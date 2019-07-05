DESCRIPTION = "A console image with hardware support for our IoT device"

require recipes-core/images/core-image-base.bb

IMAGE_INSTALL += "openssh rauc"
IMAGE_FEATURES = ""
