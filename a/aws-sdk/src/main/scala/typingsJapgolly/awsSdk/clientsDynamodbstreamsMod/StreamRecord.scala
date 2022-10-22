package typingsJapgolly.awsSdk.clientsDynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamRecord extends StObject {
  
  /**
    * The approximate date and time when the stream record was created, in UNIX epoch time format.
    */
  var ApproximateCreationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The primary key attribute(s) for the DynamoDB item that was modified.
    */
  var Keys: js.UndefOr[AttributeMap] = js.undefined
  
  /**
    * The item in the DynamoDB table as it appeared after it was modified.
    */
  var NewImage: js.UndefOr[AttributeMap] = js.undefined
  
  /**
    * The item in the DynamoDB table as it appeared before it was modified.
    */
  var OldImage: js.UndefOr[AttributeMap] = js.undefined
  
  /**
    * The sequence number of the stream record.
    */
  var SequenceNumber: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbstreamsMod.SequenceNumber] = js.undefined
  
  /**
    * The size of the stream record, in bytes.
    */
  var SizeBytes: js.UndefOr[PositiveLongObject] = js.undefined
  
  /**
    * The type of data from the modified DynamoDB item that was captured in this stream record:    KEYS_ONLY - only the key attributes of the modified item.    NEW_IMAGE - the entire item, as it appeared after it was modified.    OLD_IMAGE - the entire item, as it appeared before it was modified.    NEW_AND_OLD_IMAGES - both the new and the old item images of the item.  
    */
  var StreamViewType: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbstreamsMod.StreamViewType] = js.undefined
}
object StreamRecord {
  
  inline def apply(): StreamRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamRecord]
  }
  
  extension [Self <: StreamRecord](x: Self) {
    
    inline def setApproximateCreationDateTime(value: js.Date): Self = StObject.set(x, "ApproximateCreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setApproximateCreationDateTimeUndefined: Self = StObject.set(x, "ApproximateCreationDateTime", js.undefined)
    
    inline def setKeys(value: AttributeMap): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "Keys", js.undefined)
    
    inline def setNewImage(value: AttributeMap): Self = StObject.set(x, "NewImage", value.asInstanceOf[js.Any])
    
    inline def setNewImageUndefined: Self = StObject.set(x, "NewImage", js.undefined)
    
    inline def setOldImage(value: AttributeMap): Self = StObject.set(x, "OldImage", value.asInstanceOf[js.Any])
    
    inline def setOldImageUndefined: Self = StObject.set(x, "OldImage", js.undefined)
    
    inline def setSequenceNumber(value: SequenceNumber): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
    
    inline def setSizeBytes(value: PositiveLongObject): Self = StObject.set(x, "SizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "SizeBytes", js.undefined)
    
    inline def setStreamViewType(value: StreamViewType): Self = StObject.set(x, "StreamViewType", value.asInstanceOf[js.Any])
    
    inline def setStreamViewTypeUndefined: Self = StObject.set(x, "StreamViewType", js.undefined)
  }
}
