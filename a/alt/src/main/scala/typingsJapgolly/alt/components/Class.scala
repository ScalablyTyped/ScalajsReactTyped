package typingsJapgolly.alt.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.alt.AltJS.Alt
import typingsJapgolly.alt.AltJS.AltStore
import typingsJapgolly.alt.altContainerMod.ContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Class {
  def apply(
    actions: StringDictionary[js.Object] = null,
    component: Component[js.Object, js.Object] = null,
    flux: Alt = null,
    inject: StringDictionary[js.Any] = null,
    render: /* repeated */ js.Any => CallbackTo[Element] = null,
    shouldComponentUpdate: /* props */ js.Any => CallbackTo[Boolean] = null,
    store: AltStore[_] = null,
    stores: js.Array[AltStore[_]] = null,
    transform: (/* store */ AltStore[js.Any], /* actions */ js.Any) => CallbackTo[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ContainerProps, typingsJapgolly.alt.altContainerMod.Class, Unit, ContainerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (flux != null) __obj.updateDynamic("flux")(flux.asInstanceOf[js.Any])
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => render(t0).runNow()))
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(js.Any.fromFunction1((t0: /* props */ js.Any) => shouldComponentUpdate(t0).runNow()))
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (stores != null) __obj.updateDynamic("stores")(stores.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2((t0: /* store */ typingsJapgolly.alt.AltJS.AltStore[js.Any], t1: /* actions */ js.Any) => transform(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.alt.altContainerMod.ContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.alt.altContainerMod.Class](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.alt.altContainerMod.ContainerProps])(children: _*)
  }
  @JSImport("alt/AltContainer", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

