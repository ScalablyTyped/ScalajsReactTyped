package typingsJapgolly.baseui.components

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.baseui.baseuiStrings.top
import typingsJapgolly.baseui.radioTypesMod.Align
import typingsJapgolly.baseui.radioTypesMod.RadioOverrides
import typingsJapgolly.baseui.radioTypesMod.RadioProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Radio {
  
  @JSImport("baseui/radio", "Radio")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.radioMod.Radio] {
    
    inline def align(value: Align): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def containsInteractiveElement(value: Boolean): this.type = set("containsInteractiveElement", value.asInstanceOf[js.Any])
    
    inline def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: RefHandle[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    inline def isFocusVisible(value: Boolean): this.type = set("isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def isFocused(value: Boolean): this.type = set("isFocused", value.asInstanceOf[js.Any])
    
    inline def labelPlacement(value: top | right | bottom | left): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    inline def onChange(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onFocus(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    inline def onMouseDown(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    inline def onMouseEnter(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    inline def onMouseLeave(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    inline def onMouseUp(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    inline def overrides(value: RadioOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: String): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Radio.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
