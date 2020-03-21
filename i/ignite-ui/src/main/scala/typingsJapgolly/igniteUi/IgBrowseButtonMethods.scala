package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgBrowseButtonMethods extends js.Object {
  def attachFilePicker(e: js.Object, isHidden: js.Object): Unit
  /**
  	 * $(".selector").igUpload("destroy");
  	 */
  def destroy(): Unit
  def getFilePicker(): Unit
}

object IgBrowseButtonMethods {
  @scala.inline
  def apply(attachFilePicker: (js.Object, js.Object) => Callback, destroy: Callback, getFilePicker: Callback): IgBrowseButtonMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachFilePicker")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => attachFilePicker(t0, t1).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getFilePicker")(getFilePicker.toJsFn)
    __obj.asInstanceOf[IgBrowseButtonMethods]
  }
}

