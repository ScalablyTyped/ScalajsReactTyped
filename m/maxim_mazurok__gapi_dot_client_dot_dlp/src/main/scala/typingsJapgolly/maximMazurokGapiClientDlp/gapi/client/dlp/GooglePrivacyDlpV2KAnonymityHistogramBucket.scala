package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2KAnonymityHistogramBucket extends StObject {
  
  /** Total number of equivalence classes in this bucket. */
  var bucketSize: js.UndefOr[String] = js.undefined
  
  /** Total number of distinct equivalence classes in this bucket. */
  var bucketValueCount: js.UndefOr[String] = js.undefined
  
  /** Sample of equivalence classes in this bucket. The total number of classes returned per bucket is capped at 20. */
  var bucketValues: js.UndefOr[js.Array[GooglePrivacyDlpV2KAnonymityEquivalenceClass]] = js.undefined
  
  /** Lower bound on the size of the equivalence classes in this bucket. */
  var equivalenceClassSizeLowerBound: js.UndefOr[String] = js.undefined
  
  /** Upper bound on the size of the equivalence classes in this bucket. */
  var equivalenceClassSizeUpperBound: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2KAnonymityHistogramBucket {
  
  inline def apply(): GooglePrivacyDlpV2KAnonymityHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2KAnonymityHistogramBucket]
  }
  
  extension [Self <: GooglePrivacyDlpV2KAnonymityHistogramBucket](x: Self) {
    
    inline def setBucketSize(value: String): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    inline def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    inline def setBucketValueCount(value: String): Self = StObject.set(x, "bucketValueCount", value.asInstanceOf[js.Any])
    
    inline def setBucketValueCountUndefined: Self = StObject.set(x, "bucketValueCount", js.undefined)
    
    inline def setBucketValues(value: js.Array[GooglePrivacyDlpV2KAnonymityEquivalenceClass]): Self = StObject.set(x, "bucketValues", value.asInstanceOf[js.Any])
    
    inline def setBucketValuesUndefined: Self = StObject.set(x, "bucketValues", js.undefined)
    
    inline def setBucketValuesVarargs(value: GooglePrivacyDlpV2KAnonymityEquivalenceClass*): Self = StObject.set(x, "bucketValues", js.Array(value*))
    
    inline def setEquivalenceClassSizeLowerBound(value: String): Self = StObject.set(x, "equivalenceClassSizeLowerBound", value.asInstanceOf[js.Any])
    
    inline def setEquivalenceClassSizeLowerBoundUndefined: Self = StObject.set(x, "equivalenceClassSizeLowerBound", js.undefined)
    
    inline def setEquivalenceClassSizeUpperBound(value: String): Self = StObject.set(x, "equivalenceClassSizeUpperBound", value.asInstanceOf[js.Any])
    
    inline def setEquivalenceClassSizeUpperBoundUndefined: Self = StObject.set(x, "equivalenceClassSizeUpperBound", js.undefined)
  }
}
