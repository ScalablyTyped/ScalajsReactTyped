package typingsJapgolly.localforage

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalForageDriverMethodsOptional extends js.Object {
  var dropInstance: js.UndefOr[LocalForageDropInstanceFn] = js.undefined
}

object LocalForageDriverMethodsOptional {
  @scala.inline
  def apply(
    dropInstance: (/* dbInstanceOptions */ js.UndefOr[LocalForageDbInstanceOptions], /* callback */ js.UndefOr[js.Function1[/* err */ js.Any, Unit]]) => CallbackTo[js.Promise[Unit]] = null
  ): LocalForageDriverMethodsOptional = {
    val __obj = js.Dynamic.literal()
    if (dropInstance != null) __obj.updateDynamic("dropInstance")(js.Any.fromFunction2((t0: /* dbInstanceOptions */ js.UndefOr[typingsJapgolly.localforage.LocalForageDbInstanceOptions], t1: /* callback */ js.UndefOr[js.Function1[/* err */ js.Any, scala.Unit]]) => dropInstance(t0, t1).runNow()))
    __obj.asInstanceOf[LocalForageDriverMethodsOptional]
  }
}

