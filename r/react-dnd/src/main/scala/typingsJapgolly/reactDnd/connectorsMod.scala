package typingsJapgolly.reactDnd

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.reactDnd.optionsMod.DragPreviewOptions
import typingsJapgolly.reactDnd.optionsMod.DragSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/interfaces/connectors", JSImport.Namespace)
@js.native
object connectorsMod extends js.Object {
  type ConnectDragPreview = DragElementWrapper[DragPreviewOptions]
  type ConnectDragSource = DragElementWrapper[DragSourceOptions]
  type ConnectDropTarget = DragElementWrapper[js.Any]
  type ConnectableElement = RefHandle[js.Any] | Element | org.scalajs.dom.raw.Element | Null
  type DragElementWrapper[Options] = js.Function2[
    /* elementOrNode */ ConnectableElement, 
    /* options */ js.UndefOr[Options], 
    Element | Null
  ]
}

