package typingsJapgolly.googleDriveRealtimeApi.rtclient

import japgolly.scalajs.react.Callback
import typingsJapgolly.googleDriveRealtimeApi.AnonFileIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientUtils extends js.Object {
  var RealtimeLoader: RealtimeLoaderFactory
  // INCOMPLETE
  var params: AnonFileIds
  /**
  		 * Creates a new Realtime file.
  		 * @param title {string} title of the newly created file.
  		 * @param mimeType {string} the MIME type of the new file.
  		 * @param callback {(file:DriveAPIFileResource) => void} the callback to call after creation.
  		 */
  def createRealtimeFile(title: String, mimeType: String, callback: js.Function1[/* file */ DriveAPIFileResource, Unit]): Unit
}

object ClientUtils {
  @scala.inline
  def apply(
    RealtimeLoader: RealtimeLoaderFactory,
    createRealtimeFile: (String, String, js.Function1[/* file */ DriveAPIFileResource, Unit]) => Callback,
    params: AnonFileIds
  ): ClientUtils = {
    val __obj = js.Dynamic.literal(RealtimeLoader = RealtimeLoader.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("createRealtimeFile")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Function1[
  /* file */ typingsJapgolly.googleDriveRealtimeApi.rtclient.DriveAPIFileResource, 
  scala.Unit]) => createRealtimeFile(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ClientUtils]
  }
}

