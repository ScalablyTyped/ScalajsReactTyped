package typingsJapgolly.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsCreatePoolRequest
  extends StObject
     with BaseRequest {
  
  /** the name of a pool to create */
  var pool: String
}
object IpsCreatePoolRequest {
  
  inline def apply(pool: String): IpsCreatePoolRequest = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsCreatePoolRequest]
  }
  
  extension [Self <: IpsCreatePoolRequest](x: Self) {
    
    inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
  }
}
