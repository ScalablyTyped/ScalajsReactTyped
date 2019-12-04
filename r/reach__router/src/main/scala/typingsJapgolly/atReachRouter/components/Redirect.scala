package typingsJapgolly.atReachRouter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atReachRouter.atReachRouterMod.RedirectProps
import typingsJapgolly.atReachRouter.atReachRouterMod.RouteComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object Redirect {
  def apply[TState](
    props: RouteComponentProps[RedirectProps[TState]] with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RouteComponentProps[RedirectProps[TState]] with js.Object, 
    typingsJapgolly.atReachRouter.atReachRouterMod.Redirect[TState], 
    Unit, 
    RouteComponentProps[RedirectProps[TState]] with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atReachRouter.atReachRouterMod.RouteComponentProps[typingsJapgolly.atReachRouter.atReachRouterMod.RedirectProps[TState]] with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atReachRouter.atReachRouterMod.Redirect[TState]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atReachRouter.atReachRouterMod.RouteComponentProps[typingsJapgolly.atReachRouter.atReachRouterMod.RedirectProps[TState]] with js.Object])(children: _*)
  }
  @JSImport("@reach/router", "Redirect")
  @js.native
  object componentImport extends js.Object
  
}

