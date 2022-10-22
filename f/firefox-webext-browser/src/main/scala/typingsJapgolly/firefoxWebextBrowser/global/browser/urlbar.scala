package typingsJapgolly.firefoxWebextBrowser.global.browser

import typingsJapgolly.firefoxWebextBrowser.browser.types.Setting
import typingsJapgolly.firefoxWebextBrowser.browser.urlbar.EngagementState
import typingsJapgolly.firefoxWebextBrowser.browser.urlbar.Query
import typingsJapgolly.firefoxWebextBrowser.browser.urlbar.Result
import typingsJapgolly.firefoxWebextBrowser.browser.urlbar.SearchOptions
import typingsJapgolly.firefoxWebextBrowser.browser.urlbar.UrlbarOnBehaviorRequestedEvent
import typingsJapgolly.firefoxWebextBrowser.browser.urlbar.UrlbarOnEngagementEvent
import typingsJapgolly.firefoxWebextBrowser.browser.urlbar.UrlbarOnQueryCanceledEvent
import typingsJapgolly.firefoxWebextBrowser.browser.urlbar.UrlbarOnResultPickedEvent
import typingsJapgolly.firefoxWebextBrowser.browser.urlbar.UrlbarOnResultsRequestedEvent
import typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.active
import typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.inactive
import typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.restricting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.urlbar` API to experiment with new features in the URLBar. Restricted to Mozilla privileged WebExtensions.
  *
  * Permissions: `urlbar`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object urlbar {
  
  @JSGlobal("browser.urlbar")
  @js.native
  val ^ : js.Any = js.native
  
  /* urlbar functions */
  /** Closes the urlbar view in the current window. */
  inline def closeView(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeView")().asInstanceOf[js.Promise[Any]]
  
  /* urlbar properties */
  /** Enables or disables the engagement telemetry. */
  @JSGlobal("browser.urlbar.engagementTelemetry")
  @js.native
  val engagementTelemetry: Setting = js.native
  
  /**
    * Focuses the urlbar in the current window.
    * @param [select] If true, the text in the urlbar will also be selected.
    */
  inline def focus(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("focus")().asInstanceOf[js.Promise[Any]]
  inline def focus(select: Boolean): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("focus")(select.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  /* urlbar events */
  /**
    * Before a query starts, this event is fired for the given provider. Its purpose is to request the provider's behavior for the query. The listener should return a behavior in response. By default, providers are inactive, so if your provider should always be inactive, you don't need to listen for this event.
    * @param query The query for which the behavior is requested.
    * @returns The behavior of the provider for the query.
    */
  @JSGlobal("browser.urlbar.onBehaviorRequested")
  @js.native
  val onBehaviorRequested: UrlbarOnBehaviorRequestedEvent[js.Function1[/* query */ Query, active | inactive | restricting]] = js.native
  
  /**
    * This event is fired when the user starts and ends an engagement with the urlbar.
    * @param state The state of the engagement.
    */
  @JSGlobal("browser.urlbar.onEngagement")
  @js.native
  val onEngagement: UrlbarOnEngagementEvent[js.Function1[/* state */ EngagementState, Unit]] = js.native
  
  /**
    * This event is fired for the given provider when a query is canceled. The listener should stop any ongoing fetch or creation of results and clean up its resources.
    * @param query The query that was canceled.
    */
  @JSGlobal("browser.urlbar.onQueryCanceled")
  @js.native
  val onQueryCanceled: UrlbarOnQueryCanceledEvent[js.Function1[/* query */ Query, Unit]] = js.native
  
  /**
    * Typically, a provider includes a `url` property in its results' payloads. When the user picks a result with a URL, Firefox automatically loads the URL. URLs don't make sense for every result type, however. When the user picks a result without a URL, this event is fired. The provider should take an appropriate action in response. Currently the only applicable `ResultTypes` are `dynamic` and `tip`.
    * @param payload The payload of the result that was picked.
    * @param elementName If the result is a dynamic type, this is the name of the element in the result view that was picked. If the result is not a dynamic type, this is an empty string.
    */
  @JSGlobal("browser.urlbar.onResultPicked")
  @js.native
  val onResultPicked: UrlbarOnResultPickedEvent[js.Function2[/* payload */ js.Object, /* elementName */ String, Unit]] = js.native
  
  /**
    * When a query starts, this event is fired for the given provider if the provider is active for the query and there are no other providers that are restricting. Its purpose is to request the provider's results for the query. The listener should return a list of results in response.
    * @param query The query for which results are requested.
    * @returns The results that the provider fetched for the query.
    */
  @JSGlobal("browser.urlbar.onResultsRequested")
  @js.native
  val onResultsRequested: UrlbarOnResultsRequestedEvent[js.Function1[/* query */ Query, js.Array[Result]]] = js.native
  
  /**
    * Starts a search in the urlbar in the current window.
    * @param searchString The search string.
    * @param [options] Options for the search.
    */
  inline def search(searchString: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(searchString.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def search(searchString: String, options: SearchOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(searchString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
