package typingsJapgolly.antd.esUploadInterfaceMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.File
import typingsJapgolly.antd.Anon_Percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RcCustomRequestOptions extends js.Object {
  var action: String
  var data: js.Object
  var file: File
  var filename: String
  var headers: js.Object
  var withCredentials: Boolean
  def onError(error: js.Error): Unit
  def onProgress(event: Anon_Percent, file: File): Unit
  def onSuccess(response: js.Object, file: File): Unit
}

object RcCustomRequestOptions {
  @scala.inline
  def apply(
    action: String,
    data: js.Object,
    file: File,
    filename: String,
    headers: js.Object,
    onError: js.Error => Callback,
    onProgress: (Anon_Percent, File) => Callback,
    onSuccess: (js.Object, File) => Callback,
    withCredentials: Boolean
  ): RcCustomRequestOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()))
    __obj.updateDynamic("onProgress")(js.Any.fromFunction2((t0: typingsJapgolly.antd.Anon_Percent, t1: org.scalajs.dom.raw.File) => onProgress(t0, t1).runNow()))
    __obj.updateDynamic("onSuccess")(js.Any.fromFunction2((t0: js.Object, t1: org.scalajs.dom.raw.File) => onSuccess(t0, t1).runNow()))
    __obj.asInstanceOf[RcCustomRequestOptions]
  }
}

