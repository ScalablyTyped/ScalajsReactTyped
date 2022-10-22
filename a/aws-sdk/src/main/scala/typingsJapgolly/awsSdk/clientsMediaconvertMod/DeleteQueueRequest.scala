package typingsJapgolly.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQueueRequest extends StObject {
  
  /**
    * The name of the queue that you want to delete.
    */
  var Name: string
}
object DeleteQueueRequest {
  
  inline def apply(Name: string): DeleteQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueueRequest]
  }
  
  extension [Self <: DeleteQueueRequest](x: Self) {
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
