package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.formControlTypesMod.StyleProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AsOverrideProps1880065505[C /* <: ElementType */] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
  
  inline def $counterError(value: Boolean): this.type = set("$counterError", value.asInstanceOf[js.Any])
  
  inline def $disabled(value: Boolean): this.type = set("$disabled", value.asInstanceOf[js.Any])
  
  inline def $error(value: Boolean): this.type = set("$error", value.asInstanceOf[js.Any])
  
  inline def $length(value: Double): this.type = set("$length", value.asInstanceOf[js.Any])
  
  inline def $maxLength(value: Double): this.type = set("$maxLength", value.asInstanceOf[js.Any])
  
  inline def $positive(value: Boolean): this.type = set("$positive", value.asInstanceOf[js.Any])
  
  inline def $style(value: StyleObject | (js.Function1[StyleProps, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
  
  inline def $styleFunction1(value: StyleProps => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
}
