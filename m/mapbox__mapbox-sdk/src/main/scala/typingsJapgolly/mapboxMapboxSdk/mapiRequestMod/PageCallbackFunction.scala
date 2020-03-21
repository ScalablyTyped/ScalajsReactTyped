package typingsJapgolly.mapboxMapboxSdk.mapiRequestMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.mapboxMapboxSdk.mapiErrorMod.MapiError
import typingsJapgolly.mapboxMapboxSdk.mapiResponseMod.MapiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageCallbackFunction extends js.Object {
  var error: MapiError
  var response: MapiResponse
  def next(): Unit
}

object PageCallbackFunction {
  @scala.inline
  def apply(error: MapiError, next: Callback, response: MapiResponse): PageCallbackFunction = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[PageCallbackFunction]
  }
}

