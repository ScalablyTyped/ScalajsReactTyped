package typingsJapgolly.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  --------------------------------------------------------------
//  Interfaces
//  --------------------------------------------------------------
trait IChamfer extends StObject {
  
  var quality: js.UndefOr[Double] = js.undefined
  
  var qualityMax: js.UndefOr[Double] = js.undefined
  
  var qualityMin: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object IChamfer {
  
  inline def apply(): IChamfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChamfer]
  }
  
  extension [Self <: IChamfer](x: Self) {
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityMax(value: Double): Self = StObject.set(x, "qualityMax", value.asInstanceOf[js.Any])
    
    inline def setQualityMaxUndefined: Self = StObject.set(x, "qualityMax", js.undefined)
    
    inline def setQualityMin(value: Double): Self = StObject.set(x, "qualityMin", value.asInstanceOf[js.Any])
    
    inline def setQualityMinUndefined: Self = StObject.set(x, "qualityMin", js.undefined)
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setRadius(value: Double | js.Array[Double]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRadiusVarargs(value: Double*): Self = StObject.set(x, "radius", js.Array(value*))
  }
}
