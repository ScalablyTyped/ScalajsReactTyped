package typingsJapgolly.maplibreGl.anon

import typingsJapgolly.maplibreGl.distStyleSpecMod.DataDrivenPropertyValueSpecification
import typingsJapgolly.maplibreGl.maplibreGlStrings.ExpressionSpecification
import typingsJapgolly.maplibreGl.maplibreGlStrings.`geometry-type`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`heatmap-density`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`line-progress`
import typingsJapgolly.maplibreGl.maplibreGlStrings.accumulated
import typingsJapgolly.maplibreGl.maplibreGlStrings.id
import typingsJapgolly.maplibreGl.maplibreGlStrings.ln2
import typingsJapgolly.maplibreGl.maplibreGlStrings.none
import typingsJapgolly.maplibreGl.maplibreGlStrings.pi
import typingsJapgolly.maplibreGl.maplibreGlStrings.properties
import typingsJapgolly.maplibreGl.maplibreGlStrings.visible
import typingsJapgolly.maplibreGl.maplibreGlStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillsortkeyVisibility extends StObject {
  
  var `fill-sort-key`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var visibility: js.UndefOr[visible | none] = js.undefined
}
object FillsortkeyVisibility {
  
  inline def apply(): FillsortkeyVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillsortkeyVisibility]
  }
  
  extension [Self <: FillsortkeyVisibility](x: Self) {
    
    inline def `setFill-sort-key`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "fill-sort-key", value.asInstanceOf[js.Any])
    
    inline def `setFill-sort-keyUndefined`: Self = StObject.set(x, "fill-sort-key", js.undefined)
    
    inline def `setFill-sort-keyVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "fill-sort-key", js.Array(value*))
    
    inline def setVisibility(value: visible | none): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
