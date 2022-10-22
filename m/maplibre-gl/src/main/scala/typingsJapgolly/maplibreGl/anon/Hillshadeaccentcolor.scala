package typingsJapgolly.maplibreGl.anon

import typingsJapgolly.maplibreGl.maplibreGlStrings.map
import typingsJapgolly.maplibreGl.maplibreGlStrings.viewport
import typingsJapgolly.maplibreGl.mod.ColorSpecification
import typingsJapgolly.maplibreGl.mod.PropertyValueSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hillshadeaccentcolor extends StObject {
  
  var `hillshade-accent-color`: js.UndefOr[PropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `hillshade-exaggeration`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `hillshade-highlight-color`: js.UndefOr[PropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `hillshade-illumination-anchor`: js.UndefOr[PropertyValueSpecification[map | viewport]] = js.undefined
  
  var `hillshade-illumination-direction`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `hillshade-shadow-color`: js.UndefOr[PropertyValueSpecification[ColorSpecification]] = js.undefined
}
object Hillshadeaccentcolor {
  
  inline def apply(): Hillshadeaccentcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hillshadeaccentcolor]
  }
  
  extension [Self <: Hillshadeaccentcolor](x: Self) {
    
    inline def `setHillshade-accent-color`(value: PropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "hillshade-accent-color", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-accent-colorUndefined`: Self = StObject.set(x, "hillshade-accent-color", js.undefined)
    
    inline def `setHillshade-exaggeration`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "hillshade-exaggeration", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-exaggerationUndefined`: Self = StObject.set(x, "hillshade-exaggeration", js.undefined)
    
    inline def `setHillshade-highlight-color`(value: PropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "hillshade-highlight-color", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-highlight-colorUndefined`: Self = StObject.set(x, "hillshade-highlight-color", js.undefined)
    
    inline def `setHillshade-illumination-anchor`(value: PropertyValueSpecification[map | viewport]): Self = StObject.set(x, "hillshade-illumination-anchor", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-illumination-anchorUndefined`: Self = StObject.set(x, "hillshade-illumination-anchor", js.undefined)
    
    inline def `setHillshade-illumination-direction`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "hillshade-illumination-direction", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-illumination-directionUndefined`: Self = StObject.set(x, "hillshade-illumination-direction", js.undefined)
    
    inline def `setHillshade-shadow-color`(value: PropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "hillshade-shadow-color", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-shadow-colorUndefined`: Self = StObject.set(x, "hillshade-shadow-color", js.undefined)
  }
}
