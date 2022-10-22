package typingsJapgolly.grpcGrpcJs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.grpcGrpcJs.buildSrcMetadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCallCredentialsMod {
  
  /* note: abstract class */ @JSImport("@grpc/grpc-js/build/src/call-credentials", "CallCredentials")
  @js.native
  open class CallCredentials () extends StObject {
    
    /**
      * Check whether two call credentials objects are equal. Separate
      * SingleCallCredentials with identical metadata generator functions are
      * equal.
      * @param other The other CallCredentials object to compare with.
      */
    def _equals(other: CallCredentials): Boolean = js.native
    
    /**
      * Creates a new CallCredentials object from properties of both this and
      * another CallCredentials object. This object's metadata generator will be
      * called first.
      * @param callCredentials The other CallCredentials object.
      */
    def compose(callCredentials: CallCredentials): CallCredentials = js.native
    
    /**
      * Asynchronously generates a new Metadata object.
      * @param options Options used in generating the Metadata object.
      */
    def generateMetadata(options: CallMetadataOptions): js.Promise[Metadata] = js.native
  }
  /* static members */
  object CallCredentials {
    
    @JSImport("@grpc/grpc-js/build/src/call-credentials", "CallCredentials")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createEmpty(): CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmpty")().asInstanceOf[CallCredentials]
    
    /**
      * Create a gRPC credential from a Google credential object.
      * @param googleCredentials The authentication client to use.
      * @return The resulting CallCredentials object.
      */
    inline def createFromGoogleCredential(googleCredentials: OAuth2Client): CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromGoogleCredential")(googleCredentials.asInstanceOf[js.Any]).asInstanceOf[CallCredentials]
    
    /**
      * Creates a new CallCredentials object from a given function that generates
      * Metadata objects.
      * @param metadataGenerator A function that accepts a set of options, and
      * generates a Metadata object based on these options, which is passed back
      * to the caller via a supplied (err, metadata) callback.
      */
    inline def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromMetadataGenerator")(metadataGenerator.asInstanceOf[js.Any]).asInstanceOf[CallCredentials]
  }
  
  type CallMetadataGenerator = js.Function2[
    /* options */ CallMetadataOptions, 
    /* cb */ js.Function2[/* err */ js.Error | Null, /* metadata */ js.UndefOr[Metadata], Unit], 
    Unit
  ]
  
  trait CallMetadataOptions extends StObject {
    
    var service_url: String
  }
  object CallMetadataOptions {
    
    inline def apply(service_url: String): CallMetadataOptions = {
      val __obj = js.Dynamic.literal(service_url = service_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallMetadataOptions]
    }
    
    extension [Self <: CallMetadataOptions](x: Self) {
      
      inline def setService_url(value: String): Self = StObject.set(x, "service_url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CurrentOAuth2Client
    extends StObject
       with OAuth2Client {
    
    def getRequestHeaders(): js.Promise[StringDictionary[String]] = js.native
    def getRequestHeaders(url: String): js.Promise[StringDictionary[String]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.OldOAuth2Client
    - typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CurrentOAuth2Client
  */
  trait OAuth2Client extends StObject
  
  trait OldOAuth2Client
    extends StObject
       with OAuth2Client {
    
    def getRequestMetadata(
      url: String,
      callback: js.Function2[/* err */ js.Error | Null, /* headers */ js.UndefOr[StringDictionary[String]], Unit]
    ): Unit
  }
  object OldOAuth2Client {
    
    inline def apply(
      getRequestMetadata: (String, js.Function2[/* err */ js.Error | Null, /* headers */ js.UndefOr[StringDictionary[String]], Unit]) => Callback
    ): OldOAuth2Client = {
      val __obj = js.Dynamic.literal(getRequestMetadata = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ js.Error | Null, /* headers */ js.UndefOr[StringDictionary[String]], Unit]) => (getRequestMetadata(t0, t1)).runNow()))
      __obj.asInstanceOf[OldOAuth2Client]
    }
    
    extension [Self <: OldOAuth2Client](x: Self) {
      
      inline def setGetRequestMetadata(
        value: (String, js.Function2[/* err */ js.Error | Null, /* headers */ js.UndefOr[StringDictionary[String]], Unit]) => Callback
      ): Self = StObject.set(x, "getRequestMetadata", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ js.Error | Null, /* headers */ js.UndefOr[StringDictionary[String]], Unit]) => (value(t0, t1)).runNow()))
    }
  }
}
