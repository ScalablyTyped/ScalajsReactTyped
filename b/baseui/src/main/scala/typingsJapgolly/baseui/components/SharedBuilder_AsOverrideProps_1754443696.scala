package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.selectTypesMod.SharedStylePropsArg
import typingsJapgolly.baseui.selectTypesMod.Size
import typingsJapgolly.baseui.selectTypesMod.Type
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AsOverrideProps_1754443696[C /* <: ElementType */] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
  
  inline def $clearable(value: Boolean): this.type = set("$clearable", value.asInstanceOf[js.Any])
  
  inline def $creatable(value: Boolean): this.type = set("$creatable", value.asInstanceOf[js.Any])
  
  inline def $disabled(value: Boolean): this.type = set("$disabled", value.asInstanceOf[js.Any])
  
  inline def $error(value: Boolean): this.type = set("$error", value.asInstanceOf[js.Any])
  
  inline def $isEmpty(value: Boolean): this.type = set("$isEmpty", value.asInstanceOf[js.Any])
  
  inline def $isFocused(value: Boolean): this.type = set("$isFocused", value.asInstanceOf[js.Any])
  
  inline def $isHighlighted(value: Boolean): this.type = set("$isHighlighted", value.asInstanceOf[js.Any])
  
  inline def $isLoading(value: Boolean): this.type = set("$isLoading", value.asInstanceOf[js.Any])
  
  inline def $isOpen(value: Boolean): this.type = set("$isOpen", value.asInstanceOf[js.Any])
  
  inline def $isPseudoFocused(value: Boolean): this.type = set("$isPseudoFocused", value.asInstanceOf[js.Any])
  
  inline def $maxHeight(value: String): this.type = set("$maxHeight", value.asInstanceOf[js.Any])
  
  inline def $multi(value: Boolean): this.type = set("$multi", value.asInstanceOf[js.Any])
  
  inline def $positive(value: Boolean): this.type = set("$positive", value.asInstanceOf[js.Any])
  
  inline def $required(value: Boolean): this.type = set("$required", value.asInstanceOf[js.Any])
  
  inline def $searchable(value: Boolean): this.type = set("$searchable", value.asInstanceOf[js.Any])
  
  inline def $selected(value: Boolean): this.type = set("$selected", value.asInstanceOf[js.Any])
  
  inline def $size(value: Size): this.type = set("$size", value.asInstanceOf[js.Any])
  
  inline def $style(value: StyleObject | (js.Function1[SharedStylePropsArg, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
  
  inline def $styleFunction1(value: SharedStylePropsArg => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
  
  inline def $type(value: Type): this.type = set("$type", value.asInstanceOf[js.Any])
  
  inline def $width(value: String): this.type = set("$width", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
}
