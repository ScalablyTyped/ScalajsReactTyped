package typingsJapgolly.primereact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuitemMenuitemMod {
  
  trait MenuItem extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var command: js.UndefOr[js.Function1[/* e */ MenuItemCommandParams, Unit]] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[Any] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var items: js.UndefOr[js.Array[js.Array[MenuItem] | MenuItem]] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var separator: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[MenuItemTemplateType] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object MenuItem {
    
    inline def apply(): MenuItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItem]
    }
    
    extension [Self <: MenuItem](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCommand(value: /* e */ MenuItemCommandParams => Callback): Self = StObject.set(x, "command", js.Any.fromFunction1((t0: /* e */ MenuItemCommandParams) => value(t0).runNow()))
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItems(value: js.Array[js.Array[MenuItem] | MenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: (js.Array[MenuItem] | MenuItem)*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSeparator(value: Boolean): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTemplate(value: MenuItemTemplateType): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateFunction2(value: (/* item */ MenuItem, /* options */ MenuItemOptions) => Node): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
      
      inline def setTemplateNull: Self = StObject.set(x, "template", null)
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTemplateVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "template", js.Array(value*))
      
      inline def setTemplateVdomElement(value: VdomElement): Self = StObject.set(x, "template", value.rawElement.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait MenuItemCommandParams extends StObject {
    
    var item: MenuItem
    
    var originalEvent: ReactEventFrom[org.scalajs.dom.Element]
  }
  object MenuItemCommandParams {
    
    inline def apply(item: MenuItem, originalEvent: ReactEventFrom[org.scalajs.dom.Element]): MenuItemCommandParams = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemCommandParams]
    }
    
    extension [Self <: MenuItemCommandParams](x: Self) {
      
      inline def setItem(value: MenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: ReactEventFrom[org.scalajs.dom.Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait MenuItemOptions extends StObject {
    
    var className: String
    
    var element: Node
    
    var iconClassName: String
    
    var labelClassName: String
    
    def onClick(event: ReactEventFrom[org.scalajs.dom.Element]): Unit
    
    var props: Any
  }
  object MenuItemOptions {
    
    inline def apply(
      className: String,
      iconClassName: String,
      labelClassName: String,
      onClick: ReactEventFrom[org.scalajs.dom.Element] => Callback,
      props: Any
    ): MenuItemOptions = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], iconClassName = iconClassName.asInstanceOf[js.Any], labelClassName = labelClassName.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => onClick(t0).runNow()), props = props.asInstanceOf[js.Any], element = null)
      __obj.asInstanceOf[MenuItemOptions]
    }
    
    extension [Self <: MenuItemOptions](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setElement(value: VdomNode): Self = StObject.set(x, "element", value.rawNode.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "element", js.Array(value*))
      
      inline def setElementVdomElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      inline def setLabelClassName(value: String): Self = StObject.set(x, "labelClassName", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: ReactEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type MenuItemTemplateType = Node | (js.Function2[/* item */ MenuItem, /* options */ MenuItemOptions, Node])
}
