package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.layoutGridTypesMod.Alignment
import typingsJapgolly.baseui.layoutGridTypesMod.Behavior
import typingsJapgolly.baseui.layoutGridTypesMod.CSSLengthUnit
import typingsJapgolly.baseui.layoutGridTypesMod.GridStyle
import typingsJapgolly.baseui.layoutGridTypesMod.Responsive
import typingsJapgolly.baseui.layoutGridTypesMod.StyledGridProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AsOverrideProps1581778183[C /* <: ElementType */] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def $align(value: Responsive[Alignment]): this.type = set("$align", value.asInstanceOf[js.Any])
  
  inline def $alignVarargs(value: Alignment*): this.type = set("$align", js.Array(value*))
  
  inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
  
  inline def $behavior(value: Behavior): this.type = set("$behavior", value.asInstanceOf[js.Any])
  
  inline def $gridGutters(value: Responsive[Double]): this.type = set("$gridGutters", value.asInstanceOf[js.Any])
  
  inline def $gridGuttersVarargs(value: Double*): this.type = set("$gridGutters", js.Array(value*))
  
  inline def $gridMargins(value: Responsive[Double]): this.type = set("$gridMargins", value.asInstanceOf[js.Any])
  
  inline def $gridMarginsVarargs(value: Double*): this.type = set("$gridMargins", js.Array(value*))
  
  inline def $gridMaxWidth(value: Double): this.type = set("$gridMaxWidth", value.asInstanceOf[js.Any])
  
  inline def $gridStyle(value: GridStyle): this.type = set("$gridStyle", value.asInstanceOf[js.Any])
  
  inline def $gridUnit(value: CSSLengthUnit): this.type = set("$gridUnit", value.asInstanceOf[js.Any])
  
  inline def $style(value: StyleObject | (js.Function1[StyledGridProps, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
  
  inline def $styleFunction1(value: StyledGridProps => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
}
