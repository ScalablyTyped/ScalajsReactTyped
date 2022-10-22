package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.initialTimenumbertimeElap
import typingsJapgolly.baseui.baseuiStrings.circle
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.mini
import typingsJapgolly.baseui.baseuiStrings.pill
import typingsJapgolly.baseui.baseuiStrings.primary
import typingsJapgolly.baseui.baseuiStrings.round_
import typingsJapgolly.baseui.baseuiStrings.secondary
import typingsJapgolly.baseui.baseuiStrings.square
import typingsJapgolly.baseui.baseuiStrings.tertiary
import typingsJapgolly.baseui.buttonTypesMod.CustomColors
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AsOverrideProps32780377[C /* <: ElementType */] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
  
  inline def $colors(value: CustomColors): this.type = set("$colors", value.asInstanceOf[js.Any])
  
  inline def $disabled(value: Boolean): this.type = set("$disabled", value.asInstanceOf[js.Any])
  
  inline def $isFocusVisible(value: Boolean): this.type = set("$isFocusVisible", value.asInstanceOf[js.Any])
  
  inline def $isLoading(value: Boolean): this.type = set("$isLoading", value.asInstanceOf[js.Any])
  
  inline def $isSelected(value: Boolean): this.type = set("$isSelected", value.asInstanceOf[js.Any])
  
  inline def $kind(value: primary | secondary | tertiary): this.type = set("$kind", value.asInstanceOf[js.Any])
  
  inline def $shape(value: default_ | pill | round_ | circle | square): this.type = set("$shape", value.asInstanceOf[js.Any])
  
  inline def $size(value: mini | default_ | compact | large_): this.type = set("$size", value.asInstanceOf[js.Any])
  
  inline def $style(value: StyleObject | (js.Function1[initialTimenumbertimeElap, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
  
  inline def $styleFunction1(value: initialTimenumbertimeElap => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
}
