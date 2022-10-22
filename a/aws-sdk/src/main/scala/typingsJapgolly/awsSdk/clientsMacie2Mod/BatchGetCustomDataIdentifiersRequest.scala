package typingsJapgolly.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetCustomDataIdentifiersRequest extends StObject {
  
  /**
    * An array of custom data identifier IDs, one for each custom data identifier to retrieve information about.
    */
  var ids: js.UndefOr[listOfString] = js.undefined
}
object BatchGetCustomDataIdentifiersRequest {
  
  inline def apply(): BatchGetCustomDataIdentifiersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetCustomDataIdentifiersRequest]
  }
  
  extension [Self <: BatchGetCustomDataIdentifiersRequest](x: Self) {
    
    inline def setIds(value: listOfString): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: string*): Self = StObject.set(x, "ids", js.Array(value*))
  }
}
