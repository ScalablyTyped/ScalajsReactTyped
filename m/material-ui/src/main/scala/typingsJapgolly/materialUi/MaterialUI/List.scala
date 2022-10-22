package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  type List = Component[ListProps & js.Object, js.Object]
  
  type ListItem = Component[ListItemProps & js.Object, js.Object]
  
  trait ListItemProps
    extends StObject
       with EnhancedButtonProps {
    
    // <EnhancedButton/> is the element that get the 'other' properties
    var autoGenerateNestedIndicator: js.UndefOr[Boolean] = js.undefined
    
    var hoverColor: js.UndefOr[String] = js.undefined
    
    var initiallyOpen: js.UndefOr[Boolean] = js.undefined
    
    var innerDivStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var insetChildren: js.UndefOr[Boolean] = js.undefined
    
    var leftAvatar: js.UndefOr[Element] = js.undefined
    
    var leftCheckbox: js.UndefOr[Element] = js.undefined
    
    var leftIcon: js.UndefOr[Element] = js.undefined
    
    var nestedItems: js.UndefOr[js.Array[Element]] = js.undefined
    
    var nestedLevel: js.UndefOr[Double] = js.undefined
    
    var nestedListStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onNestedListToggle: js.UndefOr[js.Function1[Component[ListItemProps & js.Object, js.Object], Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var primaryText: js.UndefOr[Node] = js.undefined
    
    var primaryTogglesNestedList: js.UndefOr[Boolean] = js.undefined
    
    var rightAvatar: js.UndefOr[Element] = js.undefined
    
    var rightIcon: js.UndefOr[Element] = js.undefined
    
    var rightIconButton: js.UndefOr[Element] = js.undefined
    
    var rightToggle: js.UndefOr[Element] = js.undefined
    
    var secondaryText: js.UndefOr[Node] = js.undefined
    
    var secondaryTextLines: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object ListItemProps {
    
    inline def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    extension [Self <: ListItemProps](x: Self) {
      
      inline def setAutoGenerateNestedIndicator(value: Boolean): Self = StObject.set(x, "autoGenerateNestedIndicator", value.asInstanceOf[js.Any])
      
      inline def setAutoGenerateNestedIndicatorUndefined: Self = StObject.set(x, "autoGenerateNestedIndicator", js.undefined)
      
      inline def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
      
      inline def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
      
      inline def setInitiallyOpen(value: Boolean): Self = StObject.set(x, "initiallyOpen", value.asInstanceOf[js.Any])
      
      inline def setInitiallyOpenUndefined: Self = StObject.set(x, "initiallyOpen", js.undefined)
      
      inline def setInnerDivStyle(value: CSSProperties): Self = StObject.set(x, "innerDivStyle", value.asInstanceOf[js.Any])
      
      inline def setInnerDivStyleUndefined: Self = StObject.set(x, "innerDivStyle", js.undefined)
      
      inline def setInsetChildren(value: Boolean): Self = StObject.set(x, "insetChildren", value.asInstanceOf[js.Any])
      
      inline def setInsetChildrenUndefined: Self = StObject.set(x, "insetChildren", js.undefined)
      
      inline def setLeftAvatar(value: VdomElement): Self = StObject.set(x, "leftAvatar", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLeftAvatarUndefined: Self = StObject.set(x, "leftAvatar", js.undefined)
      
      inline def setLeftCheckbox(value: VdomElement): Self = StObject.set(x, "leftCheckbox", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLeftCheckboxUndefined: Self = StObject.set(x, "leftCheckbox", js.undefined)
      
      inline def setLeftIcon(value: VdomElement): Self = StObject.set(x, "leftIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      inline def setNestedItems(value: js.Array[Element]): Self = StObject.set(x, "nestedItems", value.asInstanceOf[js.Any])
      
      inline def setNestedItemsUndefined: Self = StObject.set(x, "nestedItems", js.undefined)
      
      inline def setNestedItemsVarargs(value: Element*): Self = StObject.set(x, "nestedItems", js.Array(value*))
      
      inline def setNestedLevel(value: Double): Self = StObject.set(x, "nestedLevel", value.asInstanceOf[js.Any])
      
      inline def setNestedLevelUndefined: Self = StObject.set(x, "nestedLevel", js.undefined)
      
      inline def setNestedListStyle(value: CSSProperties): Self = StObject.set(x, "nestedListStyle", value.asInstanceOf[js.Any])
      
      inline def setNestedListStyleUndefined: Self = StObject.set(x, "nestedListStyle", js.undefined)
      
      inline def setOnNestedListToggle(value: Component[ListItemProps & js.Object, js.Object] => Callback): Self = StObject.set(x, "onNestedListToggle", js.Any.fromFunction1((t0: Component[ListItemProps & js.Object, js.Object]) => value(t0).runNow()))
      
      inline def setOnNestedListToggleUndefined: Self = StObject.set(x, "onNestedListToggle", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPrimaryText(value: VdomNode): Self = StObject.set(x, "primaryText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrimaryTextNull: Self = StObject.set(x, "primaryText", null)
      
      inline def setPrimaryTextUndefined: Self = StObject.set(x, "primaryText", js.undefined)
      
      inline def setPrimaryTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "primaryText", js.Array(value*))
      
      inline def setPrimaryTextVdomElement(value: VdomElement): Self = StObject.set(x, "primaryText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrimaryTogglesNestedList(value: Boolean): Self = StObject.set(x, "primaryTogglesNestedList", value.asInstanceOf[js.Any])
      
      inline def setPrimaryTogglesNestedListUndefined: Self = StObject.set(x, "primaryTogglesNestedList", js.undefined)
      
      inline def setRightAvatar(value: VdomElement): Self = StObject.set(x, "rightAvatar", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRightAvatarUndefined: Self = StObject.set(x, "rightAvatar", js.undefined)
      
      inline def setRightIcon(value: VdomElement): Self = StObject.set(x, "rightIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRightIconButton(value: VdomElement): Self = StObject.set(x, "rightIconButton", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRightIconButtonUndefined: Self = StObject.set(x, "rightIconButton", js.undefined)
      
      inline def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
      
      inline def setRightToggle(value: VdomElement): Self = StObject.set(x, "rightToggle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRightToggleUndefined: Self = StObject.set(x, "rightToggle", js.undefined)
      
      inline def setSecondaryText(value: VdomNode): Self = StObject.set(x, "secondaryText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSecondaryTextLines(value: Double): Self = StObject.set(x, "secondaryTextLines", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTextLinesUndefined: Self = StObject.set(x, "secondaryTextLines", js.undefined)
      
      inline def setSecondaryTextNull: Self = StObject.set(x, "secondaryText", null)
      
      inline def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      inline def setSecondaryTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "secondaryText", js.Array(value*))
      
      inline def setSecondaryTextVdomElement(value: VdomElement): Self = StObject.set(x, "secondaryText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type ListProps = HTMLAttributes[js.Object]
  
  trait SelectableProps extends StObject {
    
    var onChange: js.UndefOr[
        js.Function2[/* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], /* value */ Any, Unit]
      ] = js.undefined
    
    var selectedItemStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object SelectableProps {
    
    inline def apply(): SelectableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectableProps]
    }
    
    extension [Self <: SelectableProps](x: Self) {
      
      inline def setOnChange(value: (/* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], /* value */ Any) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], t1: /* value */ Any) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSelectedItemStyle(value: CSSProperties): Self = StObject.set(x, "selectedItemStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemStyleUndefined: Self = StObject.set(x, "selectedItemStyle", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
