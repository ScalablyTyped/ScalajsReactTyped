package typingsJapgolly.twilio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestTwilioMod {
  
  @JSImport("twilio/lib/rest/Twilio", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Twilio {
    /**
      * Twilio Client to interact with the Rest API
      *
      * @param username - The username used for authentication. This is normally account sid, but if using key/secret auth will be the api key sid.
      * @param password - The password used for authentication. This is normally auth token, but if using key/secret auth will be the secret.
      * @param opts - The options argument
      */
    def this(username: String, password: String) = this()
    def this(username: String, password: String, opts: TwilioClientOptions) = this()
    
    /* CompleteClass */
    var accounts: typingsJapgolly.twilio.libRestAccountsMod.^ = js.native
    
    /* CompleteClass */
    var addresses: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.addresses */ Any = js.native
    
    /* CompleteClass */
    var api: typingsJapgolly.twilio.libRestApiMod.^ = js.native
    
    /* CompleteClass */
    var applications: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.applications */ Any = js.native
    
    /* CompleteClass */
    var authorizedConnectApps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.authorizedConnectApps */ Any = js.native
    
    /* CompleteClass */
    var autopilot: typingsJapgolly.twilio.libRestAutopilotMod.^ = js.native
    
    /* CompleteClass */
    var availablePhoneNumbers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.availablePhoneNumbers */ Any = js.native
    
    /* CompleteClass */
    var balance: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.balance */ Any = js.native
    
    /* CompleteClass */
    var bulkexports: typingsJapgolly.twilio.libRestBulkexportsMod.^ = js.native
    
    /* CompleteClass */
    var calls: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.calls */ Any = js.native
    
    /* CompleteClass */
    var chat: typingsJapgolly.twilio.libRestChatMod.^ = js.native
    
    /* CompleteClass */
    var conferences: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.conferences */ Any = js.native
    
    /* CompleteClass */
    var connectApps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.connectApps */ Any = js.native
    
    /* CompleteClass */
    var conversations: typingsJapgolly.twilio.libRestConversationsMod.^ = js.native
    
    /* CompleteClass */
    var events: typingsJapgolly.twilio.libRestEventsMod.^ = js.native
    
    /* CompleteClass */
    var flexApi: typingsJapgolly.twilio.libRestFlexApiMod.^ = js.native
    
    /* CompleteClass */
    var frontlineApi: typingsJapgolly.twilio.libRestFrontlineApiMod.^ = js.native
    
    /* CompleteClass */
    var incomingPhoneNumbers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.incomingPhoneNumbers */ Any = js.native
    
    /* CompleteClass */
    var insights: typingsJapgolly.twilio.libRestInsightsMod.^ = js.native
    
    /* CompleteClass */
    var ipMessaging: typingsJapgolly.twilio.libRestIpMessagingMod.^ = js.native
    
    /* CompleteClass */
    var keys: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.keys */ Any = js.native
    
    /* CompleteClass */
    var lookups: typingsJapgolly.twilio.libRestLookupsMod.^ = js.native
    
    /* CompleteClass */
    var media: typingsJapgolly.twilio.libRestMediaMod.^ = js.native
    
    /* CompleteClass */
    var messages: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.messages */ Any = js.native
    
    /* CompleteClass */
    var messaging: typingsJapgolly.twilio.libRestMessagingMod.^ = js.native
    
    /* CompleteClass */
    var microvisor: typingsJapgolly.twilio.libRestMicrovisorMod.^ = js.native
    
    /* CompleteClass */
    var monitor: typingsJapgolly.twilio.libRestMonitorMod.^ = js.native
    
    /* CompleteClass */
    var newKeys: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.newKeys */ Any = js.native
    
    /* CompleteClass */
    var newSigningKeys: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.newSigningKeys */ Any = js.native
    
    /* CompleteClass */
    var notifications: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.notifications */ Any = js.native
    
    /* CompleteClass */
    @JSName("notify")
    var notify_FTwilio: typingsJapgolly.twilio.libRestNotifyMod.^ = js.native
    
    /* CompleteClass */
    var numbers: typingsJapgolly.twilio.libRestNumbersMod.^ = js.native
    
    /* CompleteClass */
    var outgoingCallerIds: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.outgoingCallerIds */ Any = js.native
    
    /* CompleteClass */
    var preview: typingsJapgolly.twilio.libRestPreviewMod.^ = js.native
    
    /* CompleteClass */
    var pricing: typingsJapgolly.twilio.libRestPricingMod.^ = js.native
    
    /* CompleteClass */
    var proxy: typingsJapgolly.twilio.libRestProxyMod.^ = js.native
    
    /* CompleteClass */
    var queues: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.queues */ Any = js.native
    
    /* CompleteClass */
    var recordings: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.recordings */ Any = js.native
    
    /**
      * Makes a request to the Twilio API using the configured http client.
      * Authentication information is automatically added if none is provided.
      *
      * @param opts - The options argument
      */
    /* CompleteClass */
    override def request(opts: RequestOptions): js.Promise[Any] = js.native
    
    /* CompleteClass */
    var routes: typingsJapgolly.twilio.libRestRoutesMod.^ = js.native
    
    /* CompleteClass */
    var serverless: typingsJapgolly.twilio.libRestServerlessMod.^ = js.native
    
    /* CompleteClass */
    var shortCodes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.shortCodes */ Any = js.native
    
    /* CompleteClass */
    var signingKeys: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.signingKeys */ Any = js.native
    
    /* CompleteClass */
    var sip: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.sip */ Any = js.native
    
    /* CompleteClass */
    var studio: typingsJapgolly.twilio.libRestStudioMod.^ = js.native
    
    /* CompleteClass */
    var supersim: typingsJapgolly.twilio.libRestSupersimMod.^ = js.native
    
    /* CompleteClass */
    var sync: typingsJapgolly.twilio.libRestSyncMod.^ = js.native
    
    /* CompleteClass */
    var taskrouter: typingsJapgolly.twilio.libRestTaskrouterMod.^ = js.native
    
    /* CompleteClass */
    var tokens: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.tokens */ Any = js.native
    
    /* CompleteClass */
    var transcriptions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.transcriptions */ Any = js.native
    
    /* CompleteClass */
    var trunking: typingsJapgolly.twilio.libRestTrunkingMod.^ = js.native
    
    /* CompleteClass */
    var trusthub: typingsJapgolly.twilio.libRestTrusthubMod.^ = js.native
    
    /* CompleteClass */
    var usage: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.usage */ Any = js.native
    
    /**
      * Validates that a request to the new SSL certificate is successful.
      *
      * @throws {RestException} if the request fails
      */
    /* CompleteClass */
    override def validateSslCert(): js.Promise[Any] = js.native
    
    /* CompleteClass */
    var validationRequests: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.validationRequests */ Any = js.native
    
    /* CompleteClass */
    var verify: typingsJapgolly.twilio.libRestVerifyMod.^ = js.native
    
    /* CompleteClass */
    var video: typingsJapgolly.twilio.libRestVideoMod.^ = js.native
    
    /* CompleteClass */
    var voice: typingsJapgolly.twilio.libRestVoiceMod.^ = js.native
    
    /* CompleteClass */
    var wireless: typingsJapgolly.twilio.libRestWirelessMod.^ = js.native
  }
  
  trait RequestOptions extends StObject {
    
    var allowRedirects: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[js.Object] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var logLevel: js.UndefOr[String] = js.undefined
    
    var method: String
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var uri: String
    
    var username: js.UndefOr[String] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(method: String, uri: String): RequestOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setAllowRedirects(value: Boolean): Self = StObject.set(x, "allowRedirects", value.asInstanceOf[js.Any])
      
      inline def setAllowRedirectsUndefined: Self = StObject.set(x, "allowRedirects", js.undefined)
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Twilio extends StObject {
    
    var accounts: typingsJapgolly.twilio.libRestAccountsMod.^
    
    var addresses: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.addresses */ Any
    
    var api: typingsJapgolly.twilio.libRestApiMod.^
    
    var applications: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.applications */ Any
    
    var authorizedConnectApps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.authorizedConnectApps */ Any
    
    var autopilot: typingsJapgolly.twilio.libRestAutopilotMod.^
    
    var availablePhoneNumbers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.availablePhoneNumbers */ Any
    
    var balance: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.balance */ Any
    
    var bulkexports: typingsJapgolly.twilio.libRestBulkexportsMod.^
    
    var calls: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.calls */ Any
    
    var chat: typingsJapgolly.twilio.libRestChatMod.^
    
    var conferences: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.conferences */ Any
    
    var connectApps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.connectApps */ Any
    
    var conversations: typingsJapgolly.twilio.libRestConversationsMod.^
    
    var events: typingsJapgolly.twilio.libRestEventsMod.^
    
    var flexApi: typingsJapgolly.twilio.libRestFlexApiMod.^
    
    var frontlineApi: typingsJapgolly.twilio.libRestFrontlineApiMod.^
    
    var httpClient: js.UndefOr[typingsJapgolly.twilio.libBaseRequestClientMod.^] = js.undefined
    
    var incomingPhoneNumbers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.incomingPhoneNumbers */ Any
    
    var insights: typingsJapgolly.twilio.libRestInsightsMod.^
    
    var ipMessaging: typingsJapgolly.twilio.libRestIpMessagingMod.^
    
    var keys: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.keys */ Any
    
    var lookups: typingsJapgolly.twilio.libRestLookupsMod.^
    
    var media: typingsJapgolly.twilio.libRestMediaMod.^
    
    var messages: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.messages */ Any
    
    var messaging: typingsJapgolly.twilio.libRestMessagingMod.^
    
    var microvisor: typingsJapgolly.twilio.libRestMicrovisorMod.^
    
    var monitor: typingsJapgolly.twilio.libRestMonitorMod.^
    
    var newKeys: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.newKeys */ Any
    
    var newSigningKeys: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.newSigningKeys */ Any
    
    var notifications: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.notifications */ Any
    
    @JSName("notify")
    var notify_FTwilio: typingsJapgolly.twilio.libRestNotifyMod.^
    
    var numbers: typingsJapgolly.twilio.libRestNumbersMod.^
    
    var outgoingCallerIds: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.outgoingCallerIds */ Any
    
    var preview: typingsJapgolly.twilio.libRestPreviewMod.^
    
    var pricing: typingsJapgolly.twilio.libRestPricingMod.^
    
    var proxy: typingsJapgolly.twilio.libRestProxyMod.^
    
    var queues: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.queues */ Any
    
    var recordings: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.recordings */ Any
    
    /**
      * Makes a request to the Twilio API using the configured http client.
      * Authentication information is automatically added if none is provided.
      *
      * @param opts - The options argument
      */
    def request(opts: RequestOptions): js.Promise[Any]
    
    var routes: typingsJapgolly.twilio.libRestRoutesMod.^
    
    var serverless: typingsJapgolly.twilio.libRestServerlessMod.^
    
    var shortCodes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.shortCodes */ Any
    
    var signingKeys: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.signingKeys */ Any
    
    var sip: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.sip */ Any
    
    var studio: typingsJapgolly.twilio.libRestStudioMod.^
    
    var supersim: typingsJapgolly.twilio.libRestSupersimMod.^
    
    var sync: typingsJapgolly.twilio.libRestSyncMod.^
    
    var taskrouter: typingsJapgolly.twilio.libRestTaskrouterMod.^
    
    var tokens: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.tokens */ Any
    
    var transcriptions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.transcriptions */ Any
    
    var trunking: typingsJapgolly.twilio.libRestTrunkingMod.^
    
    var trusthub: typingsJapgolly.twilio.libRestTrusthubMod.^
    
    var usage: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.usage */ Any
    
    /**
      * Validates that a request to the new SSL certificate is successful.
      *
      * @throws {RestException} if the request fails
      */
    def validateSslCert(): js.Promise[Any]
    
    var validationRequests: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.validationRequests */ Any
    
    var verify: typingsJapgolly.twilio.libRestVerifyMod.^
    
    var video: typingsJapgolly.twilio.libRestVideoMod.^
    
    var voice: typingsJapgolly.twilio.libRestVoiceMod.^
    
    var wireless: typingsJapgolly.twilio.libRestWirelessMod.^
  }
  object Twilio {
    
    inline def apply(
      accounts: typingsJapgolly.twilio.libRestAccountsMod.^,
      addresses: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.addresses */ Any,
      api: typingsJapgolly.twilio.libRestApiMod.^,
      applications: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.applications */ Any,
      authorizedConnectApps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.authorizedConnectApps */ Any,
      autopilot: typingsJapgolly.twilio.libRestAutopilotMod.^,
      availablePhoneNumbers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.availablePhoneNumbers */ Any,
      balance: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.balance */ Any,
      bulkexports: typingsJapgolly.twilio.libRestBulkexportsMod.^,
      calls: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.calls */ Any,
      chat: typingsJapgolly.twilio.libRestChatMod.^,
      conferences: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.conferences */ Any,
      connectApps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.connectApps */ Any,
      conversations: typingsJapgolly.twilio.libRestConversationsMod.^,
      events: typingsJapgolly.twilio.libRestEventsMod.^,
      flexApi: typingsJapgolly.twilio.libRestFlexApiMod.^,
      frontlineApi: typingsJapgolly.twilio.libRestFrontlineApiMod.^,
      incomingPhoneNumbers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.incomingPhoneNumbers */ Any,
      insights: typingsJapgolly.twilio.libRestInsightsMod.^,
      ipMessaging: typingsJapgolly.twilio.libRestIpMessagingMod.^,
      keys: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.keys */ Any,
      lookups: typingsJapgolly.twilio.libRestLookupsMod.^,
      media: typingsJapgolly.twilio.libRestMediaMod.^,
      messages: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.messages */ Any,
      messaging: typingsJapgolly.twilio.libRestMessagingMod.^,
      microvisor: typingsJapgolly.twilio.libRestMicrovisorMod.^,
      monitor: typingsJapgolly.twilio.libRestMonitorMod.^,
      newKeys: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.newKeys */ Any,
      newSigningKeys: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.newSigningKeys */ Any,
      notifications: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.notifications */ Any,
      notify_ : typingsJapgolly.twilio.libRestNotifyMod.^,
      numbers: typingsJapgolly.twilio.libRestNumbersMod.^,
      outgoingCallerIds: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.outgoingCallerIds */ Any,
      preview: typingsJapgolly.twilio.libRestPreviewMod.^,
      pricing: typingsJapgolly.twilio.libRestPricingMod.^,
      proxy: typingsJapgolly.twilio.libRestProxyMod.^,
      queues: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.queues */ Any,
      recordings: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.recordings */ Any,
      request: RequestOptions => js.Promise[Any],
      routes: typingsJapgolly.twilio.libRestRoutesMod.^,
      serverless: typingsJapgolly.twilio.libRestServerlessMod.^,
      shortCodes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.shortCodes */ Any,
      signingKeys: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.signingKeys */ Any,
      sip: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.sip */ Any,
      studio: typingsJapgolly.twilio.libRestStudioMod.^,
      supersim: typingsJapgolly.twilio.libRestSupersimMod.^,
      sync: typingsJapgolly.twilio.libRestSyncMod.^,
      taskrouter: typingsJapgolly.twilio.libRestTaskrouterMod.^,
      tokens: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.tokens */ Any,
      transcriptions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.transcriptions */ Any,
      trunking: typingsJapgolly.twilio.libRestTrunkingMod.^,
      trusthub: typingsJapgolly.twilio.libRestTrusthubMod.^,
      usage: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.usage */ Any,
      validateSslCert: CallbackTo[js.Promise[Any]],
      validationRequests: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.validationRequests */ Any,
      verify: typingsJapgolly.twilio.libRestVerifyMod.^,
      video: typingsJapgolly.twilio.libRestVideoMod.^,
      voice: typingsJapgolly.twilio.libRestVoiceMod.^,
      wireless: typingsJapgolly.twilio.libRestWirelessMod.^
    ): Twilio = {
      val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], addresses = addresses.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], applications = applications.asInstanceOf[js.Any], authorizedConnectApps = authorizedConnectApps.asInstanceOf[js.Any], autopilot = autopilot.asInstanceOf[js.Any], availablePhoneNumbers = availablePhoneNumbers.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], bulkexports = bulkexports.asInstanceOf[js.Any], calls = calls.asInstanceOf[js.Any], chat = chat.asInstanceOf[js.Any], conferences = conferences.asInstanceOf[js.Any], connectApps = connectApps.asInstanceOf[js.Any], conversations = conversations.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], flexApi = flexApi.asInstanceOf[js.Any], frontlineApi = frontlineApi.asInstanceOf[js.Any], incomingPhoneNumbers = incomingPhoneNumbers.asInstanceOf[js.Any], insights = insights.asInstanceOf[js.Any], ipMessaging = ipMessaging.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], lookups = lookups.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], messaging = messaging.asInstanceOf[js.Any], microvisor = microvisor.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], newKeys = newKeys.asInstanceOf[js.Any], newSigningKeys = newSigningKeys.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], outgoingCallerIds = outgoingCallerIds.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], pricing = pricing.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any], recordings = recordings.asInstanceOf[js.Any], request = js.Any.fromFunction1(request), routes = routes.asInstanceOf[js.Any], serverless = serverless.asInstanceOf[js.Any], shortCodes = shortCodes.asInstanceOf[js.Any], signingKeys = signingKeys.asInstanceOf[js.Any], sip = sip.asInstanceOf[js.Any], studio = studio.asInstanceOf[js.Any], supersim = supersim.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], taskrouter = taskrouter.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], transcriptions = transcriptions.asInstanceOf[js.Any], trunking = trunking.asInstanceOf[js.Any], trusthub = trusthub.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], validateSslCert = validateSslCert.toJsFn, validationRequests = validationRequests.asInstanceOf[js.Any], verify = verify.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], voice = voice.asInstanceOf[js.Any], wireless = wireless.asInstanceOf[js.Any])
      __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Twilio]
    }
    
    extension [Self <: Twilio](x: Self) {
      
      inline def setAccounts(value: typingsJapgolly.twilio.libRestAccountsMod.^): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
      
      inline def setAddresses(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.addresses */ Any
      ): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setApi(value: typingsJapgolly.twilio.libRestApiMod.^): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApplications(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.applications */ Any
      ): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
      
      inline def setAuthorizedConnectApps(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.authorizedConnectApps */ Any
      ): Self = StObject.set(x, "authorizedConnectApps", value.asInstanceOf[js.Any])
      
      inline def setAutopilot(value: typingsJapgolly.twilio.libRestAutopilotMod.^): Self = StObject.set(x, "autopilot", value.asInstanceOf[js.Any])
      
      inline def setAvailablePhoneNumbers(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.availablePhoneNumbers */ Any
      ): Self = StObject.set(x, "availablePhoneNumbers", value.asInstanceOf[js.Any])
      
      inline def setBalance(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.balance */ Any
      ): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      inline def setBulkexports(value: typingsJapgolly.twilio.libRestBulkexportsMod.^): Self = StObject.set(x, "bulkexports", value.asInstanceOf[js.Any])
      
      inline def setCalls(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.calls */ Any
      ): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
      
      inline def setChat(value: typingsJapgolly.twilio.libRestChatMod.^): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
      
      inline def setConferences(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.conferences */ Any
      ): Self = StObject.set(x, "conferences", value.asInstanceOf[js.Any])
      
      inline def setConnectApps(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.connectApps */ Any
      ): Self = StObject.set(x, "connectApps", value.asInstanceOf[js.Any])
      
      inline def setConversations(value: typingsJapgolly.twilio.libRestConversationsMod.^): Self = StObject.set(x, "conversations", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: typingsJapgolly.twilio.libRestEventsMod.^): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setFlexApi(value: typingsJapgolly.twilio.libRestFlexApiMod.^): Self = StObject.set(x, "flexApi", value.asInstanceOf[js.Any])
      
      inline def setFrontlineApi(value: typingsJapgolly.twilio.libRestFrontlineApiMod.^): Self = StObject.set(x, "frontlineApi", value.asInstanceOf[js.Any])
      
      inline def setHttpClient(value: typingsJapgolly.twilio.libBaseRequestClientMod.^): Self = StObject.set(x, "httpClient", value.asInstanceOf[js.Any])
      
      inline def setHttpClientUndefined: Self = StObject.set(x, "httpClient", js.undefined)
      
      inline def setIncomingPhoneNumbers(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.incomingPhoneNumbers */ Any
      ): Self = StObject.set(x, "incomingPhoneNumbers", value.asInstanceOf[js.Any])
      
      inline def setInsights(value: typingsJapgolly.twilio.libRestInsightsMod.^): Self = StObject.set(x, "insights", value.asInstanceOf[js.Any])
      
      inline def setIpMessaging(value: typingsJapgolly.twilio.libRestIpMessagingMod.^): Self = StObject.set(x, "ipMessaging", value.asInstanceOf[js.Any])
      
      inline def setKeys(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.keys */ Any
      ): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setLookups(value: typingsJapgolly.twilio.libRestLookupsMod.^): Self = StObject.set(x, "lookups", value.asInstanceOf[js.Any])
      
      inline def setMedia(value: typingsJapgolly.twilio.libRestMediaMod.^): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMessages(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.messages */ Any
      ): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessaging(value: typingsJapgolly.twilio.libRestMessagingMod.^): Self = StObject.set(x, "messaging", value.asInstanceOf[js.Any])
      
      inline def setMicrovisor(value: typingsJapgolly.twilio.libRestMicrovisorMod.^): Self = StObject.set(x, "microvisor", value.asInstanceOf[js.Any])
      
      inline def setMonitor(value: typingsJapgolly.twilio.libRestMonitorMod.^): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
      
      inline def setNewKeys(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.newKeys */ Any
      ): Self = StObject.set(x, "newKeys", value.asInstanceOf[js.Any])
      
      inline def setNewSigningKeys(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.newSigningKeys */ Any
      ): Self = StObject.set(x, "newSigningKeys", value.asInstanceOf[js.Any])
      
      inline def setNotifications(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.notifications */ Any
      ): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotify_(value: typingsJapgolly.twilio.libRestNotifyMod.^): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
      
      inline def setNumbers(value: typingsJapgolly.twilio.libRestNumbersMod.^): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
      
      inline def setOutgoingCallerIds(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.outgoingCallerIds */ Any
      ): Self = StObject.set(x, "outgoingCallerIds", value.asInstanceOf[js.Any])
      
      inline def setPreview(value: typingsJapgolly.twilio.libRestPreviewMod.^): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPricing(value: typingsJapgolly.twilio.libRestPricingMod.^): Self = StObject.set(x, "pricing", value.asInstanceOf[js.Any])
      
      inline def setProxy(value: typingsJapgolly.twilio.libRestProxyMod.^): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setQueues(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.queues */ Any
      ): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
      
      inline def setRecordings(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.recordings */ Any
      ): Self = StObject.set(x, "recordings", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: RequestOptions => js.Promise[Any]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
      
      inline def setRoutes(value: typingsJapgolly.twilio.libRestRoutesMod.^): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setServerless(value: typingsJapgolly.twilio.libRestServerlessMod.^): Self = StObject.set(x, "serverless", value.asInstanceOf[js.Any])
      
      inline def setShortCodes(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.shortCodes */ Any
      ): Self = StObject.set(x, "shortCodes", value.asInstanceOf[js.Any])
      
      inline def setSigningKeys(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.signingKeys */ Any
      ): Self = StObject.set(x, "signingKeys", value.asInstanceOf[js.Any])
      
      inline def setSip(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.sip */ Any
      ): Self = StObject.set(x, "sip", value.asInstanceOf[js.Any])
      
      inline def setStudio(value: typingsJapgolly.twilio.libRestStudioMod.^): Self = StObject.set(x, "studio", value.asInstanceOf[js.Any])
      
      inline def setSupersim(value: typingsJapgolly.twilio.libRestSupersimMod.^): Self = StObject.set(x, "supersim", value.asInstanceOf[js.Any])
      
      inline def setSync(value: typingsJapgolly.twilio.libRestSyncMod.^): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setTaskrouter(value: typingsJapgolly.twilio.libRestTaskrouterMod.^): Self = StObject.set(x, "taskrouter", value.asInstanceOf[js.Any])
      
      inline def setTokens(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.tokens */ Any
      ): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTranscriptions(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.transcriptions */ Any
      ): Self = StObject.set(x, "transcriptions", value.asInstanceOf[js.Any])
      
      inline def setTrunking(value: typingsJapgolly.twilio.libRestTrunkingMod.^): Self = StObject.set(x, "trunking", value.asInstanceOf[js.Any])
      
      inline def setTrusthub(value: typingsJapgolly.twilio.libRestTrusthubMod.^): Self = StObject.set(x, "trusthub", value.asInstanceOf[js.Any])
      
      inline def setUsage(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.usage */ Any
      ): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setValidateSslCert(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "validateSslCert", value.toJsFn)
      
      inline def setValidationRequests(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Api.prototype.account.validationRequests */ Any
      ): Self = StObject.set(x, "validationRequests", value.asInstanceOf[js.Any])
      
      inline def setVerify(value: typingsJapgolly.twilio.libRestVerifyMod.^): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
      
      inline def setVideo(value: typingsJapgolly.twilio.libRestVideoMod.^): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVoice(value: typingsJapgolly.twilio.libRestVoiceMod.^): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
      
      inline def setWireless(value: typingsJapgolly.twilio.libRestWirelessMod.^): Self = StObject.set(x, "wireless", value.asInstanceOf[js.Any])
    }
  }
  
  trait TwilioClientOptions extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var edge: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[js.Object] = js.undefined
    
    var httpClient: js.UndefOr[typingsJapgolly.twilio.libBaseRequestClientMod.^] = js.undefined
    
    var lazyLoading: js.UndefOr[Boolean] = js.undefined
    
    var logLevel: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var userAgentExtensions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TwilioClientOptions {
    
    inline def apply(): TwilioClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwilioClientOptions]
    }
    
    extension [Self <: TwilioClientOptions](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setEdge(value: String): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setEnv(value: js.Object): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setHttpClient(value: typingsJapgolly.twilio.libBaseRequestClientMod.^): Self = StObject.set(x, "httpClient", value.asInstanceOf[js.Any])
      
      inline def setHttpClientUndefined: Self = StObject.set(x, "httpClient", js.undefined)
      
      inline def setLazyLoading(value: Boolean): Self = StObject.set(x, "lazyLoading", value.asInstanceOf[js.Any])
      
      inline def setLazyLoadingUndefined: Self = StObject.set(x, "lazyLoading", js.undefined)
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setUserAgentExtensions(value: js.Array[String]): Self = StObject.set(x, "userAgentExtensions", value.asInstanceOf[js.Any])
      
      inline def setUserAgentExtensionsUndefined: Self = StObject.set(x, "userAgentExtensions", js.undefined)
      
      inline def setUserAgentExtensionsVarargs(value: String*): Self = StObject.set(x, "userAgentExtensions", js.Array(value*))
    }
  }
}
