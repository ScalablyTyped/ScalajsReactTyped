package typingsJapgolly.awsSdkClientS3Browser

import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketOwner
import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Requester
import typingsJapgolly.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketRequestPaymentOutputMod {
  
  trait GetBucketRequestPaymentOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Specifies who pays for the download and request fees.</p>
      */
    var Payer: js.UndefOr[Requester | BucketOwner | String] = js.undefined
  }
  object GetBucketRequestPaymentOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketRequestPaymentOutput]
    }
    
    extension [Self <: GetBucketRequestPaymentOutput](x: Self) {
      
      inline def setPayer(value: Requester | BucketOwner | String): Self = StObject.set(x, "Payer", value.asInstanceOf[js.Any])
      
      inline def setPayerUndefined: Self = StObject.set(x, "Payer", js.undefined)
    }
  }
}
