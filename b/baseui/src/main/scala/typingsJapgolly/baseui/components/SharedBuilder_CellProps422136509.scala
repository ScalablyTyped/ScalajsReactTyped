package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.layoutGridTypesMod.Alignment
import typingsJapgolly.baseui.layoutGridTypesMod.CSSLengthUnit
import typingsJapgolly.baseui.layoutGridTypesMod.CellOverrides
import typingsJapgolly.baseui.layoutGridTypesMod.Responsive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_CellProps422136509 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def align(value: Responsive[Alignment]): this.type = set("align", value.asInstanceOf[js.Any])
  
  inline def alignVarargs(value: Alignment*): this.type = set("align", js.Array(value*))
  
  inline def gridColumns(value: Responsive[Double]): this.type = set("gridColumns", value.asInstanceOf[js.Any])
  
  inline def gridColumnsVarargs(value: Double*): this.type = set("gridColumns", js.Array(value*))
  
  inline def gridGaps(value: Responsive[Double]): this.type = set("gridGaps", value.asInstanceOf[js.Any])
  
  inline def gridGapsVarargs(value: Double*): this.type = set("gridGaps", js.Array(value*))
  
  inline def gridGutters(value: Responsive[Double]): this.type = set("gridGutters", value.asInstanceOf[js.Any])
  
  inline def gridGuttersVarargs(value: Double*): this.type = set("gridGutters", js.Array(value*))
  
  inline def gridUnit(value: CSSLengthUnit): this.type = set("gridUnit", value.asInstanceOf[js.Any])
  
  inline def order(value: Responsive[Double]): this.type = set("order", value.asInstanceOf[js.Any])
  
  inline def orderVarargs(value: Double*): this.type = set("order", js.Array(value*))
  
  inline def overrides(value: CellOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  
  inline def skip(value: Responsive[Double]): this.type = set("skip", value.asInstanceOf[js.Any])
  
  inline def skipVarargs(value: Double*): this.type = set("skip", js.Array(value*))
  
  inline def span(value: Responsive[Double]): this.type = set("span", value.asInstanceOf[js.Any])
  
  inline def spanVarargs(value: Double*): this.type = set("span", js.Array(value*))
}
