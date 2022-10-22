package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.heightstringnumberSharedS
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AsOverrideProps1780301599[C /* <: ElementType */] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
  
  inline def $color(value: String): this.type = set("$color", value.asInstanceOf[js.Any])
  
  inline def $disabled(value: Boolean): this.type = set("$disabled", value.asInstanceOf[js.Any])
  
  inline def $disabledNull: this.type = set("$disabled", null)
  
  inline def $expanded(value: Boolean): this.type = set("$expanded", value.asInstanceOf[js.Any])
  
  inline def $expandedNull: this.type = set("$expanded", null)
  
  inline def $size(value: String | Double): this.type = set("$size", value.asInstanceOf[js.Any])
  
  inline def $style(value: StyleObject | (js.Function1[heightstringnumberSharedS, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
  
  inline def $styleFunction1(value: heightstringnumberSharedS => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
}
