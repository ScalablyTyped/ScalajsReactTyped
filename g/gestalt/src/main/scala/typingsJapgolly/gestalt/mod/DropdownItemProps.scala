package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.gestalt.anon.Event
import typingsJapgolly.gestalt.anon.ItemDropdownOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownItemProps extends StObject {
  
  /**
    * When supplied, will display a Badge next to the item's label.
    */
  var badge: js.UndefOr[BadgeObject] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  /**
    * When supplied, will add a data-test-id prop to the dom element.
    */
  var dataTestId: js.UndefOr[String] = js.undefined
  
  var onSelect: AbstractEventHandler[ReactFocusEventFrom[HTMLInputElement], ItemDropdownOption]
  
  var option: DropdownOption
  
  /**
    * Either the selected item info or an array of selected items,
    * used to determine when the "selected" icon appears on an item
    */
  var selected: js.UndefOr[DropdownOption | js.Array[DropdownOption]] = js.undefined
}
object DropdownItemProps {
  
  inline def apply(
    onSelect: /* arg */ ItemDropdownOption & Event[ReactFocusEventFrom[HTMLInputElement]] => Callback,
    option: DropdownOption
  ): DropdownItemProps = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1((t0: /* arg */ ItemDropdownOption & Event[ReactFocusEventFrom[HTMLInputElement]]) => onSelect(t0).runNow()), option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownItemProps]
  }
  
  extension [Self <: DropdownItemProps](x: Self) {
    
    inline def setBadge(value: BadgeObject): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDataTestId(value: String): Self = StObject.set(x, "dataTestId", value.asInstanceOf[js.Any])
    
    inline def setDataTestIdUndefined: Self = StObject.set(x, "dataTestId", js.undefined)
    
    inline def setOnSelect(value: /* arg */ ItemDropdownOption & Event[ReactFocusEventFrom[HTMLInputElement]] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* arg */ ItemDropdownOption & Event[ReactFocusEventFrom[HTMLInputElement]]) => value(t0).runNow()))
    
    inline def setOption(value: DropdownOption): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: DropdownOption | js.Array[DropdownOption]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSelectedVarargs(value: DropdownOption*): Self = StObject.set(x, "selected", js.Array(value*))
  }
}
