DESCRIPTION = "A console image with hardware support for our IoT device"

require recipes-core/images/core-image-base.bb

IMAGE_INSTALL += "rauc"
IMAGE_FEATURES = "ssh-server-openssh"
