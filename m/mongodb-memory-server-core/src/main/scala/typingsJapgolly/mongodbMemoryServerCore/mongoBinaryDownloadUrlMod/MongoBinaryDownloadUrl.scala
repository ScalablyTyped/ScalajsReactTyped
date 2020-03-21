package typingsJapgolly.mongodbMemoryServerCore.mongoBinaryDownloadUrlMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mongodbMemoryServerCore.getosMod.AnyOS
import typingsJapgolly.mongodbMemoryServerCore.getosMod.LinuxOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoBinaryDownloadUrl extends js.Object {
  var arch: String
  var os: js.UndefOr[AnyOS] = js.undefined
  var platform: String
  var version: String
  /**
    * Get the archive
    * Version independent
    */
  def getArchiveName(): js.Promise[String]
  /**
    * Get the archive for Linux
    * (from: https://www.mongodb.org/dl/linux)
    */
  def getArchiveNameLinux(): js.Promise[String]
  /**
    * Get the archive for OSX (Mac)
    * (from: https://www.mongodb.org/dl/osx)
    */
  def getArchiveNameOsx(): js.Promise[String]
  /**
    * Get the archive for Windows
    * (from: https://www.mongodb.org/dl/win32)
    */
  def getArchiveNameWin(): js.Promise[String]
  /**
    * Get the version string for Debain
    * @param os LinuxOS Object
    */
  def getDebianVersionString(os: LinuxOS): String
  /**
    * Assemble the URL to download
    * Calls all the necessary functions to determine the URL
    */
  def getDownloadUrl(): js.Promise[String]
  /**
    * Get the version string for ElementaryOS
    * @param os LinuxOS Object
    */
  def getElementaryOSVersionString(os: LinuxOS): String
  /**
    * Get the version string for Fedora
    * @param os LinuxOS Object
    */
  def getFedoraVersionString(os: LinuxOS): String
  /**
    * Linux Fallback
    * @param os LinuxOS Object
    */
  def getLegacyVersionString(os: AnyOS): String
  /**
    * Get the version string (with distro)
    * @param os LinuxOS Object
    */
  def getLinuxOSVersionString(os: LinuxOS): String
  /**
    * Get the version string for Linux Mint
    * @param os LinuxOS Object
    */
  def getMintVersionString(os: LinuxOS): String
  /**
    * Get the version string for Red Hat Enterprise Linux
    * @param os LinuxOS Object
    */
  def getRhelVersionString(os: LinuxOS): String
  /**
    * Get the version string for Suse / OpenSuse
    * @param os LinuxOS Object
    */
  def getSuseVersionString(os: LinuxOS): String
  /**
    * Get the version string for Ubuntu
    * @param os LinuxOS Object
    */
  def getUbuntuVersionString(os: LinuxOS): String
  /**
    * Translate input arch to mongodb useable arch
    * @example
    * x64 -> x86_64
    * @param platform The Platform to translate
    */
  def translateArch(arch: String, mongoPlatform: String): String
  /**
    * Translate input platform to mongodb useable platfrom
    * @example
    * darwin -> osx
    * @param platform The Platform to translate
    */
  def translatePlatform(platform: String): String
}

object MongoBinaryDownloadUrl {
  @scala.inline
  def apply(
    arch: String,
    getArchiveName: CallbackTo[js.Promise[String]],
    getArchiveNameLinux: CallbackTo[js.Promise[String]],
    getArchiveNameOsx: CallbackTo[js.Promise[String]],
    getArchiveNameWin: CallbackTo[js.Promise[String]],
    getDebianVersionString: LinuxOS => CallbackTo[String],
    getDownloadUrl: CallbackTo[js.Promise[String]],
    getElementaryOSVersionString: LinuxOS => CallbackTo[String],
    getFedoraVersionString: LinuxOS => CallbackTo[String],
    getLegacyVersionString: AnyOS => CallbackTo[String],
    getLinuxOSVersionString: LinuxOS => CallbackTo[String],
    getMintVersionString: LinuxOS => CallbackTo[String],
    getRhelVersionString: LinuxOS => CallbackTo[String],
    getSuseVersionString: LinuxOS => CallbackTo[String],
    getUbuntuVersionString: LinuxOS => CallbackTo[String],
    platform: String,
    translateArch: (String, String) => CallbackTo[String],
    translatePlatform: String => CallbackTo[String],
    version: String,
    os: AnyOS = null
  ): MongoBinaryDownloadUrl = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("getArchiveName")(getArchiveName.toJsFn)
    __obj.updateDynamic("getArchiveNameLinux")(getArchiveNameLinux.toJsFn)
    __obj.updateDynamic("getArchiveNameOsx")(getArchiveNameOsx.toJsFn)
    __obj.updateDynamic("getArchiveNameWin")(getArchiveNameWin.toJsFn)
    __obj.updateDynamic("getDebianVersionString")(js.Any.fromFunction1((t0: typingsJapgolly.mongodbMemoryServerCore.getosMod.LinuxOS) => getDebianVersionString(t0).runNow()))
    __obj.updateDynamic("getDownloadUrl")(getDownloadUrl.toJsFn)
    __obj.updateDynamic("getElementaryOSVersionString")(js.Any.fromFunction1((t0: typingsJapgolly.mongodbMemoryServerCore.getosMod.LinuxOS) => getElementaryOSVersionString(t0).runNow()))
    __obj.updateDynamic("getFedoraVersionString")(js.Any.fromFunction1((t0: typingsJapgolly.mongodbMemoryServerCore.getosMod.LinuxOS) => getFedoraVersionString(t0).runNow()))
    __obj.updateDynamic("getLegacyVersionString")(js.Any.fromFunction1((t0: typingsJapgolly.mongodbMemoryServerCore.getosMod.AnyOS) => getLegacyVersionString(t0).runNow()))
    __obj.updateDynamic("getLinuxOSVersionString")(js.Any.fromFunction1((t0: typingsJapgolly.mongodbMemoryServerCore.getosMod.LinuxOS) => getLinuxOSVersionString(t0).runNow()))
    __obj.updateDynamic("getMintVersionString")(js.Any.fromFunction1((t0: typingsJapgolly.mongodbMemoryServerCore.getosMod.LinuxOS) => getMintVersionString(t0).runNow()))
    __obj.updateDynamic("getRhelVersionString")(js.Any.fromFunction1((t0: typingsJapgolly.mongodbMemoryServerCore.getosMod.LinuxOS) => getRhelVersionString(t0).runNow()))
    __obj.updateDynamic("getSuseVersionString")(js.Any.fromFunction1((t0: typingsJapgolly.mongodbMemoryServerCore.getosMod.LinuxOS) => getSuseVersionString(t0).runNow()))
    __obj.updateDynamic("getUbuntuVersionString")(js.Any.fromFunction1((t0: typingsJapgolly.mongodbMemoryServerCore.getosMod.LinuxOS) => getUbuntuVersionString(t0).runNow()))
    __obj.updateDynamic("translateArch")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => translateArch(t0, t1).runNow()))
    __obj.updateDynamic("translatePlatform")(js.Any.fromFunction1((t0: java.lang.String) => translatePlatform(t0).runNow()))
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoBinaryDownloadUrl]
  }
}

