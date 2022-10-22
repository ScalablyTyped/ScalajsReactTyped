package typingsJapgolly.awsSdkClientS3Browser

import typingsJapgolly.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Browser.typesSelectObjectContentEventStreamMod.UnmarshalledSelectObjectContentEventStream
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSelectObjectContentOutputMod {
  
  trait SelectObjectContentOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _SelectObjectContentEventStream shape
      */
    var Payload: js.UndefOr[UnmarshalledSelectObjectContentEventStream] = js.undefined
  }
  object SelectObjectContentOutput {
    
    inline def apply($metadata: ResponseMetadata): SelectObjectContentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectObjectContentOutput]
    }
    
    extension [Self <: SelectObjectContentOutput](x: Self) {
      
      inline def setPayload(value: UnmarshalledSelectObjectContentEventStream): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    }
  }
}
