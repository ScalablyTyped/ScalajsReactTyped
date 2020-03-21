package typingsJapgolly.vueSplitpane.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitpaneComputed extends js.Object {
  def cursor(): String
  def userSelect(): String
}

object SplitpaneComputed {
  @scala.inline
  def apply(cursor: CallbackTo[String], userSelect: CallbackTo[String]): SplitpaneComputed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cursor")(cursor.toJsFn)
    __obj.updateDynamic("userSelect")(userSelect.toJsFn)
    __obj.asInstanceOf[SplitpaneComputed]
  }
}

