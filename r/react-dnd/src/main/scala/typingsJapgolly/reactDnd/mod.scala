package typingsJapgolly.reactDnd

import typingsJapgolly.dndCore.distInterfacesMod.DragDropManager
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactDnd.distCoreDndContextMod.DndContextType
import typingsJapgolly.reactDnd.distCoreDndProviderMod.DndProviderProps
import typingsJapgolly.reactDnd.distCoreDragPreviewImageMod.DragPreviewImageProps
import typingsJapgolly.reactDnd.distHooksTypesMod.DragSourceHookSpec
import typingsJapgolly.reactDnd.distHooksTypesMod.DropTargetHookSpec
import typingsJapgolly.reactDnd.distHooksTypesMod.FactoryOrInstance
import typingsJapgolly.reactDnd.distTypesConnectorsMod.ConnectDragPreview
import typingsJapgolly.reactDnd.distTypesConnectorsMod.ConnectDragSource
import typingsJapgolly.reactDnd.distTypesConnectorsMod.ConnectDropTarget
import typingsJapgolly.reactDnd.distTypesMonitorsMod.DragLayerMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dnd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-dnd", "DndContext")
  @js.native
  val DndContext: Context[DndContextType] = js.native
  
  @JSImport("react-dnd", "DndProvider")
  @js.native
  val DndProvider: FC[DndProviderProps[Any, Any]] = js.native
  
  @JSImport("react-dnd", "DragPreviewImage")
  @js.native
  val DragPreviewImage: FC[DragPreviewImageProps] = js.native
  
  inline def useDrag[DragObject, DropResult, CollectedProps](specArg: FactoryOrInstance[DragSourceHookSpec[DragObject, DropResult, CollectedProps]]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDrag")(specArg.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview]]
  inline def useDrag[DragObject, DropResult, CollectedProps](
    specArg: FactoryOrInstance[DragSourceHookSpec[DragObject, DropResult, CollectedProps]],
    deps: js.Array[Any]
  ): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDrag")(specArg.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview]]
  
  inline def useDragDropManager(): DragDropManager = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragDropManager")().asInstanceOf[DragDropManager]
  
  inline def useDragLayer[CollectedProps, DragObject](collect: js.Function1[/* monitor */ DragLayerMonitor[DragObject], CollectedProps]): CollectedProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragLayer")(collect.asInstanceOf[js.Any]).asInstanceOf[CollectedProps]
  
  inline def useDrop[DragObject, DropResult, CollectedProps](specArg: FactoryOrInstance[DropTargetHookSpec[DragObject, DropResult, CollectedProps]]): js.Tuple2[CollectedProps, ConnectDropTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDrop")(specArg.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[CollectedProps, ConnectDropTarget]]
  inline def useDrop[DragObject, DropResult, CollectedProps](
    specArg: FactoryOrInstance[DropTargetHookSpec[DragObject, DropResult, CollectedProps]],
    deps: js.Array[Any]
  ): js.Tuple2[CollectedProps, ConnectDropTarget] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDrop")(specArg.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[CollectedProps, ConnectDropTarget]]
}
