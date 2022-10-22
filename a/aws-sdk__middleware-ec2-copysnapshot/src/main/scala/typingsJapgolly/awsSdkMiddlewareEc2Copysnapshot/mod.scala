package typingsJapgolly.awsSdkMiddlewareEc2Copysnapshot

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.awsSdkTypes.distTypesCredentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Decoder
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Encoder
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-ec2-copysnapshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addPresignedUrl[Input /* <: CopySnapshotInput */, Output /* <: MetadataBearer */](
    hasRegionProviderCredentialsProviderEndpointProviderBase64EncoderUtf8DecoderSha256: AddPresignedUrlParameters
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addPresignedUrl")(hasRegionProviderCredentialsProviderEndpointProviderBase64EncoderUtf8DecoderSha256.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait AddPresignedUrlParameters extends StObject {
    
    /**
      * Encoder to encode the blob input when generate presigned URL
      */
    def base64Encoder(input: js.typedarray.Uint8Array): String
    /**
      * Encoder to encode the blob input when generate presigned URL
      */
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder
    
    /**
      * Credentials provider used to sign the presigned URL
      */
    def credentials(): js.Promise[Credentials]
    /**
      * Credentials provider used to sign the presigned URL
      */
    @JSName("credentials")
    var credentials_Original: Provider[Credentials]
    
    /**
      * Endpoint provider of the original request.
      */
    def endpoint(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ Any
      ]
    /**
      * Endpoint provider of the original request.
      */
    @JSName("endpoint")
    var endpoint_Original: Provider[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ Any
      ]
    
    /**
      * Region provider used to sign the presigned URL
      */
    def region(): js.Promise[String]
    /**
      * Region provider used to sign the presigned URL
      */
    @JSName("region")
    var region_Original: Provider[String]
    
    /**
      * Hashing class used by signer
      */
    var sha256: HashConstructor
    
    /**
      * Decoder to decode input string when generate presigned URL
      */
    def utf8Decoder(input: String): js.typedarray.Uint8Array
    /**
      * Decoder to decode input string when generate presigned URL
      */
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder
  }
  object AddPresignedUrlParameters {
    
    inline def apply(
      base64Encoder: /* input */ js.typedarray.Uint8Array => String,
      credentials: CallbackTo[js.Promise[Credentials]],
      endpoint: CallbackTo[
          js.Promise[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ Any
          ]
        ],
      region: CallbackTo[js.Promise[String]],
      sha256: HashConstructor,
      utf8Decoder: /* input */ String => js.typedarray.Uint8Array
    ): AddPresignedUrlParameters = {
      val __obj = js.Dynamic.literal(base64Encoder = js.Any.fromFunction1(base64Encoder), credentials = credentials.toJsFn, endpoint = endpoint.toJsFn, region = region.toJsFn, sha256 = sha256.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder))
      __obj.asInstanceOf[AddPresignedUrlParameters]
    }
    
    extension [Self <: AddPresignedUrlParameters](x: Self) {
      
      inline def setBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      inline def setCredentials(value: CallbackTo[js.Promise[Credentials]]): Self = StObject.set(x, "credentials", value.toJsFn)
      
      inline def setEndpoint(
        value: CallbackTo[
              js.Promise[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ Any
              ]
            ]
      ): Self = StObject.set(x, "endpoint", value.toJsFn)
      
      inline def setRegion(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "region", value.toJsFn)
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
    }
  }
  
  trait CopySnapshotInput extends StObject {
    
    var DestinationRegion: js.UndefOr[String] = js.undefined
    
    var PresignedUrl: js.UndefOr[String] = js.undefined
    
    var SourceRegion: String
  }
  object CopySnapshotInput {
    
    inline def apply(SourceRegion: String): CopySnapshotInput = {
      val __obj = js.Dynamic.literal(SourceRegion = SourceRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopySnapshotInput]
    }
    
    extension [Self <: CopySnapshotInput](x: Self) {
      
      inline def setDestinationRegion(value: String): Self = StObject.set(x, "DestinationRegion", value.asInstanceOf[js.Any])
      
      inline def setDestinationRegionUndefined: Self = StObject.set(x, "DestinationRegion", js.undefined)
      
      inline def setPresignedUrl(value: String): Self = StObject.set(x, "PresignedUrl", value.asInstanceOf[js.Any])
      
      inline def setPresignedUrlUndefined: Self = StObject.set(x, "PresignedUrl", js.undefined)
      
      inline def setSourceRegion(value: String): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    }
  }
}
