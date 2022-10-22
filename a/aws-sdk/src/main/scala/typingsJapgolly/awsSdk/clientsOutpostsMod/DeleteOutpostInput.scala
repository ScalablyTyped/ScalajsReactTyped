package typingsJapgolly.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOutpostInput extends StObject {
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the Outpost. 
    */
  var OutpostId: typingsJapgolly.awsSdk.clientsOutpostsMod.OutpostId
}
object DeleteOutpostInput {
  
  inline def apply(OutpostId: OutpostId): DeleteOutpostInput = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOutpostInput]
  }
  
  extension [Self <: DeleteOutpostInput](x: Self) {
    
    inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
  }
}
