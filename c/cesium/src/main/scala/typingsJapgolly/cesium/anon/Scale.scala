package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.Cartesian3
import typingsJapgolly.cesium.mod.Property
import typingsJapgolly.cesium.mod.Quaternion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale extends StObject {
  
  var rotation: js.UndefOr[Property | Quaternion] = js.undefined
  
  var scale: js.UndefOr[Property | Cartesian3] = js.undefined
  
  var translation: js.UndefOr[Property | Cartesian3] = js.undefined
}
object Scale {
  
  inline def apply(): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scale]
  }
  
  extension [Self <: Scale](x: Self) {
    
    inline def setRotation(value: Property | Quaternion): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: Property | Cartesian3): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setTranslation(value: Property | Cartesian3): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    
    inline def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
  }
}
