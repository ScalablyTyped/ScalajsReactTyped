package typingsJapgolly.useSidecar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.useSidecar.typesMod.MediumCallback
import typingsJapgolly.useSidecar.typesMod.removeCb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<use-sidecar.use-sidecar/dist/es5/types.SideCarMedium> */
trait ReadonlySideCarMedium extends js.Object {
  val assignMedium: js.Function1[/* handler */ MediumCallback[ComponentType[js.Object]], Unit]
  val assignSyncMedium: js.Function1[/* handler */ MediumCallback[ComponentType[js.Object]], Unit]
  val options: js.UndefOr[js.Object] = js.undefined
  val read: js.Function0[js.UndefOr[ComponentType[js.Object]]]
  val useMedium: js.Function1[/* effect */ ComponentType[js.Object], removeCb]
}

object ReadonlySideCarMedium {
  @scala.inline
  def apply(
    assignMedium: /* handler */ MediumCallback[ComponentType[js.Object]] => Callback,
    assignSyncMedium: /* handler */ MediumCallback[ComponentType[js.Object]] => Callback,
    read: CallbackTo[js.UndefOr[ComponentType[js.Object]]],
    useMedium: /* effect */ ComponentType[js.Object] => CallbackTo[removeCb],
    options: js.Object = null
  ): ReadonlySideCarMedium = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assignMedium")(js.Any.fromFunction1((t0: /* handler */ typingsJapgolly.useSidecar.typesMod.MediumCallback[typingsJapgolly.react.mod.ComponentType[js.Object]]) => assignMedium(t0).runNow()))
    __obj.updateDynamic("assignSyncMedium")(js.Any.fromFunction1((t0: /* handler */ typingsJapgolly.useSidecar.typesMod.MediumCallback[typingsJapgolly.react.mod.ComponentType[js.Object]]) => assignSyncMedium(t0).runNow()))
    __obj.updateDynamic("read")(read.toJsFn)
    __obj.updateDynamic("useMedium")(js.Any.fromFunction1((t0: /* effect */ typingsJapgolly.react.mod.ComponentType[js.Object]) => useMedium(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySideCarMedium]
  }
}

