package typingsJapgolly.reactDnd

import typingsJapgolly.dndCore.interfacesMod.BackendFactory
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactDnd.dndContextMod.DndContextType
import typingsJapgolly.reactDnd.dndProviderMod.DndProviderProps
import typingsJapgolly.reactDnd.dragPreviewImageMod.DragPreviewImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common", JSImport.Namespace)
@js.native
object commonMod extends js.Object {
  val DndContext: Context[DndContextType] = js.native
  val DndProvider: FC[DndProviderProps[js.Any, js.Any]] = js.native
  val DragPreviewImage: FC[DragPreviewImageProps] = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory): AnonDragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): AnonDragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): AnonDragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): AnonDragDropManager = js.native
}

