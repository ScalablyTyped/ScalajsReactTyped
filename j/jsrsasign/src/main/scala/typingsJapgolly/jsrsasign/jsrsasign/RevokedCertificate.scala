package typingsJapgolly.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokedCertificate extends StObject {
  
  var date: String
  
  var ext: js.Array[ExtParam]
  
  var sn: typingsJapgolly.jsrsasign.anon.Hex
}
object RevokedCertificate {
  
  inline def apply(date: String, ext: js.Array[ExtParam], sn: typingsJapgolly.jsrsasign.anon.Hex): RevokedCertificate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], sn = sn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokedCertificate]
  }
  
  extension [Self <: RevokedCertificate](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setExt(value: js.Array[ExtParam]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtVarargs(value: ExtParam*): Self = StObject.set(x, "ext", js.Array(value*))
    
    inline def setSn(value: typingsJapgolly.jsrsasign.anon.Hex): Self = StObject.set(x, "sn", value.asInstanceOf[js.Any])
  }
}
