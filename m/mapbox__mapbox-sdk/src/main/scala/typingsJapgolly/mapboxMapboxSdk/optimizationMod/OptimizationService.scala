package typingsJapgolly.mapboxMapboxSdk.optimizationMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimizationService extends js.Object {
  def getContours(config: OptimizationRequest): MapiRequest
}

object OptimizationService {
  @scala.inline
  def apply(getContours: OptimizationRequest => CallbackTo[MapiRequest]): OptimizationService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContours")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.optimizationMod.OptimizationRequest) => getContours(t0).runNow()))
    __obj.asInstanceOf[OptimizationService]
  }
}

