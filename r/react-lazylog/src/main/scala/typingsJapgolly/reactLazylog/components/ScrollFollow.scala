package typingsJapgolly.reactLazylog.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactLazylog.scrollFollowMod.ScrollFollowProps
import typingsJapgolly.reactLazylog.scrollFollowMod.ScrollFollowRenderProps
import typingsJapgolly.reactLazylog.scrollFollowMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollFollow {
  def apply(
    render: ScrollFollowRenderProps => CallbackTo[Node],
    startFollowing: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ScrollFollowProps, default, Unit, ScrollFollowProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.reactLazylog.scrollFollowMod.ScrollFollowRenderProps) => render(t0).runNow()))
    if (!js.isUndefined(startFollowing)) __obj.updateDynamic("startFollowing")(startFollowing.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactLazylog.scrollFollowMod.ScrollFollowProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactLazylog.scrollFollowMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactLazylog.scrollFollowMod.ScrollFollowProps])(children: _*)
  }
  @JSImport("react-lazylog/build/ScrollFollow", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

