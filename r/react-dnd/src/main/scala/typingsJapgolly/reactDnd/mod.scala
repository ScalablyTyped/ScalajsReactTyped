package typingsJapgolly.reactDnd

import typingsJapgolly.dndCore.interfacesMod.BackendFactory
import typingsJapgolly.dndCore.interfacesMod.SourceType
import typingsJapgolly.dndCore.interfacesMod.TargetType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactDnd.connectorsMod.ConnectDragPreview
import typingsJapgolly.reactDnd.connectorsMod.ConnectDragSource
import typingsJapgolly.reactDnd.connectorsMod.ConnectDropTarget
import typingsJapgolly.reactDnd.dndContextMod.DndContextType
import typingsJapgolly.reactDnd.dndProviderMod.DndProviderProps
import typingsJapgolly.reactDnd.dragPreviewImageMod.DragPreviewImageProps
import typingsJapgolly.reactDnd.hooksApiMod.DragObjectWithType
import typingsJapgolly.reactDnd.hooksApiMod.DragSourceHookSpec
import typingsJapgolly.reactDnd.hooksApiMod.DropTargetHookSpec
import typingsJapgolly.reactDnd.interfacesMod.DndComponentEnhancer
import typingsJapgolly.reactDnd.interfacesMod.DragLayerCollector
import typingsJapgolly.reactDnd.interfacesMod.DragSourceCollector
import typingsJapgolly.reactDnd.interfacesMod.DragSourceSpec
import typingsJapgolly.reactDnd.interfacesMod.DropTargetCollector
import typingsJapgolly.reactDnd.interfacesMod.DropTargetSpec
import typingsJapgolly.reactDnd.monitorsMod.DragLayerMonitor
import typingsJapgolly.reactDnd.optionsMod.DndOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val DndContext: Context[DndContextType] = js.native
  val DndProvider: FC[DndProviderProps[js.Any, js.Any]] = js.native
  val DragPreviewImage: FC[DragPreviewImageProps] = js.native
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps]): DndComponentEnhancer[CollectedProps] = js.native
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps], options: DndOptions[RequiredProps]): DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, TargetType],
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, TargetType],
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: TargetType,
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: TargetType,
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory): AnonDragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): AnonDragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): AnonDragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): AnonDragDropManager = js.native
  def useDrag[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DragSourceHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = js.native
  def useDragLayer[CollectedProps](collect: js.Function1[/* monitor */ DragLayerMonitor, CollectedProps]): CollectedProps = js.native
  def useDrop[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DropTargetHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple2[CollectedProps, ConnectDropTarget] = js.native
}

