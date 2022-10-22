package typingsJapgolly.wixStyleReact

import typingsJapgolly.wixStyleReact.anon.ClientOffset
import typingsJapgolly.wixStyleReact.anon.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDragAndDropDraggableDragUtilsMod {
  
  @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/DragUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dragCoordinates(hasMonitorComponent: Component): ClientOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("dragCoordinates")(hasMonitorComponent.asInstanceOf[js.Any]).asInstanceOf[ClientOffset]
  
  inline def getEmptyImage(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getEmptyImage")().asInstanceOf[Any]
}
