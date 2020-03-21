package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameAnimationOptions
import typingsJapgolly.reactOnsenui.mod.AnimationOptions
import typingsJapgolly.reactOnsenui.mod.NavigatorAnimationTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Navigator {
  def apply(
    renderPage: (js.Any, js.UndefOr[typingsJapgolly.reactOnsenui.mod.Navigator]) => CallbackTo[Element],
    animation: NavigatorAnimationTypes = null,
    animationOptions: AnimationOptions = null,
    className: String = null,
    id: String = null,
    initialRoute: js.Any = null,
    initialRouteStack: js.Array[String] = null,
    onPostPop: js.UndefOr[Callback] = js.undefined,
    onPostPush: js.UndefOr[Callback] = js.undefined,
    onPrePop: js.UndefOr[Callback] = js.undefined,
    onPrePush: js.UndefOr[Callback] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLAttributesidclassNameAnimationOptions, 
    typingsJapgolly.reactOnsenui.mod.Navigator, 
    Unit, 
    HTMLAttributesidclassNameAnimationOptions
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("renderPage")(js.Any.fromFunction2((t0: js.Any, t1: js.UndefOr[typingsJapgolly.reactOnsenui.mod.Navigator]) => renderPage(t0, t1).runNow()))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initialRoute != null) __obj.updateDynamic("initialRoute")(initialRoute.asInstanceOf[js.Any])
    if (initialRouteStack != null) __obj.updateDynamic("initialRouteStack")(initialRouteStack.asInstanceOf[js.Any])
    onPostPop.foreach(p => __obj.updateDynamic("onPostPop")(p.toJsFn))
    onPostPush.foreach(p => __obj.updateDynamic("onPostPush")(p.toJsFn))
    onPrePop.foreach(p => __obj.updateDynamic("onPrePop")(p.toJsFn))
    onPrePush.foreach(p => __obj.updateDynamic("onPrePush")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameAnimationOptions, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOnsenui.mod.Navigator](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameAnimationOptions])(children: _*)
  }
  @JSImport("react-onsenui", "Navigator")
  @js.native
  object componentImport extends js.Object
  
}

