package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideNaviationProps extends StObject {
  
  /**
    * String that clients such as VoiceOver will read to describe the element.
    */
  var accessibilityLabel: String
  
  /**
    * The content shown in SideNavigation.
    * See [subcomponents](https://gestalt.pinterest.systems/sidenavigation#Subcomponents).
    */
  var children: Node
  
  /**
    * Content to display at the bottom of SideNavigation.
    * Open slot available to display other functionality required in the page.
    * See the [Footer variant](https://gestalt.pinterest.systems/sidenavigation#Header) to learn more.
    */
  var footer: js.UndefOr[Node] = js.undefined
  
  /**
    * Content to display at the top of SideNavigation.
    * Open slot used for controlling the display of navigation items.
    * See the [Header variant](https://gestalt.pinterest.systems/sidenavigation#Header) to learn more.
    */
  var header: js.UndefOr[Node] = js.undefined
  
  /**
    * Displays a border in SideNavigation.
    * See the [Border](https://gestalt.pinterest.systems/sidenavigation#Border) variant for more info.
    */
  var showBorder: js.UndefOr[Boolean] = js.undefined
}
object SideNaviationProps {
  
  inline def apply(accessibilityLabel: String): SideNaviationProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], children = null)
    __obj.asInstanceOf[SideNaviationProps]
  }
  
  extension [Self <: SideNaviationProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFooter(value: VdomNode): Self = StObject.set(x, "footer", value.rawNode.asInstanceOf[js.Any])
    
    inline def setFooterNull: Self = StObject.set(x, "footer", null)
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footer", js.Array(value*))
    
    inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHeader(value: VdomNode): Self = StObject.set(x, "header", value.rawNode.asInstanceOf[js.Any])
    
    inline def setHeaderNull: Self = StObject.set(x, "header", null)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "header", js.Array(value*))
    
    inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "header", value.rawElement.asInstanceOf[js.Any])
    
    inline def setShowBorder(value: Boolean): Self = StObject.set(x, "showBorder", value.asInstanceOf[js.Any])
    
    inline def setShowBorderUndefined: Self = StObject.set(x, "showBorder", js.undefined)
  }
}
