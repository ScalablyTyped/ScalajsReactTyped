package typingsJapgolly.reactDnd

import typingsJapgolly.reactDnd.connectorsMod.ConnectDragPreview
import typingsJapgolly.reactDnd.connectorsMod.ConnectDragSource
import typingsJapgolly.reactDnd.hooksApiMod.DragObjectWithType
import typingsJapgolly.reactDnd.hooksApiMod.DragSourceHookSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/useDrag", JSImport.Namespace)
@js.native
object useDragMod extends js.Object {
  def useDrag[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DragSourceHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = js.native
}

