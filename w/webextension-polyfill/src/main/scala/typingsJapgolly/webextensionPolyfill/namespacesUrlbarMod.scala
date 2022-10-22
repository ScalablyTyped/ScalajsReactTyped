package typingsJapgolly.webextensionPolyfill

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.webextensionPolyfill.namespacesEventsMod.Events.Event
import typingsJapgolly.webextensionPolyfill.namespacesTypesMod.Types.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesUrlbarMod {
  
  object Urlbar {
    
    /**
      * The state of an engagement made with the urlbar by the user. <code>start</code>: The user has started an engagement.
      * <code>engagement</code>: The user has completed an engagement by picking a result. <code>abandonment</code>
      * : The user has abandoned their engagement, for example by blurring the urlbar. <code>discard</code>
      * : The engagement ended in a way that should be ignored by listeners.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.start
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.engagement
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.abandonment
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.discard
    */
    trait EngagementState extends StObject
    object EngagementState {
      
      inline def abandonment: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.abandonment = "abandonment".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.abandonment]
      
      inline def discard: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.discard = "discard".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.discard]
      
      inline def engagement: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.engagement = "engagement".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.engagement]
      
      inline def start: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.start = "start".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.start]
    }
    
    /**
      * The behavior of the provider for the query.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.active
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.inactive
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.restricting
    */
    trait OnBehaviorRequestedReturnEnum extends StObject
    object OnBehaviorRequestedReturnEnum {
      
      inline def active: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.active = "active".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.active]
      
      inline def inactive: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.inactive = "inactive".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.inactive]
      
      inline def restricting: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.restricting = "restricting".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.restricting]
    }
    
    /**
      * The payload of the result that was picked.
      */
    type OnResultPickedPayloadType = StringDictionary[Any]
    
    /**
      * A query performed in the urlbar.
      */
    trait Query extends StObject {
      
      /**
        * Whether the query's browser context is private.
        */
      var isPrivate: Boolean
      
      /**
        * The maximum number of results shown to the user.
        */
      var maxResults: Double
      
      /**
        * The query's search string.
        */
      var searchString: String
      
      /**
        * List of acceptable source types to return.
        */
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
    
    /**
      * A result of a query. Queries can have many results. Each result is created by a provider.
      */
    trait Result extends StObject {
      
      /**
        * An object with arbitrary properties depending on the result's type.
        */
      var payload: ResultPayloadType
      
      /**
        * The result's source.
        */
      var source: SourceType
      
      /**
        * Suggest a preferred position for this result within the result set.
        * Optional.
        */
      var suggestedIndex: js.UndefOr[Double] = js.undefined
      
      /**
        * The result's type.
        */
      var `type`: ResultType
    }
    object Result {
      
      inline def apply(payload: ResultPayloadType, source: SourceType, `type`: ResultType): Result = {
        val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Result]
      }
      
      extension [Self <: Result](x: Self) {
        
        inline def setPayload(value: ResultPayloadType): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        inline def setSource(value: SourceType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSuggestedIndex(value: Double): Self = StObject.set(x, "suggestedIndex", value.asInstanceOf[js.Any])
        
        inline def setSuggestedIndexUndefined: Self = StObject.set(x, "suggestedIndex", js.undefined)
        
        inline def setType(value: ResultType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An object with arbitrary properties depending on the result's type.
      */
    type ResultPayloadType = StringDictionary[Any]
    
    /**
      * Possible types of results. <code>dynamic</code>: A result whose view and payload are specified by the extension. <code>
      * remote_tab</code>: A synced tab from another device. <code>search</code>: A search suggestion from a search engine.
      * <code>tab</code>: An open tab in the browser. <code>tip</code>: An actionable message to help the user with their query.
      * <code>url</code>: A URL that's not one of the other types.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.dynamic
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.remote_tab
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.search
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.tab
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.tip
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.url
    */
    trait ResultType extends StObject
    object ResultType {
      
      inline def dynamic: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.dynamic = "dynamic".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.dynamic]
      
      inline def remote_tab: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.remote_tab = "remote_tab".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.remote_tab]
      
      inline def search: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.search = "search".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.search]
      
      inline def tab: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.tab = "tab".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.tab]
      
      inline def tip: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.tip = "tip".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.tip]
      
      inline def url: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.url = "url".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.url]
    }
    
    /**
      * Options to the <code>search</code> function.
      */
    trait SearchOptions extends StObject {
      
      /**
        * Whether to focus the input field and select its contents.
        * Optional.
        */
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
      * Possible sources of results. <code>bookmarks</code>: The result comes from the user's bookmarks. <code>history</code>
      * : The result comes from the user's history. <code>local</code>: The result comes from some local source not covered by
      * another source type. <code>network</code>: The result comes from some network source not covered by another source type.
      * <code>search</code>: The result comes from a search engine. <code>tabs</code>: The result is an open tab in the browser
      * or a synced tab from another device.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.bookmarks
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.history
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.local
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.network
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.search
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.tabs
    */
    trait SourceType extends StObject
    object SourceType {
      
      inline def bookmarks: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.bookmarks = "bookmarks".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.bookmarks]
      
      inline def history: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.history = "history".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.history]
      
      inline def local: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.local = "local".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.local]
      
      inline def network: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.network = "network".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.network]
      
      inline def search: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.search = "search".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.search]
      
      inline def tabs: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.tabs = "tabs".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.tabs]
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Closes the urlbar view in the current window.
        */
      def closeView(): Unit = js.native
      
      /**
        * Enables or disables the engagement telemetry.
        */
      var engagementTelemetry: Setting = js.native
      
      /**
        * Focuses the urlbar in the current window.
        *
        * @param select Optional. If true, the text in the urlbar will also be selected.
        */
      def focus(): Unit = js.native
      def focus(select: Boolean): Unit = js.native
      
      /**
        * Before a query starts, this event is fired for the given provider. Its purpose is to request the provider's behavior for
        * the query. The listener should return a behavior in response. By default, providers are inactive,
        * so if your provider should always be inactive, you don't need to listen for this event.
        */
      var onBehaviorRequested: onBehaviorRequestedEvent = js.native
      
      /**
        * This event is fired when the user starts and ends an engagement with the urlbar.
        */
      var onEngagement: onEngagementEvent = js.native
      
      /**
        * This event is fired for the given provider when a query is canceled. The listener should stop any ongoing fetch or
        * creation of results and clean up its resources.
        */
      var onQueryCanceled: onQueryCanceledEvent = js.native
      
      /**
        * Typically, a provider includes a <code>url</code> property in its results' payloads.
        * When the user picks a result with a URL, Firefox automatically loads the URL. URLs don't make sense for every result
        * type, however. When the user picks a result without a URL, this event is fired. The provider should take an appropriate
        * action in response. Currently the only applicable <code>ResultTypes</code> are <code>dynamic</code> and <code>tip</code>.
        */
      var onResultPicked: onResultPickedEvent = js.native
      
      /**
        * When a query starts, this event is fired for the given provider if the provider is active for the query and there are no
        * other providers that are restricting. Its purpose is to request the provider's results for the query.
        * The listener should return a list of results in response.
        */
      var onResultsRequested: onResultsRequestedEvent = js.native
      
      /**
        * Starts a search in the urlbar in the current window.
        *
        * @param searchString The search string.
        * @param options Optional. Options for the search.
        */
      def search(searchString: String): Unit = js.native
      def search(searchString: String, options: SearchOptions): Unit = js.native
    }
    
    /**
      * Before a query starts, this event is fired for the given provider. Its purpose is to request the provider's behavior for
      * the query. The listener should return a behavior in response. By default, providers are inactive,
      * so if your provider should always be inactive, you don't need to listen for this event.
      */
    trait onBehaviorRequestedEvent
      extends StObject
         with Event[js.Function1[/* query */ Query, OnBehaviorRequestedReturnEnum]] {
      
      /**
        * Registers an event listener <em>callback</em> to an event.
        *
        * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
        * @param providerName The name of the provider whose behavior the listener returns.
        */
      def addListener(callback: js.Function1[/* query */ Query, OnBehaviorRequestedReturnEnum], providerName: String): Unit
    }
    object onBehaviorRequestedEvent {
      
      inline def apply(
        addListener: (js.Function1[/* query */ Query, OnBehaviorRequestedReturnEnum], String) => Callback,
        hasListener: js.Function1[/* query */ Query, OnBehaviorRequestedReturnEnum] => Boolean,
        hasListeners: CallbackTo[Boolean],
        removeListener: js.Function1[/* query */ Query, OnBehaviorRequestedReturnEnum] => Callback
      ): onBehaviorRequestedEvent = {
        val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: js.Function1[/* query */ Query, OnBehaviorRequestedReturnEnum], t1: String) => (addListener(t0, t1)).runNow()), hasListener = js.Any.fromFunction1(hasListener), hasListeners = hasListeners.toJsFn, removeListener = js.Any.fromFunction1((t0: js.Function1[/* query */ Query, OnBehaviorRequestedReturnEnum]) => removeListener(t0).runNow()))
        __obj.asInstanceOf[onBehaviorRequestedEvent]
      }
      
      extension [Self <: onBehaviorRequestedEvent](x: Self) {
        
        inline def setAddListener(value: (js.Function1[/* query */ Query, OnBehaviorRequestedReturnEnum], String) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: js.Function1[/* query */ Query, OnBehaviorRequestedReturnEnum], t1: String) => (value(t0, t1)).runNow()))
      }
    }
    
    /**
      * This event is fired when the user starts and ends an engagement with the urlbar.
      */
    trait onEngagementEvent
      extends StObject
         with Event[js.Function1[/* state */ EngagementState, Unit]] {
      
      /**
        * Registers an event listener <em>callback</em> to an event.
        *
        * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
        * @param providerName The name of the provider that will listen for engagement events.
        */
      def addListener(callback: js.Function1[/* state */ EngagementState, Unit], providerName: String): Unit
    }
    object onEngagementEvent {
      
      inline def apply(
        addListener: (js.Function1[/* state */ EngagementState, Unit], String) => Callback,
        hasListener: js.Function1[/* state */ EngagementState, Unit] => Boolean,
        hasListeners: CallbackTo[Boolean],
        removeListener: js.Function1[/* state */ EngagementState, Unit] => Callback
      ): onEngagementEvent = {
        val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: js.Function1[/* state */ EngagementState, Unit], t1: String) => (addListener(t0, t1)).runNow()), hasListener = js.Any.fromFunction1(hasListener), hasListeners = hasListeners.toJsFn, removeListener = js.Any.fromFunction1((t0: js.Function1[/* state */ EngagementState, Unit]) => removeListener(t0).runNow()))
        __obj.asInstanceOf[onEngagementEvent]
      }
      
      extension [Self <: onEngagementEvent](x: Self) {
        
        inline def setAddListener(value: (js.Function1[/* state */ EngagementState, Unit], String) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: js.Function1[/* state */ EngagementState, Unit], t1: String) => (value(t0, t1)).runNow()))
      }
    }
    
    /**
      * This event is fired for the given provider when a query is canceled. The listener should stop any ongoing fetch or
      * creation of results and clean up its resources.
      */
    trait onQueryCanceledEvent
      extends StObject
         with Event[js.Function1[/* query */ Query, Unit]] {
      
      /**
        * Registers an event listener <em>callback</em> to an event.
        *
        * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
        * @param providerName The name of the provider that is creating results for the query.
        */
      def addListener(callback: js.Function1[/* query */ Query, Unit], providerName: String): Unit
    }
    object onQueryCanceledEvent {
      
      inline def apply(
        addListener: (js.Function1[/* query */ Query, Unit], String) => Callback,
        hasListener: js.Function1[/* query */ Query, Unit] => Boolean,
        hasListeners: CallbackTo[Boolean],
        removeListener: js.Function1[/* query */ Query, Unit] => Callback
      ): onQueryCanceledEvent = {
        val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: js.Function1[/* query */ Query, Unit], t1: String) => (addListener(t0, t1)).runNow()), hasListener = js.Any.fromFunction1(hasListener), hasListeners = hasListeners.toJsFn, removeListener = js.Any.fromFunction1((t0: js.Function1[/* query */ Query, Unit]) => removeListener(t0).runNow()))
        __obj.asInstanceOf[onQueryCanceledEvent]
      }
      
      extension [Self <: onQueryCanceledEvent](x: Self) {
        
        inline def setAddListener(value: (js.Function1[/* query */ Query, Unit], String) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: js.Function1[/* query */ Query, Unit], t1: String) => (value(t0, t1)).runNow()))
      }
    }
    
    /**
      * Typically, a provider includes a <code>url</code> property in its results' payloads.
      * When the user picks a result with a URL, Firefox automatically loads the URL. URLs don't make sense for every result
      * type, however. When the user picks a result without a URL, this event is fired. The provider should take an appropriate
      * action in response. Currently the only applicable <code>ResultTypes</code> are <code>dynamic</code> and <code>tip</code>.
      */
    trait onResultPickedEvent
      extends StObject
         with Event[
              js.Function2[/* payload */ OnResultPickedPayloadType, /* elementName */ String, Unit]
            ] {
      
      /**
        * Registers an event listener <em>callback</em> to an event.
        *
        * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
        * @param providerName The listener will be called for the results of the provider with this name.
        */
      def addListener(
        callback: js.Function2[/* payload */ OnResultPickedPayloadType, /* elementName */ String, Unit],
        providerName: String
      ): Unit
    }
    object onResultPickedEvent {
      
      inline def apply(
        addListener: (js.Function2[/* payload */ OnResultPickedPayloadType, /* elementName */ String, Unit], String) => Callback,
        hasListener: js.Function2[/* payload */ OnResultPickedPayloadType, /* elementName */ String, Unit] => Boolean,
        hasListeners: CallbackTo[Boolean],
        removeListener: js.Function2[/* payload */ OnResultPickedPayloadType, /* elementName */ String, Unit] => Callback
      ): onResultPickedEvent = {
        val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: js.Function2[/* payload */ OnResultPickedPayloadType, /* elementName */ String, Unit], t1: String) => (addListener(t0, t1)).runNow()), hasListener = js.Any.fromFunction1(hasListener), hasListeners = hasListeners.toJsFn, removeListener = js.Any.fromFunction1((t0: js.Function2[/* payload */ OnResultPickedPayloadType, /* elementName */ String, Unit]) => removeListener(t0).runNow()))
        __obj.asInstanceOf[onResultPickedEvent]
      }
      
      extension [Self <: onResultPickedEvent](x: Self) {
        
        inline def setAddListener(
          value: (js.Function2[/* payload */ OnResultPickedPayloadType, /* elementName */ String, Unit], String) => Callback
        ): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: js.Function2[/* payload */ OnResultPickedPayloadType, /* elementName */ String, Unit], t1: String) => (value(t0, t1)).runNow()))
      }
    }
    
    /**
      * When a query starts, this event is fired for the given provider if the provider is active for the query and there are no
      * other providers that are restricting. Its purpose is to request the provider's results for the query.
      * The listener should return a list of results in response.
      */
    trait onResultsRequestedEvent
      extends StObject
         with Event[js.Function1[/* query */ Query, js.Array[Result]]] {
      
      /**
        * Registers an event listener <em>callback</em> to an event.
        *
        * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
        * @param providerName The name of the provider whose results the listener returns.
        */
      def addListener(callback: js.Function1[/* query */ Query, js.Array[Result]], providerName: String): Unit
    }
    object onResultsRequestedEvent {
      
      inline def apply(
        addListener: (js.Function1[/* query */ Query, js.Array[Result]], String) => Callback,
        hasListener: js.Function1[/* query */ Query, js.Array[Result]] => Boolean,
        hasListeners: CallbackTo[Boolean],
        removeListener: js.Function1[/* query */ Query, js.Array[Result]] => Callback
      ): onResultsRequestedEvent = {
        val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: js.Function1[/* query */ Query, js.Array[Result]], t1: String) => (addListener(t0, t1)).runNow()), hasListener = js.Any.fromFunction1(hasListener), hasListeners = hasListeners.toJsFn, removeListener = js.Any.fromFunction1((t0: js.Function1[/* query */ Query, js.Array[Result]]) => removeListener(t0).runNow()))
        __obj.asInstanceOf[onResultsRequestedEvent]
      }
      
      extension [Self <: onResultsRequestedEvent](x: Self) {
        
        inline def setAddListener(value: (js.Function1[/* query */ Query, js.Array[Result]], String) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: js.Function1[/* query */ Query, js.Array[Result]], t1: String) => (value(t0, t1)).runNow()))
      }
    }
  }
}
