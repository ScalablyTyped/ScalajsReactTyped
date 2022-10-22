package typingsJapgolly.reactDndTouchBackend

import org.scalajs.dom.Element
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Touch
import org.scalajs.dom.TouchEvent
import typingsJapgolly.dndCore.distInterfacesMod.XYCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsOffsetsMod {
  
  @JSImport("react-dnd-touch-backend/dist/utils/offsets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEventClientOffset(e: MouseEvent): js.UndefOr[XYCoord] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventClientOffset")(e.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[XYCoord]]
  inline def getEventClientOffset(e: MouseEvent, lastTargetTouchFallback: Touch): js.UndefOr[XYCoord] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventClientOffset")(e.asInstanceOf[js.Any], lastTargetTouchFallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[XYCoord]]
  inline def getEventClientOffset(e: Touch): js.UndefOr[XYCoord] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventClientOffset")(e.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[XYCoord]]
  inline def getEventClientOffset(e: TouchEvent): js.UndefOr[XYCoord] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventClientOffset")(e.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[XYCoord]]
  inline def getEventClientOffset(e: TouchEvent, lastTargetTouchFallback: Touch): js.UndefOr[XYCoord] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventClientOffset")(e.asInstanceOf[js.Any], lastTargetTouchFallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[XYCoord]]
  inline def getEventClientOffset(e: Touch, lastTargetTouchFallback: Touch): js.UndefOr[XYCoord] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventClientOffset")(e.asInstanceOf[js.Any], lastTargetTouchFallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[XYCoord]]
  
  inline def getEventClientTouchOffset(e: TouchEvent): js.UndefOr[XYCoord] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventClientTouchOffset")(e.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[XYCoord]]
  inline def getEventClientTouchOffset(e: TouchEvent, lastTargetTouchFallback: Touch): js.UndefOr[XYCoord] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventClientTouchOffset")(e.asInstanceOf[js.Any], lastTargetTouchFallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[XYCoord]]
  
  inline def getNodeClientOffset(node: Element): js.UndefOr[XYCoord] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeClientOffset")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[XYCoord]]
}
