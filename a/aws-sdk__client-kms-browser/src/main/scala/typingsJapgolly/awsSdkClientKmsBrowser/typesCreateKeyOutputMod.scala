package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.typesKeyMetadataMod.UnmarshalledKeyMetadata
import typingsJapgolly.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateKeyOutputMod {
  
  trait CreateKeyOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Metadata associated with the CMK.</p>
      */
    var KeyMetadata: js.UndefOr[UnmarshalledKeyMetadata] = js.undefined
  }
  object CreateKeyOutput {
    
    inline def apply($metadata: ResponseMetadata): CreateKeyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateKeyOutput]
    }
    
    extension [Self <: CreateKeyOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setKeyMetadata(value: UnmarshalledKeyMetadata): Self = StObject.set(x, "KeyMetadata", value.asInstanceOf[js.Any])
      
      inline def setKeyMetadataUndefined: Self = StObject.set(x, "KeyMetadata", js.undefined)
    }
  }
}
