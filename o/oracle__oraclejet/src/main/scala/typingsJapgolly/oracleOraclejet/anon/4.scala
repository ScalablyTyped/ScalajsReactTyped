package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import typingsJapgolly.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var labelLayout: typingsJapgolly.oracleOraclejet.ojdiagramUtilsMod.LabelLayout | (js.Function2[
    /* context */ DvtDiagramLayoutContext, 
    /* node */ DvtDiagramLayoutContextNode, 
    typingsJapgolly.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
  ])
}
object `4` {
  
  inline def apply(
    labelLayout: typingsJapgolly.oracleOraclejet.ojdiagramUtilsMod.LabelLayout | (js.Function2[
      /* context */ DvtDiagramLayoutContext, 
      /* node */ DvtDiagramLayoutContextNode, 
      typingsJapgolly.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
    ])
  ): `4` = {
    val __obj = js.Dynamic.literal(labelLayout = labelLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setLabelLayout(
      value: typingsJapgolly.oracleOraclejet.ojdiagramUtilsMod.LabelLayout | (js.Function2[
          /* context */ DvtDiagramLayoutContext, 
          /* node */ DvtDiagramLayoutContextNode, 
          typingsJapgolly.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
        ])
    ): Self = StObject.set(x, "labelLayout", value.asInstanceOf[js.Any])
    
    inline def setLabelLayoutFunction2(
      value: (/* context */ DvtDiagramLayoutContext, /* node */ DvtDiagramLayoutContextNode) => typingsJapgolly.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
    ): Self = StObject.set(x, "labelLayout", js.Any.fromFunction2(value))
  }
}
