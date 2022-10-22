package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.center
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.left
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.right
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableListItemMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/TableListItem", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TableListItemProps & RefAttributes[TableListItemImperativeActions]] = js.native
  
  trait TableListItemColumn extends StObject {
    
    var align: js.UndefOr[left | center | right] = js.undefined
    
    var value: Node
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object TableListItemColumn {
    
    inline def apply(): TableListItemColumn = {
      val __obj = js.Dynamic.literal(value = null)
      __obj.asInstanceOf[TableListItemColumn]
    }
    
    extension [Self <: TableListItemColumn](x: Self) {
      
      inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setValue(value: VdomNode): Self = StObject.set(x, "value", value.rawNode.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setValueVdomElement(value: VdomElement): Self = StObject.set(x, "value", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait TableListItemImperativeActions extends StObject {
    
    def focus(): Unit
  }
  object TableListItemImperativeActions {
    
    inline def apply(focus: Callback): TableListItemImperativeActions = {
      val __obj = js.Dynamic.literal(focus = focus.toJsFn)
      __obj.asInstanceOf[TableListItemImperativeActions]
    }
    
    extension [Self <: TableListItemImperativeActions](x: Self) {
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    }
  }
  
  trait TableListItemProps extends StObject {
    
    var checkbox: js.UndefOr[Boolean] = js.undefined
    
    var checkboxDisabled: js.UndefOr[Boolean] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dragDisabled: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var dragging: js.UndefOr[Boolean] = js.undefined
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[org.scalajs.dom.Element], Unit]] = js.undefined
    
    var onCheckboxChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onClick: js.UndefOr[js.Function] = js.undefined
    
    var onKeyUp: js.UndefOr[js.Function1[/* e */ KeyboardEvent, Unit]] = js.undefined
    
    var options: js.Array[TableListItemColumn]
    
    var showDivider: js.UndefOr[Boolean] = js.undefined
    
    var verticalPadding: js.UndefOr[tiny | small | medium] = js.undefined
  }
  object TableListItemProps {
    
    inline def apply(options: js.Array[TableListItemColumn]): TableListItemProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableListItemProps]
    }
    
    extension [Self <: TableListItemProps](x: Self) {
      
      inline def setCheckbox(value: Boolean): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setCheckboxDisabled(value: Boolean): Self = StObject.set(x, "checkboxDisabled", value.asInstanceOf[js.Any])
      
      inline def setCheckboxDisabledUndefined: Self = StObject.set(x, "checkboxDisabled", js.undefined)
      
      inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDragDisabled(value: Boolean): Self = StObject.set(x, "dragDisabled", value.asInstanceOf[js.Any])
      
      inline def setDragDisabledUndefined: Self = StObject.set(x, "dragDisabled", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setOnBlur(value: /* e */ ReactFocusEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* e */ ReactFocusEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCheckboxChange(value: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCheckboxChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCheckboxChangeUndefined: Self = StObject.set(x, "onCheckboxChange", js.undefined)
      
      inline def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyUp(value: /* e */ KeyboardEvent => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: /* e */ KeyboardEvent) => value(t0).runNow()))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOptions(value: js.Array[TableListItemColumn]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: TableListItemColumn*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setShowDivider(value: Boolean): Self = StObject.set(x, "showDivider", value.asInstanceOf[js.Any])
      
      inline def setShowDividerUndefined: Self = StObject.set(x, "showDivider", js.undefined)
      
      inline def setVerticalPadding(value: tiny | small | medium): Self = StObject.set(x, "verticalPadding", value.asInstanceOf[js.Any])
      
      inline def setVerticalPaddingUndefined: Self = StObject.set(x, "verticalPadding", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[TableListItemProps & RefAttributes[TableListItemImperativeActions]]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesTableListItemMod.foo` */
  override def _to: ForwardRefExoticComponent[TableListItemProps & RefAttributes[TableListItemImperativeActions]] = default
}
