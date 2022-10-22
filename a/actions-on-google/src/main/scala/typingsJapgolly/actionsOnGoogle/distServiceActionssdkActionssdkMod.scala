package typingsJapgolly.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.actionsOnGoogle.distAssistantMod.AppHandler
import typingsJapgolly.actionsOnGoogle.distFrameworkFrameworkMod.BuiltinFrameworkMetadata
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleRpcStatus
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConvMod.ActionsSdkConversation
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationArgumentArgumentMod.Argument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationConversationMod.ConversationApp
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationConversationMod.ConversationAppOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationConversationMod.ExceptionHandler
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationConversationMod.Intent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkActionssdkMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/actionssdk", "actionssdk")
  @js.native
  val actionssdk: ActionsSdk_ = js.native
  
  type ActionSdkIntentHandlers = StringDictionary[
    js.UndefOr[
      (ActionsSdkIntentHandler[js.Object, js.Object, ActionsSdkConversation[js.Object, js.Object], Argument]) | String
    ]
  ]
  
  @js.native
  trait ActionsSdkApp[TConvData, TUserStorage, TConversation /* <: ActionsSdkConversation[TConvData, TUserStorage] */]
    extends StObject
       with ConversationApp[TConvData, TUserStorage] {
    
    /** @hidden */
    var _handlers: ActionsSdkHandlers[TConvData, TUserStorage, TConversation] = js.native
    
    /** @hidden */
    var _middlewares: js.Array[ActionsSdkMiddleware[ActionsSdkConversation[js.Object, js.Object]]] = js.native
    
    /** @public */
    def `catch`(catcher: ExceptionHandler[TUserStorage, TConversation]): this.type = js.native
    
    def fallback(handler: String): this.type = js.native
    /** @public */
    def fallback(handler: ActionsSdkIntentHandler[TConvData, TUserStorage, TConversation, Argument]): this.type = js.native
    
    def intent[TArgument /* <: Argument */](intent: String, handler: String): this.type = js.native
    /**
      * Sets the IntentHandler to be executed when the fulfillment is called
      * with a given Actions SDK intent.
      *
      * @param intent The Actions SDK intent to match.
      *     When given an array, sets the IntentHandler for any intent in the array.
      * @param handler The IntentHandler to be executed when the intent is matched.
      *     When given a string instead of a function, the intent fulfillment will be redirected
      *     to the IntentHandler of the redirected intent.
      * @public
      */
    def intent[TArgument /* <: Argument */](
      intent: String,
      handler: ActionsSdkIntentHandler[TConvData, TUserStorage, TConversation, TArgument]
    ): this.type = js.native
    def intent[TArgument /* <: Argument */](intent: js.Array[String], handler: String): this.type = js.native
    def intent[TArgument /* <: Argument */](
      intent: js.Array[Intent | String],
      handler: ActionsSdkIntentHandler[TConvData, TUserStorage, TConversation, TArgument]
    ): this.type = js.native
    def intent[TArgument /* <: Argument */](intent: js.Array[Intent], handler: Intent): this.type = js.native
    /**
      * Sets the IntentHandler to be executed when the fulfillment is called
      * with a given Actions SDK intent.
      *
      * @param intent The Actions SDK intent to match.
      *     When given an array, sets the IntentHandler for any intent in the array.
      * @param handler The IntentHandler to be executed when the intent is matched.
      *     When given a string instead of a function, the intent fulfillment will be redirected
      *     to the IntentHandler of the redirected intent.
      * @public
      */
    def intent[TArgument /* <: Argument */](
      intent: Intent,
      handler: ActionsSdkIntentHandler[TConvData, TUserStorage, TConversation, TArgument]
    ): this.type = js.native
    def intent[TArgument /* <: Argument */](intent: Intent, handler: Intent): this.type = js.native
    
    /** @public */
    def middleware[TConversationPlugin /* <: ActionsSdkConversation[js.Object, js.Object] */](middleware: ActionsSdkMiddleware[TConversationPlugin]): this.type = js.native
    
    /** @public */
    var verification: js.UndefOr[ActionsSdkVerification | String] = js.native
  }
  
  trait ActionsSdkHandlers[TConvData, TUserStorage, TConversation /* <: ActionsSdkConversation[TConvData, TUserStorage] */] extends StObject {
    
    def catcher(conv: TConversation, error: js.Error): js.Promise[Any] | Any
    @JSName("catcher")
    var catcher_Original: ExceptionHandler[TUserStorage, TConversation]
    
    var fallback: js.UndefOr[
        (ActionsSdkIntentHandler[js.Object, js.Object, ActionsSdkConversation[js.Object, js.Object], Argument]) | String
      ] = js.undefined
    
    var intents: ActionSdkIntentHandlers
  }
  object ActionsSdkHandlers {
    
    inline def apply[TConvData, TUserStorage, TConversation /* <: ActionsSdkConversation[TConvData, TUserStorage] */](
      catcher: (TConversation, /* error */ js.Error) => js.Promise[Any] | Any,
      intents: ActionSdkIntentHandlers
    ): ActionsSdkHandlers[TConvData, TUserStorage, TConversation] = {
      val __obj = js.Dynamic.literal(catcher = js.Any.fromFunction2(catcher), intents = intents.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionsSdkHandlers[TConvData, TUserStorage, TConversation]]
    }
    
    extension [Self <: ActionsSdkHandlers[?, ?, ?], TConvData, TUserStorage, TConversation /* <: ActionsSdkConversation[TConvData, TUserStorage] */](x: Self & (ActionsSdkHandlers[TConvData, TUserStorage, TConversation])) {
      
      inline def setCatcher(value: (TConversation, /* error */ js.Error) => js.Promise[Any] | Any): Self = StObject.set(x, "catcher", js.Any.fromFunction2(value))
      
      inline def setFallback(
        value: (ActionsSdkIntentHandler[js.Object, js.Object, ActionsSdkConversation[js.Object, js.Object], Argument]) | String
      ): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackFunction4(
        value: (ActionsSdkConversation[js.Object, js.Object], /* input */ String, Argument, /* status */ js.UndefOr[GoogleRpcStatus]) => js.Promise[Any] | Any
      ): Self = StObject.set(x, "fallback", js.Any.fromFunction4(value))
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setIntents(value: ActionSdkIntentHandlers): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    }
  }
  
  type ActionsSdkIntentHandler[TConvData, TUserStorage, TConversation /* <: ActionsSdkConversation[TConvData, TUserStorage] */, TArgument /* <: Argument */] = js.Function4[
    /* conv */ TConversation, 
    /* input */ String, 
    /* argument */ TArgument, 
    /* status */ js.UndefOr[GoogleRpcStatus], 
    js.Promise[Any] | Any
  ]
  
  type ActionsSdkMiddleware[TConversationPlugin /* <: ActionsSdkConversation[js.Object, js.Object] */] = js.Function2[
    /* conv */ ActionsSdkConversation[js.Object, js.Object], 
    /* framework */ BuiltinFrameworkMetadata, 
    ((ActionsSdkConversation[js.Object, js.Object]) & TConversationPlugin) | Unit | (js.Promise[((ActionsSdkConversation[js.Object, js.Object]) & TConversationPlugin) | Unit])
  ]
  
  trait ActionsSdkOptions[TConvData, TUserStorage]
    extends StObject
       with ConversationAppOptions[TConvData, TUserStorage] {
    
    /**
      * Validates whether request is from Google through signature verification.
      * Uses Google-Auth-Library to verify authorization token against given Google Cloud Project ID.
      * Auth token is given in request header with key, "authorization".
      *
      * HTTP Code 403 will be thrown by default on verification error.
      *
      * @example
      * ```javascript
      *
      * const app = actionssdk({ verification: 'nodejs-cloud-test-project-1234' })
      * ```
      *
      * @public
      */
    var verification: js.UndefOr[ActionsSdkVerification | String] = js.undefined
  }
  object ActionsSdkOptions {
    
    inline def apply[TConvData, TUserStorage](): ActionsSdkOptions[TConvData, TUserStorage] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionsSdkOptions[TConvData, TUserStorage]]
    }
    
    extension [Self <: ActionsSdkOptions[?, ?], TConvData, TUserStorage](x: Self & (ActionsSdkOptions[TConvData, TUserStorage])) {
      
      inline def setVerification(value: ActionsSdkVerification | String): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
      
      inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
    }
  }
  
  trait ActionsSdkVerification extends StObject {
    
    /**
      * Custom error message as a string or a function that returns a string
      * given the original error message set by the library.
      *
      * The message will get sent back in the JSON top level `error` property.
      * @public
      */
    var error: js.UndefOr[String | (js.Function1[/* error */ String, String])] = js.undefined
    
    /**
      * Google Cloud Project ID for the Assistant app.
      * @public
      */
    var project: String
    
    /**
      * Custom status code to return on verification error.
      * @public
      */
    var status: js.UndefOr[Double] = js.undefined
  }
  object ActionsSdkVerification {
    
    inline def apply(project: String): ActionsSdkVerification = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionsSdkVerification]
    }
    
    extension [Self <: ActionsSdkVerification](x: Self) {
      
      inline def setError(value: String | (js.Function1[/* error */ String, String])): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorFunction1(value: /* error */ String => String): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait ActionsSdk_ extends StObject {
    
    /** @public */
    def apply[Conversation /* <: ActionsSdkConversation[js.Object, js.Object] */](): AppHandler & (ActionsSdkApp[js.Object, js.Object, Conversation]) = js.native
    def apply[Conversation /* <: ActionsSdkConversation[js.Object, js.Object] */](options: ActionsSdkOptions[js.Object, js.Object]): AppHandler & (ActionsSdkApp[js.Object, js.Object, Conversation]) = js.native
  }
}
