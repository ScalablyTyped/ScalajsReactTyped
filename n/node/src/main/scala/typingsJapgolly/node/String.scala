package typingsJapgolly.node

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Node.js ESNEXT support
trait String extends js.Object {
  /** Removes whitespace from the left end of a string. */
  def trimLeft(): java.lang.String
  /** Removes whitespace from the right end of a string. */
  def trimRight(): java.lang.String
}

object String {
  @scala.inline
  def apply(trimLeft: CallbackTo[java.lang.String], trimRight: CallbackTo[java.lang.String]): String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("trimLeft")(trimLeft.toJsFn)
    __obj.updateDynamic("trimRight")(trimRight.toJsFn)
    __obj.asInstanceOf[String]
  }
}

