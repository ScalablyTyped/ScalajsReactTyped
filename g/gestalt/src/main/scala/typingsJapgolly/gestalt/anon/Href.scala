package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.gestalt.gestaltStrings.blank
import typingsJapgolly.gestalt.gestaltStrings.nofollow
import typingsJapgolly.gestalt.gestaltStrings.none
import typingsJapgolly.gestalt.gestaltStrings.self
import typingsJapgolly.gestalt.mod.AbstractEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Href extends StObject {
  
  var accessibilityLabel: String
  
  var href: String
  
  var label: String
  
  var onClick: js.UndefOr[
    AbstractEventHandler[
      (ReactMouseEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]), 
      DangerouslyDisableOnNavigation
    ]
  ] = js.undefined
  
  var rel: js.UndefOr[none | nofollow] = js.undefined
  
  var target: js.UndefOr[Null | self | blank] = js.undefined
}
object Href {
  
  inline def apply(accessibilityLabel: String, href: String, label: String): Href = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
  
  extension [Self <: Href](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnClick(
      value: /* arg */ DangerouslyDisableOnNavigation & (Event[
          (ReactMouseEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element])
        ]) => Callback
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* arg */ DangerouslyDisableOnNavigation & (Event[
          (ReactMouseEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element])
        ])) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setRel(value: none | nofollow): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setTarget(value: self | blank): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
