package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.gestaltStrings.expandable
import typingsJapgolly.gestalt.gestaltStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideNavigationNestedGroup extends StObject {
  
  /**
    * Content of the group. See [nested directory](#Nested-directory) variant for more information.
    */
  var children: Node
  
  /**
    * Nested directories can be static or expandable. See [nested directory](#Nested-directory) variant for more information.
    */
  var display: js.UndefOr[expandable | static] = js.undefined
  
  /**
    * Label for the group. See [nested directory](#Nested-directory) variant for more information.
    */
  var label: String
}
object SideNavigationNestedGroup {
  
  inline def apply(label: String): SideNavigationNestedGroup = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], children = null)
    __obj.asInstanceOf[SideNavigationNestedGroup]
  }
  
  extension [Self <: SideNavigationNestedGroup](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDisplay(value: expandable | static): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
