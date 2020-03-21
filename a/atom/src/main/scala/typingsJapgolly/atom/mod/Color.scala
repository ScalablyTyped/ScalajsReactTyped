package typingsJapgolly.atom.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /** Returns a string in the form '#abcdef'. */
  def toHexString(): String
  /** Returns a string in the form 'rgba(25, 50, 75, .9)'. */
  def toRGBAString(): String
}

object Color {
  @scala.inline
  def apply(toHexString: CallbackTo[String], toRGBAString: CallbackTo[String]): Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toHexString")(toHexString.toJsFn)
    __obj.updateDynamic("toRGBAString")(toRGBAString.toJsFn)
    __obj.asInstanceOf[Color]
  }
}

