package typingsJapgolly.ionicDiscover.publisherMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionicDiscover.ionicDiscoverStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPublisherEventEmitter extends js.Object {
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type
}

object IPublisherEventEmitter {
  @scala.inline
  def apply(on: (error, js.Function1[/* err */ js.Error, Unit]) => CallbackTo[IPublisherEventEmitter]): IPublisherEventEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.ionicDiscover.ionicDiscoverStrings.error, t1: js.Function1[/* err */ js.Error, scala.Unit]) => on(t0, t1).runNow()))
    __obj.asInstanceOf[IPublisherEventEmitter]
  }
}

