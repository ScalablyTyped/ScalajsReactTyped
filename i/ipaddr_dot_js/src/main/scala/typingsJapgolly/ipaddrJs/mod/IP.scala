package typingsJapgolly.ipaddrJs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ipaddrJs.ipaddrJsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Common methods/properties for IPv4 and IPv6 classes.
trait IP extends js.Object {
  def prefixLengthFromSubnetMask(): Double | `false`
  def toByteArray(): js.Array[Double]
  def toNormalizedString(): String
}

object IP {
  @scala.inline
  def apply(
    prefixLengthFromSubnetMask: CallbackTo[Double | `false`],
    toByteArray: CallbackTo[js.Array[Double]],
    toNormalizedString: CallbackTo[String]
  ): IP = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("prefixLengthFromSubnetMask")(prefixLengthFromSubnetMask.toJsFn)
    __obj.updateDynamic("toByteArray")(toByteArray.toJsFn)
    __obj.updateDynamic("toNormalizedString")(toNormalizedString.toJsFn)
    __obj.asInstanceOf[IP]
  }
}

