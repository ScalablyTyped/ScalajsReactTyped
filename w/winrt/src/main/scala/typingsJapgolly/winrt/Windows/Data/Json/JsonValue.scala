package typingsJapgolly.winrt.Windows.Data.Json

import typingsJapgolly.winrt.AnonResultSucceeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Json.JsonValue")
@js.native
class JsonValue () extends IJsonValue {
  /* CompleteClass */
  override var valueType: JsonValueType = js.native
  /* CompleteClass */
  override def getArray(): JsonArray = js.native
  /* CompleteClass */
  override def getBoolean(): Boolean = js.native
  /* CompleteClass */
  override def getNumber(): Double = js.native
  /* CompleteClass */
  override def getObject(): JsonObject = js.native
  /* CompleteClass */
  override def getString(): String = js.native
  /* CompleteClass */
  override def stringify(): String = js.native
}

/* static members */
@JSGlobal("Windows.Data.Json.JsonValue")
@js.native
object JsonValue extends js.Object {
  def createBooleanValue(input: Boolean): JsonValue = js.native
  def createNumberValue(input: Double): JsonValue = js.native
  def createStringValue(input: String): JsonValue = js.native
  def parse(input: String): JsonValue = js.native
  def tryParse(input: String): AnonResultSucceeded = js.native
}

