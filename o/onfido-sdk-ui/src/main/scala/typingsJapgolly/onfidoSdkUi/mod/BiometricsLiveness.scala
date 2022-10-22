package typingsJapgolly.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiometricsLiveness extends StObject {
  
  var active: js.UndefOr[BiometricsLivenessActive] = js.undefined
  
  var passive: js.UndefOr[BiometricsLivenessPassive] = js.undefined
}
object BiometricsLiveness {
  
  inline def apply(): BiometricsLiveness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiometricsLiveness]
  }
  
  extension [Self <: BiometricsLiveness](x: Self) {
    
    inline def setActive(value: BiometricsLivenessActive): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setPassive(value: BiometricsLivenessPassive): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    
    inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
  }
}
