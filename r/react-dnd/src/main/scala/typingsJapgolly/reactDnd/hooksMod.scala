package typingsJapgolly.reactDnd

import typingsJapgolly.reactDnd.connectorsMod.ConnectDragPreview
import typingsJapgolly.reactDnd.connectorsMod.ConnectDragSource
import typingsJapgolly.reactDnd.connectorsMod.ConnectDropTarget
import typingsJapgolly.reactDnd.hooksApiMod.DragObjectWithType
import typingsJapgolly.reactDnd.hooksApiMod.DragSourceHookSpec
import typingsJapgolly.reactDnd.hooksApiMod.DropTargetHookSpec
import typingsJapgolly.reactDnd.monitorsMod.DragLayerMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks", JSImport.Namespace)
@js.native
object hooksMod extends js.Object {
  def useDrag[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DragSourceHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = js.native
  def useDragLayer[CollectedProps](collect: js.Function1[/* monitor */ DragLayerMonitor, CollectedProps]): CollectedProps = js.native
  def useDrop[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DropTargetHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple2[CollectedProps, ConnectDropTarget] = js.native
}

