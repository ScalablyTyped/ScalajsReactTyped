package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetParametersForImportOutputMod {
  
  trait GetParametersForImportOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The import token to send in a subsequent <a>ImportKeyMaterial</a> request.</p>
      */
    var ImportToken: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    /**
      * <p>The identifier of the CMK to use in a subsequent <a>ImportKeyMaterial</a> request. This is the same CMK specified in the <code>GetParametersForImport</code> request.</p>
      */
    var KeyId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The time at which the import token and public key are no longer valid. After this time, you cannot use them to make an <a>ImportKeyMaterial</a> request and you must send another <code>GetParametersForImport</code> request to get new ones.</p>
      */
    var ParametersValidTo: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>The public key to use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.</p>
      */
    var PublicKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object GetParametersForImportOutput {
    
    inline def apply($metadata: ResponseMetadata): GetParametersForImportOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetParametersForImportOutput]
    }
    
    extension [Self <: GetParametersForImportOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setImportToken(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ImportToken", value.asInstanceOf[js.Any])
      
      inline def setImportTokenUndefined: Self = StObject.set(x, "ImportToken", js.undefined)
      
      inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
      
      inline def setParametersValidTo(value: js.Date): Self = StObject.set(x, "ParametersValidTo", value.asInstanceOf[js.Any])
      
      inline def setParametersValidToUndefined: Self = StObject.set(x, "ParametersValidTo", js.undefined)
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
    }
  }
}
