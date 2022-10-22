package typingsJapgolly.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.StringParam & {  certissuer :string | undefined,   certsubject :string | undefined} */
trait StringParamcertissuerstri extends StObject {
  
  var certissuer: js.UndefOr[String] = js.undefined
  
  var certsubject: js.UndefOr[String] = js.undefined
  
  var str: String
}
object StringParamcertissuerstri {
  
  inline def apply(str: String): StringParamcertissuerstri = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringParamcertissuerstri]
  }
  
  extension [Self <: StringParamcertissuerstri](x: Self) {
    
    inline def setCertissuer(value: String): Self = StObject.set(x, "certissuer", value.asInstanceOf[js.Any])
    
    inline def setCertissuerUndefined: Self = StObject.set(x, "certissuer", js.undefined)
    
    inline def setCertsubject(value: String): Self = StObject.set(x, "certsubject", value.asInstanceOf[js.Any])
    
    inline def setCertsubjectUndefined: Self = StObject.set(x, "certsubject", js.undefined)
    
    inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
  }
}
