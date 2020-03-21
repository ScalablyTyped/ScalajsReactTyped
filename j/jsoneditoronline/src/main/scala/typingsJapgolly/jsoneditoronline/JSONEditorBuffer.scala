package typingsJapgolly.jsoneditoronline

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorBuffer extends js.Object {
  var text: String
  def flush(): String
  def set(text: String): Unit
}

object JSONEditorBuffer {
  @scala.inline
  def apply(flush: CallbackTo[String], set: String => Callback, text: String): JSONEditorBuffer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: java.lang.String) => set(t0).runNow()))
    __obj.asInstanceOf[JSONEditorBuffer]
  }
}

