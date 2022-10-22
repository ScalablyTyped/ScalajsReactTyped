package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libCheckboxCheckboxMod.CheckboxChangeEvent
import typingsJapgolly.antd.libCheckboxCheckboxMod.CheckboxProps
import typingsJapgolly.antd.libCheckboxGroupMod.CheckboxGroupProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Checkbox {
  
  object Group {
    
    object Type {
      
      @JSImport("antd", "Checkbox.Group.type")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: Type.type): SharedBuilder_CheckboxGroupPropsRefAttributes_1473907240[HTMLDivElement] = new SharedBuilder_CheckboxGroupPropsRefAttributes_1473907240[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: CheckboxGroupProps & RefAttributes[HTMLDivElement]): SharedBuilder_CheckboxGroupPropsRefAttributes_1473907240[HTMLDivElement] = new SharedBuilder_CheckboxGroupPropsRefAttributes_1473907240[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    @JSImport("antd", "Checkbox.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_CheckboxGroupPropsRefAttributes_1473907240[HTMLDivElement] = new SharedBuilder_CheckboxGroupPropsRefAttributes_1473907240[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CheckboxGroupProps & RefAttributes[HTMLDivElement]): SharedBuilder_CheckboxGroupPropsRefAttributes_1473907240[HTMLDivElement] = new SharedBuilder_CheckboxGroupPropsRefAttributes_1473907240[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Checkbox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLInputElement] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def indeterminate(value: Boolean): this.type = set("indeterminate", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(value: CheckboxChangeEvent => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: CheckboxChangeEvent) => value(t0).runNow()))
    
    inline def onClick(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def skipGroup(value: Boolean): this.type = set("skipGroup", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Checkbox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CheckboxProps & RefAttributes[HTMLInputElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
