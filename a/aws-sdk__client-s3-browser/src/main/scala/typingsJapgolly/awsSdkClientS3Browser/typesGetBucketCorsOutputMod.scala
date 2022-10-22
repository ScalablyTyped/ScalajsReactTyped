package typingsJapgolly.awsSdkClientS3Browser

import typingsJapgolly.awsSdkClientS3Browser.typesCorsruleMod.UnmarshalledCORSRule
import typingsJapgolly.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketCorsOutputMod {
  
  trait GetBucketCorsOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _CORSRules shape
      */
    var CORSRules: js.UndefOr[js.Array[UnmarshalledCORSRule]] = js.undefined
  }
  object GetBucketCorsOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketCorsOutput]
    }
    
    extension [Self <: GetBucketCorsOutput](x: Self) {
      
      inline def setCORSRules(value: js.Array[UnmarshalledCORSRule]): Self = StObject.set(x, "CORSRules", value.asInstanceOf[js.Any])
      
      inline def setCORSRulesUndefined: Self = StObject.set(x, "CORSRules", js.undefined)
      
      inline def setCORSRulesVarargs(value: UnmarshalledCORSRule*): Self = StObject.set(x, "CORSRules", js.Array(value*))
    }
  }
}
