package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.iconTypesMod.Color
import typingsJapgolly.baseui.iconTypesMod.Size
import typingsJapgolly.baseui.iconTypesMod.StyledComponentArgs
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AsOverrideProps_1536238557[C /* <: ElementType */] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
  
  inline def $color(value: Color): this.type = set("$color", value.asInstanceOf[js.Any])
  
  inline def $size(value: Size): this.type = set("$size", value.asInstanceOf[js.Any])
  
  inline def $style(value: StyleObject | (js.Function1[StyledComponentArgs, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
  
  inline def $styleFunction1(value: StyledComponentArgs => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
}
