package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasFinalUrlBuilder[B] extends js.Object {
  def withFinalUrl(url: String): B
  def withMobileFinalUrl(url: String): B
}

object hasFinalUrlBuilder {
  @scala.inline
  def apply[B](withFinalUrl: String => CallbackTo[B], withMobileFinalUrl: String => CallbackTo[B]): hasFinalUrlBuilder[B] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("withFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withFinalUrl(t0).runNow()))
    __obj.updateDynamic("withMobileFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => withMobileFinalUrl(t0).runNow()))
    __obj.asInstanceOf[hasFinalUrlBuilder[B]]
  }
}

