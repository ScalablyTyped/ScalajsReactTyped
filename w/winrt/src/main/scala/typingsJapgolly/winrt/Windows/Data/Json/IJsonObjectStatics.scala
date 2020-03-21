package typingsJapgolly.winrt.Windows.Data.Json

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.AnonSucceeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonObjectStatics extends js.Object {
  def parse(input: String): JsonObject
  def tryParse(input: String): AnonSucceeded
}

object IJsonObjectStatics {
  @scala.inline
  def apply(parse: String => CallbackTo[JsonObject], tryParse: String => CallbackTo[AnonSucceeded]): IJsonObjectStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.updateDynamic("tryParse")(js.Any.fromFunction1((t0: java.lang.String) => tryParse(t0).runNow()))
    __obj.asInstanceOf[IJsonObjectStatics]
  }
}

