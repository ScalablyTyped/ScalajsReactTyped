package typingsJapgolly.mapboxMapboxSdk.staticMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticMapService extends js.Object {
  /**
    * Get a static map image..
    * @param request
    */
  def getStaticImage(request: StaticMapRequest): MapiRequest
}

object StaticMapService {
  @scala.inline
  def apply(getStaticImage: StaticMapRequest => CallbackTo[MapiRequest]): StaticMapService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStaticImage")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.staticMod.StaticMapRequest) => getStaticImage(t0).runNow()))
    __obj.asInstanceOf[StaticMapService]
  }
}

