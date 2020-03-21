package typingsJapgolly.winrt.Windows.Data.Json

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.AnonResultSucceeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonValueStatics extends js.Object {
  def createBooleanValue(input: Boolean): JsonValue
  def createNumberValue(input: Double): JsonValue
  def createStringValue(input: String): JsonValue
  def parse(input: String): JsonValue
  def tryParse(input: String): AnonResultSucceeded
}

object IJsonValueStatics {
  @scala.inline
  def apply(
    createBooleanValue: Boolean => CallbackTo[JsonValue],
    createNumberValue: Double => CallbackTo[JsonValue],
    createStringValue: String => CallbackTo[JsonValue],
    parse: String => CallbackTo[JsonValue],
    tryParse: String => CallbackTo[AnonResultSucceeded]
  ): IJsonValueStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createBooleanValue")(js.Any.fromFunction1((t0: scala.Boolean) => createBooleanValue(t0).runNow()))
    __obj.updateDynamic("createNumberValue")(js.Any.fromFunction1((t0: scala.Double) => createNumberValue(t0).runNow()))
    __obj.updateDynamic("createStringValue")(js.Any.fromFunction1((t0: java.lang.String) => createStringValue(t0).runNow()))
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.updateDynamic("tryParse")(js.Any.fromFunction1((t0: java.lang.String) => tryParse(t0).runNow()))
    __obj.asInstanceOf[IJsonValueStatics]
  }
}

