package typingsJapgolly.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStreamInput extends StObject {
  
  /**
    * If this parameter is unset (null) or if you set it to false, and the stream has registered consumers, the call to DeleteStream fails with a ResourceInUseException. 
    */
  var EnforceConsumerDeletion: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The name of the stream to delete.
    */
  var StreamName: typingsJapgolly.awsSdk.clientsKinesisMod.StreamName
}
object DeleteStreamInput {
  
  inline def apply(StreamName: StreamName): DeleteStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStreamInput]
  }
  
  extension [Self <: DeleteStreamInput](x: Self) {
    
    inline def setEnforceConsumerDeletion(value: BooleanObject): Self = StObject.set(x, "EnforceConsumerDeletion", value.asInstanceOf[js.Any])
    
    inline def setEnforceConsumerDeletionUndefined: Self = StObject.set(x, "EnforceConsumerDeletion", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
