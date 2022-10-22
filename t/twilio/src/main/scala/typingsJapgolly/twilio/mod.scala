package typingsJapgolly.twilio

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.std.Record
import typingsJapgolly.twilio.anon.TaskRouterCapability
import typingsJapgolly.twilio.anon.TypeofAccessToken
import typingsJapgolly.twilio.anon.TypeofClientCapability
import typingsJapgolly.twilio.libJwtAccessTokenMod.AccessTokenOptions
import typingsJapgolly.twilio.libJwtClientCapabilityMod.ClientCapabilityOptions
import typingsJapgolly.twilio.libRestTwilioMod.TwilioClientOptions
import typingsJapgolly.twilio.libWebhooksWebhooksMod.Request
import typingsJapgolly.twilio.libWebhooksWebhooksMod.RequestValidatorOptions
import typingsJapgolly.twilio.libWebhooksWebhooksMod.WebhookOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): typingsJapgolly.twilio.libRestTwilioMod.^ = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsJapgolly.twilio.libRestTwilioMod.^]
  inline def apply(accountSid: String): typingsJapgolly.twilio.libRestTwilioMod.^ = ^.asInstanceOf[js.Dynamic].apply(accountSid.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.twilio.libRestTwilioMod.^]
  inline def apply(accountSid: String, authToken: String): typingsJapgolly.twilio.libRestTwilioMod.^ = (^.asInstanceOf[js.Dynamic].apply(accountSid.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.twilio.libRestTwilioMod.^]
  inline def apply(accountSid: String, authToken: String, opts: TwilioClientOptions): typingsJapgolly.twilio.libRestTwilioMod.^ = (^.asInstanceOf[js.Dynamic].apply(accountSid.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.twilio.libRestTwilioMod.^]
  inline def apply(accountSid: String, authToken: Unit, opts: TwilioClientOptions): typingsJapgolly.twilio.libRestTwilioMod.^ = (^.asInstanceOf[js.Dynamic].apply(accountSid.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.twilio.libRestTwilioMod.^]
  inline def apply(accountSid: Unit, authToken: String): typingsJapgolly.twilio.libRestTwilioMod.^ = (^.asInstanceOf[js.Dynamic].apply(accountSid.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.twilio.libRestTwilioMod.^]
  inline def apply(accountSid: Unit, authToken: String, opts: TwilioClientOptions): typingsJapgolly.twilio.libRestTwilioMod.^ = (^.asInstanceOf[js.Dynamic].apply(accountSid.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.twilio.libRestTwilioMod.^]
  inline def apply(accountSid: Unit, authToken: Unit, opts: TwilioClientOptions): typingsJapgolly.twilio.libRestTwilioMod.^ = (^.asInstanceOf[js.Dynamic].apply(accountSid.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.twilio.libRestTwilioMod.^]
  
  @JSImport("twilio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio", "RequestClient")
  @js.native
  val RequestClient: typingsJapgolly.twilio.libBaseRequestClientMod.^ = js.native
  
  @JSImport("twilio", "Twilio")
  @js.native
  open class Twilio protected ()
    extends typingsJapgolly.twilio.libRestTwilioMod.^ {
    /**
      * Twilio Client to interact with the Rest API
      *
      * @param username - The username used for authentication. This is normally account sid, but if using key/secret auth will be the api key sid.
      * @param password - The password used for authentication. This is normally auth token, but if using key/secret auth will be the secret.
      * @param opts - The options argument
      */
    def this(username: String, password: String) = this()
    def this(username: String, password: String, opts: TwilioClientOptions) = this()
  }
  
  object jwt extends Shortcut {
    
    @JSImport("twilio", "jwt")
    @js.native
    val ^ : JwtInterface = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("twilio", "jwt.AccessToken")
    @js.native
    open class AccessToken protected ()
      extends typingsJapgolly.twilio.libJwtAccessTokenMod.^ {
      /**
        * Creates new AccessToken instance
        *
        * @param accountSid - The account's unique ID to which access is scoped
        * @param keySid - The signing key's unique ID
        * @param secret - The secret to sign the token with
        * @param options - Options
        */
      def this(accountSid: String, keySid: String, secret: String) = this()
      def this(accountSid: String, keySid: String, secret: String, options: AccessTokenOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("twilio", "jwt.ClientCapability")
    @js.native
    open class ClientCapability protected ()
      extends typingsJapgolly.twilio.libJwtClientCapabilityMod.^ {
      def this(options: ClientCapabilityOptions) = this()
    }
    
    type _To = JwtInterface
    
    /* This means you don't have to write `^`, but can instead just say `jwt.foo` */
    override def _to: JwtInterface = ^
  }
  
  object twiml extends Shortcut {
    
    @JSImport("twilio", "twiml")
    @js.native
    val ^ : TwimlInterface = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("twilio", "twiml.FaxResponse")
    @js.native
    open class FaxResponse ()
      extends typingsJapgolly.twilio.libTwimlFaxResponseMod.^
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("twilio", "twiml.MessagingResponse")
    @js.native
    open class MessagingResponse ()
      extends typingsJapgolly.twilio.libTwimlMessagingResponseMod.^
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("twilio", "twiml.VoiceResponse")
    @js.native
    open class VoiceResponse ()
      extends typingsJapgolly.twilio.libTwimlVoiceResponseMod.^
    
    type _To = TwimlInterface
    
    /* This means you don't have to write `^`, but can instead just say `twiml.foo` */
    override def _to: TwimlInterface = ^
  }
  
  @JSImport("twilio", "validateExpressRequest")
  @js.native
  val validateExpressRequest: js.Function3[
    /* request */ Request, 
    /* authToken */ String, 
    /* opts */ js.UndefOr[RequestValidatorOptions], 
    Boolean
  ] = js.native
  
  @JSImport("twilio", "validateRequest")
  @js.native
  val validateRequest: js.Function4[
    /* authToken */ String, 
    /* twilioHeader */ String, 
    /* url */ String, 
    /* params */ Record[String, Any], 
    Boolean
  ] = js.native
  
  @JSImport("twilio", "validateRequestWithBody")
  @js.native
  val validateRequestWithBody: js.Function4[
    /* authToken */ String, 
    /* twilioHeader */ String, 
    /* requestUrl */ String, 
    /* body */ String, 
    Boolean
  ] = js.native
  
  inline def webhook(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("webhook")().asInstanceOf[Any]
  inline def webhook(authToken: String, opts: WebhookOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("webhook")(authToken.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def webhook(opts: WebhookOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("webhook")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def webhook(opts: WebhookOptions, authToken: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("webhook")(opts.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait JwtInterface extends StObject {
    
    var AccessToken: TypeofAccessToken & (Instantiable4[
        /* accountSid */ String, 
        /* keySid */ String, 
        /* secret */ String, 
        /* options */ js.UndefOr[AccessTokenOptions], 
        typingsJapgolly.twilio.libJwtAccessTokenMod.^
      ])
    
    var ClientCapability: TypeofClientCapability & (Instantiable1[
        /* options */ ClientCapabilityOptions, 
        typingsJapgolly.twilio.libJwtClientCapabilityMod.^
      ])
    
    var taskrouter: TaskRouterCapability
  }
  object JwtInterface {
    
    inline def apply(
      AccessToken: TypeofAccessToken & (Instantiable4[
          /* accountSid */ String, 
          /* keySid */ String, 
          /* secret */ String, 
          /* options */ js.UndefOr[AccessTokenOptions], 
          typingsJapgolly.twilio.libJwtAccessTokenMod.^
        ]),
      ClientCapability: TypeofClientCapability & (Instantiable1[
          /* options */ ClientCapabilityOptions, 
          typingsJapgolly.twilio.libJwtClientCapabilityMod.^
        ]),
      taskrouter: TaskRouterCapability
    ): JwtInterface = {
      val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], ClientCapability = ClientCapability.asInstanceOf[js.Any], taskrouter = taskrouter.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwtInterface]
    }
    
    extension [Self <: JwtInterface](x: Self) {
      
      inline def setAccessToken(
        value: TypeofAccessToken & (Instantiable4[
              /* accountSid */ String, 
              /* keySid */ String, 
              /* secret */ String, 
              /* options */ js.UndefOr[AccessTokenOptions], 
              typingsJapgolly.twilio.libJwtAccessTokenMod.^
            ])
      ): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
      
      inline def setClientCapability(
        value: TypeofClientCapability & (Instantiable1[
              /* options */ ClientCapabilityOptions, 
              typingsJapgolly.twilio.libJwtClientCapabilityMod.^
            ])
      ): Self = StObject.set(x, "ClientCapability", value.asInstanceOf[js.Any])
      
      inline def setTaskrouter(value: TaskRouterCapability): Self = StObject.set(x, "taskrouter", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TwimlConstructor[T]
    extends StObject
       with Instantiable0[T]
  
  trait TwimlInterface extends StObject {
    
    var FaxResponse: TwimlConstructor[typingsJapgolly.twilio.libTwimlFaxResponseMod.^]
    
    var MessagingResponse: TwimlConstructor[typingsJapgolly.twilio.libTwimlMessagingResponseMod.^]
    
    var VoiceResponse: TwimlConstructor[typingsJapgolly.twilio.libTwimlVoiceResponseMod.^]
  }
  object TwimlInterface {
    
    inline def apply(
      FaxResponse: TwimlConstructor[typingsJapgolly.twilio.libTwimlFaxResponseMod.^],
      MessagingResponse: TwimlConstructor[typingsJapgolly.twilio.libTwimlMessagingResponseMod.^],
      VoiceResponse: TwimlConstructor[typingsJapgolly.twilio.libTwimlVoiceResponseMod.^]
    ): TwimlInterface = {
      val __obj = js.Dynamic.literal(FaxResponse = FaxResponse.asInstanceOf[js.Any], MessagingResponse = MessagingResponse.asInstanceOf[js.Any], VoiceResponse = VoiceResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwimlInterface]
    }
    
    extension [Self <: TwimlInterface](x: Self) {
      
      inline def setFaxResponse(value: TwimlConstructor[typingsJapgolly.twilio.libTwimlFaxResponseMod.^]): Self = StObject.set(x, "FaxResponse", value.asInstanceOf[js.Any])
      
      inline def setMessagingResponse(value: TwimlConstructor[typingsJapgolly.twilio.libTwimlMessagingResponseMod.^]): Self = StObject.set(x, "MessagingResponse", value.asInstanceOf[js.Any])
      
      inline def setVoiceResponse(value: TwimlConstructor[typingsJapgolly.twilio.libTwimlVoiceResponseMod.^]): Self = StObject.set(x, "VoiceResponse", value.asInstanceOf[js.Any])
    }
  }
}
