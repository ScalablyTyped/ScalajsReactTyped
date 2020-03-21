package typingsJapgolly.winrt.Windows.Data.Json

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.AnonResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonArrayStatics extends js.Object {
  def parse(input: String): JsonArray
  def tryParse(input: String): AnonResult
}

object IJsonArrayStatics {
  @scala.inline
  def apply(parse: String => CallbackTo[JsonArray], tryParse: String => CallbackTo[AnonResult]): IJsonArrayStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.updateDynamic("tryParse")(js.Any.fromFunction1((t0: java.lang.String) => tryParse(t0).runNow()))
    __obj.asInstanceOf[IJsonArrayStatics]
  }
}

