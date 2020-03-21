package typingsJapgolly.geometryDom

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRectList extends js.Object {
  /**
    * total number of DOMRect objects associated with the object.
    * readonly unsigned long length
    */
  var length: Double
  /**
    * the DOMRect object at index must be returned.
    * @param index
    */
  def item(index: Double): typingsJapgolly.geometryDom.GeometryDom.DOMRect
}

object DOMRectList {
  @scala.inline
  def apply(item: Double => CallbackTo[typingsJapgolly.geometryDom.GeometryDom.DOMRect], length: Double): DOMRectList = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("item")(js.Any.fromFunction1((t0: scala.Double) => item(t0).runNow()))
    __obj.asInstanceOf[DOMRectList]
  }
}

