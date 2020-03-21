package typingsJapgolly.reactWindowInfiniteLoader

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.reactWindow.mod.ListOnItemsRenderedProps
import typingsJapgolly.reactWindowInfiniteLoader.mod.OnItemsRendered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnItemsRendered extends js.Object {
  var onItemsRendered: OnItemsRendered
  var ref: Ref
}

object AnonOnItemsRendered {
  @scala.inline
  def apply(onItemsRendered: /* props */ ListOnItemsRenderedProps => CallbackTo[js.Any], ref: Ref = null): AnonOnItemsRendered = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onItemsRendered")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactWindow.mod.ListOnItemsRenderedProps) => onItemsRendered(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnItemsRendered]
  }
}

