package typingsJapgolly.gapiClientAdsense.gapi.client.adsense

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdsense.AnonFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsResource extends js.Object {
  /** List the metadata for the metrics available to this AdSense account. */
  def list(request: AnonFieldsKey): Request_[Metadata]
}

object MetricsResource {
  @scala.inline
  def apply(list: AnonFieldsKey => CallbackTo[Request_[Metadata]]): MetricsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsense.AnonFieldsKey) => list(t0).runNow()))
    __obj.asInstanceOf[MetricsResource]
  }
}

