package typingsJapgolly.mapboxMapboxSdk.matrixMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatrixService extends js.Object {
  /**
    * Get a duration and/or distance matrix showing travel times and distances between coordinates.
    * @param request
    */
  def getMatrix(request: MatrixRequest): MapiRequest
}

object MatrixService {
  @scala.inline
  def apply(getMatrix: MatrixRequest => CallbackTo[MapiRequest]): MatrixService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMatrix")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.matrixMod.MatrixRequest) => getMatrix(t0).runNow()))
    __obj.asInstanceOf[MatrixService]
  }
}

