package typingsJapgolly.awsSdkClientS3Browser

import typingsJapgolly.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateBucketOutputMod {
  
  trait CreateBucketOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _Location shape
      */
    var Location: js.UndefOr[String] = js.undefined
  }
  object CreateBucketOutput {
    
    inline def apply($metadata: ResponseMetadata): CreateBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateBucketOutput]
    }
    
    extension [Self <: CreateBucketOutput](x: Self) {
      
      inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    }
  }
}
