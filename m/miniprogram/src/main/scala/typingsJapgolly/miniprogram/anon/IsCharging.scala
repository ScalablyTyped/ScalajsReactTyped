package typingsJapgolly.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsCharging extends StObject {
  
  var isCharging: Boolean
  
  var level: Double
}
object IsCharging {
  
  inline def apply(isCharging: Boolean, level: Double): IsCharging = {
    val __obj = js.Dynamic.literal(isCharging = isCharging.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsCharging]
  }
  
  extension [Self <: IsCharging](x: Self) {
    
    inline def setIsCharging(value: Boolean): Self = StObject.set(x, "isCharging", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
