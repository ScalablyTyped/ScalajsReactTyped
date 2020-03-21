package typingsJapgolly.mapboxMapboxSdk.geocodingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeService extends js.Object {
  def forwardGeocode(request: GeocodeRequest): MapiRequest
  def reverseGeocode(request: GeocodeRequest): MapiRequest
}

object GeocodeService {
  @scala.inline
  def apply(
    forwardGeocode: GeocodeRequest => CallbackTo[MapiRequest],
    reverseGeocode: GeocodeRequest => CallbackTo[MapiRequest]
  ): GeocodeService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forwardGeocode")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.geocodingMod.GeocodeRequest) => forwardGeocode(t0).runNow()))
    __obj.updateDynamic("reverseGeocode")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.geocodingMod.GeocodeRequest) => reverseGeocode(t0).runNow()))
    __obj.asInstanceOf[GeocodeService]
  }
}

