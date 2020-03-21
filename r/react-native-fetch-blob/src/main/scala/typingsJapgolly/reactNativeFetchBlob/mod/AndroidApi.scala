package typingsJapgolly.reactNativeFetchBlob.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidApi extends js.Object {
  /**
    * When sending an ACTION_VIEW intent with given file path and MIME type, system will try to open an
    * App to handle the file. For example, open Gallery app to view an image, or install APK.
    * @param path Path of the file to be opened.
    * @param mime Basically system will open an app according to this MIME type.
    */
  def actionViewIntent(path: String, mime: String): js.Promise[_]
}

object AndroidApi {
  @scala.inline
  def apply(actionViewIntent: (String, String) => CallbackTo[js.Promise[js.Any]]): AndroidApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actionViewIntent")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => actionViewIntent(t0, t1).runNow()))
    __obj.asInstanceOf[AndroidApi]
  }
}

