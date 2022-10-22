package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.typesRecordMod.Record
import typingsJapgolly.awsSdkClientKinesisBrowser.typesRecordMod.UnmarshalledRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSubscribeToShardEventMod {
  
  trait SubscribeToShardEvent extends StObject {
    
    /**
      * <p>Use this as <code>StartingSequenceNumber</code> in the next call to <a>SubscribeToShard</a>.</p>
      */
    var ContinuationSequenceNumber: String
    
    /**
      * <p>The number of milliseconds the read records are from the tip of the stream, indicating how far behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are no new records to process at this moment.</p>
      */
    var MillisBehindLatest: Double
    
    /**
      * <p/>
      */
    var Records: js.Array[Record] | js.Iterable[Record]
  }
  object SubscribeToShardEvent {
    
    inline def apply(
      ContinuationSequenceNumber: String,
      MillisBehindLatest: Double,
      Records: js.Array[Record] | js.Iterable[Record]
    ): SubscribeToShardEvent = {
      val __obj = js.Dynamic.literal(ContinuationSequenceNumber = ContinuationSequenceNumber.asInstanceOf[js.Any], MillisBehindLatest = MillisBehindLatest.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeToShardEvent]
    }
    
    extension [Self <: SubscribeToShardEvent](x: Self) {
      
      inline def setContinuationSequenceNumber(value: String): Self = StObject.set(x, "ContinuationSequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setMillisBehindLatest(value: Double): Self = StObject.set(x, "MillisBehindLatest", value.asInstanceOf[js.Any])
      
      inline def setRecords(value: js.Array[Record] | js.Iterable[Record]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: Record*): Self = StObject.set(x, "Records", js.Array(value*))
    }
  }
  
  trait UnmarshalledSubscribeToShardEvent
    extends StObject
       with SubscribeToShardEvent {
    
    /**
      * <p/>
      */
    @JSName("Records")
    var Records_UnmarshalledSubscribeToShardEvent: js.Array[UnmarshalledRecord]
  }
  object UnmarshalledSubscribeToShardEvent {
    
    inline def apply(
      ContinuationSequenceNumber: String,
      MillisBehindLatest: Double,
      Records: js.Array[UnmarshalledRecord]
    ): UnmarshalledSubscribeToShardEvent = {
      val __obj = js.Dynamic.literal(ContinuationSequenceNumber = ContinuationSequenceNumber.asInstanceOf[js.Any], MillisBehindLatest = MillisBehindLatest.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledSubscribeToShardEvent]
    }
    
    extension [Self <: UnmarshalledSubscribeToShardEvent](x: Self) {
      
      inline def setRecords(value: js.Array[UnmarshalledRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: UnmarshalledRecord*): Self = StObject.set(x, "Records", js.Array(value*))
    }
  }
}
