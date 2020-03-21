package typingsJapgolly.gapiClientPagespeedonline.gapi.client.pagespeedonline

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPagespeedonline.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagespeedapiResource extends js.Object {
  /**
    * Runs PageSpeed analysis on the page at the specified URL, and returns PageSpeed scores, a list of suggestions to make that page faster, and other
    * information.
    */
  def runpagespeed(request: AnonAlt): Request_[Result]
}

object PagespeedapiResource {
  @scala.inline
  def apply(runpagespeed: AnonAlt => CallbackTo[Request_[Result]]): PagespeedapiResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("runpagespeed")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPagespeedonline.AnonAlt) => runpagespeed(t0).runNow()))
    __obj.asInstanceOf[PagespeedapiResource]
  }
}

