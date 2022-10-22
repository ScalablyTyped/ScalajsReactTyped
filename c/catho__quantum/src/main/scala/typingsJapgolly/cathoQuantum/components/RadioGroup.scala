package typingsJapgolly.cathoQuantum.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.ColorsSpacing
import typingsJapgolly.cathoQuantum.anon.ComponentsSpacing
import typingsJapgolly.cathoQuantum.anon.Disabled
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.button
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.error
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.large
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.medium
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.neutral
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.radio
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.small
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.success
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.warning
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xlarge
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xsmall
import typingsJapgolly.cathoQuantum.iconMod.IconNames
import typingsJapgolly.cathoQuantum.radioGroupMod.RadioButtonProps
import typingsJapgolly.cathoQuantum.radioGroupMod.RadioGroupProps
import typingsJapgolly.cathoQuantum.radioGroupMod.RadioProps
import typingsJapgolly.cathoQuantum.radioGroupMod.default
import typingsJapgolly.react.mod.ChangeEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioGroup {
  
  inline def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadioGroupProps]))
  }
  
  object Button {
    
    inline def apply(value: String): typingsJapgolly.cathoQuantum.components.RadioGroup.Button.Builder = {
      val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      new typingsJapgolly.cathoQuantum.components.RadioGroup.Button.Builder(js.Array(this.component, __props.asInstanceOf[RadioButtonProps]))
    }
    
    @JSImport("@catho/quantum/RadioGroup", "default.Button")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
      
      inline def children(value: String): this.type = set("children", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
      
      inline def icon(value: IconNames | String): this.type = set("icon", value.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
      
      inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
      
      inline def onChange(value: CallbackTo[Unit | ChangeEventHandler[HTMLInputElement]]): this.type = set("onChange", value.toJsFn)
      
      inline def size(value: xsmall | small | medium | large | xlarge): this.type = set("size", value.asInstanceOf[js.Any])
      
      inline def skin(value: neutral | primary | success | warning | error): this.type = set("skin", value.asInstanceOf[js.Any])
      
      inline def theme(value: ComponentsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: RadioButtonProps): typingsJapgolly.cathoQuantum.components.RadioGroup.Button.Builder = new typingsJapgolly.cathoQuantum.components.RadioGroup.Button.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Radio {
    
    inline def apply(value: String): typingsJapgolly.cathoQuantum.components.RadioGroup.Radio.Builder = {
      val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      new typingsJapgolly.cathoQuantum.components.RadioGroup.Radio.Builder(js.Array(this.component, __props.asInstanceOf[RadioProps]))
    }
    
    @JSImport("@catho/quantum/RadioGroup", "default.Radio")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def children(value: String | js.Array[Node] | Node): this.type = set("children", value.asInstanceOf[js.Any])
      
      inline def childrenNull: this.type = set("children", null)
      
      inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
      
      inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
      
      inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
      
      inline def onChange(value: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def theme(value: ColorsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: RadioProps): typingsJapgolly.cathoQuantum.components.RadioGroup.Radio.Builder = new typingsJapgolly.cathoQuantum.components.RadioGroup.Radio.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@catho/quantum/RadioGroup", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def children(value: js.Array[Node] | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def onChange(value: CallbackTo[js.Object | ChangeEventHandler[HTMLInputElement]]): this.type = set("onChange", value.toJsFn)
    
    inline def options(value: js.Array[Disabled]): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def optionsVarargs(value: Disabled*): this.type = set("options", js.Array(value*))
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def size(value: xsmall | small | medium | large | xlarge): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def theme(value: ColorsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def `type`(value: radio | button): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
