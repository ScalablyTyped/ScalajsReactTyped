package typingsJapgolly.reactDndMultiBackend

import typingsJapgolly.reactDnd.distHooksTypesMod.DropTargetHookSpec
import typingsJapgolly.reactDnd.distTypesConnectorsMod.ConnectDropTarget
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmHooksUseMultiDropMod {
  
  @JSImport("react-dnd-multi-backend/dist/esm/hooks/useMultiDrop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMultiDrop[Drag, Drop, Props](spec: DropTargetHookSpec[Drag, Drop, Props]): useMultiDropState[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMultiDrop")(spec.asInstanceOf[js.Any]).asInstanceOf[useMultiDropState[Props]]
  
  type useMultiDropOneState[Props] = js.Tuple2[Props, ConnectDropTarget]
  
  type useMultiDropState[Props] = js.Tuple2[useMultiDropOneState[Props], Record[String, useMultiDropOneState[Props]]]
}
