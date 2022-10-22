package typingsJapgolly.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequesterAdvertisement
  extends StObject
     with Advertisement {
  
  /**
    * Request types that a Requester can send.
    */
  var requests: js.UndefOr[js.Array[String]] = js.undefined
}
object RequesterAdvertisement {
  
  inline def apply(name: String): RequesterAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequesterAdvertisement]
  }
  
  extension [Self <: RequesterAdvertisement](x: Self) {
    
    inline def setRequests(value: js.Array[String]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: String*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
