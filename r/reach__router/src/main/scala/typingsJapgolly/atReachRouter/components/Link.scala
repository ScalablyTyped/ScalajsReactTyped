package typingsJapgolly.atReachRouter.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atReachRouter.atReachRouterMod.LinkGetProps
import typingsJapgolly.atReachRouter.atReachRouterMod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link {
  def apply[TState](
    to: String,
    getProps: /* props */ LinkGetProps => CallbackTo[js.Object] = null,
    replace: js.UndefOr[Boolean] = js.undefined,
    state: TState = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    LinkProps[TState], 
    typingsJapgolly.atReachRouter.atReachRouterMod.Link[TState], 
    Unit, 
    LinkProps[TState]
  ] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
      if (getProps != null) __obj.updateDynamic("getProps")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.atReachRouter.atReachRouterMod.LinkGetProps) => getProps(t0).runNow()))
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atReachRouter.atReachRouterMod.LinkProps[TState], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atReachRouter.atReachRouterMod.Link[TState]](js.constructorOf[typingsJapgolly.atReachRouter.atReachRouterMod.Link[TState]])
    f(__obj.asInstanceOf[typingsJapgolly.atReachRouter.atReachRouterMod.LinkProps[TState]])(children: _*)
  }
}

