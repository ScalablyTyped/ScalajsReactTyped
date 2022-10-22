package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsGetexMod.GetExModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PXAT
  extends StObject
     with GetExModes {
  
  var PXAT: Double | js.Date
}
object PXAT {
  
  inline def apply(PXAT: Double | js.Date): PXAT = {
    val __obj = js.Dynamic.literal(PXAT = PXAT.asInstanceOf[js.Any])
    __obj.asInstanceOf[PXAT]
  }
  
  extension [Self <: PXAT](x: Self) {
    
    inline def setPXAT(value: Double | js.Date): Self = StObject.set(x, "PXAT", value.asInstanceOf[js.Any])
  }
}
