package typingsJapgolly.winrt.Windows.Foundation

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClosable extends js.Object {
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

