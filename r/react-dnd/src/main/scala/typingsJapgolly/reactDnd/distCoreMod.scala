package typingsJapgolly.reactDnd

import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactDnd.distCoreDndContextMod.DndContextType
import typingsJapgolly.reactDnd.distCoreDndProviderMod.DndProviderProps
import typingsJapgolly.reactDnd.distCoreDragPreviewImageMod.DragPreviewImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreMod {
  
  @JSImport("react-dnd/dist/core", "DndContext")
  @js.native
  val DndContext: Context[DndContextType] = js.native
  
  @JSImport("react-dnd/dist/core", "DndProvider")
  @js.native
  val DndProvider: FC[DndProviderProps[Any, Any]] = js.native
  
  @JSImport("react-dnd/dist/core", "DragPreviewImage")
  @js.native
  val DragPreviewImage: FC[DragPreviewImageProps] = js.native
}
