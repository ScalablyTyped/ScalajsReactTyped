package typingsJapgolly.cathoQuantum.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.BaseFontSize
import typingsJapgolly.cathoQuantum.anon.Checked
import typingsJapgolly.cathoQuantum.anon.ColorsSpacing
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.button
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.checkbox
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.error
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.large
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.medium
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.neutral
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.small
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.success
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.warning
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xlarge
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xsmall
import typingsJapgolly.cathoQuantum.checkboxMod.CheckboxButtonProps
import typingsJapgolly.cathoQuantum.checkboxMod.CheckboxGroupProps
import typingsJapgolly.cathoQuantum.checkboxMod.CheckboxProps
import typingsJapgolly.cathoQuantum.checkboxMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckboxGroup {
  
  inline def apply(`type`: checkbox | button): Builder = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CheckboxGroupProps]))
  }
  
  object Button {
    
    inline def apply(name: String): typingsJapgolly.cathoQuantum.components.CheckboxGroup.Button.Builder = {
      val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      new typingsJapgolly.cathoQuantum.components.CheckboxGroup.Button.Builder(js.Array(this.component, __props.asInstanceOf[CheckboxButtonProps]))
    }
    
    @JSImport("@catho/quantum/Checkbox", "CheckboxGroup.Button")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
      
      inline def children(value: js.Array[Node] | Node): this.type = set("children", value.asInstanceOf[js.Any])
      
      inline def childrenNull: this.type = set("children", null)
      
      inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
      
      inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
      
      inline def icon(value: String): this.type = set("icon", value.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
      
      inline def onChange(value: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def size(value: xsmall | small | medium | large | xlarge): this.type = set("size", value.asInstanceOf[js.Any])
      
      inline def skin(value: neutral | primary | success | warning | error): this.type = set("skin", value.asInstanceOf[js.Any])
      
      inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: CheckboxButtonProps): typingsJapgolly.cathoQuantum.components.CheckboxGroup.Button.Builder = new typingsJapgolly.cathoQuantum.components.CheckboxGroup.Button.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Checkbox {
    
    inline def apply(name: String): typingsJapgolly.cathoQuantum.components.CheckboxGroup.Checkbox.Builder = {
      val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      new typingsJapgolly.cathoQuantum.components.CheckboxGroup.Checkbox.Builder(js.Array(this.component, __props.asInstanceOf[CheckboxProps]))
    }
    
    @JSImport("@catho/quantum/Checkbox", "CheckboxGroup.Checkbox")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
      
      inline def children(value: String): this.type = set("children", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
      
      inline def onChange(value: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def theme(value: BaseFontSize): this.type = set("theme", value.asInstanceOf[js.Any])
      
      inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: CheckboxProps): typingsJapgolly.cathoQuantum.components.CheckboxGroup.Checkbox.Builder = new typingsJapgolly.cathoQuantum.components.CheckboxGroup.Checkbox.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@catho/quantum/Checkbox", "CheckboxGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.cathoQuantum.checkboxMod.CheckboxGroup] {
    
    inline def children(
      value: js.Array[typingsJapgolly.react.mod.global.JSX.Element] | typingsJapgolly.react.mod.global.JSX.Element
    ): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: typingsJapgolly.react.mod.global.JSX.Element*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* items */ js.UndefOr[Options], /* event */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChangeEvent<HTMLInputElement> */ Any
        ]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction2((t0: /* items */ js.UndefOr[Options], t1: /* event */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChangeEvent<HTMLInputElement> */ Any
        ]) => (value(t0, t1)).runNow()))
    
    inline def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def optionsVarargs(value: Checked*): this.type = set("options", js.Array(value*))
    
    inline def size(value: xsmall | small | medium | large | xlarge): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def theme(value: ColorsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CheckboxGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
