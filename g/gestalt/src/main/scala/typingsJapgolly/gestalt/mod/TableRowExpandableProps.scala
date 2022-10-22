package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.gestalt.anon.Event
import typingsJapgolly.gestalt.gestaltStrings.gray
import typingsJapgolly.gestalt.gestaltStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRowExpandableProps extends StObject {
  
  var accessibilityCollapseLabel: String
  
  var accessibilityExpandLabel: String
  
  var children: js.UndefOr[Node] = js.undefined
  
  var expandedContents: Node
  
  var hoverStyle: js.UndefOr[none | gray] = js.undefined
  
  var id: String
  
  var onExpand: js.UndefOr[
    AbstractEventHandler[
      (ReactMouseEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]), 
      js.Object
    ]
  ] = js.undefined
}
object TableRowExpandableProps {
  
  inline def apply(accessibilityCollapseLabel: String, accessibilityExpandLabel: String, id: String): TableRowExpandableProps = {
    val __obj = js.Dynamic.literal(accessibilityCollapseLabel = accessibilityCollapseLabel.asInstanceOf[js.Any], accessibilityExpandLabel = accessibilityExpandLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], expandedContents = null)
    __obj.asInstanceOf[TableRowExpandableProps]
  }
  
  extension [Self <: TableRowExpandableProps](x: Self) {
    
    inline def setAccessibilityCollapseLabel(value: String): Self = StObject.set(x, "accessibilityCollapseLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityExpandLabel(value: String): Self = StObject.set(x, "accessibilityExpandLabel", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setExpandedContents(value: VdomNode): Self = StObject.set(x, "expandedContents", value.rawNode.asInstanceOf[js.Any])
    
    inline def setExpandedContentsNull: Self = StObject.set(x, "expandedContents", null)
    
    inline def setExpandedContentsVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "expandedContents", js.Array(value*))
    
    inline def setExpandedContentsVdomElement(value: VdomElement): Self = StObject.set(x, "expandedContents", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHoverStyle(value: none | gray): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnExpand(
      value: /* arg */ js.Object & (Event[
          (ReactMouseEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element])
        ]) => Callback
    ): Self = StObject.set(x, "onExpand", js.Any.fromFunction1((t0: /* arg */ js.Object & (Event[
          (ReactMouseEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element])
        ])) => value(t0).runNow()))
    
    inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
  }
}
