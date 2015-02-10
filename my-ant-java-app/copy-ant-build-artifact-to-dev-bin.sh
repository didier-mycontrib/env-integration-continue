# script shell linux pour copier un artifact construit par jenkins 
# du ${WORKSPACE} jenkins vers /home/formation/dev/bin ***
#########################################################
# Commandes à saisir dans jenkins pour déclencher le script:
###########
# chmod a+x copy-ant-build-artifact-to-dev-bin.sh
# ./copy-ant-build-artifact-to-dev-bin.sh
####################################
SRC_DIR=${WORKSPACE}
ARTIFACT=my-ant-java-app.jar
DEST_DIR=/home/formation/dev-bin
cp ${SRC_DIR}/${ARTIFACT} ${DEST_DIR}
