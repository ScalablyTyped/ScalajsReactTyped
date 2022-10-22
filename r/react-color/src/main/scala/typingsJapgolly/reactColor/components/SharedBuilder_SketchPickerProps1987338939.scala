package typingsJapgolly.reactColor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactColor.anon.PartialClassesSketchPicke
import typingsJapgolly.reactColor.libComponentsSketchSketchMod.PresetColor
import typingsJapgolly.reactColor.mod.Color
import typingsJapgolly.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_SketchPickerProps1987338939[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
  
  inline def disableAlpha(value: Boolean): this.type = set("disableAlpha", value.asInstanceOf[js.Any])
  
  inline def onChange(value: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (value(t0, t1)).runNow()))
  
  inline def onChangeComplete(value: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): this.type = set("onChangeComplete", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (value(t0, t1)).runNow()))
  
  inline def onSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Callback): this.type = set("onSwatchHover", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ MouseEvent) => (value(t0, t1)).runNow()))
  
  inline def presetColors(value: js.Array[PresetColor]): this.type = set("presetColors", value.asInstanceOf[js.Any])
  
  inline def presetColorsVarargs(value: PresetColor*): this.type = set("presetColors", js.Array(value*))
  
  inline def styles(value: PartialClassesSketchPicke): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
}
