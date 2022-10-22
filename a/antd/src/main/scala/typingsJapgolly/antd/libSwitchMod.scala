package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwitchMod extends Shortcut {
  
  @JSImport("antd/lib/switch", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  type CompoundedComponent = ForwardRefExoticComponent[SwitchProps & RefAttributes[HTMLElement]]
  
  type SwitchChangeEventHandler = js.Function2[/* checked */ Boolean, /* event */ ReactMouseEventFrom[HTMLButtonElement], Unit]
  
  type SwitchClickEventHandler = SwitchChangeEventHandler
  
  trait SwitchProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var checkedChildren: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[SwitchChangeEventHandler] = js.undefined
    
    var onClick: js.UndefOr[SwitchClickEventHandler] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[SwitchSize] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var unCheckedChildren: js.UndefOr[Node] = js.undefined
  }
  object SwitchProps {
    
    inline def apply(): SwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchProps]
    }
    
    extension [Self <: SwitchProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedChildren(value: VdomNode): Self = StObject.set(x, "checkedChildren", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCheckedChildrenNull: Self = StObject.set(x, "checkedChildren", null)
      
      inline def setCheckedChildrenUndefined: Self = StObject.set(x, "checkedChildren", js.undefined)
      
      inline def setCheckedChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "checkedChildren", js.Array(value*))
      
      inline def setCheckedChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "checkedChildren", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnChange(value: (/* checked */ Boolean, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* checked */ Boolean, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: (/* checked */ Boolean, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* checked */ Boolean, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSize(value: SwitchSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUnCheckedChildren(value: VdomNode): Self = StObject.set(x, "unCheckedChildren", value.rawNode.asInstanceOf[js.Any])
      
      inline def setUnCheckedChildrenNull: Self = StObject.set(x, "unCheckedChildren", null)
      
      inline def setUnCheckedChildrenUndefined: Self = StObject.set(x, "unCheckedChildren", js.undefined)
      
      inline def setUnCheckedChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "unCheckedChildren", js.Array(value*))
      
      inline def setUnCheckedChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "unCheckedChildren", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.small
    - typingsJapgolly.antd.antdStrings.default
  */
  trait SwitchSize extends StObject
  object SwitchSize {
    
    inline def default: typingsJapgolly.antd.antdStrings.default = "default".asInstanceOf[typingsJapgolly.antd.antdStrings.default]
    
    inline def small: typingsJapgolly.antd.antdStrings.small = "small".asInstanceOf[typingsJapgolly.antd.antdStrings.small]
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `libSwitchMod.foo` */
  override def _to: CompoundedComponent = default
}
