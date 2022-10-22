package typingsJapgolly.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JournalKinesisStreamDescription extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the QLDB journal stream.
    */
  var Arn: js.UndefOr[typingsJapgolly.awsSdk.clientsQldbMod.Arn] = js.undefined
  
  /**
    * The date and time, in epoch time format, when the QLDB journal stream was created. (Epoch time format is the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The error message that describes the reason that a stream has a status of IMPAIRED or FAILED. This is not applicable to streams that have other status values.
    */
  var ErrorCause: js.UndefOr[typingsJapgolly.awsSdk.clientsQldbMod.ErrorCause] = js.undefined
  
  /**
    * The exclusive date and time that specifies when the stream ends. If this parameter is undefined, the stream runs indefinitely until you cancel it.
    */
  var ExclusiveEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The inclusive start date and time from which to start streaming journal data.
    */
  var InclusiveStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The configuration settings of the Amazon Kinesis Data Streams destination for a QLDB journal stream.
    */
  var KinesisConfiguration: typingsJapgolly.awsSdk.clientsQldbMod.KinesisConfiguration
  
  /**
    * The name of the ledger.
    */
  var LedgerName: typingsJapgolly.awsSdk.clientsQldbMod.LedgerName
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write data records to a Kinesis Data Streams resource.
    */
  var RoleArn: Arn
  
  /**
    * The current state of the QLDB journal stream.
    */
  var Status: StreamStatus
  
  /**
    * The UUID (represented in Base62-encoded text) of the QLDB journal stream.
    */
  var StreamId: UniqueId
  
  /**
    * The user-defined name of the QLDB journal stream.
    */
  var StreamName: typingsJapgolly.awsSdk.clientsQldbMod.StreamName
}
object JournalKinesisStreamDescription {
  
  inline def apply(
    KinesisConfiguration: KinesisConfiguration,
    LedgerName: LedgerName,
    RoleArn: Arn,
    Status: StreamStatus,
    StreamId: UniqueId,
    StreamName: StreamName
  ): JournalKinesisStreamDescription = {
    val __obj = js.Dynamic.literal(KinesisConfiguration = KinesisConfiguration.asInstanceOf[js.Any], LedgerName = LedgerName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StreamId = StreamId.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[JournalKinesisStreamDescription]
  }
  
  extension [Self <: JournalKinesisStreamDescription](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setErrorCause(value: ErrorCause): Self = StObject.set(x, "ErrorCause", value.asInstanceOf[js.Any])
    
    inline def setErrorCauseUndefined: Self = StObject.set(x, "ErrorCause", js.undefined)
    
    inline def setExclusiveEndTime(value: js.Date): Self = StObject.set(x, "ExclusiveEndTime", value.asInstanceOf[js.Any])
    
    inline def setExclusiveEndTimeUndefined: Self = StObject.set(x, "ExclusiveEndTime", js.undefined)
    
    inline def setInclusiveStartTime(value: js.Date): Self = StObject.set(x, "InclusiveStartTime", value.asInstanceOf[js.Any])
    
    inline def setInclusiveStartTimeUndefined: Self = StObject.set(x, "InclusiveStartTime", js.undefined)
    
    inline def setKinesisConfiguration(value: KinesisConfiguration): Self = StObject.set(x, "KinesisConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLedgerName(value: LedgerName): Self = StObject.set(x, "LedgerName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: StreamStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: UniqueId): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
