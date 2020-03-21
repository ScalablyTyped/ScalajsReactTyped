package typingsJapgolly.mapboxMapboxSdk.mapMatchingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMatchingService extends js.Object {
  def getMatching(request: MapMatchingRequest): MapiRequest
}

object MapMatchingService {
  @scala.inline
  def apply(getMatching: MapMatchingRequest => CallbackTo[MapiRequest]): MapMatchingService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMatching")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.mapMatchingMod.MapMatchingRequest) => getMatching(t0).runNow()))
    __obj.asInstanceOf[MapMatchingService]
  }
}

