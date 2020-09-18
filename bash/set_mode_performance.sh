if [ "$EUID" -ne 0 ]
  then echo "Please the script run as root."
  exit
fi
echo "Current status:"
cat /sys/devices/system/cpu/cpu*/cpufreq/scaling_governor
echo "Setting all cores to performance mode..."
sudo echo performance > /sys/devices/system/cpu/cpu0/cpufreq/scaling_governor
sudo echo performance > /sys/devices/system/cpu/cpu1/cpufreq/scaling_governor
sudo echo performance > /sys/devices/system/cpu/cpu2/cpufreq/scaling_governor
sudo echo performance > /sys/devices/system/cpu/cpu3/cpufreq/scaling_governor
echo "Current status:"
cat /sys/devices/system/cpu/cpu*/cpufreq/scaling_governor
