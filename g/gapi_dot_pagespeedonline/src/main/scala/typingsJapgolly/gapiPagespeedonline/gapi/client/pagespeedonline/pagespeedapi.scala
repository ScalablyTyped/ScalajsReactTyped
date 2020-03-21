package typingsJapgolly.gapiPagespeedonline.gapi.client.pagespeedonline

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiPagespeedonline.AnonFields
import typingsJapgolly.gapiPagespeedonline.GoogleApiPageSpeedOnlineResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pagespeedapi extends js.Object {
  /**
    * Runs Page Speed analysis on the page at the specified URL, and returns a Page Speed score, a list of suggestions to make that page faster, and other information.
    */
  def runpagespeed(`object`: AnonFields): HttpRequest[GoogleApiPageSpeedOnlineResource]
}

object pagespeedapi {
  @scala.inline
  def apply(runpagespeed: AnonFields => CallbackTo[HttpRequest[GoogleApiPageSpeedOnlineResource]]): pagespeedapi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("runpagespeed")(js.Any.fromFunction1((t0: typingsJapgolly.gapiPagespeedonline.AnonFields) => runpagespeed(t0).runNow()))
    __obj.asInstanceOf[pagespeedapi]
  }
}

