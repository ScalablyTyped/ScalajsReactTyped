package typingsJapgolly.filesystem

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalFileSystemSync extends js.Object {
  /**
    * Used for storage that should not be removed by the user agent without application or user permission.
    */
  var PERSISTENT: Double
  /**
    * Used for storage with no guarantee of persistence.
    */
  var TEMPORARY: Double
  /**
    * Requests a filesystem in which to store application data.
    * @param type Whether the filesystem requested should be persistent, as defined above. Use one of TEMPORARY or PERSISTENT.
    * @param size This is an indicator of how much storage space, in bytes, the application expects to need.
    */
  def requestFileSystemSync(`type`: Double, size: Double): FileSystemSync
  /**
    * Allows the user to look up the Entry for a file or directory referred to by a local URL.
    * @param url A URL referring to a local file in a filesystem accessable via this API.
    */
  def resolveLocalFileSystemSyncURL(url: String): EntrySync
  /**
    * see requestFileSystemSync
    */
  def webkitRequestFileSystemSync(`type`: Double, size: Double): FileSystemSync
}

object LocalFileSystemSync {
  @scala.inline
  def apply(
    PERSISTENT: Double,
    TEMPORARY: Double,
    requestFileSystemSync: (Double, Double) => CallbackTo[FileSystemSync],
    resolveLocalFileSystemSyncURL: String => CallbackTo[EntrySync],
    webkitRequestFileSystemSync: (Double, Double) => CallbackTo[FileSystemSync]
  ): LocalFileSystemSync = {
    val __obj = js.Dynamic.literal(PERSISTENT = PERSISTENT.asInstanceOf[js.Any], TEMPORARY = TEMPORARY.asInstanceOf[js.Any])
    __obj.updateDynamic("requestFileSystemSync")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => requestFileSystemSync(t0, t1).runNow()))
    __obj.updateDynamic("resolveLocalFileSystemSyncURL")(js.Any.fromFunction1((t0: java.lang.String) => resolveLocalFileSystemSyncURL(t0).runNow()))
    __obj.updateDynamic("webkitRequestFileSystemSync")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => webkitRequestFileSystemSync(t0, t1).runNow()))
    __obj.asInstanceOf[LocalFileSystemSync]
  }
}

