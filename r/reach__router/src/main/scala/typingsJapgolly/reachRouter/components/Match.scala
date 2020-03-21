package typingsJapgolly.reachRouter.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reachRouter.mod.MatchProps
import typingsJapgolly.reachRouter.mod.MatchRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Match {
  def apply[TParams](
    path: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* props */ MatchRenderProps[TParams] => CallbackTo[Node]
  ): UnmountedWithRoot[
    MatchProps[TParams], 
    typingsJapgolly.reachRouter.mod.Match[TParams], 
    Unit, 
    MatchProps[TParams]
  ] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reachRouter.mod.MatchRenderProps[TParams]) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reachRouter.mod.MatchProps[TParams], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reachRouter.mod.Match[TParams]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reachRouter.mod.MatchProps[TParams]])
  }
  @JSImport("@reach/router", "Match")
  @js.native
  object componentImport extends js.Object
  
}

