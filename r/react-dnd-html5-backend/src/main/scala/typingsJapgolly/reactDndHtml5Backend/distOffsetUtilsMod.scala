package typingsJapgolly.reactDndHtml5Backend

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Node
import typingsJapgolly.dndCore.distInterfacesMod.XYCoord
import typingsJapgolly.reactDndHtml5Backend.anon.AnchorX
import typingsJapgolly.reactDndHtml5Backend.anon.OffsetX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOffsetUtilsMod {
  
  @JSImport("react-dnd-html5-backend/dist/OffsetUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDragPreviewOffset(
    sourceNode: HTMLElement,
    dragPreview: HTMLElement,
    clientOffset: XYCoord,
    anchorPoint: AnchorX,
    offsetPoint: OffsetX
  ): XYCoord = (^.asInstanceOf[js.Dynamic].applyDynamic("getDragPreviewOffset")(sourceNode.asInstanceOf[js.Any], dragPreview.asInstanceOf[js.Any], clientOffset.asInstanceOf[js.Any], anchorPoint.asInstanceOf[js.Any], offsetPoint.asInstanceOf[js.Any])).asInstanceOf[XYCoord]
  
  inline def getEventClientOffset(e: MouseEvent): XYCoord = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventClientOffset")(e.asInstanceOf[js.Any]).asInstanceOf[XYCoord]
  
  inline def getNodeClientOffset(node: Node): XYCoord | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeClientOffset")(node.asInstanceOf[js.Any]).asInstanceOf[XYCoord | Null]
}
