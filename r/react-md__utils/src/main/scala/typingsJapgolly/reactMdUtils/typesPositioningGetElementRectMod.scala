package typingsJapgolly.reactMdUtils

import org.scalajs.dom.DOMRect
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactMdUtils.typesPositioningTypesMod.Coords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPositioningGetElementRectMod {
  
  @JSImport("@react-md/utils/types/positioning/getElementRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getElementRect(element: HTMLElement): DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementRect")(element.asInstanceOf[js.Any]).asInstanceOf[DOMRect]
  inline def getElementRect(element: HTMLElement, coords: Coords): DOMRect = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementRect")(element.asInstanceOf[js.Any], coords.asInstanceOf[js.Any])).asInstanceOf[DOMRect]
}
