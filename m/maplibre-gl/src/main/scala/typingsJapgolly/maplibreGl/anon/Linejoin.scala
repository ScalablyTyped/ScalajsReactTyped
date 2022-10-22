package typingsJapgolly.maplibreGl.anon

import typingsJapgolly.maplibreGl.distStyleSpecMod.DataDrivenPropertyValueSpecification
import typingsJapgolly.maplibreGl.distStyleSpecMod.PropertyValueSpecification
import typingsJapgolly.maplibreGl.maplibreGlStrings.ExpressionSpecification
import typingsJapgolly.maplibreGl.maplibreGlStrings.`geometry-type`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`heatmap-density`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`line-progress`
import typingsJapgolly.maplibreGl.maplibreGlStrings.accumulated
import typingsJapgolly.maplibreGl.maplibreGlStrings.bevel
import typingsJapgolly.maplibreGl.maplibreGlStrings.butt
import typingsJapgolly.maplibreGl.maplibreGlStrings.id
import typingsJapgolly.maplibreGl.maplibreGlStrings.ln2
import typingsJapgolly.maplibreGl.maplibreGlStrings.miter
import typingsJapgolly.maplibreGl.maplibreGlStrings.none
import typingsJapgolly.maplibreGl.maplibreGlStrings.pi
import typingsJapgolly.maplibreGl.maplibreGlStrings.properties
import typingsJapgolly.maplibreGl.maplibreGlStrings.round
import typingsJapgolly.maplibreGl.maplibreGlStrings.square
import typingsJapgolly.maplibreGl.maplibreGlStrings.visible
import typingsJapgolly.maplibreGl.maplibreGlStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Linejoin extends StObject {
  
  var `line-cap`: js.UndefOr[PropertyValueSpecification[butt | round | square]] = js.undefined
  
  var `line-join`: js.UndefOr[DataDrivenPropertyValueSpecification[bevel | round | miter]] = js.undefined
  
  var `line-miter-limit`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `line-round-limit`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `line-sort-key`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var visibility: js.UndefOr[visible | none] = js.undefined
}
object Linejoin {
  
  inline def apply(): Linejoin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Linejoin]
  }
  
  extension [Self <: Linejoin](x: Self) {
    
    inline def `setLine-cap`(value: PropertyValueSpecification[butt | round | square]): Self = StObject.set(x, "line-cap", value.asInstanceOf[js.Any])
    
    inline def `setLine-capUndefined`: Self = StObject.set(x, "line-cap", js.undefined)
    
    inline def `setLine-join`(value: DataDrivenPropertyValueSpecification[bevel | round | miter]): Self = StObject.set(x, "line-join", value.asInstanceOf[js.Any])
    
    inline def `setLine-joinUndefined`: Self = StObject.set(x, "line-join", js.undefined)
    
    inline def `setLine-joinVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "line-join", js.Array(value*))
    
    inline def `setLine-miter-limit`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "line-miter-limit", value.asInstanceOf[js.Any])
    
    inline def `setLine-miter-limitUndefined`: Self = StObject.set(x, "line-miter-limit", js.undefined)
    
    inline def `setLine-round-limit`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "line-round-limit", value.asInstanceOf[js.Any])
    
    inline def `setLine-round-limitUndefined`: Self = StObject.set(x, "line-round-limit", js.undefined)
    
    inline def `setLine-sort-key`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "line-sort-key", value.asInstanceOf[js.Any])
    
    inline def `setLine-sort-keyUndefined`: Self = StObject.set(x, "line-sort-key", js.undefined)
    
    inline def `setLine-sort-keyVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "line-sort-key", js.Array(value*))
    
    inline def setVisibility(value: visible | none): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
