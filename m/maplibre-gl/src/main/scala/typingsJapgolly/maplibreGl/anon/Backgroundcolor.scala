package typingsJapgolly.maplibreGl.anon

import typingsJapgolly.maplibreGl.mod.ColorSpecification
import typingsJapgolly.maplibreGl.mod.PropertyValueSpecification
import typingsJapgolly.maplibreGl.mod.ResolvedImageSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backgroundcolor extends StObject {
  
  var `background-color`: js.UndefOr[PropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `background-opacity`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `background-pattern`: js.UndefOr[PropertyValueSpecification[ResolvedImageSpecification]] = js.undefined
}
object Backgroundcolor {
  
  inline def apply(): Backgroundcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backgroundcolor]
  }
  
  extension [Self <: Backgroundcolor](x: Self) {
    
    inline def `setBackground-color`(value: PropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    inline def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    inline def `setBackground-opacity`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "background-opacity", value.asInstanceOf[js.Any])
    
    inline def `setBackground-opacityUndefined`: Self = StObject.set(x, "background-opacity", js.undefined)
    
    inline def `setBackground-pattern`(value: PropertyValueSpecification[ResolvedImageSpecification]): Self = StObject.set(x, "background-pattern", value.asInstanceOf[js.Any])
    
    inline def `setBackground-patternUndefined`: Self = StObject.set(x, "background-pattern", js.undefined)
  }
}
