package typingsJapgolly.reduxPersist.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.StoreEnhancer
import typingsJapgolly.redux.mod.StoreEnhancerStoreCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistorOptions extends js.Object {
  var enhancer: js.UndefOr[StoreEnhancer[_, js.Object]] = js.undefined
}

object PersistorOptions {
  @scala.inline
  def apply(
    enhancer: /* next */ StoreEnhancerStoreCreator[js.Object, js.Object] => CallbackTo[StoreEnhancerStoreCreator[js.Any, js.Object]] = null
  ): PersistorOptions = {
    val __obj = js.Dynamic.literal()
    if (enhancer != null) __obj.updateDynamic("enhancer")(js.Any.fromFunction1((t0: /* next */ typingsJapgolly.redux.mod.StoreEnhancerStoreCreator[js.Object, js.Object]) => enhancer(t0).runNow()))
    __obj.asInstanceOf[PersistorOptions]
  }
}

