package typingsJapgolly.mapboxMapboxSdk.tilequeryMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileQueryService extends js.Object {
  /**
    * Get a static map image..
    * @param request
    */
  def listFeatures(request: TileQueryRequest): MapiRequest
}

object TileQueryService {
  @scala.inline
  def apply(listFeatures: TileQueryRequest => CallbackTo[MapiRequest]): TileQueryService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("listFeatures")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.tilequeryMod.TileQueryRequest) => listFeatures(t0).runNow()))
    __obj.asInstanceOf[TileQueryService]
  }
}

