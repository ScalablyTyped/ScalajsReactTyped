package typingsJapgolly.reactNavigationStack.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigationStack.transitionerMod.Props
import typingsJapgolly.reactNavigationStack.transitionerMod.TransitionSpec
import typingsJapgolly.reactNavigationStack.transitionerMod.default
import typingsJapgolly.reactNavigationStack.typesMod.NavigationStackProp
import typingsJapgolly.reactNavigationStack.typesMod.SceneDescriptorMap
import typingsJapgolly.reactNavigationStack.typesMod.TransitionProps
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
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
  
      __obj.updateDynamic("render")(js.Any.fromFunction2((t0: typingsJapgolly.reactNavigationStack.typesMod.TransitionProps, t1: js.UndefOr[typingsJapgolly.reactNavigationStack.typesMod.TransitionProps]) => render(t0, t1).runNow()))
    if (configureTransition != null) __obj.updateDynamic("configureTransition")(js.Any.fromFunction2((t0: /* current */ typingsJapgolly.reactNavigationStack.typesMod.TransitionProps, t1: /* previous */ js.UndefOr[typingsJapgolly.reactNavigationStack.typesMod.TransitionProps]) => configureTransition(t0, t1).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction2((t0: /* current */ typingsJapgolly.reactNavigationStack.typesMod.TransitionProps, t1: /* previous */ js.UndefOr[typingsJapgolly.reactNavigationStack.typesMod.TransitionProps]) => onTransitionEnd(t0, t1).runNow()))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction2((t0: /* current */ typingsJapgolly.reactNavigationStack.typesMod.TransitionProps, t1: /* previous */ js.UndefOr[typingsJapgolly.reactNavigationStack.typesMod.TransitionProps]) => onTransitionStart(t0, t1).runNow()))
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigationStack.transitionerMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigationStack.transitionerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigationStack.transitionerMod.Props])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/Transitioner", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

