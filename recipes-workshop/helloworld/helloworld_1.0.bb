SUMMARY = "Hello Yocto Example Recipe"

# Cheating
LICENSE = "CLOSED"

SRC_URI += "file://hello_world.c"

# Replace/Override compile function
do_compile(){
    ${CC} -o hello_world ../hello_world.c
}

# Replace/Override install function
do_install(){
    install -d ${D}${bindir}
    install -m 777 hello_world ${D}${bindir}/hello_world
}

