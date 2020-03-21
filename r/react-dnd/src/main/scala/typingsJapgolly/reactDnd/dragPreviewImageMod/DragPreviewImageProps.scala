package typingsJapgolly.reactDnd.dragPreviewImageMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactDnd.connectorsMod.ConnectDragPreview
import typingsJapgolly.reactDnd.connectorsMod.ConnectableElement
import typingsJapgolly.reactDnd.optionsMod.DragPreviewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragPreviewImageProps extends js.Object {
  var connect: ConnectDragPreview
  var src: String
}

object DragPreviewImageProps {
  @scala.inline
  def apply(
    connect: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => CallbackTo[Element | Null],
    src: String
  ): DragPreviewImageProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("connect")(js.Any.fromFunction2((t0: /* elementOrNode */ typingsJapgolly.reactDnd.connectorsMod.ConnectableElement, t1: /* options */ js.UndefOr[typingsJapgolly.reactDnd.optionsMod.DragPreviewOptions]) => connect(t0, t1).runNow()))
    __obj.asInstanceOf[DragPreviewImageProps]
  }
}

