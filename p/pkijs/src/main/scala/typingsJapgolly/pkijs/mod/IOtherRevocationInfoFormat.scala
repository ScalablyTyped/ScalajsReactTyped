package typingsJapgolly.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOtherRevocationInfoFormat extends StObject {
  
  var otherRevInfo: Any
  
  var otherRevInfoFormat: String
}
object IOtherRevocationInfoFormat {
  
  inline def apply(otherRevInfo: Any, otherRevInfoFormat: String): IOtherRevocationInfoFormat = {
    val __obj = js.Dynamic.literal(otherRevInfo = otherRevInfo.asInstanceOf[js.Any], otherRevInfoFormat = otherRevInfoFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOtherRevocationInfoFormat]
  }
  
  extension [Self <: IOtherRevocationInfoFormat](x: Self) {
    
    inline def setOtherRevInfo(value: Any): Self = StObject.set(x, "otherRevInfo", value.asInstanceOf[js.Any])
    
    inline def setOtherRevInfoFormat(value: String): Self = StObject.set(x, "otherRevInfoFormat", value.asInstanceOf[js.Any])
  }
}
