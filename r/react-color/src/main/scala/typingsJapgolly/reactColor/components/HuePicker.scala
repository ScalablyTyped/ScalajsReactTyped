package typingsJapgolly.reactColor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactColor.anon.PartialClassesHuePickerSt
import typingsJapgolly.reactColor.libComponentsHueHueMod.HuePickerProps
import typingsJapgolly.reactColor.mod.Color
import typingsJapgolly.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HuePicker {
  
  @JSImport("react-color", "HuePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactColor.mod.HuePicker] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (value(t0, t1)).runNow()))
    
    inline def onChangeComplete(value: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): this.type = set("onChangeComplete", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (value(t0, t1)).runNow()))
    
    inline def styles(value: PartialClassesHuePickerSt): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HuePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HuePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
