package typingsJapgolly.reactDndMultiBackend

import org.scalajs.dom.Element
import typingsJapgolly.reactDnd.distHooksTypesMod.DragSourceHookSpec
import typingsJapgolly.reactDnd.distHooksTypesMod.DropTargetHookSpec
import typingsJapgolly.reactDndMultiBackend.distEsmHooksUseMultiDragMod.useMultiDragState
import typingsJapgolly.reactDndMultiBackend.distEsmHooksUseMultiDropMod.useMultiDropState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmHooksMod {
  
  @JSImport("react-dnd-multi-backend/dist/esm/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMultiDrag[Drag, Drop, Props](spec: DragSourceHookSpec[Drag, Drop, Props]): useMultiDragState[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMultiDrag")(spec.asInstanceOf[js.Any]).asInstanceOf[useMultiDragState[Props]]
  
  inline def useMultiDrop[Drag, Drop, Props](spec: DropTargetHookSpec[Drag, Drop, Props]): useMultiDropState[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMultiDrop")(spec.asInstanceOf[js.Any]).asInstanceOf[useMultiDropState[Props]]
  
  inline def usePreview[T, El /* <: Element */](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreview")().asInstanceOf[Any]
}
