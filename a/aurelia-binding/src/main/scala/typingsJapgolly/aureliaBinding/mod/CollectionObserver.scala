package typingsJapgolly.aureliaBinding.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionObserver extends js.Object {
  /**
    * Subscribe to collection mutation events.
    */
  def subscribe(callback: js.Function1[/* changeRecords */ js.Array[ICollectionObserverSplice[_, _]], Unit]): Disposable
}

object CollectionObserver {
  @scala.inline
  def apply(
    subscribe: js.Function1[/* changeRecords */ js.Array[ICollectionObserverSplice[js.Any, js.Any]], Unit] => CallbackTo[Disposable]
  ): CollectionObserver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: js.Function1[
  /* changeRecords */ js.Array[typingsJapgolly.aureliaBinding.mod.ICollectionObserverSplice[js.Any, js.Any]], 
  scala.Unit]) => subscribe(t0).runNow()))
    __obj.asInstanceOf[CollectionObserver]
  }
}

