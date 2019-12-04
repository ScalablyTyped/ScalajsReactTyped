package typingsJapgolly.reactDashNavigationDashStack.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneDescriptorMap
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsTransitionerMod.Props
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsTransitionerMod.TransitionSpec
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsTransitionerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Transitioner {
  def apply(
    descriptors: SceneDescriptorMap,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    render: (TransitionProps, js.UndefOr[TransitionProps]) => CallbackTo[Node],
    configureTransition: (/* current */ TransitionProps, /* previous */ js.UndefOr[TransitionProps]) => CallbackTo[TransitionSpec] = null,
    onTransitionEnd: (/* current */ TransitionProps, /* previous */ js.UndefOr[TransitionProps]) => CallbackTo[Unit | js.Promise[js.Any]] = null,
    onTransitionStart: (/* current */ TransitionProps, /* previous */ js.UndefOr[TransitionProps]) => CallbackTo[Unit | js.Promise[js.Any]] = null,
    screenProps: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
  
      __obj.updateDynamic("render")(js.Any.fromFunction2((t0: typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps, t1: js.UndefOr[
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps]) => render(t0, t1).runNow()))
    if (configureTransition != null) __obj.updateDynamic("configureTransition")(js.Any.fromFunction2((t0: /* current */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps, t1: /* previous */ js.UndefOr[
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps]) => configureTransition(t0, t1).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction2((t0: /* current */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps, t1: /* previous */ js.UndefOr[
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps]) => onTransitionEnd(t0, t1).runNow()))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction2((t0: /* current */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps, t1: /* previous */ js.UndefOr[
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps]) => onTransitionStart(t0, t1).runNow()))
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsTransitionerMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsTransitionerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsTransitionerMod.Props])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/Transitioner", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

