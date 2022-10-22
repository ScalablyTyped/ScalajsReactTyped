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

trait SideNavigationSectionProps extends StObject {
  
  /**
    * Any [SideNavigation.TopItem](https://gestalt.pinterest.systems/sidenavigation#SideNavigation.TopItem) to be rendered
    */
  var children: Node
  
  /**
    * Label for the section. See the [Sections](https://gestalt.pinterest.systems/sidenavigation#Sections) variant for more info.
    */
  var label: String
}
object SideNavigationSectionProps {
  
  inline def apply(label: String): SideNavigationSectionProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], children = null)
    __obj.asInstanceOf[SideNavigationSectionProps]
  }
  
  extension [Self <: SideNavigationSectionProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
