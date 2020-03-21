package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeLensList extends js.Object {
  var lenses: js.Array[CodeLens]
  def dispose(): Unit
}

object CodeLensList {
  @scala.inline
  def apply(dispose: Callback, lenses: js.Array[CodeLens]): CodeLensList = {
    val __obj = js.Dynamic.literal(lenses = lenses.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[CodeLensList]
  }
}

