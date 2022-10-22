package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libRadioInterfaceMod.RadioChangeEvent
import typingsJapgolly.antd.libRadioInterfaceMod.RadioGroupProps
import typingsJapgolly.antd.libRadioInterfaceMod.RadioProps
import typingsJapgolly.antd.libRadioRadioButtonMod.RadioButtonProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Radio {
  
  object Button {
    
    @JSImport("antd", "Radio.Button")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Button.type): SharedBuilder_RadioButtonPropsRefAttributes745724458 = new SharedBuilder_RadioButtonPropsRefAttributes745724458(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RadioButtonProps & RefAttributes[Any]): SharedBuilder_RadioButtonPropsRefAttributes745724458 = new SharedBuilder_RadioButtonPropsRefAttributes745724458(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Group {
    
    object Type {
      
      @JSImport("antd", "Radio.Group.type")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: Type.type): SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement] = new SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: RadioGroupProps & RefAttributes[HTMLDivElement]): SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement] = new SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    @JSImport("antd", "Radio.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement] = new SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RadioGroupProps & RefAttributes[HTMLDivElement]): SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement] = new SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Radio")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLElement] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(value: RadioChangeEvent => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: RadioChangeEvent) => value(t0).runNow()))
    
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
  
  implicit def make(companion: Radio.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioProps & RefAttributes[HTMLElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
