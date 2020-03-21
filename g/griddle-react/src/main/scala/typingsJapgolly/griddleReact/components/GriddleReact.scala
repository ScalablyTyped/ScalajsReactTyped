package typingsJapgolly.griddleReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.griddleReact.AnonFilterPlaceholder
import typingsJapgolly.griddleReact.mod.GriddleComponents
import typingsJapgolly.griddleReact.mod.GriddleEvents
import typingsJapgolly.griddleReact.mod.GriddleInitialState
import typingsJapgolly.griddleReact.mod.GriddlePageProperties
import typingsJapgolly.griddleReact.mod.GriddlePlugin
import typingsJapgolly.griddleReact.mod.GriddleProps
import typingsJapgolly.griddleReact.mod.GriddleRenderProperties
import typingsJapgolly.griddleReact.mod.GriddleSortKey
import typingsJapgolly.griddleReact.mod.GriddleStyleConfig
import typingsJapgolly.griddleReact.mod.Listener
import typingsJapgolly.griddleReact.mod.PropertyBag
import typingsJapgolly.griddleReact.mod.Reducer
import typingsJapgolly.griddleReact.mod.Selector
import typingsJapgolly.griddleReact.mod.SettingsComponentObject
import typingsJapgolly.griddleReact.mod.default
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GriddleReact {
  def apply[T](
    components: GriddleComponents = null,
    core: GriddlePlugin = null,
    data: js.Array[T] = null,
    enableSettings: js.UndefOr[Boolean] = js.undefined,
    events: GriddleEvents = null,
    initialState: GriddleInitialState = null,
    listeners: PropertyBag[Listener] = null,
    pageProperties: GriddlePageProperties = null,
    plugins: js.Array[GriddlePlugin] = null,
    reducer: PropertyBag[Reducer] = null,
    reduxMiddleware: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]] = null,
    renderProperties: GriddleRenderProperties = null,
    selectors: PropertyBag[Selector] = null,
    settingsComponentObjects: PropertyBag[SettingsComponentObject] = null,
    sortMethod: (/* data */ js.Array[js.Any], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => CallbackTo[Double] = null,
    sortProperties: js.Array[GriddleSortKey] = null,
    storeKey: String = null,
    styleConfig: GriddleStyleConfig = null,
    textProperties: AnonFilterPlaceholder = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GriddleProps[T], default[T], Unit, GriddleProps[T]] = {
    val __obj = js.Dynamic.literal()
  
      if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (core != null) __obj.updateDynamic("core")(core.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSettings)) __obj.updateDynamic("enableSettings")(enableSettings.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (pageProperties != null) __obj.updateDynamic("pageProperties")(pageProperties.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (reducer != null) __obj.updateDynamic("reducer")(reducer.asInstanceOf[js.Any])
    if (reduxMiddleware != null) __obj.updateDynamic("reduxMiddleware")(reduxMiddleware.asInstanceOf[js.Any])
    if (renderProperties != null) __obj.updateDynamic("renderProperties")(renderProperties.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (settingsComponentObjects != null) __obj.updateDynamic("settingsComponentObjects")(settingsComponentObjects.asInstanceOf[js.Any])
    if (sortMethod != null) __obj.updateDynamic("sortMethod")(js.Any.fromFunction3((t0: /* data */ js.Array[js.Any], t1: /* column */ java.lang.String, t2: /* sortAscending */ js.UndefOr[scala.Boolean]) => sortMethod(t0, t1, t2).runNow()))
    if (sortProperties != null) __obj.updateDynamic("sortProperties")(sortProperties.asInstanceOf[js.Any])
    if (storeKey != null) __obj.updateDynamic("storeKey")(storeKey.asInstanceOf[js.Any])
    if (styleConfig != null) __obj.updateDynamic("styleConfig")(styleConfig.asInstanceOf[js.Any])
    if (textProperties != null) __obj.updateDynamic("textProperties")(textProperties.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.griddleReact.mod.GriddleProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.griddleReact.mod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.griddleReact.mod.GriddleProps[T]])(children: _*)
  }
  @JSImport("griddle-react", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

