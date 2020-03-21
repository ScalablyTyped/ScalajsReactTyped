package typingsJapgolly.rcTable.resizeContextMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeContextProps extends js.Object {
  def onColumnResize(columnKey: Key, width: Double): Unit
}

object ResizeContextProps {
  @scala.inline
  def apply(onColumnResize: (Key, Double) => Callback): ResizeContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onColumnResize")(js.Any.fromFunction2((t0: typingsJapgolly.react.mod.Key, t1: scala.Double) => onColumnResize(t0, t1).runNow()))
    __obj.asInstanceOf[ResizeContextProps]
  }
}

