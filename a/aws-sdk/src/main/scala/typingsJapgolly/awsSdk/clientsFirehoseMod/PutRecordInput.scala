package typingsJapgolly.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRecordInput extends StObject {
  
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typingsJapgolly.awsSdk.clientsFirehoseMod.DeliveryStreamName
  
  /**
    * The record.
    */
  var Record: typingsJapgolly.awsSdk.clientsFirehoseMod.Record
}
object PutRecordInput {
  
  inline def apply(DeliveryStreamName: DeliveryStreamName, Record: Record): PutRecordInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], Record = Record.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordInput]
  }
  
  extension [Self <: PutRecordInput](x: Self) {
    
    inline def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
    
    inline def setRecord(value: Record): Self = StObject.set(x, "Record", value.asInstanceOf[js.Any])
  }
}
