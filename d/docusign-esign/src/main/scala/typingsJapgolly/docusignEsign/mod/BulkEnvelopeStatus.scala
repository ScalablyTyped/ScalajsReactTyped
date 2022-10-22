package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEnvelopeStatus extends StObject {
  
  /**
    * Identifier used to query the status of an individual bulk recipient batch.
    */
  var batchId: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of items in the batch being queried.
    */
  var batchSize: js.UndefOr[String] = js.undefined
  
  /**
    * A list of bulk envelope objects.
    */
  var bulkEnvelopes: js.UndefOr[js.Array[BulkEnvelope]] = js.undefined
  
  /**
    * URI at which you can retrieve the batch envelopes.
    */
  var bulkEnvelopesBatchUri: js.UndefOr[String] = js.undefined
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The number of entries with a status of `failed`.
    */
  var failed: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the next chunk of records based on the search request. It is `null` if this is the last set of results for the search.
    */
  var nextUri: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the prior chunk of records based on the search request. It is `null` if this is the first set of results for the search.
    */
  var previousUri: js.UndefOr[String] = js.undefined
  
  /**
    * The number of entries with a status of `queued`.
    */
  var queued: js.UndefOr[String] = js.undefined
  
  /**
    * The number of results in this response. Because you can filter which entries are included in the response, this value is always less than or equal to the `totalSetSize`.
    */
  var resultSetSize: js.UndefOr[String] = js.undefined
  
  /**
    * The number of entries with a status of `sent`.
    */
  var sent: js.UndefOr[String] = js.undefined
  
  /**
    * The starting index position of the current result set.
    */
  var startPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The date on which the bulk envelope was created.
    */
  var submittedDate: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of items in the result set. This value is always greater than or equal to the value of `resultSetSize`.
    */
  var totalSetSize: js.UndefOr[String] = js.undefined
}
object BulkEnvelopeStatus {
  
  inline def apply(): BulkEnvelopeStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEnvelopeStatus]
  }
  
  extension [Self <: BulkEnvelopeStatus](x: Self) {
    
    inline def setBatchId(value: String): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setBatchSize(value: String): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setBulkEnvelopes(value: js.Array[BulkEnvelope]): Self = StObject.set(x, "bulkEnvelopes", value.asInstanceOf[js.Any])
    
    inline def setBulkEnvelopesBatchUri(value: String): Self = StObject.set(x, "bulkEnvelopesBatchUri", value.asInstanceOf[js.Any])
    
    inline def setBulkEnvelopesBatchUriUndefined: Self = StObject.set(x, "bulkEnvelopesBatchUri", js.undefined)
    
    inline def setBulkEnvelopesUndefined: Self = StObject.set(x, "bulkEnvelopes", js.undefined)
    
    inline def setBulkEnvelopesVarargs(value: BulkEnvelope*): Self = StObject.set(x, "bulkEnvelopes", js.Array(value*))
    
    inline def setEndPosition(value: String): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    inline def setFailed(value: String): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setNextUri(value: String): Self = StObject.set(x, "nextUri", value.asInstanceOf[js.Any])
    
    inline def setNextUriUndefined: Self = StObject.set(x, "nextUri", js.undefined)
    
    inline def setPreviousUri(value: String): Self = StObject.set(x, "previousUri", value.asInstanceOf[js.Any])
    
    inline def setPreviousUriUndefined: Self = StObject.set(x, "previousUri", js.undefined)
    
    inline def setQueued(value: String): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    inline def setQueuedUndefined: Self = StObject.set(x, "queued", js.undefined)
    
    inline def setResultSetSize(value: String): Self = StObject.set(x, "resultSetSize", value.asInstanceOf[js.Any])
    
    inline def setResultSetSizeUndefined: Self = StObject.set(x, "resultSetSize", js.undefined)
    
    inline def setSent(value: String): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
    
    inline def setSentUndefined: Self = StObject.set(x, "sent", js.undefined)
    
    inline def setStartPosition(value: String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    
    inline def setSubmittedDate(value: String): Self = StObject.set(x, "submittedDate", value.asInstanceOf[js.Any])
    
    inline def setSubmittedDateUndefined: Self = StObject.set(x, "submittedDate", js.undefined)
    
    inline def setTotalSetSize(value: String): Self = StObject.set(x, "totalSetSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSetSizeUndefined: Self = StObject.set(x, "totalSetSize", js.undefined)
  }
}
