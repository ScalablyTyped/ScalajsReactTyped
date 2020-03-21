package typingsJapgolly.semanticUiTab.SemanticUI

import typingsJapgolly.semanticUiApi.SemanticUI.ApiSettings
import typingsJapgolly.semanticUiTab.JQuery
import typingsJapgolly.semanticUiTab.SemanticUI.Tab.ClassNameSettings
import typingsJapgolly.semanticUiTab.SemanticUI.Tab.ErrorSettings
import typingsJapgolly.semanticUiTab.SemanticUI.Tab.MetadataSettings
import typingsJapgolly.semanticUiTab.SemanticUI.Tab.SelectorSettings
import typingsJapgolly.semanticUiTab.SemanticUI.Tab.TemplatesSettings
import typingsJapgolly.semanticUiTab.semanticUiTabBooleans.`false`
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.DOM
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.`cache add`
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.`cache read`
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.`cache remove`
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.`change tab`
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.`get path`
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.`is tab`
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.`set state`
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.all
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.alwaysRefresh
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.apiSettings
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.auto
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.cache
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.cacheType
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.childrenOnly
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.className
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.context
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.deactivate
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.debug
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.destroy
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.error
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.evaluateScripts
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.hash
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.history
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.historyType
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.html
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.ignoreFirstLoad
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.loadOnce
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.maxDepth
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.metadata
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.name
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.namespace
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.onFirstLoad
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.onLoad
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.onRequest
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.onVisible
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.once
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.path
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.performance
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.response
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.selector
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.setting
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.siblings
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.silent
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.state
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.templates
import typingsJapgolly.semanticUiTab.semanticUiTabStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tab_ extends js.Object {
  var settings: TabSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Sets cached HTML for path
    */
  def apply(behavior: `cache add`, path: String, html: String): JQuery = js.native
  /**
    * Returns cached HTML for path
    */
  def apply(behavior: `cache read`, path: String): String | `false` = js.native
  /**
    * Removes cached HTML for path
    */
  def apply(behavior: `cache remove`, path: String): JQuery = js.native
  // Documentation says this exists but it does not.
  // /**
  //  * Attaches tab action to given selector. Default event if none specified is toggle
  //  */
  // (behavior: 'attach events', selector: Selector, event?: string): JQuery;
  /**
    * Changes tab to path
    */
  def apply(behavior: `change tab`, path: String): JQuery = js.native
  /**
    * Returns current path
    */
  def apply(behavior: `get path`): String = js.native
  /**
    * Returns whether tab exists
    */
  def apply(behavior: `is tab`): Boolean = js.native
  /**
    * Sets current path to state
    */
  def apply(behavior: `set state`, path: String): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: setting, name: alwaysRefresh): Boolean = js.native
  def apply(behavior: setting, name: alwaysRefresh, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: apiSettings): ApiSettings = js.native
  def apply(behavior: setting, name: apiSettings, value: ApiSettings): JQuery = js.native
  def apply(behavior: setting, name: auto): Boolean = js.native
  def apply(behavior: setting, name: auto, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: cache): Boolean = js.native
  def apply(behavior: setting, name: cacheType): response | DOM | html = js.native
  def apply(behavior: setting, name: cacheType, value: DOM): JQuery = js.native
  def apply(behavior: setting, name: cacheType, value: html): JQuery = js.native
  def apply(behavior: setting, name: cacheType, value: response): JQuery = js.native
  def apply(behavior: setting, name: cache, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: childrenOnly): Boolean = js.native
  def apply(behavior: setting, name: childrenOnly, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: context): `false` | String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: context, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: deactivate): siblings | all = js.native
  def apply(behavior: setting, name: deactivate, value: all): JQuery = js.native
  def apply(behavior: setting, name: deactivate, value: siblings): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: evaluateScripts): once | Boolean = js.native
  def apply(behavior: setting, name: evaluateScripts, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: evaluateScripts, value: once): JQuery = js.native
  def apply(behavior: setting, name: history): Boolean = js.native
  def apply(behavior: setting, name: historyType): hash | state = js.native
  def apply(behavior: setting, name: historyType, value: hash): JQuery = js.native
  def apply(behavior: setting, name: historyType, value: state): JQuery = js.native
  def apply(behavior: setting, name: history, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: ignoreFirstLoad): Boolean = js.native
  def apply(behavior: setting, name: ignoreFirstLoad, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: loadOnce): Boolean = js.native
  def apply(behavior: setting, name: loadOnce, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: maxDepth): Double = js.native
  def apply(behavior: setting, name: maxDepth, value: Double): JQuery = js.native
  def apply(behavior: setting, name: metadata): MetadataSettings = js.native
  def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onFirstLoad): js.ThisFunction3[
    /* this */ JQuery, 
    /* tabPath */ String, 
    /* parameterArray */ js.Array[_], 
    /* historyEvent */ js.Any, 
    Unit
  ] = js.native
  def apply(
    behavior: setting,
    name: onFirstLoad,
    value: js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[_], 
      /* historyEvent */ js.Any, 
      Unit
    ]
  ): JQuery = js.native
  def apply(behavior: setting, name: onLoad): js.ThisFunction3[
    /* this */ JQuery, 
    /* tabPath */ String, 
    /* parameterArray */ js.Array[_], 
    /* historyEvent */ js.Any, 
    Unit
  ] = js.native
  def apply(
    behavior: setting,
    name: onLoad,
    value: js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[_], 
      /* historyEvent */ js.Any, 
      Unit
    ]
  ): JQuery = js.native
  def apply(behavior: setting, name: onRequest): js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit] = js.native
  def apply(
    behavior: setting,
    name: onRequest,
    value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onVisible): js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit] = js.native
  def apply(
    behavior: setting,
    name: onVisible,
    value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: path): `false` | String = js.native
  def apply(behavior: setting, name: path, value: String): JQuery = js.native
  def apply(behavior: setting, name: path, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: templates): TemplatesSettings = js.native
  def apply(behavior: setting, name: templates, value: TemplatesSettings): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: TabSettings): JQuery = js.native
  def apply(settings: TabSettings): JQuery = js.native
}

