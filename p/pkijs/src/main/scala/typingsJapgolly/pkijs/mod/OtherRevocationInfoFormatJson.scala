package typingsJapgolly.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherRevocationInfoFormatJson
  extends StObject
     with SignedDataCRLJson {
  
  var otherRevInfo: js.UndefOr[Any] = js.undefined
  
  var otherRevInfoFormat: String
}
object OtherRevocationInfoFormatJson {
  
  inline def apply(otherRevInfoFormat: String): OtherRevocationInfoFormatJson = {
    val __obj = js.Dynamic.literal(otherRevInfoFormat = otherRevInfoFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherRevocationInfoFormatJson]
  }
  
  extension [Self <: OtherRevocationInfoFormatJson](x: Self) {
    
    inline def setOtherRevInfo(value: Any): Self = StObject.set(x, "otherRevInfo", value.asInstanceOf[js.Any])
    
    inline def setOtherRevInfoFormat(value: String): Self = StObject.set(x, "otherRevInfoFormat", value.asInstanceOf[js.Any])
    
    inline def setOtherRevInfoUndefined: Self = StObject.set(x, "otherRevInfo", js.undefined)
  }
}
