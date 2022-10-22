package typingsJapgolly.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRecordBatchInput extends StObject {
  
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typingsJapgolly.awsSdk.clientsFirehoseMod.DeliveryStreamName
  
  /**
    * One or more records.
    */
  var Records: PutRecordBatchRequestEntryList
}
object PutRecordBatchInput {
  
  inline def apply(DeliveryStreamName: DeliveryStreamName, Records: PutRecordBatchRequestEntryList): PutRecordBatchInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordBatchInput]
  }
  
  extension [Self <: PutRecordBatchInput](x: Self) {
    
    inline def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
    
    inline def setRecords(value: PutRecordBatchRequestEntryList): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    inline def setRecordsVarargs(value: Record*): Self = StObject.set(x, "Records", js.Array(value*))
  }
}
