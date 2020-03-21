package typingsJapgolly.reactDnd

import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.reactDnd.hooksApiMod.DragObjectWithType
import typingsJapgolly.reactDnd.hooksApiMod.DragSourceHookSpec
import typingsJapgolly.reactDnd.monitorsMod.DragSourceMonitor
import typingsJapgolly.reactDnd.sourceConnectorMod.SourceConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/internal/drag", JSImport.Namespace)
@js.native
object dragMod extends js.Object {
  def useDragHandler[DragObject /* <: DragObjectWithType */, DropResult, CustomProps](
    spec: MutableRefObject[DragSourceHookSpec[DragObject, DropResult, CustomProps]],
    monitor: DragSourceMonitor,
    connector: js.Any
  ): Unit = js.native
  def useDragSourceMonitor(): js.Tuple2[DragSourceMonitor, SourceConnector] = js.native
}

