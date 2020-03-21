package typingsJapgolly.tstl.iclearMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClear extends js.Object {
  /**
    * Clear elements.
    */
  def clear(): Unit
}

object IClear {
  @scala.inline
  def apply(clear: Callback): IClear = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.asInstanceOf[IClear]
  }
}

