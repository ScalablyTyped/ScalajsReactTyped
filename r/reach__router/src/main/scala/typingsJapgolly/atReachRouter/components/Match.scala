package typingsJapgolly.atReachRouter.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atReachRouter.atReachRouterMod.MatchProps
import typingsJapgolly.atReachRouter.atReachRouterMod.MatchRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Match {
  def apply[TParams](
    path: String,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: /* props */ MatchRenderProps[TParams] => CallbackTo[Node]
  ): UnmountedWithRoot[
    MatchProps[TParams], 
    typingsJapgolly.atReachRouter.atReachRouterMod.Match[TParams], 
    Unit, 
    MatchProps[TParams]
  ] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.atReachRouter.atReachRouterMod.MatchRenderProps[TParams]) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atReachRouter.atReachRouterMod.MatchProps[TParams], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.atReachRouter.atReachRouterMod.Match[TParams]](js.constructorOf[typingsJapgolly.atReachRouter.atReachRouterMod.Match[TParams]])
    f(__obj.asInstanceOf[typingsJapgolly.atReachRouter.atReachRouterMod.MatchProps[TParams]])
  }
}

