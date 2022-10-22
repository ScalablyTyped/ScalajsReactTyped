package typingsJapgolly.maplibreGl.anon

import typingsJapgolly.maplibreGl.distStyleSpecMod.DataDrivenPropertyValueSpecification
import typingsJapgolly.maplibreGl.distStyleSpecMod.ExpressionSpecification
import typingsJapgolly.maplibreGl.distStyleSpecMod.PropertyValueSpecification
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

trait Heatmapintensity extends StObject {
  
  var `heatmap-color`: js.UndefOr[ExpressionSpecification] = js.undefined
  
  var `heatmap-intensity`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `heatmap-opacity`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `heatmap-radius`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `heatmap-weight`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
}
object Heatmapintensity {
  
  inline def apply(): Heatmapintensity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Heatmapintensity]
  }
  
  extension [Self <: Heatmapintensity](x: Self) {
    
    inline def `setHeatmap-color`(value: ExpressionSpecification): Self = StObject.set(x, "heatmap-color", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-colorUndefined`: Self = StObject.set(x, "heatmap-color", js.undefined)
    
    inline def `setHeatmap-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typingsJapgolly.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "heatmap-color", js.Array(value*))
    
    inline def `setHeatmap-intensity`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "heatmap-intensity", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-intensityUndefined`: Self = StObject.set(x, "heatmap-intensity", js.undefined)
    
    inline def `setHeatmap-opacity`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "heatmap-opacity", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-opacityUndefined`: Self = StObject.set(x, "heatmap-opacity", js.undefined)
    
    inline def `setHeatmap-radius`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "heatmap-radius", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-radiusUndefined`: Self = StObject.set(x, "heatmap-radius", js.undefined)
    
    inline def `setHeatmap-radiusVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typingsJapgolly.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "heatmap-radius", js.Array(value*))
    
    inline def `setHeatmap-weight`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "heatmap-weight", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-weightUndefined`: Self = StObject.set(x, "heatmap-weight", js.undefined)
    
    inline def `setHeatmap-weightVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typingsJapgolly.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "heatmap-weight", js.Array(value*))
  }
}
