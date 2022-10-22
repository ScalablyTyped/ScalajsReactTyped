package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUnlinkIdentityOutputMod {
  
  trait UnlinkIdentityOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
  }
  object UnlinkIdentityOutput {
    
    inline def apply($metadata: ResponseMetadata): UnlinkIdentityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnlinkIdentityOutput]
    }
    
    extension [Self <: UnlinkIdentityOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
    }
  }
}
