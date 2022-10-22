package typingsJapgolly.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Userid extends StObject {
  
  var keyid: typingsJapgolly.openpgp.mod.`type`.keyid.Keyid
  
  var userid: String
  
  var valid: Boolean
}
object Userid {
  
  inline def apply(keyid: typingsJapgolly.openpgp.mod.`type`.keyid.Keyid, userid: String, valid: Boolean): Userid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userid]
  }
  
  extension [Self <: Userid](x: Self) {
    
    inline def setKeyid(value: typingsJapgolly.openpgp.mod.`type`.keyid.Keyid): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
    
    inline def setUserid(value: String): Self = StObject.set(x, "userid", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
