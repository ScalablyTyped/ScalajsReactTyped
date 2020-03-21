package typingsJapgolly.angularUiRouter.mod.angularAugmentingMod.ui

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angular.mod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  var `abstract`: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean (default true). If false will reload state on everytransitions. Useful for when you'd like to restore all data  to its initial state.
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  /**
    * String, component name
    */
  var component: js.UndefOr[String] = js.undefined
  /**
    * A controller paired to the state. Function, annotated array or name as String
    */
  var controller: js.UndefOr[Function | String | (js.Array[String | Function])] = js.undefined
  var controllerAs: js.UndefOr[String] = js.undefined
  /**
    * Function (injectable), returns the actual controller function or string.
    */
  var controllerProvider: js.UndefOr[Function | (js.Array[String | Function])] = js.undefined
  /**
    * Arbitrary data object, useful for custom configuration.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  /**
    * Callback function for when a state is entered. Good way to trigger an action or dispatch an event, such as opening a dialog.
    * If minifying your scripts, make sure to explicitly annotate this function, because it won't be automatically annotated by your build tools.
    */
  var onEnter: js.UndefOr[Function | (js.Array[String | Function])] = js.undefined
  /**
    * Callback functions for when a state is entered and exited. Good way to trigger an action or dispatch an event, such as opening a dialog.
    * If minifying your scripts, make sure to explicitly annotate this function, because it won't be automatically annotated by your build tools.
    */
  var onExit: js.UndefOr[Function | (js.Array[String | Function])] = js.undefined
  /**
    * A map which optionally configures parameters declared in the url, or defines additional non-url parameters. Only use this within a state if you are not using url. Otherwise you can specify your parameters within the url. When a state is navigated or transitioned to, the $stateParams service will be populated with any parameters that were passed.
    */
  var params: js.UndefOr[js.Any] = js.undefined
  /**
    * Specifies the parent state of this state
    */
  var parent: js.UndefOr[String | IState] = js.undefined
  /**
    * string | function | object
    * Synchronously or asynchronously redirects Transitions to a different state/params
    */
  var redirectTo: js.UndefOr[String | Function | IState] = js.undefined
  /**
    * Boolean (default true). If false will not re-trigger the same state just because a search/query parameter has changed. Useful for when you'd like to modify $location.search() without triggering a reload.
    */
  var reloadOnSearch: js.UndefOr[Boolean] = js.undefined
  var resolve: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * String HTML content, or function that returns an HTML string
    */
  var template: js.UndefOr[String | (js.Function1[/* params */ IStateParamsService, String])] = js.undefined
  /**
    * Function, returns HTML content string
    */
  var templateProvider: js.UndefOr[Function | (js.Array[String | Function])] = js.undefined
  /**
    * String URL path to template file OR Function, returns URL path string
    */
  var templateUrl: js.UndefOr[String | (js.Function1[/* params */ IStateParamsService, String])] = js.undefined
  /**
    * A url with optional parameters. When a state is navigated or transitioned to, the $stateParams service will be populated with any parameters that were passed.
    */
  var url: js.UndefOr[String | IUrlMatcher] = js.undefined
  /**
    * Use the views property to set up multiple views. If you don't need multiple views within a single state this property is not needed. Tip: remember that often nested views are more useful and powerful than multiple sibling views.
    */
  var views: js.UndefOr[StringDictionary[IState]] = js.undefined
}

object IState {
  @scala.inline
  def apply(
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    component: String = null,
    controller: Function | String | (js.Array[String | Function]) = null,
    controllerAs: String = null,
    controllerProvider: Function | (js.Array[String | Function]) = null,
    data: js.Any = null,
    name: String = null,
    onEnter: Function | (js.Array[String | Function]) = null,
    onExit: Function | (js.Array[String | Function]) = null,
    params: js.Any = null,
    parent: String | IState = null,
    redirectTo: String | Function | IState = null,
    reloadOnSearch: js.UndefOr[Boolean] = js.undefined,
    resolve: StringDictionary[js.Any] = null,
    template: String | (js.Function1[/* params */ IStateParamsService, String]) = null,
    templateProvider: Function | (js.Array[String | Function]) = null,
    templateUrl: String | (js.Function1[/* params */ IStateParamsService, String]) = null,
    url: String | IUrlMatcher = null,
    views: StringDictionary[IState] = null
  ): IState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs.asInstanceOf[js.Any])
    if (controllerProvider != null) __obj.updateDynamic("controllerProvider")(controllerProvider.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadOnSearch)) __obj.updateDynamic("reloadOnSearch")(reloadOnSearch.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateProvider != null) __obj.updateDynamic("templateProvider")(templateProvider.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
}

