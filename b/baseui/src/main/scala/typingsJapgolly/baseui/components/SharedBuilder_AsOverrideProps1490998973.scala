package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.baseuiStrings.end_
import typingsJapgolly.baseui.baseuiStrings.start
import typingsJapgolly.baseui.inputTypesMod.SharedProps
import typingsJapgolly.csstype.mod.Property.Resize
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AsOverrideProps1490998973[C /* <: ElementType */] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
  
  inline def $disabled(value: Boolean): this.type = set("$disabled", value.asInstanceOf[js.Any])
  
  inline def $error(value: Boolean): this.type = set("$error", value.asInstanceOf[js.Any])
  
  inline def $hasIconTrailing(value: Boolean): this.type = set("$hasIconTrailing", value.asInstanceOf[js.Any])
  
  inline def $isFocused(value: Boolean): this.type = set("$isFocused", value.asInstanceOf[js.Any])
  
  inline def $isReadOnly(value: Boolean): this.type = set("$isReadOnly", value.asInstanceOf[js.Any])
  
  inline def $position(value: start | end_): this.type = set("$position", value.asInstanceOf[js.Any])
  
  inline def $positive(value: Boolean): this.type = set("$positive", value.asInstanceOf[js.Any])
  
  inline def $required(value: Boolean): this.type = set("$required", value.asInstanceOf[js.Any])
  
  inline def $resize(value: Resize): this.type = set("$resize", value.asInstanceOf[js.Any])
  
  inline def $style(value: StyleObject | (js.Function1[SharedProps, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
  
  inline def $styleFunction1(value: SharedProps => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
}
