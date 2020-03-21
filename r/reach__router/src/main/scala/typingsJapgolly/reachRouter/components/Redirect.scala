package typingsJapgolly.reachRouter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reachRouter.mod.NavigateFn
import typingsJapgolly.reachRouter.mod.RedirectProps
import typingsJapgolly.reachRouter.mod.RouteComponentProps
import typingsJapgolly.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Redirect {
  def apply[TState](
    to: String,
    default: js.UndefOr[Boolean] = js.undefined,
    from: String = null,
    location: WindowLocation = null,
    navigate: NavigateFn = null,
    noThrow: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    replace: js.UndefOr[Boolean] = js.undefined,
    state: TState = null,
    uri: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RouteComponentProps[RedirectProps[TState]], 
    typingsJapgolly.reachRouter.mod.Redirect[TState], 
    Unit, 
    RouteComponentProps[RedirectProps[TState]]
  ] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
      if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(navigate.asInstanceOf[js.Any])
    if (!js.isUndefined(noThrow)) __obj.updateDynamic("noThrow")(noThrow.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reachRouter.mod.RouteComponentProps[typingsJapgolly.reachRouter.mod.RedirectProps[TState]], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reachRouter.mod.Redirect[TState]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reachRouter.mod.RouteComponentProps[typingsJapgolly.reachRouter.mod.RedirectProps[TState]]])(children: _*)
  }
  @JSImport("@reach/router", "Redirect")
  @js.native
  object componentImport extends js.Object
  
}

