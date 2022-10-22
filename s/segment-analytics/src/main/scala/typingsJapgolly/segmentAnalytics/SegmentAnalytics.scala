package typingsJapgolly.segmentAnalytics

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.segmentAnalytics.anon.AnonymousId
import typingsJapgolly.segmentAnalytics.anon.Dictintegration
import typingsJapgolly.segmentAnalytics.anon.Id
import typingsJapgolly.segmentAnalytics.anon.Key
import typingsJapgolly.segmentAnalytics.anon.KeyString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SegmentAnalytics {
  
  // The actual analytics.js object
  @js.native
  trait AnalyticsJS extends StObject {
    
    /* Define a new integration */
    def addIntegration(integration: js.Function1[/* options */ Any, Unit]): this.type = js.native
    
    /* The alias method combines two previously unassociated user identities.
      This comes in handy if the same user visits from two different devices
      and you want to combine their history.
      Some providers also don’t alias automatically for you when an anonymous
      user signs up (like Mixpanel), so you need to call alias manually right
      after sign up with their brand new userId. */
    def alias(userId: String): Unit = js.native
    def alias(userId: String, callback: js.Function0[Unit]): Unit = js.native
    def alias(userId: String, options: SegmentOpts): Unit = js.native
    def alias(userId: String, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    def alias(userId: String, previousId: String): Unit = js.native
    def alias(userId: String, previousId: String, callback: js.Function0[Unit]): Unit = js.native
    def alias(userId: String, previousId: String, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def alias(userId: String, previousId: String, options: SegmentOpts): Unit = js.native
    def alias(userId: String, previousId: String, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    def alias(userId: String, previousId: Unit, callback: js.Function0[Unit]): Unit = js.native
    def alias(userId: String, previousId: Unit, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def alias(userId: String, previousId: Unit, options: SegmentOpts): Unit = js.native
    def alias(userId: String, previousId: Unit, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    
    /* Analytics.js has a debug mode that logs helpful messages to the
      console. */
    def debug(): Unit = js.native
    def debug(state: Boolean): Unit = js.native
    
    def group(): Id = js.native
    /* The group method associates an individual user with a group. The group
      can a company, organization, account, project, team or any other name
      you came up with for the same concept. */
    def group(groupId: String): Unit = js.native
    def group(groupId: String, callback: js.Function0[Unit]): Unit = js.native
    def group(groupId: String, traits: js.Object): Unit = js.native
    def group(groupId: String, traits: js.Object, callback: js.Function0[Unit]): Unit = js.native
    def group(groupId: String, traits: js.Object, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def group(groupId: String, traits: js.Object, options: SegmentOpts): Unit = js.native
    def group(groupId: String, traits: js.Object, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    def group(groupId: String, traits: Unit, callback: js.Function0[Unit]): Unit = js.native
    def group(groupId: String, traits: Unit, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def group(groupId: String, traits: Unit, options: SegmentOpts): Unit = js.native
    def group(groupId: String, traits: Unit, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    
    def identify(): Unit = js.native
    def identify(callback: js.Function0[Unit]): Unit = js.native
    def identify(traits: js.Object): Unit = js.native
    def identify(traits: js.Object, callback: js.Function0[Unit]): Unit = js.native
    def identify(traits: js.Object, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def identify(traits: js.Object, options: SegmentOpts): Unit = js.native
    def identify(traits: js.Object, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    def identify(traits: Unit, callback: js.Function0[Unit]): Unit = js.native
    def identify(traits: Unit, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def identify(traits: Unit, options: SegmentOpts): Unit = js.native
    def identify(traits: Unit, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    /* The identify method is how you tie one of your users and their actions
      to a recognizable userId and traits. */
    def identify(userId: String): Unit = js.native
    def identify(userId: String, callback: js.Function0[Unit]): Unit = js.native
    def identify(userId: String, traits: js.Object): Unit = js.native
    def identify(userId: String, traits: js.Object, callback: js.Function0[Unit]): Unit = js.native
    def identify(userId: String, traits: js.Object, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def identify(userId: String, traits: js.Object, options: SegmentOpts): Unit = js.native
    def identify(userId: String, traits: js.Object, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    def identify(userId: String, traits: Unit, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def identify(userId: String, traits: Unit, options: SegmentOpts): Unit = js.native
    def identify(userId: String, traits: Unit, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    
    /* Initialize with the given integration `settings` and `options`. */
    def init(): this.type = js.native
    def init(settings: Unit, options: InitOptions): this.type = js.native
    def init(settings: IntegrationsSettings): this.type = js.native
    def init(settings: IntegrationsSettings, options: InitOptions): this.type = js.native
    
    /* Configure Segment with write key */
    def load(writeKey: String): Unit = js.native
    def load(writeKey: String, options: SegmentOpts): Unit = js.native
    
    /* The global analytics object emits events whenever you call alias, group,
      identify, track or page. That way you can listen to those events and run
      your own custom code. */
    def on(
      event: String,
      callback: js.Function3[/* event */ String, /* properties */ js.Object, /* options */ SegmentOpts, Unit]
    ): Unit = js.native
    
    /* The page method lets you record page views on your website, along with
      optional extra information about the page being viewed. */
    def page(): Unit = js.native
    def page(callback: js.Function0[Unit]): Unit = js.native
    def page(category: String): Unit = js.native
    def page(category: String, name: String): Unit = js.native
    def page(category: String, name: String, properties: js.Object): Unit = js.native
    def page(category: String, name: String, properties: js.Object, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(category: String, name: String, properties: js.Object, options: SegmentOpts): Unit = js.native
    def page(
      category: String,
      name: String,
      properties: js.Object,
      options: SegmentOpts,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def page(category: String, name: String, properties: Unit, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(category: String, name: String, properties: Unit, options: SegmentOpts): Unit = js.native
    def page(
      category: String,
      name: String,
      properties: Unit,
      options: SegmentOpts,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def page(category: String, name: Unit, properties: js.Object): Unit = js.native
    def page(category: String, name: Unit, properties: js.Object, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(category: String, name: Unit, properties: js.Object, options: SegmentOpts): Unit = js.native
    def page(
      category: String,
      name: Unit,
      properties: js.Object,
      options: SegmentOpts,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def page(category: String, name: Unit, properties: Unit, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(category: String, name: Unit, properties: Unit, options: SegmentOpts): Unit = js.native
    def page(category: String, name: Unit, properties: Unit, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    def page(category: Unit, name: String): Unit = js.native
    def page(category: Unit, name: String, properties: js.Object): Unit = js.native
    def page(category: Unit, name: String, properties: js.Object, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(category: Unit, name: String, properties: js.Object, options: SegmentOpts): Unit = js.native
    def page(
      category: Unit,
      name: String,
      properties: js.Object,
      options: SegmentOpts,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def page(category: Unit, name: String, properties: Unit, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(category: Unit, name: String, properties: Unit, options: SegmentOpts): Unit = js.native
    def page(category: Unit, name: String, properties: Unit, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    def page(category: Unit, name: Unit, properties: js.Object): Unit = js.native
    def page(category: Unit, name: Unit, properties: js.Object, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(category: Unit, name: Unit, properties: js.Object, options: SegmentOpts): Unit = js.native
    def page(
      category: Unit,
      name: Unit,
      properties: js.Object,
      options: SegmentOpts,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def page(category: Unit, name: Unit, properties: Unit, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(category: Unit, name: Unit, properties: Unit, options: SegmentOpts): Unit = js.native
    def page(category: Unit, name: Unit, properties: Unit, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    def page(name: String, callback: js.Function0[Unit]): Unit = js.native
    def page(name: String, properties: js.Object): Unit = js.native
    def page(name: String, properties: js.Object, callback: js.Function0[Unit]): Unit = js.native
    def page(name: String, properties: js.Object, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(name: String, properties: js.Object, options: SegmentOpts): Unit = js.native
    def page(name: String, properties: js.Object, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    def page(name: String, properties: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(name: String, properties: Unit, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(name: String, properties: Unit, options: SegmentOpts): Unit = js.native
    def page(name: String, properties: Unit, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    def page(name: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(name: Unit, properties: js.Object): Unit = js.native
    def page(name: Unit, properties: js.Object, callback: js.Function0[Unit]): Unit = js.native
    def page(name: Unit, properties: js.Object, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(name: Unit, properties: js.Object, options: SegmentOpts): Unit = js.native
    def page(name: Unit, properties: js.Object, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    def page(name: Unit, properties: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(name: Unit, properties: Unit, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(name: Unit, properties: Unit, options: SegmentOpts): Unit = js.native
    def page(name: Unit, properties: Unit, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    def page(properties: js.Object): Unit = js.native
    def page(properties: js.Object, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def page(properties: js.Object, options: SegmentOpts): Unit = js.native
    def page(properties: js.Object, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    def page(properties: Unit, options: SegmentOpts): Unit = js.native
    def page(properties: Unit, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    
    /* The ready method allows you to pass in a callback that will be called as
      soon as all of your enabled integrations have loaded. It’s like jQuery’s
      ready method, except for integrations. */
    def ready(callback: js.Function0[Unit]): Unit = js.native
    
    /* If you need to clear the user and group id and traits we’ve added a
      reset function that is most commonly used when your identified users
      logout of your application. */
    def reset(): Unit = js.native
    
    /*  Set the user's `id`. */
    def setAnonymousId(id: String): this.type = js.native
    
    /* You can extend the length (in milliseconds) of the method callbacks and
      helpers */
    def timeout(milliseconds: Double): Unit = js.native
    
    /* The track method lets you record any actions your users perform. */
    def track(event: String): Unit = js.native
    def track(event: String, callback: js.Function0[Unit]): Unit = js.native
    def track(event: String, properties: js.Object): Unit = js.native
    def track(event: String, properties: js.Object, callback: js.Function0[Unit]): Unit = js.native
    def track(event: String, properties: js.Object, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def track(event: String, properties: js.Object, options: SegmentOpts): Unit = js.native
    def track(event: String, properties: js.Object, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    def track(event: String, properties: Unit, callback: js.Function0[Unit]): Unit = js.native
    def track(event: String, properties: Unit, options: Unit, callback: js.Function0[Unit]): Unit = js.native
    def track(event: String, properties: Unit, options: SegmentOpts): Unit = js.native
    def track(event: String, properties: Unit, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
    
    def trackForm(elements: js.Array[Element], event: String): Unit = js.native
    def trackForm(elements: js.Array[Element], event: String, properties: js.Function1[/* elm */ Element, js.Object]): Unit = js.native
    def trackForm(elements: js.Array[Element], event: String, properties: js.Object): Unit = js.native
    def trackForm(elements: js.Array[Element], event: js.Function1[/* elm */ Element, String]): Unit = js.native
    def trackForm(
      elements: js.Array[Element],
      event: js.Function1[/* elm */ Element, String],
      properties: js.Function1[/* elm */ Element, js.Object]
    ): Unit = js.native
    def trackForm(elements: js.Array[Element], event: js.Function1[/* elm */ Element, String], properties: js.Object): Unit = js.native
    def trackForm(elements: Element, event: String): Unit = js.native
    def trackForm(elements: Element, event: String, properties: js.Function1[/* elm */ Element, js.Object]): Unit = js.native
    def trackForm(elements: Element, event: String, properties: js.Object): Unit = js.native
    def trackForm(elements: Element, event: js.Function1[/* elm */ Element, String]): Unit = js.native
    def trackForm(
      elements: Element,
      event: js.Function1[/* elm */ Element, String],
      properties: js.Function1[/* elm */ Element, js.Object]
    ): Unit = js.native
    def trackForm(elements: Element, event: js.Function1[/* elm */ Element, String], properties: js.Object): Unit = js.native
    /* trackForm is a helper that binds a track call to a form submission.
      Usually the page would change before you could call track, but with
      trackForm a small timeout is inserted to give the track call enough
      time to fire. */
    def trackForm(elements: JQuery, event: String): Unit = js.native
    def trackForm(elements: JQuery, event: String, properties: js.Function1[/* elm */ Element, js.Object]): Unit = js.native
    def trackForm(elements: JQuery, event: String, properties: js.Object): Unit = js.native
    def trackForm(elements: JQuery, event: js.Function1[/* elm */ Element, String]): Unit = js.native
    def trackForm(
      elements: JQuery,
      event: js.Function1[/* elm */ Element, String],
      properties: js.Function1[/* elm */ Element, js.Object]
    ): Unit = js.native
    def trackForm(elements: JQuery, event: js.Function1[/* elm */ Element, String], properties: js.Object): Unit = js.native
    
    def trackLink(elements: js.Array[Element], event: String): Unit = js.native
    def trackLink(elements: js.Array[Element], event: String, properties: js.Function1[/* elm */ Element, js.Object]): Unit = js.native
    def trackLink(elements: js.Array[Element], event: String, properties: js.Object): Unit = js.native
    def trackLink(elements: js.Array[Element], event: js.Function1[/* elm */ Element, String]): Unit = js.native
    def trackLink(
      elements: js.Array[Element],
      event: js.Function1[/* elm */ Element, String],
      properties: js.Function1[/* elm */ Element, js.Object]
    ): Unit = js.native
    def trackLink(elements: js.Array[Element], event: js.Function1[/* elm */ Element, String], properties: js.Object): Unit = js.native
    def trackLink(elements: Element, event: String): Unit = js.native
    def trackLink(elements: Element, event: String, properties: js.Function1[/* elm */ Element, js.Object]): Unit = js.native
    def trackLink(elements: Element, event: String, properties: js.Object): Unit = js.native
    def trackLink(elements: Element, event: js.Function1[/* elm */ Element, String]): Unit = js.native
    def trackLink(
      elements: Element,
      event: js.Function1[/* elm */ Element, String],
      properties: js.Function1[/* elm */ Element, js.Object]
    ): Unit = js.native
    def trackLink(elements: Element, event: js.Function1[/* elm */ Element, String], properties: js.Object): Unit = js.native
    /* trackLink is a helper that binds a track call to whenever a link is
      clicked. Usually the page would change before you could call track, but
      with trackLink a small timeout is inserted to give the track call enough
      time to fire. */
    def trackLink(elements: JQuery, event: String): Unit = js.native
    def trackLink(elements: JQuery, event: String, properties: js.Function1[/* elm */ Element, js.Object]): Unit = js.native
    def trackLink(elements: JQuery, event: String, properties: js.Object): Unit = js.native
    def trackLink(elements: JQuery, event: js.Function1[/* elm */ Element, String]): Unit = js.native
    def trackLink(
      elements: JQuery,
      event: js.Function1[/* elm */ Element, String],
      properties: js.Function1[/* elm */ Element, js.Object]
    ): Unit = js.native
    def trackLink(elements: JQuery, event: js.Function1[/* elm */ Element, String], properties: js.Object): Unit = js.native
    
    /* Use a plugin */
    def use(plugin: js.Function1[/* analytics */ this.type, Unit]): this.type = js.native
    
    /* Once Analytics.js loaded, you can retrieve information about the
      currently identified user or group like their id and traits. */
    def user(): AnonymousId = js.native
  }
  
  trait CookieOptions extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var maxage: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object CookieOptions {
    
    inline def apply(): CookieOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieOptions]
    }
    
    extension [Self <: CookieOptions](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setMaxage(value: Double): Self = StObject.set(x, "maxage", value.asInstanceOf[js.Any])
      
      inline def setMaxageUndefined: Self = StObject.set(x, "maxage", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  trait GroupOptions extends StObject {
    
    var cookie: js.UndefOr[KeyString] = js.undefined
    
    var localStorage: js.UndefOr[KeyString] = js.undefined
    
    var persist: js.UndefOr[Boolean] = js.undefined
  }
  object GroupOptions {
    
    inline def apply(): GroupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupOptions]
    }
    
    extension [Self <: GroupOptions](x: Self) {
      
      inline def setCookie(value: KeyString): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setLocalStorage(value: KeyString): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    }
  }
  
  trait InitOptions extends StObject {
    
    var cookie: js.UndefOr[CookieOptions] = js.undefined
    
    var group: js.UndefOr[GroupOptions] = js.undefined
    
    var integrations: js.UndefOr[Dictintegration] = js.undefined
    
    var localStorage: js.UndefOr[StoreOptions] = js.undefined
    
    var metrics: js.UndefOr[MetricsOptions] = js.undefined
    
    var user: js.UndefOr[UserOptions] = js.undefined
  }
  object InitOptions {
    
    inline def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    extension [Self <: InitOptions](x: Self) {
      
      inline def setCookie(value: CookieOptions): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setGroup(value: GroupOptions): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setIntegrations(value: Dictintegration): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setLocalStorage(value: StoreOptions): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
      
      inline def setMetrics(value: MetricsOptions): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setUser(value: UserOptions): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  type IntegrationsSettings = StringDictionary[Any]
  
  trait MetricsOptions extends StObject {
    
    var flushTimer: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var maxQueueSize: js.UndefOr[Double] = js.undefined
    
    var sampleRate: js.UndefOr[Double] = js.undefined
  }
  object MetricsOptions {
    
    inline def apply(): MetricsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricsOptions]
    }
    
    extension [Self <: MetricsOptions](x: Self) {
      
      inline def setFlushTimer(value: Double): Self = StObject.set(x, "flushTimer", value.asInstanceOf[js.Any])
      
      inline def setFlushTimerUndefined: Self = StObject.set(x, "flushTimer", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setMaxQueueSize(value: Double): Self = StObject.set(x, "maxQueueSize", value.asInstanceOf[js.Any])
      
      inline def setMaxQueueSizeUndefined: Self = StObject.set(x, "maxQueueSize", js.undefined)
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    }
  }
  
  // Generic options object with integrations
  trait SegmentOpts extends StObject {
    
    var anonymousId: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[js.Object] = js.undefined
    
    var integrations: js.UndefOr[Any] = js.undefined
  }
  object SegmentOpts {
    
    inline def apply(): SegmentOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentOpts]
    }
    
    extension [Self <: SegmentOpts](x: Self) {
      
      inline def setAnonymousId(value: String): Self = StObject.set(x, "anonymousId", value.asInstanceOf[js.Any])
      
      inline def setAnonymousIdUndefined: Self = StObject.set(x, "anonymousId", js.undefined)
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setIntegrations(value: Any): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
    }
  }
  
  trait StoreOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
  }
  object StoreOptions {
    
    inline def apply(): StoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoreOptions]
    }
    
    extension [Self <: StoreOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
  
  trait UserOptions extends StObject {
    
    var cookie: js.UndefOr[Key] = js.undefined
    
    var localStorage: js.UndefOr[KeyString] = js.undefined
    
    var persist: js.UndefOr[Boolean] = js.undefined
  }
  object UserOptions {
    
    inline def apply(): UserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserOptions]
    }
    
    extension [Self <: UserOptions](x: Self) {
      
      inline def setCookie(value: Key): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setLocalStorage(value: KeyString): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    }
  }
}
