package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasSetFinalUrl extends js.Object {
  def setFinalUrl(url: String): Unit
  def setMobileFinalUrl(url: String): Unit
}

object hasSetFinalUrl {
  @scala.inline
  def apply(setFinalUrl: String => Callback, setMobileFinalUrl: String => Callback): hasSetFinalUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => setFinalUrl(t0).runNow()))
    __obj.updateDynamic("setMobileFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => setMobileFinalUrl(t0).runNow()))
    __obj.asInstanceOf[hasSetFinalUrl]
  }
}

