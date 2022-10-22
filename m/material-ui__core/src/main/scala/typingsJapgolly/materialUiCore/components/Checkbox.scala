package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiCore.checkboxCheckboxMod.CheckboxClassKey
import typingsJapgolly.materialUiCore.checkboxCheckboxMod.CheckboxProps
import typingsJapgolly.materialUiCore.materialUiCoreStrings.default
import typingsJapgolly.materialUiCore.materialUiCoreStrings.medium
import typingsJapgolly.materialUiCore.materialUiCoreStrings.primary
import typingsJapgolly.materialUiCore.materialUiCoreStrings.secondary
import typingsJapgolly.materialUiCore.materialUiCoreStrings.small
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Checkbox {
  
  @JSImport("@material-ui/core", "Checkbox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def checkedIcon(value: VdomNode): this.type = set("checkedIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def checkedIconNull: this.type = set("checkedIcon", null)
    
    inline def checkedIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("checkedIcon", js.Array(value*))
    
    inline def checkedIconVdomElement(value: VdomElement): this.type = set("checkedIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classes(value: Partial[ClassNameMap[CheckboxClassKey]]): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def color(value: primary | secondary | default): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def disableRipple(value: Boolean): this.type = set("disableRipple", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomNode): this.type = set("icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def indeterminate(value: Boolean): this.type = set("indeterminate", value.asInstanceOf[js.Any])
    
    inline def indeterminateIcon(value: VdomNode): this.type = set("indeterminateIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def indeterminateIconNull: this.type = set("indeterminateIcon", null)
    
    inline def indeterminateIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("indeterminateIcon", js.Array(value*))
    
    inline def indeterminateIconVdomElement(value: VdomElement): this.type = set("indeterminateIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def innerRef(value: Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
    
    inline def inputProps(value: InputHTMLAttributes[HTMLInputElement]): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: Ref[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    inline def inputRefFunction1(value: HTMLInputElement | Null => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
    
    inline def inputRefNull: this.type = set("inputRef", null)
    
    inline def onChange(value: (/* event */ ReactEventFrom[HTMLInputElement], /* checked */ Boolean) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLInputElement], t1: /* checked */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def ref(
      value: /* import warning: importer.ImportType#apply Failed type conversion: C extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
    ): this.type = set("ref", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Checkbox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CheckboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
