package typingsJapgolly.reactColor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactColor.libComponentsCommonEditableInputMod.EditableInputProps
import typingsJapgolly.reactColor.libComponentsCommonEditableInputMod.EditableInputStyles
import typingsJapgolly.reactColor.mod.Color
import typingsJapgolly.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditableInput {
  
  @JSImport("react-color/lib/components/common", "EditableInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactColor.libComponentsCommonMod.EditableInput] {
    
    inline def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def dragLabel(value: String): this.type = set("dragLabel", value.asInstanceOf[js.Any])
    
    inline def dragMax(value: String): this.type = set("dragMax", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (value(t0, t1)).runNow()))
    
    inline def style(value: EditableInputStyles): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: EditableInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EditableInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
