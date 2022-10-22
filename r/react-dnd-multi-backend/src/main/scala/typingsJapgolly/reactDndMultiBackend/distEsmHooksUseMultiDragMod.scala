package typingsJapgolly.reactDndMultiBackend

import typingsJapgolly.reactDnd.distHooksTypesMod.DragSourceHookSpec
import typingsJapgolly.reactDnd.distTypesConnectorsMod.ConnectDragPreview
import typingsJapgolly.reactDnd.distTypesConnectorsMod.ConnectDragSource
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmHooksUseMultiDragMod {
  
  @JSImport("react-dnd-multi-backend/dist/esm/hooks/useMultiDrag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMultiDrag[Drag, Drop, Props](spec: DragSourceHookSpec[Drag, Drop, Props]): useMultiDragState[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMultiDrag")(spec.asInstanceOf[js.Any]).asInstanceOf[useMultiDragState[Props]]
  
  type useMultiDragOneState[Props] = js.Tuple3[Props, ConnectDragSource, ConnectDragPreview]
  
  type useMultiDragState[Props] = js.Tuple2[useMultiDragOneState[Props], Record[String, useMultiDragOneState[Props]]]
}
