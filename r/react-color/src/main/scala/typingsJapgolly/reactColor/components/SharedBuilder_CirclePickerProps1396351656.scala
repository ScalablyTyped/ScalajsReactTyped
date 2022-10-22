package typingsJapgolly.reactColor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactColor.anon.PartialClassesCirclePicke
import typingsJapgolly.reactColor.mod.Color
import typingsJapgolly.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_CirclePickerProps1396351656[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def circleSize(value: Double): this.type = set("circleSize", value.asInstanceOf[js.Any])
  
  inline def circleSpacing(value: Double): this.type = set("circleSpacing", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
  
  inline def colors(value: js.Array[String]): this.type = set("colors", value.asInstanceOf[js.Any])
  
  inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
  
  inline def onChange(value: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (value(t0, t1)).runNow()))
  
  inline def onChangeComplete(value: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): this.type = set("onChangeComplete", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (value(t0, t1)).runNow()))
  
  inline def onSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Callback): this.type = set("onSwatchHover", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ MouseEvent) => (value(t0, t1)).runNow()))
  
  inline def styles(value: PartialClassesCirclePicke): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
}
