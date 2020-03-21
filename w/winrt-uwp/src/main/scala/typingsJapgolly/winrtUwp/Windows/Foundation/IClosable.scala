package typingsJapgolly.winrtUwp.Windows.Foundation

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a method to release allocated resources. */
trait IClosable extends js.Object {
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit
}

object IClosable {
  @scala.inline
  def apply(close: Callback): IClosable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[IClosable]
  }
}

