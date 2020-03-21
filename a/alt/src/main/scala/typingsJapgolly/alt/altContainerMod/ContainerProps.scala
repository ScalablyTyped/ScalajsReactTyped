package typingsJapgolly.alt.altContainerMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.alt.AltJS.Alt
import typingsJapgolly.alt.AltJS.AltStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProps extends js.Object {
  var actions: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  var component: js.UndefOr[Component[js.Object, js.Object]] = js.undefined
  var flux: js.UndefOr[Alt] = js.undefined
  var inject: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var render: js.UndefOr[js.Function1[/* repeated */ js.Any, Element]] = js.undefined
  var shouldComponentUpdate: js.UndefOr[js.Function1[/* props */ js.Any, Boolean]] = js.undefined
  var store: js.UndefOr[AltStore[_]] = js.undefined
  var stores: js.UndefOr[js.Array[AltStore[_]]] = js.undefined
  var transform: js.UndefOr[js.Function2[/* store */ AltStore[_], /* actions */ js.Any, _]] = js.undefined
}

object ContainerProps {
  @scala.inline
  def apply(
    actions: StringDictionary[js.Object] = null,
    component: Component[js.Object, js.Object] = null,
    flux: Alt = null,
    inject: StringDictionary[js.Any] = null,
    render: /* repeated */ js.Any => CallbackTo[Element] = null,
    shouldComponentUpdate: /* props */ js.Any => CallbackTo[Boolean] = null,
    store: AltStore[_] = null,
    stores: js.Array[AltStore[_]] = null,
    transform: (/* store */ AltStore[js.Any], /* actions */ js.Any) => CallbackTo[js.Any] = null
  ): ContainerProps = {
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
    __obj.asInstanceOf[ContainerProps]
  }
}

