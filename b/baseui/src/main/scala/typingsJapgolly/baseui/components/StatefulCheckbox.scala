package typingsJapgolly.baseui.components

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.checkboxTypesMod.CheckboxReducerState
import typingsJapgolly.baseui.checkboxTypesMod.LabelPlacement
import typingsJapgolly.baseui.checkboxTypesMod.StatefulCheckboxProps
import typingsJapgolly.baseui.checkboxTypesMod.StyleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulCheckbox {
  
  @JSImport("baseui/checkbox", "StatefulCheckbox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def checkmarkType(value: StyleType): this.type = set("checkmarkType", value.asInstanceOf[js.Any])
    
    inline def containsInteractiveElement(value: Boolean): this.type = set("containsInteractiveElement", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def initialState(value: CheckboxReducerState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: RefHandle[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    inline def isIndeterminate(value: Boolean): this.type = set("isIndeterminate", value.asInstanceOf[js.Any])
    
    inline def labelPlacement(value: LabelPlacement): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    inline def onChange(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onFocus(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    inline def onMouseDown(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    inline def onMouseEnter(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    inline def onMouseLeave(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    inline def onMouseUp(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    inline def overrides(value: Any): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StatefulCheckbox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StatefulCheckboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
