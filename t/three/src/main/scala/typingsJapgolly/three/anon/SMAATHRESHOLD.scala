package typingsJapgolly.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SMAATHRESHOLD extends StObject {
  
  var SMAA_THRESHOLD: String
}
object SMAATHRESHOLD {
  
  inline def apply(SMAA_THRESHOLD: String): SMAATHRESHOLD = {
    val __obj = js.Dynamic.literal(SMAA_THRESHOLD = SMAA_THRESHOLD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMAATHRESHOLD]
  }
  
  extension [Self <: SMAATHRESHOLD](x: Self) {
    
    inline def setSMAA_THRESHOLD(value: String): Self = StObject.set(x, "SMAA_THRESHOLD", value.asInstanceOf[js.Any])
  }
}
