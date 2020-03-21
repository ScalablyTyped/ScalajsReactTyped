package typingsJapgolly.tsNode

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescript.mod.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofScriptSnapshot extends js.Object {
  def fromString(text: String): IScriptSnapshot
}

object TypeofScriptSnapshot {
  @scala.inline
  def apply(fromString: String => CallbackTo[IScriptSnapshot]): TypeofScriptSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromString")(js.Any.fromFunction1((t0: java.lang.String) => fromString(t0).runNow()))
    __obj.asInstanceOf[TypeofScriptSnapshot]
  }
}

