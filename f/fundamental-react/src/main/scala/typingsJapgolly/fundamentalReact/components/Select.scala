package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.anon.State
import typingsJapgolly.fundamentalReact.libSelectSelectMod.Option
import typingsJapgolly.fundamentalReact.libSelectSelectMod.SelectProps
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Select {
  
  @JSImport("fundamental-react", "Select")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    inline def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def emptyAriaLabel(value: String): this.type = set("emptyAriaLabel", value.asInstanceOf[js.Any])
    
    inline def formMessageProps(value: Record[String, Any]): this.type = set("formMessageProps", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def includeEmptyOption(value: Boolean): this.type = set("includeEmptyOption", value.asInstanceOf[js.Any])
    
    inline def innerRefClassName(value: String): this.type = set("innerRefClassName", value.asInstanceOf[js.Any])
    
    inline def listClassName(value: String): this.type = set("listClassName", value.asInstanceOf[js.Any])
    
    inline def listItemClassName(value: String): this.type = set("listItemClassName", value.asInstanceOf[js.Any])
    
    inline def listItemTextClassName(value: String): this.type = set("listItemTextClassName", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* event */ ReactFocusEventFrom[HTMLDivElement] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def onClick(value: /* event */ ReactMouseEventFrom[HTMLButtonElement] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
    
    inline def onSelect(
      value: (/* event */ ReactMouseEventFrom[HTMLLIElement] | ReactKeyboardEventFrom[HTMLLIElement], /* selectedOption */ Option) => Callback
    ): this.type = set("onSelect", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLLIElement] | ReactKeyboardEventFrom[HTMLLIElement], t1: /* selectedOption */ Option) => (value(t0, t1)).runNow()))
    
    inline def options(value: js.Array[Option]): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def optionsVarargs(value: Option*): this.type = set("options", js.Array(value*))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def popperClassName(value: String): this.type = set("popperClassName", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def referenceClassName(value: String): this.type = set("referenceClassName", value.asInstanceOf[js.Any])
    
    inline def selectedKey(value: String): this.type = set("selectedKey", value.asInstanceOf[js.Any])
    
    inline def textContentClassName(value: String): this.type = set("textContentClassName", value.asInstanceOf[js.Any])
    
    inline def triggerClassName(value: String): this.type = set("triggerClassName", value.asInstanceOf[js.Any])
    
    inline def validationState(value: State): this.type = set("validationState", value.asInstanceOf[js.Any])
    
    inline def wrapperProps(value: Record[String, Any]): this.type = set("wrapperProps", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Select.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SelectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
