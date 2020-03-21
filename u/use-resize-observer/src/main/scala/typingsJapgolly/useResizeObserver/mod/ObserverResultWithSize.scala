package typingsJapgolly.useResizeObserver.mod

import japgolly.scalajs.react.raw.React.RefHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverResultWithSize[TElement] extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var ref: RefHandle[TElement]
  var width: js.UndefOr[Double] = js.undefined
}

object ObserverResultWithSize {
  @scala.inline
  def apply[TElement](ref: RefHandle[TElement], height: Int | Double = null, width: Int | Double = null): ObserverResultWithSize[TElement] = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverResultWithSize[TElement]]
  }
}

