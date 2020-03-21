package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreCursorFactory extends js.Object {
  def createCursor(`type`: CoreCursorType, id: Double): CoreCursor
}

object ICoreCursorFactory {
  @scala.inline
  def apply(createCursor: (CoreCursorType, Double) => CallbackTo[CoreCursor]): ICoreCursorFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createCursor")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Core.CoreCursorType, t1: scala.Double) => createCursor(t0, t1).runNow()))
    __obj.asInstanceOf[ICoreCursorFactory]
  }
}

