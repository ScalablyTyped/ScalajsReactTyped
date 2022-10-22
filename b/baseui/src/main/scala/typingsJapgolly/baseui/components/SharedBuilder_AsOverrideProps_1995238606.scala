package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.sliderTypesMod.StyleProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AsOverrideProps_1995238606[C /* <: ElementType */] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
  
  inline def $disabled(value: Boolean): this.type = set("$disabled", value.asInstanceOf[js.Any])
  
  inline def $isDragged(value: Boolean): this.type = set("$isDragged", value.asInstanceOf[js.Any])
  
  inline def $isFocusVisible(value: Boolean): this.type = set("$isFocusVisible", value.asInstanceOf[js.Any])
  
  inline def $marks(value: Boolean): this.type = set("$marks", value.asInstanceOf[js.Any])
  
  inline def $max(value: Double): this.type = set("$max", value.asInstanceOf[js.Any])
  
  inline def $min(value: Double): this.type = set("$min", value.asInstanceOf[js.Any])
  
  inline def $style(value: StyleObject | (js.Function1[StyleProps, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
  
  inline def $styleFunction1(value: StyleProps => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
  
  inline def $thumbIndex(value: Double): this.type = set("$thumbIndex", value.asInstanceOf[js.Any])
  
  inline def $value(value: js.Array[Double]): this.type = set("$value", value.asInstanceOf[js.Any])
  
  inline def $valueVarargs(value: Double*): this.type = set("$value", js.Array(value*))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
}
