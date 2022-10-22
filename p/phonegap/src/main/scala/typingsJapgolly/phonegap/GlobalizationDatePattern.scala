package typingsJapgolly.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalizationDatePattern extends StObject {
  
  var dst_offset: Double
  
  var pattern: String
  
  var timezone: String
  
  var utc_offset: Double
}
object GlobalizationDatePattern {
  
  inline def apply(dst_offset: Double, pattern: String, timezone: String, utc_offset: Double): GlobalizationDatePattern = {
    val __obj = js.Dynamic.literal(dst_offset = dst_offset.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], utc_offset = utc_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizationDatePattern]
  }
  
  extension [Self <: GlobalizationDatePattern](x: Self) {
    
    inline def setDst_offset(value: Double): Self = StObject.set(x, "dst_offset", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setUtc_offset(value: Double): Self = StObject.set(x, "utc_offset", value.asInstanceOf[js.Any])
  }
}
