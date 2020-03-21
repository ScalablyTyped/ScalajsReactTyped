package typingsJapgolly.mapboxMapboxSdk.directionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsService extends js.Object {
  def getDirections(request: DirectionsRequest): MapiRequest
}

object DirectionsService {
  @scala.inline
  def apply(getDirections: DirectionsRequest => CallbackTo[MapiRequest]): DirectionsService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDirections")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.directionsMod.DirectionsRequest) => getDirections(t0).runNow()))
    __obj.asInstanceOf[DirectionsService]
  }
}

