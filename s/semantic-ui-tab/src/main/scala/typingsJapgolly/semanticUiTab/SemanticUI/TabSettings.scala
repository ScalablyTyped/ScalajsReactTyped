package typingsJapgolly.semanticUiTab.SemanticUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiApi.SemanticUI.ApiSettings
import typingsJapgolly.semanticUiTab.JQuery
import typingsJapgolly.semanticUiTab.SemanticUI.Tab.ClassNameSettings
import typingsJapgolly.semanticUiTab.SemanticUI.Tab.ErrorSettings
import typingsJapgolly.semanticUiTab.SemanticUI.Tab.MetadataSettings
import typingsJapgolly.semanticUiTab.SemanticUI.Tab.SelectorSettings
import typingsJapgolly.semanticUiTab.SemanticUI.Tab.TemplatesSettings
import typingsJapgolly.semanticUiTab.semanticUiTabBooleans.`false`
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.DOM
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.all
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.hash
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.html
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.once
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.response
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.siblings
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.state
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabSettings {
  
  trait Impl extends StObject {
    
    /**
      * Tab should reload content every time it is opened
      */
    var alwaysRefresh: Boolean
    
    /**
      * Settings object for $.api call
      *
      * @default false
      * @see {@link http://semantic-ui.com/behaviors/api.html}
      */
    var apiSettings: ApiSettings
    
    // region Tab Settings
    /**
      * Whether tab should load remote content as same url as history
      *
      * @default false
      */
    var auto: Boolean
    
    /**
      * Tab should cache content after loading locally to avoid server trip on second load
      *
      * @default true
      */
    var cache: Boolean
    
    /**
      * Can be set to either response, DOM or html.
      * Using DOM will cache the a clone of the DOM tree, preserving all events as they existed on render.
      * response will cache the original response on load, this way callbacks always receive the same content.
      * Using html will cache the resulting html after all callbacks, making sure any changes to content are preserved.
      *
      * @default 'response'
      */
    var cacheType: response | DOM | html
    
    /**
      * If enabled limits tabs to children of passed context
      *
      * @default false
      */
    var childrenOnly: Boolean
    
    /**
      * Class names used to attach style to state
      */
    var className: ClassNameSettings
    
    /**
      * Tabs are limited to those found inside this context
      *
      * @default false
      */
    var context: `false` | String | JQuery
    
    /**
      * When set to siblings will only deactivate elements that are DOM siblings with the activated element.
      * When set to all the component will deactivate all other elements initialized at the same time.
      *
      * @default 'siblings'
      * @since 2.2
      */
    var deactivate: siblings | all
    
    /**
      * Debug output to console
      */
    var debug: Boolean
    
    // endregion
    // region Debug Settings
    var error: ErrorSettings
    
    /**
      * Whether inline scripts in tab HTML should be parsed on tab load.
      * Defaults to once, parsing only on first load.
      * Can also be set to true or false to always parse or never parse inline scripts.
      *
      * @default 'once'
      */
    var evaluateScripts: once | Boolean
    
    /**
      * Whether to record history events for tab changes
      *
      * @default false
      */
    var history: Boolean
    
    /**
      * Can be set to hash or state.
      * Hash will use an in-page link to create history events.
      * State will use DOM History and load pages from server on refresh.
      *
      * @default 'hash'
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/Guide/API/DOM/Manipulating_the_browser_history}
      */
    var historyType: hash | state
    
    /**
      * Do not load content remotely on first tab load. Useful when open tab is rendered on server.
      *
      * @default false
      */
    var ignoreFirstLoad: Boolean
    
    /**
      * When enabled only calls remote endpoint for tab data on first load and leaves the DOM undisturbed afterwards.
      *
      * @default false
      * @since 2.2.8
      */
    var loadOnce: Boolean
    
    /**
      * Maximum amount of nested tabs allowed (avoids recursion)
      *
      * @default 25
      */
    var maxDepth: Double
    
    /**
      * DOM metadata used by module
      */
    var metadata: MetadataSettings
    
    // endregion
    // region Debug Settings
    /**
      * Name used in log statements
      */
    var name: String
    
    // endregion
    // region Component Settings
    // region DOM Settings
    /**
      * Event namespace. Makes sure module teardown does not effect other events attached to an element.
      */
    var namespace: String
    
    // endregion
    // region Callbacks
    /**
      * Callback only the first time a tab is loaded
      */
    def onFirstLoad(tabPath: String, parameterArray: js.Array[Any], historyEvent: Any): Unit
    
    /**
      * Callback every time a tab is loaded
      */
    def onLoad(tabPath: String, parameterArray: js.Array[Any], historyEvent: Any): Unit
    
    /**
      * Called when a tab begins loading remote content
      */
    def onRequest(tabPath: String): Unit
    
    /**
      * Called after a tab becomes visible
      */
    def onVisible(tabPath: String): Unit
    
    /**
      * When using historyType state you must specify the base URL for all internal links.
      *
      * @default false
      */
    var path: `false` | String
    
    /**
      * Show console.table output with performance metrics
      */
    var performance: Boolean
    
    /**
      * Selectors used by module
      */
    var selector: SelectorSettings
    
    /**
      * Silences all console output including error messages, regardless of other debug settings.
      */
    var silent: Boolean
    
    // endregion
    // region DOM Settings
    /**
      * Functions used to return content
      */
    var templates: TemplatesSettings
    
    /**
      * Debug output includes all internal behaviors
      */
    var verbose: Boolean
  }
  object Impl {
    
    inline def apply(
      alwaysRefresh: Boolean,
      apiSettings: ApiSettings,
      auto: Boolean,
      cache: Boolean,
      cacheType: response | DOM | html,
      childrenOnly: Boolean,
      className: ClassNameSettings,
      context: `false` | String | JQuery,
      deactivate: siblings | all,
      debug: Boolean,
      error: ErrorSettings,
      evaluateScripts: once | Boolean,
      history: Boolean,
      historyType: hash | state,
      ignoreFirstLoad: Boolean,
      loadOnce: Boolean,
      maxDepth: Double,
      metadata: MetadataSettings,
      name: String,
      namespace: String,
      onFirstLoad: (String, js.Array[Any], Any) => Callback,
      onLoad: (String, js.Array[Any], Any) => Callback,
      onRequest: String => Callback,
      onVisible: String => Callback,
      path: `false` | String,
      performance: Boolean,
      selector: SelectorSettings,
      silent: Boolean,
      templates: TemplatesSettings,
      verbose: Boolean
    ): Impl = {
      val __obj = js.Dynamic.literal(alwaysRefresh = alwaysRefresh.asInstanceOf[js.Any], apiSettings = apiSettings.asInstanceOf[js.Any], auto = auto.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheType = cacheType.asInstanceOf[js.Any], childrenOnly = childrenOnly.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], deactivate = deactivate.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], evaluateScripts = evaluateScripts.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], historyType = historyType.asInstanceOf[js.Any], ignoreFirstLoad = ignoreFirstLoad.asInstanceOf[js.Any], loadOnce = loadOnce.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onFirstLoad = js.Any.fromFunction3((t0: String, t1: js.Array[Any], t2: Any) => (onFirstLoad(t0, t1, t2)).runNow()), onLoad = js.Any.fromFunction3((t0: String, t1: js.Array[Any], t2: Any) => (onLoad(t0, t1, t2)).runNow()), onRequest = js.Any.fromFunction1((t0: String) => onRequest(t0).runNow()), onVisible = js.Any.fromFunction1((t0: String) => onVisible(t0).runNow()), path = path.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Impl]
    }
    
    extension [Self <: Impl](x: Self) {
      
      inline def setAlwaysRefresh(value: Boolean): Self = StObject.set(x, "alwaysRefresh", value.asInstanceOf[js.Any])
      
      inline def setApiSettings(value: ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
      
      inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheType(value: response | DOM | html): Self = StObject.set(x, "cacheType", value.asInstanceOf[js.Any])
      
      inline def setChildrenOnly(value: Boolean): Self = StObject.set(x, "childrenOnly", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setContext(value: `false` | String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDeactivate(value: siblings | all): Self = StObject.set(x, "deactivate", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setEvaluateScripts(value: once | Boolean): Self = StObject.set(x, "evaluateScripts", value.asInstanceOf[js.Any])
      
      inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryType(value: hash | state): Self = StObject.set(x, "historyType", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFirstLoad(value: Boolean): Self = StObject.set(x, "ignoreFirstLoad", value.asInstanceOf[js.Any])
      
      inline def setLoadOnce(value: Boolean): Self = StObject.set(x, "loadOnce", value.asInstanceOf[js.Any])
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setOnFirstLoad(value: (String, js.Array[Any], Any) => Callback): Self = StObject.set(x, "onFirstLoad", js.Any.fromFunction3((t0: String, t1: js.Array[Any], t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnLoad(value: (String, js.Array[Any], Any) => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction3((t0: String, t1: js.Array[Any], t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnRequest(value: String => Callback): Self = StObject.set(x, "onRequest", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setOnVisible(value: String => Callback): Self = StObject.set(x, "onVisible", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setPath(value: `false` | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.semanticUiTab.anon.PickImplautoPartialPickIm
    - typingsJapgolly.semanticUiTab.anon.PickImpldeactivatePartial
    - typingsJapgolly.semanticUiTab.anon.PickImplhistoryPartialPic
    - typingsJapgolly.semanticUiTab.anon.PickImplignoreFirstLoadPa
    - typingsJapgolly.semanticUiTab.anon.PickImplevaluateScriptsPa
    - typingsJapgolly.semanticUiTab.anon.PickImplalwaysRefreshPart
    - typingsJapgolly.semanticUiTab.anon.PickImplcacheTypePartialP
    - typingsJapgolly.semanticUiTab.anon.PickImplcachePartialPickI
    - typingsJapgolly.semanticUiTab.anon.PickImplapiSettingsPartia
    - typingsJapgolly.semanticUiTab.anon.PickImplhistoryTypePartia
    - typingsJapgolly.semanticUiTab.anon.PickImplpathPartialPickIm
    - typingsJapgolly.semanticUiTab.anon.PickImplcontextPartialPic
    - typingsJapgolly.semanticUiTab.anon.PickImplchildrenOnlyParti
    - typingsJapgolly.semanticUiTab.anon.PickImplmaxDepthPartialPi
    - typingsJapgolly.semanticUiTab.anon.PickImplloadOncePartialPi
    - typingsJapgolly.semanticUiTab.anon.PickImplonFirstLoadPartia
    - typingsJapgolly.semanticUiTab.anon.PickImplonLoadPartialPick
    - typingsJapgolly.semanticUiTab.anon.PickImplonRequestPartialP
    - typingsJapgolly.semanticUiTab.anon.PickImplonVisiblePartialP
    - typingsJapgolly.semanticUiTab.anon.PickImpltemplatesPartialP
    - typingsJapgolly.semanticUiTab.anon.PickImplselectorPartialPi
    - typingsJapgolly.semanticUiTab.anon.PickImplmetadataPartialPi
    - typingsJapgolly.semanticUiTab.anon.PickImplclassNamePartialP
    - typingsJapgolly.semanticUiTab.anon.PickImplerrorPartialPickI
    - typingsJapgolly.semanticUiTab.anon.PickImplnamespacePartialP
    - typingsJapgolly.semanticUiTab.anon.PickImplnamePartialPickIm
    - typingsJapgolly.semanticUiTab.anon.PickImplsilentPartialPick
    - typingsJapgolly.semanticUiTab.anon.PickImpldebugPartialPickI
    - typingsJapgolly.semanticUiTab.anon.PickImplperformancePartia
    - typingsJapgolly.semanticUiTab.anon.PickImplverbosePartialPic
  */
  trait Param extends StObject
  object Param {
    
    inline def PickImplalwaysRefreshPart(alwaysRefresh: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTab.anon.PickImplalwaysRefreshPart = {
      val __obj = js.Dynamic.literal(alwaysRefresh = alwaysRefresh.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplalwaysRefreshPart]
    }
    
    inline def PickImplapiSettingsPartia(apiSettings: ApiSettings & js.UndefOr[ApiSettings]): typingsJapgolly.semanticUiTab.anon.PickImplapiSettingsPartia = {
      val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplapiSettingsPartia]
    }
    
    inline def PickImplautoPartialPickIm(auto: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTab.anon.PickImplautoPartialPickIm = {
      val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplautoPartialPickIm]
    }
    
    inline def PickImplcachePartialPickI(cache: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTab.anon.PickImplcachePartialPickI = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplcachePartialPickI]
    }
    
    inline def PickImplcacheTypePartialP(cacheType: (response | DOM | html) & (js.UndefOr[response | DOM | html])): typingsJapgolly.semanticUiTab.anon.PickImplcacheTypePartialP = {
      val __obj = js.Dynamic.literal(cacheType = cacheType.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplcacheTypePartialP]
    }
    
    inline def PickImplchildrenOnlyParti(childrenOnly: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTab.anon.PickImplchildrenOnlyParti = {
      val __obj = js.Dynamic.literal(childrenOnly = childrenOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplchildrenOnlyParti]
    }
    
    inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiTab.anon.PickImplclassNamePartialP = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplclassNamePartialP]
    }
    
    inline def PickImplcontextPartialPic(context: (`false` | String | JQuery) & (js.UndefOr[`false` | String | JQuery])): typingsJapgolly.semanticUiTab.anon.PickImplcontextPartialPic = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplcontextPartialPic]
    }
    
    inline def PickImpldeactivatePartial(deactivate: (siblings | all) & (js.UndefOr[siblings | all])): typingsJapgolly.semanticUiTab.anon.PickImpldeactivatePartial = {
      val __obj = js.Dynamic.literal(deactivate = deactivate.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImpldeactivatePartial]
    }
    
    inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTab.anon.PickImpldebugPartialPickI = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImpldebugPartialPickI]
    }
    
    inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiTab.anon.PickImplerrorPartialPickI = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplerrorPartialPickI]
    }
    
    inline def PickImplevaluateScriptsPa(evaluateScripts: (once | Boolean) & (js.UndefOr[once | Boolean])): typingsJapgolly.semanticUiTab.anon.PickImplevaluateScriptsPa = {
      val __obj = js.Dynamic.literal(evaluateScripts = evaluateScripts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplevaluateScriptsPa]
    }
    
    inline def PickImplhistoryPartialPic(history: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTab.anon.PickImplhistoryPartialPic = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplhistoryPartialPic]
    }
    
    inline def PickImplhistoryTypePartia(historyType: (hash | state) & (js.UndefOr[hash | state])): typingsJapgolly.semanticUiTab.anon.PickImplhistoryTypePartia = {
      val __obj = js.Dynamic.literal(historyType = historyType.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplhistoryTypePartia]
    }
    
    inline def PickImplignoreFirstLoadPa(ignoreFirstLoad: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTab.anon.PickImplignoreFirstLoadPa = {
      val __obj = js.Dynamic.literal(ignoreFirstLoad = ignoreFirstLoad.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplignoreFirstLoadPa]
    }
    
    inline def PickImplloadOncePartialPi(loadOnce: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTab.anon.PickImplloadOncePartialPi = {
      val __obj = js.Dynamic.literal(loadOnce = loadOnce.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplloadOncePartialPi]
    }
    
    inline def PickImplmaxDepthPartialPi(maxDepth: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiTab.anon.PickImplmaxDepthPartialPi = {
      val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplmaxDepthPartialPi]
    }
    
    inline def PickImplmetadataPartialPi(metadata: MetadataSettings & js.UndefOr[MetadataSettings]): typingsJapgolly.semanticUiTab.anon.PickImplmetadataPartialPi = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplmetadataPartialPi]
    }
    
    inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiTab.anon.PickImplnamePartialPickIm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplnamePartialPickIm]
    }
    
    inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiTab.anon.PickImplnamespacePartialP = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplnamespacePartialP]
    }
    
    inline def PickImplonFirstLoadPartia(
      onFirstLoad: (js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[Any], 
          /* historyEvent */ Any, 
          Unit
        ]) & (js.UndefOr[
          js.ThisFunction3[
            /* this */ JQuery, 
            /* tabPath */ String, 
            /* parameterArray */ js.Array[Any], 
            /* historyEvent */ Any, 
            Unit
          ]
        ])
    ): typingsJapgolly.semanticUiTab.anon.PickImplonFirstLoadPartia = {
      val __obj = js.Dynamic.literal(onFirstLoad = onFirstLoad.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplonFirstLoadPartia]
    }
    
    inline def PickImplonLoadPartialPick(
      onLoad: (js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[Any], 
          /* historyEvent */ Any, 
          Unit
        ]) & (js.UndefOr[
          js.ThisFunction3[
            /* this */ JQuery, 
            /* tabPath */ String, 
            /* parameterArray */ js.Array[Any], 
            /* historyEvent */ Any, 
            Unit
          ]
        ])
    ): typingsJapgolly.semanticUiTab.anon.PickImplonLoadPartialPick = {
      val __obj = js.Dynamic.literal(onLoad = onLoad.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplonLoadPartialPick]
    }
    
    inline def PickImplonRequestPartialP(
      onRequest: (js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]])
    ): typingsJapgolly.semanticUiTab.anon.PickImplonRequestPartialP = {
      val __obj = js.Dynamic.literal(onRequest = onRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplonRequestPartialP]
    }
    
    inline def PickImplonVisiblePartialP(
      onVisible: (js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]])
    ): typingsJapgolly.semanticUiTab.anon.PickImplonVisiblePartialP = {
      val __obj = js.Dynamic.literal(onVisible = onVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplonVisiblePartialP]
    }
    
    inline def PickImplpathPartialPickIm(path: (`false` | String) & (js.UndefOr[`false` | String])): typingsJapgolly.semanticUiTab.anon.PickImplpathPartialPickIm = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplpathPartialPickIm]
    }
    
    inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTab.anon.PickImplperformancePartia = {
      val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplperformancePartia]
    }
    
    inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typingsJapgolly.semanticUiTab.anon.PickImplselectorPartialPi = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplselectorPartialPi]
    }
    
    inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTab.anon.PickImplsilentPartialPick = {
      val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplsilentPartialPick]
    }
    
    inline def PickImpltemplatesPartialP(templates: TemplatesSettings & js.UndefOr[TemplatesSettings]): typingsJapgolly.semanticUiTab.anon.PickImpltemplatesPartialP = {
      val __obj = js.Dynamic.literal(templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImpltemplatesPartialP]
    }
    
    inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiTab.anon.PickImplverbosePartialPic = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiTab.anon.PickImplverbosePartialPic]
    }
  }
}
