package typingsJapgolly.naverWhale

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.devtools.network.NavigatedEvent
import typingsJapgolly.chrome.chrome.devtools.network.RequestFinishedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofnetwork extends js.Object {
  var onNavigated: NavigatedEvent
  var onRequestFinished: RequestFinishedEvent
  def getHAR(callback: js.Function1[/* harLog */ js.Object, Unit]): Unit
}

object Typeofnetwork {
  @scala.inline
  def apply(
    getHAR: js.Function1[/* harLog */ js.Object, Unit] => Callback,
    onNavigated: NavigatedEvent,
    onRequestFinished: RequestFinishedEvent
  ): Typeofnetwork = {
    val __obj = js.Dynamic.literal(onNavigated = onNavigated.asInstanceOf[js.Any], onRequestFinished = onRequestFinished.asInstanceOf[js.Any])
    __obj.updateDynamic("getHAR")(js.Any.fromFunction1((t0: js.Function1[/* harLog */ js.Object, scala.Unit]) => getHAR(t0).runNow()))
    __obj.asInstanceOf[Typeofnetwork]
  }
}

