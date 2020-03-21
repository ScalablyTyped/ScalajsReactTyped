package typingsJapgolly.vastClient.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VASTClientCustomStorage
  extends /* key */ StringDictionary[js.Any | js.Function0[_]] {
  def getItem(key: String): String | Null
  def setItem(key: String, `val`: String): Unit
}

object VASTClientCustomStorage {
  @scala.inline
  def apply(
    getItem: String => CallbackTo[String | Null],
    setItem: (String, String) => Callback,
    StringDictionary: /* key */ StringDictionary[js.Any | js.Function0[_]] = null
  ): VASTClientCustomStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: java.lang.String) => getItem(t0).runNow()))
    __obj.updateDynamic("setItem")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setItem(t0, t1).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[VASTClientCustomStorage]
  }
}

