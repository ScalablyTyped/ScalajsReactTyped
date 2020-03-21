package typingsJapgolly.ably.mod.Types

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crypto extends js.Object {
  def generateRandomKey(callback: js.Function2[/* error */ ErrorInfo, /* key */ String, Unit]): Unit
}

object Crypto {
  @scala.inline
  def apply(generateRandomKey: js.Function2[/* error */ ErrorInfo, /* key */ String, Unit] => Callback): Crypto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generateRandomKey")(js.Any.fromFunction1((t0: js.Function2[
  /* error */ typingsJapgolly.ably.mod.Types.ErrorInfo, 
  /* key */ java.lang.String, 
  scala.Unit]) => generateRandomKey(t0).runNow()))
    __obj.asInstanceOf[Crypto]
  }
}

