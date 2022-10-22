package typingsJapgolly.awsSdkClientS3Browser

import typingsJapgolly.awsSdkClientS3Browser.typesErrorDocumentMod.UnmarshalledErrorDocument
import typingsJapgolly.awsSdkClientS3Browser.typesIndexDocumentMod.UnmarshalledIndexDocument
import typingsJapgolly.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Browser.typesRedirectAllRequestsToMod.UnmarshalledRedirectAllRequestsTo
import typingsJapgolly.awsSdkClientS3Browser.typesRoutingRuleMod.UnmarshalledRoutingRule
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketWebsiteOutputMod {
  
  trait GetBucketWebsiteOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _ErrorDocument shape
      */
    var ErrorDocument: js.UndefOr[UnmarshalledErrorDocument] = js.undefined
    
    /**
      * _IndexDocument shape
      */
    var IndexDocument: js.UndefOr[UnmarshalledIndexDocument] = js.undefined
    
    /**
      * _RedirectAllRequestsTo shape
      */
    var RedirectAllRequestsTo: js.UndefOr[UnmarshalledRedirectAllRequestsTo] = js.undefined
    
    /**
      * _RoutingRules shape
      */
    var RoutingRules: js.UndefOr[js.Array[UnmarshalledRoutingRule]] = js.undefined
  }
  object GetBucketWebsiteOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketWebsiteOutput]
    }
    
    extension [Self <: GetBucketWebsiteOutput](x: Self) {
      
      inline def setErrorDocument(value: UnmarshalledErrorDocument): Self = StObject.set(x, "ErrorDocument", value.asInstanceOf[js.Any])
      
      inline def setErrorDocumentUndefined: Self = StObject.set(x, "ErrorDocument", js.undefined)
      
      inline def setIndexDocument(value: UnmarshalledIndexDocument): Self = StObject.set(x, "IndexDocument", value.asInstanceOf[js.Any])
      
      inline def setIndexDocumentUndefined: Self = StObject.set(x, "IndexDocument", js.undefined)
      
      inline def setRedirectAllRequestsTo(value: UnmarshalledRedirectAllRequestsTo): Self = StObject.set(x, "RedirectAllRequestsTo", value.asInstanceOf[js.Any])
      
      inline def setRedirectAllRequestsToUndefined: Self = StObject.set(x, "RedirectAllRequestsTo", js.undefined)
      
      inline def setRoutingRules(value: js.Array[UnmarshalledRoutingRule]): Self = StObject.set(x, "RoutingRules", value.asInstanceOf[js.Any])
      
      inline def setRoutingRulesUndefined: Self = StObject.set(x, "RoutingRules", js.undefined)
      
      inline def setRoutingRulesVarargs(value: UnmarshalledRoutingRule*): Self = StObject.set(x, "RoutingRules", js.Array(value*))
    }
  }
}
