package typingsJapgolly.firefoxWebextBrowser.browser

import japgolly.scalajs.react.Callback
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
  
  /* urlbar types */
  /**
    * The state of an engagement made with the urlbar by the user. `start`: The user has started an engagement. `engagement`: The user has completed an engagement by picking a result. `abandonment`: The user has abandoned their engagement, for example by blurring the urlbar. `discard`: The engagement ended in a way that should be ignored by listeners.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.start
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.engagement
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.abandonment
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.discard
  */
  trait EngagementState extends StObject
  object EngagementState {
    
    inline def abandonment: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.abandonment = "abandonment".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.abandonment]
    
    inline def discard: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.discard = "discard".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.discard]
    
    inline def engagement: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.engagement = "engagement".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.engagement]
    
    inline def start: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.start = "start".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.start]
  }
  
  /** A query performed in the urlbar. */
  trait Query extends StObject {
    
    /** Whether the query's browser context is private. */
    var isPrivate: Boolean
    
    /** The maximum number of results shown to the user. */
    var maxResults: Double
    
    /** The query's search string. */
    var searchString: String
    
    /** List of acceptable source types to return. */
    var sources: js.Array[SourceType]
  }
  object Query {
    
    inline def apply(isPrivate: Boolean, maxResults: Double, searchString: String, sources: js.Array[SourceType]): Query = {
      val __obj = js.Dynamic.literal(isPrivate = isPrivate.asInstanceOf[js.Any], maxResults = maxResults.asInstanceOf[js.Any], searchString = searchString.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    extension [Self <: Query](x: Self) {
      
      inline def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
      
      inline def setSources(value: js.Array[SourceType]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesVarargs(value: SourceType*): Self = StObject.set(x, "sources", js.Array(value*))
    }
  }
  
  /** A result of a query. Queries can have many results. Each result is created by a provider. */
  trait Result extends StObject {
    
    /** An object with arbitrary properties depending on the result's type. */
    var payload: js.Object
    
    /** The result's source. */
    var source: SourceType
    
    /** Suggest a preferred position for this result within the result set. */
    var suggestedIndex: js.UndefOr[Double] = js.undefined
    
    /** The result's type. */
    var `type`: ResultType
  }
  object Result {
    
    inline def apply(payload: js.Object, source: SourceType, `type`: ResultType): Result = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setSource(value: SourceType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSuggestedIndex(value: Double): Self = StObject.set(x, "suggestedIndex", value.asInstanceOf[js.Any])
      
      inline def setSuggestedIndexUndefined: Self = StObject.set(x, "suggestedIndex", js.undefined)
      
      inline def setType(value: ResultType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Possible types of results. `dynamic`: A result whose view and payload are specified by the extension. `remote_tab`: A synced tab from another device. `search`: A search suggestion from a search engine. `tab`: An open tab in the browser. `tip`: An actionable message to help the user with their query. `url`: A URL that's not one of the other types.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.dynamic
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.remote_tab
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.search
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tip
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.url
  */
  trait ResultType extends StObject
  object ResultType {
    
    inline def dynamic: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.dynamic = "dynamic".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.dynamic]
    
    inline def remote_tab: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.remote_tab = "remote_tab".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.remote_tab]
    
    inline def search: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.search = "search".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.search]
    
    inline def tab: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = "tab".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab]
    
    inline def tip: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tip = "tip".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tip]
    
    inline def url: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = "url".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.url]
  }
  
  /** Options to the `search` function. */
  trait SearchOptions extends StObject {
    
    /** Whether to focus the input field and select its contents. */
    var focus: js.UndefOr[Boolean] = js.undefined
  }
  object SearchOptions {
    
    inline def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    extension [Self <: SearchOptions](x: Self) {
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    }
  }
  
  /**
    * Possible sources of results. `bookmarks`: The result comes from the user's bookmarks. `history`: The result comes from the user's history. `local`: The result comes from some local source not covered by another source type. `network`: The result comes from some network source not covered by another source type. `search`: The result comes from a search engine. `tabs`: The result is an open tab in the browser or a synced tab from another device.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmarks
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.history
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.local
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.network
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.search
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabs
  */
  trait SourceType extends StObject
  object SourceType {
    
    inline def bookmarks: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmarks = "bookmarks".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmarks]
    
    inline def history: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.history = "history".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.history]
    
    inline def local: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.local = "local".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.local]
    
    inline def network: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.network = "network".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.network]
    
    inline def search: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.search = "search".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.search]
    
    inline def tabs: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabs = "tabs".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabs]
  }
  
  trait UrlbarOnBehaviorRequestedEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, providerName: String): Unit
    
    def hasListener(cb: TCallback): Boolean
    
    def removeListener(cb: TCallback): Unit
  }
  object UrlbarOnBehaviorRequestedEvent {
    
    inline def apply[TCallback](
      addListener: (TCallback, String) => Callback,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Callback
    ): UrlbarOnBehaviorRequestedEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: TCallback, t1: String) => (addListener(t0, t1)).runNow()), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1((t0: TCallback) => removeListener(t0).runNow()))
      __obj.asInstanceOf[UrlbarOnBehaviorRequestedEvent[TCallback]]
    }
    
    extension [Self <: UrlbarOnBehaviorRequestedEvent[?], TCallback](x: Self & UrlbarOnBehaviorRequestedEvent[TCallback]) {
      
      inline def setAddListener(value: (TCallback, String) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: TCallback, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      inline def setRemoveListener(value: TCallback => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction1((t0: TCallback) => value(t0).runNow()))
    }
  }
  
  trait UrlbarOnEngagementEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, providerName: String): Unit
    
    def hasListener(cb: TCallback): Boolean
    
    def removeListener(cb: TCallback): Unit
  }
  object UrlbarOnEngagementEvent {
    
    inline def apply[TCallback](
      addListener: (TCallback, String) => Callback,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Callback
    ): UrlbarOnEngagementEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: TCallback, t1: String) => (addListener(t0, t1)).runNow()), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1((t0: TCallback) => removeListener(t0).runNow()))
      __obj.asInstanceOf[UrlbarOnEngagementEvent[TCallback]]
    }
    
    extension [Self <: UrlbarOnEngagementEvent[?], TCallback](x: Self & UrlbarOnEngagementEvent[TCallback]) {
      
      inline def setAddListener(value: (TCallback, String) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: TCallback, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      inline def setRemoveListener(value: TCallback => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction1((t0: TCallback) => value(t0).runNow()))
    }
  }
  
  trait UrlbarOnQueryCanceledEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, providerName: String): Unit
    
    def hasListener(cb: TCallback): Boolean
    
    def removeListener(cb: TCallback): Unit
  }
  object UrlbarOnQueryCanceledEvent {
    
    inline def apply[TCallback](
      addListener: (TCallback, String) => Callback,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Callback
    ): UrlbarOnQueryCanceledEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: TCallback, t1: String) => (addListener(t0, t1)).runNow()), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1((t0: TCallback) => removeListener(t0).runNow()))
      __obj.asInstanceOf[UrlbarOnQueryCanceledEvent[TCallback]]
    }
    
    extension [Self <: UrlbarOnQueryCanceledEvent[?], TCallback](x: Self & UrlbarOnQueryCanceledEvent[TCallback]) {
      
      inline def setAddListener(value: (TCallback, String) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: TCallback, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      inline def setRemoveListener(value: TCallback => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction1((t0: TCallback) => value(t0).runNow()))
    }
  }
  
  trait UrlbarOnResultPickedEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, providerName: String): Unit
    
    def hasListener(cb: TCallback): Boolean
    
    def removeListener(cb: TCallback): Unit
  }
  object UrlbarOnResultPickedEvent {
    
    inline def apply[TCallback](
      addListener: (TCallback, String) => Callback,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Callback
    ): UrlbarOnResultPickedEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: TCallback, t1: String) => (addListener(t0, t1)).runNow()), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1((t0: TCallback) => removeListener(t0).runNow()))
      __obj.asInstanceOf[UrlbarOnResultPickedEvent[TCallback]]
    }
    
    extension [Self <: UrlbarOnResultPickedEvent[?], TCallback](x: Self & UrlbarOnResultPickedEvent[TCallback]) {
      
      inline def setAddListener(value: (TCallback, String) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: TCallback, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      inline def setRemoveListener(value: TCallback => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction1((t0: TCallback) => value(t0).runNow()))
    }
  }
  
  trait UrlbarOnResultsRequestedEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, providerName: String): Unit
    
    def hasListener(cb: TCallback): Boolean
    
    def removeListener(cb: TCallback): Unit
  }
  object UrlbarOnResultsRequestedEvent {
    
    inline def apply[TCallback](
      addListener: (TCallback, String) => Callback,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Callback
    ): UrlbarOnResultsRequestedEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: TCallback, t1: String) => (addListener(t0, t1)).runNow()), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1((t0: TCallback) => removeListener(t0).runNow()))
      __obj.asInstanceOf[UrlbarOnResultsRequestedEvent[TCallback]]
    }
    
    extension [Self <: UrlbarOnResultsRequestedEvent[?], TCallback](x: Self & UrlbarOnResultsRequestedEvent[TCallback]) {
      
      inline def setAddListener(value: (TCallback, String) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: TCallback, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      inline def setRemoveListener(value: TCallback => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction1((t0: TCallback) => value(t0).runNow()))
    }
  }
}
