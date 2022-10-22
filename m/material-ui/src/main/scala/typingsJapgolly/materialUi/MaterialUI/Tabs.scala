package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  type Tab = Component[TabProps & js.Object, js.Object]
  
  trait TabProps
    extends StObject
       with SharedEnhancedButtonProps[Component[TabProps & js.Object, js.Object]] {
    
    var buttonStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var label: js.UndefOr[Node] = js.undefined
    
    var onActive: js.UndefOr[js.Function1[Component[TabProps & js.Object, js.Object], Unit]] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object TabProps {
    
    inline def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    extension [Self <: TabProps](x: Self) {
      
      inline def setButtonStyle(value: CSSProperties): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnActive(value: Component[TabProps & js.Object, js.Object] => Callback): Self = StObject.set(x, "onActive", js.Any.fromFunction1((t0: Component[TabProps & js.Object, js.Object]) => value(t0).runNow()))
      
      inline def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Tabs = Component[TabsProps & js.Object, js.Object]
  
  trait TabsProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentContainerClassName: js.UndefOr[String] = js.undefined
    
    var contentContainerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var initialSelectedIndex: js.UndefOr[Double] = js.undefined
    
    var inkBarStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function3[
          /* value */ Any, 
          /* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], 
          Component[TabProps & js.Object, js.Object], 
          Unit
        ]
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabItemContainerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var tabTemplate: js.UndefOr[ComponentClassP[Any & js.Object]] = js.undefined
    
    var tabTemplateStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object TabsProps {
    
    inline def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    extension [Self <: TabsProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentContainerClassName(value: String): Self = StObject.set(x, "contentContainerClassName", value.asInstanceOf[js.Any])
      
      inline def setContentContainerClassNameUndefined: Self = StObject.set(x, "contentContainerClassName", js.undefined)
      
      inline def setContentContainerStyle(value: CSSProperties): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
      
      inline def setInitialSelectedIndex(value: Double): Self = StObject.set(x, "initialSelectedIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectedIndexUndefined: Self = StObject.set(x, "initialSelectedIndex", js.undefined)
      
      inline def setInkBarStyle(value: CSSProperties): Self = StObject.set(x, "inkBarStyle", value.asInstanceOf[js.Any])
      
      inline def setInkBarStyleUndefined: Self = StObject.set(x, "inkBarStyle", js.undefined)
      
      inline def setOnChange(
        value: (/* value */ Any, /* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], Component[TabProps & js.Object, js.Object]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3((t0: /* value */ Any, t1: /* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], t2: Component[TabProps & js.Object, js.Object]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabItemContainerStyle(value: CSSProperties): Self = StObject.set(x, "tabItemContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setTabItemContainerStyleUndefined: Self = StObject.set(x, "tabItemContainerStyle", js.undefined)
      
      inline def setTabTemplate(value: ComponentClassP[Any & js.Object]): Self = StObject.set(x, "tabTemplate", value.asInstanceOf[js.Any])
      
      inline def setTabTemplateStyle(value: CSSProperties): Self = StObject.set(x, "tabTemplateStyle", value.asInstanceOf[js.Any])
      
      inline def setTabTemplateStyleUndefined: Self = StObject.set(x, "tabTemplateStyle", js.undefined)
      
      inline def setTabTemplateUndefined: Self = StObject.set(x, "tabTemplate", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
