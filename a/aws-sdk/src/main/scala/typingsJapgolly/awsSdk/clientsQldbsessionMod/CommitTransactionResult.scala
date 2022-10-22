package typingsJapgolly.awsSdk.clientsQldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitTransactionResult extends StObject {
  
  /**
    * The commit digest of the committed transaction.
    */
  var CommitDigest: js.UndefOr[typingsJapgolly.awsSdk.clientsQldbsessionMod.CommitDigest] = js.undefined
  
  /**
    * Contains metrics about the number of I/O requests that were consumed.
    */
  var ConsumedIOs: js.UndefOr[IOUsage] = js.undefined
  
  /**
    * Contains server-side performance information for the command.
    */
  var TimingInformation: js.UndefOr[typingsJapgolly.awsSdk.clientsQldbsessionMod.TimingInformation] = js.undefined
  
  /**
    * The transaction ID of the committed transaction.
    */
  var TransactionId: js.UndefOr[typingsJapgolly.awsSdk.clientsQldbsessionMod.TransactionId] = js.undefined
}
object CommitTransactionResult {
  
  inline def apply(): CommitTransactionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitTransactionResult]
  }
  
  extension [Self <: CommitTransactionResult](x: Self) {
    
    inline def setCommitDigest(value: CommitDigest): Self = StObject.set(x, "CommitDigest", value.asInstanceOf[js.Any])
    
    inline def setCommitDigestUndefined: Self = StObject.set(x, "CommitDigest", js.undefined)
    
    inline def setConsumedIOs(value: IOUsage): Self = StObject.set(x, "ConsumedIOs", value.asInstanceOf[js.Any])
    
    inline def setConsumedIOsUndefined: Self = StObject.set(x, "ConsumedIOs", js.undefined)
    
    inline def setTimingInformation(value: TimingInformation): Self = StObject.set(x, "TimingInformation", value.asInstanceOf[js.Any])
    
    inline def setTimingInformationUndefined: Self = StObject.set(x, "TimingInformation", js.undefined)
    
    inline def setTransactionId(value: TransactionId): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
