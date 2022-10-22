package typingsJapgolly.maplibreGl.anon

import typingsJapgolly.maplibreGl.distStyleSpecMod.ColorSpecification
import typingsJapgolly.maplibreGl.distStyleSpecMod.DataDrivenPropertyValueSpecification
import typingsJapgolly.maplibreGl.distStyleSpecMod.PropertyValueSpecification
import typingsJapgolly.maplibreGl.distStyleSpecMod.ResolvedImageSpecification
import typingsJapgolly.maplibreGl.maplibreGlStrings.ExpressionSpecification
import typingsJapgolly.maplibreGl.maplibreGlStrings.`geometry-type`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`heatmap-density`
import typingsJapgolly.maplibreGl.maplibreGlStrings.`line-progress`
import typingsJapgolly.maplibreGl.maplibreGlStrings.accumulated
import typingsJapgolly.maplibreGl.maplibreGlStrings.id
import typingsJapgolly.maplibreGl.maplibreGlStrings.ln2
import typingsJapgolly.maplibreGl.maplibreGlStrings.map
import typingsJapgolly.maplibreGl.maplibreGlStrings.pi
import typingsJapgolly.maplibreGl.maplibreGlStrings.properties
import typingsJapgolly.maplibreGl.maplibreGlStrings.viewport
import typingsJapgolly.maplibreGl.maplibreGlStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fillcolor extends StObject {
  
  var `fill-antialias`: js.UndefOr[PropertyValueSpecification[Boolean]] = js.undefined
  
  var `fill-color`: js.UndefOr[DataDrivenPropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `fill-opacity`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `fill-outline-color`: js.UndefOr[DataDrivenPropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `fill-pattern`: js.UndefOr[DataDrivenPropertyValueSpecification[ResolvedImageSpecification]] = js.undefined
  
  var `fill-translate`: js.UndefOr[PropertyValueSpecification[js.Tuple2[Double, Double]]] = js.undefined
  
  var `fill-translate-anchor`: js.UndefOr[PropertyValueSpecification[map | viewport]] = js.undefined
}
object Fillcolor {
  
  inline def apply(): Fillcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fillcolor]
  }
  
  extension [Self <: Fillcolor](x: Self) {
    
    inline def `setFill-antialias`(value: PropertyValueSpecification[Boolean]): Self = StObject.set(x, "fill-antialias", value.asInstanceOf[js.Any])
    
    inline def `setFill-antialiasUndefined`: Self = StObject.set(x, "fill-antialias", js.undefined)
    
    inline def `setFill-color`(value: DataDrivenPropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "fill-color", value.asInstanceOf[js.Any])
    
    inline def `setFill-colorUndefined`: Self = StObject.set(x, "fill-color", js.undefined)
    
    inline def `setFill-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "fill-color", js.Array(value*))
    
    inline def `setFill-opacity`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
    
    inline def `setFill-opacityVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "fill-opacity", js.Array(value*))
    
    inline def `setFill-outline-color`(value: DataDrivenPropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "fill-outline-color", value.asInstanceOf[js.Any])
    
    inline def `setFill-outline-colorUndefined`: Self = StObject.set(x, "fill-outline-color", js.undefined)
    
    inline def `setFill-outline-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "fill-outline-color", js.Array(value*))
    
    inline def `setFill-pattern`(value: DataDrivenPropertyValueSpecification[ResolvedImageSpecification]): Self = StObject.set(x, "fill-pattern", value.asInstanceOf[js.Any])
    
    inline def `setFill-patternUndefined`: Self = StObject.set(x, "fill-pattern", js.undefined)
    
    inline def `setFill-patternVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "fill-pattern", js.Array(value*))
    
    inline def `setFill-translate`(value: PropertyValueSpecification[js.Tuple2[Double, Double]]): Self = StObject.set(x, "fill-translate", value.asInstanceOf[js.Any])
    
    inline def `setFill-translate-anchor`(value: PropertyValueSpecification[map | viewport]): Self = StObject.set(x, "fill-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setFill-translate-anchorUndefined`: Self = StObject.set(x, "fill-translate-anchor", js.undefined)
    
    inline def `setFill-translateUndefined`: Self = StObject.set(x, "fill-translate", js.undefined)
  }
}
