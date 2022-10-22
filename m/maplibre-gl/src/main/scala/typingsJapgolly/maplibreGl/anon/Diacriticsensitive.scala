package typingsJapgolly.maplibreGl.anon

import typingsJapgolly.maplibreGl.distStyleSpecMod.ExpressionSpecification
import typingsJapgolly.maplibreGl.maplibreGlStrings.`geometry-type`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`heatmap-density`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`line-progress`
import typingsJapgolly.maplibreGl.maplibreGlStrings.accumulated
import typingsJapgolly.maplibreGl.maplibreGlStrings.id
import typingsJapgolly.maplibreGl.maplibreGlStrings.ln2
import typingsJapgolly.maplibreGl.maplibreGlStrings.pi
import typingsJapgolly.maplibreGl.maplibreGlStrings.properties
import typingsJapgolly.maplibreGl.maplibreGlStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diacriticsensitive extends StObject {
  
  var `case-sensitive`: js.UndefOr[Boolean | ExpressionSpecification] = js.undefined
  
  var `diacritic-sensitive`: js.UndefOr[Boolean | ExpressionSpecification] = js.undefined
  
  var locale: js.UndefOr[String | ExpressionSpecification] = js.undefined
}
object Diacriticsensitive {
  
  inline def apply(): Diacriticsensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diacriticsensitive]
  }
  
  extension [Self <: Diacriticsensitive](x: Self) {
    
    inline def `setCase-sensitive`(value: Boolean | ExpressionSpecification): Self = StObject.set(x, "case-sensitive", value.asInstanceOf[js.Any])
    
    inline def `setCase-sensitiveUndefined`: Self = StObject.set(x, "case-sensitive", js.undefined)
    
    inline def `setCase-sensitiveVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typingsJapgolly.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "case-sensitive", js.Array(value*))
    
    inline def `setDiacritic-sensitive`(value: Boolean | ExpressionSpecification): Self = StObject.set(x, "diacritic-sensitive", value.asInstanceOf[js.Any])
    
    inline def `setDiacritic-sensitiveUndefined`: Self = StObject.set(x, "diacritic-sensitive", js.undefined)
    
    inline def `setDiacritic-sensitiveVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typingsJapgolly.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "diacritic-sensitive", js.Array(value*))
    
    inline def setLocale(value: String | ExpressionSpecification): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocaleVarargs(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typingsJapgolly.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "locale", js.Array(value*))
  }
}
