package typingsJapgolly.useResizeObserver.mod

import japgolly.scalajs.react.raw.React.RefHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverResultForResizeHandler[TElement] extends js.Object {
  var ref: RefHandle[TElement]
}

object ObserverResultForResizeHandler {
  @scala.inline
  def apply[TElement](ref: RefHandle[TElement]): ObserverResultForResizeHandler[TElement] = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObserverResultForResizeHandler[TElement]]
  }
}

