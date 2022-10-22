package typingsJapgolly.maplibreGl.anon

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
import typingsJapgolly.maplibreGl.mod.ColorSpecification
import typingsJapgolly.maplibreGl.mod.DataDrivenPropertyValueSpecification
import typingsJapgolly.maplibreGl.mod.PropertyValueSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iconcolor extends StObject {
  
  var `icon-color`: js.UndefOr[DataDrivenPropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `icon-halo-blur`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `icon-halo-color`: js.UndefOr[DataDrivenPropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `icon-halo-width`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `icon-opacity`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `icon-translate`: js.UndefOr[PropertyValueSpecification[js.Tuple2[Double, Double]]] = js.undefined
  
  var `icon-translate-anchor`: js.UndefOr[PropertyValueSpecification[map | viewport]] = js.undefined
  
  var `text-color`: js.UndefOr[DataDrivenPropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `text-halo-blur`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `text-halo-color`: js.UndefOr[DataDrivenPropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `text-halo-width`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `text-opacity`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `text-translate`: js.UndefOr[PropertyValueSpecification[js.Tuple2[Double, Double]]] = js.undefined
  
  var `text-translate-anchor`: js.UndefOr[PropertyValueSpecification[map | viewport]] = js.undefined
}
object Iconcolor {
  
  inline def apply(): Iconcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Iconcolor]
  }
  
  extension [Self <: Iconcolor](x: Self) {
    
    inline def `setIcon-color`(value: DataDrivenPropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "icon-color", value.asInstanceOf[js.Any])
    
    inline def `setIcon-colorUndefined`: Self = StObject.set(x, "icon-color", js.undefined)
    
    inline def `setIcon-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "icon-color", js.Array(value*))
    
    inline def `setIcon-halo-blur`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "icon-halo-blur", value.asInstanceOf[js.Any])
    
    inline def `setIcon-halo-blurUndefined`: Self = StObject.set(x, "icon-halo-blur", js.undefined)
    
    inline def `setIcon-halo-blurVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "icon-halo-blur", js.Array(value*))
    
    inline def `setIcon-halo-color`(value: DataDrivenPropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "icon-halo-color", value.asInstanceOf[js.Any])
    
    inline def `setIcon-halo-colorUndefined`: Self = StObject.set(x, "icon-halo-color", js.undefined)
    
    inline def `setIcon-halo-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "icon-halo-color", js.Array(value*))
    
    inline def `setIcon-halo-width`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "icon-halo-width", value.asInstanceOf[js.Any])
    
    inline def `setIcon-halo-widthUndefined`: Self = StObject.set(x, "icon-halo-width", js.undefined)
    
    inline def `setIcon-halo-widthVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "icon-halo-width", js.Array(value*))
    
    inline def `setIcon-opacity`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "icon-opacity", value.asInstanceOf[js.Any])
    
    inline def `setIcon-opacityUndefined`: Self = StObject.set(x, "icon-opacity", js.undefined)
    
    inline def `setIcon-opacityVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "icon-opacity", js.Array(value*))
    
    inline def `setIcon-translate`(value: PropertyValueSpecification[js.Tuple2[Double, Double]]): Self = StObject.set(x, "icon-translate", value.asInstanceOf[js.Any])
    
    inline def `setIcon-translate-anchor`(value: PropertyValueSpecification[map | viewport]): Self = StObject.set(x, "icon-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setIcon-translate-anchorUndefined`: Self = StObject.set(x, "icon-translate-anchor", js.undefined)
    
    inline def `setIcon-translateUndefined`: Self = StObject.set(x, "icon-translate", js.undefined)
    
    inline def `setText-color`(value: DataDrivenPropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "text-color", value.asInstanceOf[js.Any])
    
    inline def `setText-colorUndefined`: Self = StObject.set(x, "text-color", js.undefined)
    
    inline def `setText-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "text-color", js.Array(value*))
    
    inline def `setText-halo-blur`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "text-halo-blur", value.asInstanceOf[js.Any])
    
    inline def `setText-halo-blurUndefined`: Self = StObject.set(x, "text-halo-blur", js.undefined)
    
    inline def `setText-halo-blurVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "text-halo-blur", js.Array(value*))
    
    inline def `setText-halo-color`(value: DataDrivenPropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "text-halo-color", value.asInstanceOf[js.Any])
    
    inline def `setText-halo-colorUndefined`: Self = StObject.set(x, "text-halo-color", js.undefined)
    
    inline def `setText-halo-colorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "text-halo-color", js.Array(value*))
    
    inline def `setText-halo-width`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "text-halo-width", value.asInstanceOf[js.Any])
    
    inline def `setText-halo-widthUndefined`: Self = StObject.set(x, "text-halo-width", js.undefined)
    
    inline def `setText-halo-widthVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "text-halo-width", js.Array(value*))
    
    inline def `setText-opacity`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "text-opacity", value.asInstanceOf[js.Any])
    
    inline def `setText-opacityUndefined`: Self = StObject.set(x, "text-opacity", js.undefined)
    
    inline def `setText-opacityVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "text-opacity", js.Array(value*))
    
    inline def `setText-translate`(value: PropertyValueSpecification[js.Tuple2[Double, Double]]): Self = StObject.set(x, "text-translate", value.asInstanceOf[js.Any])
    
    inline def `setText-translate-anchor`(value: PropertyValueSpecification[map | viewport]): Self = StObject.set(x, "text-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-translate-anchorUndefined`: Self = StObject.set(x, "text-translate-anchor", js.undefined)
    
    inline def `setText-translateUndefined`: Self = StObject.set(x, "text-translate", js.undefined)
  }
}
