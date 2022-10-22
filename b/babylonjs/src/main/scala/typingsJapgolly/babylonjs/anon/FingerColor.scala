package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.BABYLON.Color3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FingerColor extends StObject {
  
  var base: js.UndefOr[Color3] = js.undefined
  
  var fingerColor: js.UndefOr[Color3] = js.undefined
  
  var fresnel: js.UndefOr[Color3] = js.undefined
  
  var tipFresnel: js.UndefOr[Color3] = js.undefined
}
object FingerColor {
  
  inline def apply(): FingerColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FingerColor]
  }
  
  extension [Self <: FingerColor](x: Self) {
    
    inline def setBase(value: Color3): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setFingerColor(value: Color3): Self = StObject.set(x, "fingerColor", value.asInstanceOf[js.Any])
    
    inline def setFingerColorUndefined: Self = StObject.set(x, "fingerColor", js.undefined)
    
    inline def setFresnel(value: Color3): Self = StObject.set(x, "fresnel", value.asInstanceOf[js.Any])
    
    inline def setFresnelUndefined: Self = StObject.set(x, "fresnel", js.undefined)
    
    inline def setTipFresnel(value: Color3): Self = StObject.set(x, "tipFresnel", value.asInstanceOf[js.Any])
    
    inline def setTipFresnelUndefined: Self = StObject.set(x, "tipFresnel", js.undefined)
  }
}
