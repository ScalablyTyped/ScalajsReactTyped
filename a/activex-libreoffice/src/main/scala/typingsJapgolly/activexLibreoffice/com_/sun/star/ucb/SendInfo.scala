package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains information related to a send protocol.
  *
  * It can contain any string values (server names, user names, passwords, ...).
  */
trait SendInfo extends StObject {
  
  /** the protocol to which the info is related (i.e. "NNTP", "SMTP", "VIM"). */
  var ProtocolType: String
  
  /** the value. */
  var Value: String
}
object SendInfo {
  
  inline def apply(ProtocolType: String, Value: String): SendInfo = {
    val __obj = js.Dynamic.literal(ProtocolType = ProtocolType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendInfo]
  }
  
  extension [Self <: SendInfo](x: Self) {
    
    inline def setProtocolType(value: String): Self = StObject.set(x, "ProtocolType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
