package typingsJapgolly.winrt.Windows.UI.Input

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.AnonOutPoint
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerPointTransform extends js.Object {
  var inverse: IPointerPointTransform
  def transformBounds(rect: Rect): Rect
  def tryTransform(inPoint: Point): AnonOutPoint
}

object IPointerPointTransform {
  @scala.inline
  def apply(
    inverse: IPointerPointTransform,
    transformBounds: Rect => CallbackTo[Rect],
    tryTransform: Point => CallbackTo[AnonOutPoint]
  ): IPointerPointTransform = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any])
    __obj.updateDynamic("transformBounds")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Rect) => transformBounds(t0).runNow()))
    __obj.updateDynamic("tryTransform")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Point) => tryTransform(t0).runNow()))
    __obj.asInstanceOf[IPointerPointTransform]
  }
}

