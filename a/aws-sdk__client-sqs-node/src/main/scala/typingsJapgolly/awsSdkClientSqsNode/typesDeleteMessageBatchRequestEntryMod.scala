package typingsJapgolly.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteMessageBatchRequestEntryMod {
  
  trait DeleteMessageBatchRequestEntry extends StObject {
    
    /**
      * <p>An identifier for this particular receipt handle. This is used to communicate the result.</p> <note> <p>The <code>Id</code>s of a batch request need to be unique within a request</p> </note>
      */
    var Id: String
    
    /**
      * <p>A receipt handle.</p>
      */
    var ReceiptHandle: String
  }
  object DeleteMessageBatchRequestEntry {
    
    inline def apply(Id: String, ReceiptHandle: String): DeleteMessageBatchRequestEntry = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteMessageBatchRequestEntry]
    }
    
    extension [Self <: DeleteMessageBatchRequestEntry](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setReceiptHandle(value: String): Self = StObject.set(x, "ReceiptHandle", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledDeleteMessageBatchRequestEntry = DeleteMessageBatchRequestEntry
}
