package typingsJapgolly.reactDnd

import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.reactDnd.hooksApiMod.DragObjectWithType
import typingsJapgolly.reactDnd.hooksApiMod.DropTargetHookSpec
import typingsJapgolly.reactDnd.monitorsMod.DropTargetMonitor
import typingsJapgolly.reactDnd.targetConnectorMod.TargetConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/internal/drop", JSImport.Namespace)
@js.native
object dropMod extends js.Object {
  def useDropHandler[DragObject /* <: DragObjectWithType */, DropResult, CustomProps](
    spec: MutableRefObject[DropTargetHookSpec[DragObject, DropResult, CustomProps]],
    monitor: DropTargetMonitor,
    connector: js.Any
  ): Unit = js.native
  def useDropTargetMonitor(): js.Tuple2[DropTargetMonitor, TargetConnector] = js.native
}

