package typingsJapgolly.semanticUiTab.anon

import typingsJapgolly.semanticUiApi.SemanticUI.ApiSettings
import typingsJapgolly.semanticUiTab.JQuery
import typingsJapgolly.semanticUiTab.SemanticUI.Tab.ClassNameSettings
import typingsJapgolly.semanticUiTab.SemanticUI.Tab.ErrorSettings
import typingsJapgolly.semanticUiTab.SemanticUI.Tab.MetadataSettings
import typingsJapgolly.semanticUiTab.SemanticUI.Tab.SelectorSettings
import typingsJapgolly.semanticUiTab.SemanticUI.Tab.TemplatesSettings
import typingsJapgolly.semanticUiTab.SemanticUI.TabSettings.Param
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

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'onRequest'> & std.Partial<std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, keyof semantic-ui-tab.SemanticUI.TabSettings._Impl>> */
trait PickImplonRequestPartialP
  extends StObject
     with Param {
  
  var alwaysRefresh: js.UndefOr[Boolean] = js.undefined
  
  var apiSettings: js.UndefOr[ApiSettings] = js.undefined
  
  var auto: js.UndefOr[Boolean] = js.undefined
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var cacheType: js.UndefOr[response | DOM | html] = js.undefined
  
  var childrenOnly: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  
  var context: js.UndefOr[`false` | String | JQuery] = js.undefined
  
  var deactivate: js.UndefOr[siblings | all] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[ErrorSettings] = js.undefined
  
  var evaluateScripts: js.UndefOr[once | Boolean] = js.undefined
  
  var history: js.UndefOr[Boolean] = js.undefined
  
  var historyType: js.UndefOr[hash | state] = js.undefined
  
  var ignoreFirstLoad: js.UndefOr[Boolean] = js.undefined
  
  var loadOnce: js.UndefOr[Boolean] = js.undefined
  
  var maxDepth: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[MetadataSettings] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var onFirstLoad: js.UndefOr[
    js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[Any], 
      /* historyEvent */ Any, 
      Unit
    ]
  ] = js.undefined
  
  var onLoad: js.UndefOr[
    js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[Any], 
      /* historyEvent */ Any, 
      Unit
    ]
  ] = js.undefined
  
  def onRequest(tabPath: String): Unit
  @JSName("onRequest")
  var onRequest_Original: (js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]])
  
  var onVisible: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]] = js.undefined
  
  var path: js.UndefOr[`false` | String] = js.undefined
  
  var performance: js.UndefOr[Boolean] = js.undefined
  
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var templates: js.UndefOr[TemplatesSettings] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object PickImplonRequestPartialP {
  
  inline def apply(
    onRequest: (js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]])
  ): PickImplonRequestPartialP = {
    val __obj = js.Dynamic.literal(onRequest = onRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonRequestPartialP]
  }
  
  extension [Self <: PickImplonRequestPartialP](x: Self) {
    
    inline def setAlwaysRefresh(value: Boolean): Self = StObject.set(x, "alwaysRefresh", value.asInstanceOf[js.Any])
    
    inline def setAlwaysRefreshUndefined: Self = StObject.set(x, "alwaysRefresh", js.undefined)
    
    inline def setApiSettings(value: ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
    
    inline def setApiSettingsUndefined: Self = StObject.set(x, "apiSettings", js.undefined)
    
    inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheType(value: response | DOM | html): Self = StObject.set(x, "cacheType", value.asInstanceOf[js.Any])
    
    inline def setCacheTypeUndefined: Self = StObject.set(x, "cacheType", js.undefined)
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setChildrenOnly(value: Boolean): Self = StObject.set(x, "childrenOnly", value.asInstanceOf[js.Any])
    
    inline def setChildrenOnlyUndefined: Self = StObject.set(x, "childrenOnly", js.undefined)
    
    inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContext(value: `false` | String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDeactivate(value: siblings | all): Self = StObject.set(x, "deactivate", value.asInstanceOf[js.Any])
    
    inline def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setEvaluateScripts(value: once | Boolean): Self = StObject.set(x, "evaluateScripts", value.asInstanceOf[js.Any])
    
    inline def setEvaluateScriptsUndefined: Self = StObject.set(x, "evaluateScripts", js.undefined)
    
    inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryType(value: hash | state): Self = StObject.set(x, "historyType", value.asInstanceOf[js.Any])
    
    inline def setHistoryTypeUndefined: Self = StObject.set(x, "historyType", js.undefined)
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setIgnoreFirstLoad(value: Boolean): Self = StObject.set(x, "ignoreFirstLoad", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFirstLoadUndefined: Self = StObject.set(x, "ignoreFirstLoad", js.undefined)
    
    inline def setLoadOnce(value: Boolean): Self = StObject.set(x, "loadOnce", value.asInstanceOf[js.Any])
    
    inline def setLoadOnceUndefined: Self = StObject.set(x, "loadOnce", js.undefined)
    
    inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    
    inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOnFirstLoad(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[Any], 
          /* historyEvent */ Any, 
          Unit
        ]
    ): Self = StObject.set(x, "onFirstLoad", value.asInstanceOf[js.Any])
    
    inline def setOnFirstLoadUndefined: Self = StObject.set(x, "onFirstLoad", js.undefined)
    
    inline def setOnLoad(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[Any], 
          /* historyEvent */ Any, 
          Unit
        ]
    ): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnRequest(
      value: (js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]])
    ): Self = StObject.set(x, "onRequest", value.asInstanceOf[js.Any])
    
    inline def setOnVisible(value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]): Self = StObject.set(x, "onVisible", value.asInstanceOf[js.Any])
    
    inline def setOnVisibleUndefined: Self = StObject.set(x, "onVisible", js.undefined)
    
    inline def setPath(value: `false` | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
