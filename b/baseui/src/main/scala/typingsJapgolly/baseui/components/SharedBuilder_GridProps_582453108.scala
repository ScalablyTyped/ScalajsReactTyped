package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.layoutGridTypesMod.Alignment
import typingsJapgolly.baseui.layoutGridTypesMod.Behavior
import typingsJapgolly.baseui.layoutGridTypesMod.CSSLengthUnit
import typingsJapgolly.baseui.layoutGridTypesMod.GridOverrides
import typingsJapgolly.baseui.layoutGridTypesMod.GridStyle
import typingsJapgolly.baseui.layoutGridTypesMod.Responsive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_GridProps_582453108 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def align(value: Responsive[Alignment]): this.type = set("align", value.asInstanceOf[js.Any])
  
  inline def alignVarargs(value: Alignment*): this.type = set("align", js.Array(value*))
  
  inline def behavior(value: Behavior): this.type = set("behavior", value.asInstanceOf[js.Any])
  
  inline def gridColumns(value: Responsive[Double]): this.type = set("gridColumns", value.asInstanceOf[js.Any])
  
  inline def gridColumnsVarargs(value: Double*): this.type = set("gridColumns", js.Array(value*))
  
  inline def gridGaps(value: Responsive[Double]): this.type = set("gridGaps", value.asInstanceOf[js.Any])
  
  inline def gridGapsVarargs(value: Double*): this.type = set("gridGaps", js.Array(value*))
  
  inline def gridGutters(value: Responsive[Double]): this.type = set("gridGutters", value.asInstanceOf[js.Any])
  
  inline def gridGuttersVarargs(value: Double*): this.type = set("gridGutters", js.Array(value*))
  
  inline def gridMargins(value: Responsive[Double]): this.type = set("gridMargins", value.asInstanceOf[js.Any])
  
  inline def gridMarginsVarargs(value: Double*): this.type = set("gridMargins", js.Array(value*))
  
  inline def gridMaxWidth(value: Double): this.type = set("gridMaxWidth", value.asInstanceOf[js.Any])
  
  inline def gridStyle(value: GridStyle): this.type = set("gridStyle", value.asInstanceOf[js.Any])
  
  inline def gridUnit(value: CSSLengthUnit): this.type = set("gridUnit", value.asInstanceOf[js.Any])
  
  inline def overrides(value: GridOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
}
