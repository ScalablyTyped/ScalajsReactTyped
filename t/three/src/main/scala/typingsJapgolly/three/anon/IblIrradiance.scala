package typingsJapgolly.three.anon

import typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IblIrradiance extends StObject {
  
  var iblIrradiance: default
  
  var radiance: default
  
  var reflectedLight: default
}
object IblIrradiance {
  
  inline def apply(iblIrradiance: default, radiance: default, reflectedLight: default): IblIrradiance = {
    val __obj = js.Dynamic.literal(iblIrradiance = iblIrradiance.asInstanceOf[js.Any], radiance = radiance.asInstanceOf[js.Any], reflectedLight = reflectedLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IblIrradiance]
  }
  
  extension [Self <: IblIrradiance](x: Self) {
    
    inline def setIblIrradiance(value: default): Self = StObject.set(x, "iblIrradiance", value.asInstanceOf[js.Any])
    
    inline def setRadiance(value: default): Self = StObject.set(x, "radiance", value.asInstanceOf[js.Any])
    
    inline def setReflectedLight(value: default): Self = StObject.set(x, "reflectedLight", value.asInstanceOf[js.Any])
  }
}
