ifeq ($(CONFIG_MSM_AMSS_SUPPORT_256MB_EBI1),y)
zreladdr-y              := 0x19208000
params_phys-y           := 0x19200100
initrd_phys-y           := 0x19A00000
else
ifeq ($(CONFIG_MSM_AMSS_RADIO2708_MEMMAP),y)
zreladdr-y          := 0x02008000
params_phys-y       := 0x02000100
initrd_phys-y       := 0x02800000
else
zreladdr-y		:= 0x10008000
params_phys-y		:= 0x10000100
initrd_phys-y		:= 0x10800000
endif
endif

# for now, override for QSD8x50
  zreladdr-$(CONFIG_ARCH_QSD8X50)		:= 0x20008000
params_phys-$(CONFIG_ARCH_QSD8X50)		:= 0x20000100
initrd_phys-$(CONFIG_ARCH_QSD8X50)		:= 0x21000000

# override for HTC Leo
  zreladdr-$(CONFIG_MACH_HTCLEO)		:= 0x11808000
params_phys-$(CONFIG_MACH_HTCLEO)		:= 0x11800100
initrd_phys-$(CONFIG_MACH_HTCLEO)		:= 0x12200000

  zreladdr-$(CONFIG_ARCH_MSM7X30)		:= 0x00208000
params_phys-$(CONFIG_ARCH_MSM7X30)		:= 0x00200100
initrd_phys-$(CONFIG_ARCH_MSM7X30)		:= 0x01200000
