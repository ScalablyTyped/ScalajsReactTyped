package typingsJapgolly.materialRipple

import org.scalajs.dom.DOMRect
import org.scalajs.dom.Event
import typingsJapgolly.materialRipple.typesMod.MDCRipplePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@material/ripple/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNormalizedEventCoords(evt: Event, pageOffset: MDCRipplePoint, clientRect: DOMRect): MDCRipplePoint = (^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedEventCoords")(evt.asInstanceOf[js.Any], pageOffset.asInstanceOf[js.Any], clientRect.asInstanceOf[js.Any])).asInstanceOf[MDCRipplePoint]
  inline def getNormalizedEventCoords(evt: Unit, pageOffset: MDCRipplePoint, clientRect: DOMRect): MDCRipplePoint = (^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedEventCoords")(evt.asInstanceOf[js.Any], pageOffset.asInstanceOf[js.Any], clientRect.asInstanceOf[js.Any])).asInstanceOf[MDCRipplePoint]
  
  inline def supportsCssVariables(windowObj: /* globalThis */ Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsCssVariables")(windowObj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def supportsCssVariables(windowObj: /* globalThis */ Any, forceRefresh: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("supportsCssVariables")(windowObj.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
