package typingsJapgolly.w3cCssTypedObjectModelLevel1

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  def computedStyleMap(): StylePropertyMapReadOnly
}

object Element {
  @scala.inline
  def apply(computedStyleMap: CallbackTo[StylePropertyMapReadOnly]): Element = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("computedStyleMap")(computedStyleMap.toJsFn)
    __obj.asInstanceOf[Element]
  }
}

