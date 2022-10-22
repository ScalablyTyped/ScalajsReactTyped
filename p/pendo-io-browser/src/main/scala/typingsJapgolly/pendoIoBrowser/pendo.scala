package typingsJapgolly.pendoIoBrowser

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.pendoIoBrowser.anon.Auto
import typingsJapgolly.pendoIoBrowser.anon.AutoHeight
import typingsJapgolly.pendoIoBrowser.anon.Badge
import typingsJapgolly.pendoIoBrowser.anon.Delay
import typingsJapgolly.pendoIoBrowser.anon.Filters
import typingsJapgolly.pendoIoBrowser.anon.Steps
import typingsJapgolly.pendoIoBrowser.anon.Until
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserBooleans.`false`
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserBooleans.`true`
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserStrings.No
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserStrings.Yes
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserStrings.api
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserStrings.automatic
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserStrings.badge
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserStrings.button
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserStrings.disabled
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserStrings.dom
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserStrings.draft
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserStrings.element
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserStrings.launcher
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserStrings.programatic
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserStrings.published
import typingsJapgolly.pendoIoBrowser.pendoIoBrowserStrings.staged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pendo {
  
  trait Debugging extends StObject {
    
    // TODO
    def getAllGuides(): js.Array[Guide]
    
    def getAutoGuides(): Auto
    
    def getBadgeGuides(): js.Array[Guide]
    
    def getEventCache(): js.Array[Any]
    
    def getLauncherGuides(): js.Array[Guide]
  }
  object Debugging {
    
    inline def apply(
      getAllGuides: CallbackTo[js.Array[Guide]],
      getAutoGuides: CallbackTo[Auto],
      getBadgeGuides: CallbackTo[js.Array[Guide]],
      getEventCache: CallbackTo[js.Array[Any]],
      getLauncherGuides: CallbackTo[js.Array[Guide]]
    ): Debugging = {
      val __obj = js.Dynamic.literal(getAllGuides = getAllGuides.toJsFn, getAutoGuides = getAutoGuides.toJsFn, getBadgeGuides = getBadgeGuides.toJsFn, getEventCache = getEventCache.toJsFn, getLauncherGuides = getLauncherGuides.toJsFn)
      __obj.asInstanceOf[Debugging]
    }
    
    extension [Self <: Debugging](x: Self) {
      
      inline def setGetAllGuides(value: CallbackTo[js.Array[Guide]]): Self = StObject.set(x, "getAllGuides", value.toJsFn)
      
      inline def setGetAutoGuides(value: CallbackTo[Auto]): Self = StObject.set(x, "getAutoGuides", value.toJsFn)
      
      inline def setGetBadgeGuides(value: CallbackTo[js.Array[Guide]]): Self = StObject.set(x, "getBadgeGuides", value.toJsFn)
      
      inline def setGetEventCache(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getEventCache", value.toJsFn)
      
      inline def setGetLauncherGuides(value: CallbackTo[js.Array[Guide]]): Self = StObject.set(x, "getLauncherGuides", value.toJsFn)
    }
  }
  
  trait EventCallbacks extends StObject {
    
    var guidesFailed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var guidesLoaded: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object EventCallbacks {
    
    inline def apply(): EventCallbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventCallbacks]
    }
    
    extension [Self <: EventCallbacks](x: Self) {
      
      inline def setGuidesFailed(value: Callback): Self = StObject.set(x, "guidesFailed", value.toJsFn)
      
      inline def setGuidesFailedUndefined: Self = StObject.set(x, "guidesFailed", js.undefined)
      
      inline def setGuidesLoaded(value: Callback): Self = StObject.set(x, "guidesLoaded", value.toJsFn)
      
      inline def setGuidesLoadedUndefined: Self = StObject.set(x, "guidesLoaded", js.undefined)
      
      inline def setReady(value: Callback): Self = StObject.set(x, "ready", value.toJsFn)
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof pendo-io-browser.pendo.EventCallbacks ]: -? (callback : pendo-io-browser.pendo.EventCallbacks[K]): pendo-io-browser.pendo.Events} */
  trait Events extends StObject {
    
    def guidesFailed(): this.type
    def guidesFailed(callback: js.Function0[Unit]): this.type
    @JSName("guidesFailed")
    var guidesFailed_Original: js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], this.type]
    
    def guidesLoaded(): this.type
    def guidesLoaded(callback: js.Function0[Unit]): this.type
    @JSName("guidesLoaded")
    var guidesLoaded_Original: js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], this.type]
    
    def ready(): this.type
    def ready(callback: js.Function0[Unit]): this.type
    @JSName("ready")
    var ready_Original: js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], this.type]
  }
  object Events {
    
    inline def apply(
      guidesFailed: /* callback */ js.UndefOr[js.Function0[Unit]] => Events,
      guidesLoaded: /* callback */ js.UndefOr[js.Function0[Unit]] => Events,
      ready: /* callback */ js.UndefOr[js.Function0[Unit]] => Events
    ): Events = {
      val __obj = js.Dynamic.literal(guidesFailed = js.Any.fromFunction1(guidesFailed), guidesLoaded = js.Any.fromFunction1(guidesLoaded), ready = js.Any.fromFunction1(ready))
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setGuidesFailed(value: /* callback */ js.UndefOr[js.Function0[Unit]] => Events): Self = StObject.set(x, "guidesFailed", js.Any.fromFunction1(value))
      
      inline def setGuidesLoaded(value: /* callback */ js.UndefOr[js.Function0[Unit]] => Events): Self = StObject.set(x, "guidesLoaded", js.Any.fromFunction1(value))
      
      inline def setReady(value: /* callback */ js.UndefOr[js.Function0[Unit]] => Events): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Feedback extends StObject {
    
    def loginAndRedirect(): Unit = js.native
    def loginAndRedirect(options: FeedbackOptions): Unit = js.native
  }
  
  trait FeedbackOptions extends StObject {
    
    var anchor: HTMLElement
  }
  object FeedbackOptions {
    
    inline def apply(anchor: HTMLElement): FeedbackOptions = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedbackOptions]
    }
    
    extension [Self <: FeedbackOptions](x: Self) {
      
      inline def setAnchor(value: HTMLElement): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Guide extends StObject {
    
    var attributes: Badge
    
    var audience: js.Array[Any]
    
    // TODO
    var audienceUiHint: Filters
    
    var createdAt: Double
    
    var createdByUser: User
    
    var id: String
    
    var isMultiStep: Boolean
    
    var kind: String
    
    var lastUpdatedAt: Double
    
    var lastUpdatedByUser: User
    
    var launchMethod: api | automatic | badge | dom | launcher
    
    var name: String
    
    var publishedAt: Double
    
    // TODO
    var resetAt: Double
    
    var rootVersionId: String
    
    var stableVersionId: String
    
    var state: published | staged | draft | disabled
    
    var steps: js.Array[GuideStep]
  }
  object Guide {
    
    inline def apply(
      attributes: Badge,
      audience: js.Array[Any],
      audienceUiHint: Filters,
      createdAt: Double,
      createdByUser: User,
      id: String,
      isMultiStep: Boolean,
      kind: String,
      lastUpdatedAt: Double,
      lastUpdatedByUser: User,
      launchMethod: api | automatic | badge | dom | launcher,
      name: String,
      publishedAt: Double,
      resetAt: Double,
      rootVersionId: String,
      stableVersionId: String,
      state: published | staged | draft | disabled,
      steps: js.Array[GuideStep]
    ): Guide = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], audience = audience.asInstanceOf[js.Any], audienceUiHint = audienceUiHint.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdByUser = createdByUser.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isMultiStep = isMultiStep.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], lastUpdatedByUser = lastUpdatedByUser.asInstanceOf[js.Any], launchMethod = launchMethod.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], resetAt = resetAt.asInstanceOf[js.Any], rootVersionId = rootVersionId.asInstanceOf[js.Any], stableVersionId = stableVersionId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Guide]
    }
    
    extension [Self <: Guide](x: Self) {
      
      inline def setAttributes(value: Badge): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAudience(value: js.Array[Any]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUiHint(value: Filters): Self = StObject.set(x, "audienceUiHint", value.asInstanceOf[js.Any])
      
      inline def setAudienceVarargs(value: Any*): Self = StObject.set(x, "audience", js.Array(value*))
      
      inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedByUser(value: User): Self = StObject.set(x, "createdByUser", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsMultiStep(value: Boolean): Self = StObject.set(x, "isMultiStep", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLastUpdatedAt(value: Double): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
      
      inline def setLastUpdatedByUser(value: User): Self = StObject.set(x, "lastUpdatedByUser", value.asInstanceOf[js.Any])
      
      inline def setLaunchMethod(value: api | automatic | badge | dom | launcher): Self = StObject.set(x, "launchMethod", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPublishedAt(value: Double): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
      
      inline def setResetAt(value: Double): Self = StObject.set(x, "resetAt", value.asInstanceOf[js.Any])
      
      inline def setRootVersionId(value: String): Self = StObject.set(x, "rootVersionId", value.asInstanceOf[js.Any])
      
      inline def setStableVersionId(value: String): Self = StObject.set(x, "stableVersionId", value.asInstanceOf[js.Any])
      
      inline def setState(value: published | staged | draft | disabled): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: js.Array[GuideStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: GuideStep*): Self = StObject.set(x, "steps", js.Array(value*))
    }
  }
  
  trait GuideStep extends StObject {
    
    var advanceMethod: button | programatic | element
    
    var attributes: AutoHeight
    
    var contentType: String
    
    var contentUrl: js.UndefOr[String] = js.undefined
    
    var contentUrlCss: js.UndefOr[String] = js.undefined
    
    var contentUrlJs: js.UndefOr[String] = js.undefined
    
    var elementPathRule: String
    
    var guideId: String
    
    var id: String
    
    var lastUpdatedAt: Double
    
    var rank: Double
    
    var resetAt: Double
    
    var thumbnailUrls: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object GuideStep {
    
    inline def apply(
      advanceMethod: button | programatic | element,
      attributes: AutoHeight,
      contentType: String,
      elementPathRule: String,
      guideId: String,
      id: String,
      lastUpdatedAt: Double,
      rank: Double,
      resetAt: Double,
      `type`: String
    ): GuideStep = {
      val __obj = js.Dynamic.literal(advanceMethod = advanceMethod.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], elementPathRule = elementPathRule.asInstanceOf[js.Any], guideId = guideId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], resetAt = resetAt.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GuideStep]
    }
    
    extension [Self <: GuideStep](x: Self) {
      
      inline def setAdvanceMethod(value: button | programatic | element): Self = StObject.set(x, "advanceMethod", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: AutoHeight): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
      
      inline def setContentUrlCss(value: String): Self = StObject.set(x, "contentUrlCss", value.asInstanceOf[js.Any])
      
      inline def setContentUrlCssUndefined: Self = StObject.set(x, "contentUrlCss", js.undefined)
      
      inline def setContentUrlJs(value: String): Self = StObject.set(x, "contentUrlJs", value.asInstanceOf[js.Any])
      
      inline def setContentUrlJsUndefined: Self = StObject.set(x, "contentUrlJs", js.undefined)
      
      inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
      
      inline def setElementPathRule(value: String): Self = StObject.set(x, "elementPathRule", value.asInstanceOf[js.Any])
      
      inline def setGuideId(value: String): Self = StObject.set(x, "guideId", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLastUpdatedAt(value: Double): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
      
      inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      inline def setResetAt(value: Double): Self = StObject.set(x, "resetAt", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUrls(value: String): Self = StObject.set(x, "thumbnailUrls", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUrlsUndefined: Self = StObject.set(x, "thumbnailUrls", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Identity extends StObject {
    
    var account: js.UndefOr[IdentityMetadata] = js.undefined
    
    var parentAccount: js.UndefOr[IdentityMetadata] = js.undefined
    
    /** visitor.id is required if user is logged in, otherwise an anonymous ID is generated and tracked by a cookie */
    var visitor: js.UndefOr[IdentityMetadata] = js.undefined
  }
  object Identity {
    
    inline def apply(): Identity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Identity]
    }
    
    extension [Self <: Identity](x: Self) {
      
      inline def setAccount(value: IdentityMetadata): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      inline def setParentAccount(value: IdentityMetadata): Self = StObject.set(x, "parentAccount", value.asInstanceOf[js.Any])
      
      inline def setParentAccountUndefined: Self = StObject.set(x, "parentAccount", js.undefined)
      
      inline def setVisitor(value: IdentityMetadata): Self = StObject.set(x, "visitor", value.asInstanceOf[js.Any])
      
      inline def setVisitorUndefined: Self = StObject.set(x, "visitor", js.undefined)
    }
  }
  
  trait IdentityMetadata
    extends StObject
       with Metadata {
    
    var id: js.UndefOr[String] = js.undefined
  }
  object IdentityMetadata {
    
    inline def apply(): IdentityMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentityMetadata]
    }
    
    extension [Self <: IdentityMetadata](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait InitOptions
    extends StObject
       with Identity {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var disablePersistence: js.UndefOr[Boolean] = js.undefined
    
    var events: js.UndefOr[EventCallbacks] = js.undefined
    
    var excludeAllText: js.UndefOr[Boolean] = js.undefined
    
    var excludeTitle: js.UndefOr[Boolean] = js.undefined
    
    var guides: js.UndefOr[Delay] = js.undefined
  }
  object InitOptions {
    
    inline def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    extension [Self <: InitOptions](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setDisablePersistence(value: Boolean): Self = StObject.set(x, "disablePersistence", value.asInstanceOf[js.Any])
      
      inline def setDisablePersistenceUndefined: Self = StObject.set(x, "disablePersistence", js.undefined)
      
      inline def setEvents(value: EventCallbacks): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setExcludeAllText(value: Boolean): Self = StObject.set(x, "excludeAllText", value.asInstanceOf[js.Any])
      
      inline def setExcludeAllTextUndefined: Self = StObject.set(x, "excludeAllText", js.undefined)
      
      inline def setExcludeTitle(value: Boolean): Self = StObject.set(x, "excludeTitle", value.asInstanceOf[js.Any])
      
      inline def setExcludeTitleUndefined: Self = StObject.set(x, "excludeTitle", js.undefined)
      
      inline def setGuides(value: Delay): Self = StObject.set(x, "guides", value.asInstanceOf[js.Any])
      
      inline def setGuidesUndefined: Self = StObject.set(x, "guides", js.undefined)
    }
  }
  
  type Metadata = StringDictionary[String | Double | Boolean | js.Array[String]]
  
  @js.native
  trait Pendo extends StObject {
    
    var debugging: Debugging = js.native
    
    def disableDebugging(): Unit = js.native
    
    def dom(input: Any): HTMLElement = js.native
    
    // Debugging
    def enableDebugging(): Unit = js.native
    
    // Events
    var events: Events = js.native
    
    // feedback
    var feedback: Feedback = js.native
    
    def findGuideById(id: String): Guide | Unit = js.native
    
    // Guides and Guide Center
    def findGuideByName(name: String): Guide | Unit = js.native
    
    def flushNow(): js.Promise[Any] = js.native
    
    def getAccountId(): String = js.native
    
    def getCurrentUrl(): String = js.native
    
    def getVersion(): String = js.native
    
    def getVisitorId(): String = js.native
    
    def identify(identity: Identity): Unit = js.native
    def identify(visitorId: String): Unit = js.native
    def identify(visitorId: String, accountId: String): Unit = js.native
    
    // Initialization and Identification
    def initialize(): Unit = js.native
    def initialize(options: InitOptions): Unit = js.native
    
    def isDebuggingEnabled(): Yes | No = js.native
    @JSName("isDebuggingEnabled")
    def isDebuggingEnabled_false(coerce: `false`): Yes | No = js.native
    @JSName("isDebuggingEnabled")
    def isDebuggingEnabled_true(coerce: `true`): Boolean = js.native
    
    def isReady(): Boolean = js.native
    
    // Troubleshooting
    def loadGuides(): Unit = js.native
    
    // Guide Events
    def onGuideAdvanced(): Unit = js.native
    def onGuideAdvanced(steps: Steps): Unit = js.native
    def onGuideAdvanced(step: GuideStep): Unit = js.native
    
    def onGuideDismissed(): Unit = js.native
    def onGuideDismissed(step: GuideStep): Unit = js.native
    def onGuideDismissed(until: Until): Unit = js.native
    
    def onGuidePrevious(): Unit = js.native
    def onGuidePrevious(step: GuideStep): Unit = js.native
    
    def removeLauncher(): Unit = js.native
    
    def showGuideById(id: String): Unit = js.native
    
    def showGuideByName(name: String): Unit = js.native
    
    def startGuides(): Unit = js.native
    
    def stopGuides(): Unit = js.native
    
    def toggleLauncher(): Unit = js.native
    
    def track(trackType: String): Unit = js.native
    def track(trackType: String, metadata: Metadata): Unit = js.native
    
    def updateOptions(options: Identity): Unit = js.native
    
    // Other
    def validateInstall(): Unit = js.native
  }
  
  trait User extends StObject {
    
    var first: String
    
    var id: String
    
    var last: String
    
    var role: Double
    
    var userType: String
    
    var username: String
  }
  object User {
    
    inline def apply(first: String, id: String, last: String, role: Double, userType: String, username: String): User = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], userType = userType.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setRole(value: Double): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setUserType(value: String): Self = StObject.set(x, "userType", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
