package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.gestalt.anon.DangerouslyDisableOnNavigation
import typingsJapgolly.gestalt.anon.Event
import typingsJapgolly.gestalt.gestaltStrings.page
import typingsJapgolly.gestalt.gestaltStrings.section
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideNavigationNestedItemProps extends StObject {
  
  /**
    * When set to 'page' or 'section', it displays the item in "active" state. See the [Accessibility](https://gestalt.pinterest.systems/SideNavigation#Accessibility) guidelines to learn more.
    */
  var active: js.UndefOr[page | section] = js.undefined
  
  /**
    * Directs users to the url when item is selected.
    */
  var href: String
  
  /**
    * Label for the item.
    */
  var label: String
  
  /**
    * Callback when the user selects an item using the mouse or keyboard.
    */
  var onClick: js.UndefOr[
    AbstractEventHandler[
      (ReactMouseEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]), 
      DangerouslyDisableOnNavigation
    ]
  ] = js.undefined
}
object SideNavigationNestedItemProps {
  
  inline def apply(href: String, label: String): SideNavigationNestedItemProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavigationNestedItemProps]
  }
  
  extension [Self <: SideNavigationNestedItemProps](x: Self) {
    
    inline def setActive(value: page | section): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
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
  }
}
