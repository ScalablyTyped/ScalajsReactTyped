package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.tagTypesMod.SharedPropsArg
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AsOverrideProps2050516390[C /* <: ElementType */] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
  
  inline def $clickable(value: Boolean): this.type = set("$clickable", value.asInstanceOf[js.Any])
  
  inline def $closeable(value: Boolean): this.type = set("$closeable", value.asInstanceOf[js.Any])
  
  inline def $color(value: String): this.type = set("$color", value.asInstanceOf[js.Any])
  
  inline def $disabled(value: Boolean): this.type = set("$disabled", value.asInstanceOf[js.Any])
  
  inline def $isActive(value: Boolean): this.type = set("$isActive", value.asInstanceOf[js.Any])
  
  inline def $isFocusVisible(value: Boolean): this.type = set("$isFocusVisible", value.asInstanceOf[js.Any])
  
  inline def $isFocused(value: Boolean): this.type = set("$isFocused", value.asInstanceOf[js.Any])
  
  inline def $isHovered(value: Boolean): this.type = set("$isHovered", value.asInstanceOf[js.Any])
  
  inline def $kind(value: String): this.type = set("$kind", value.asInstanceOf[js.Any])
  
  inline def $size(value: String): this.type = set("$size", value.asInstanceOf[js.Any])
  
  inline def $style(value: StyleObject | (js.Function1[SharedPropsArg, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
  
  inline def $styleFunction1(value: SharedPropsArg => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
  
  inline def $variant(value: String): this.type = set("$variant", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
}
