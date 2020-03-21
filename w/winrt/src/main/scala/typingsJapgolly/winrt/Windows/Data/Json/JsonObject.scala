package typingsJapgolly.winrt.Windows.Data.Json

import typingsJapgolly.winrt.AnonSucceeded
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Json.JsonObject")
@js.native
class JsonObject ()
  extends IJsonObject
     with IMap[String, IJsonValue] {
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override var valueType: JsonValueType = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, IJsonValue]] = js.native
  /* CompleteClass */
  override def getArray(): JsonArray = js.native
  /* CompleteClass */
  override def getBoolean(): Boolean = js.native
  /* CompleteClass */
  override def getNamedArray(name: String): JsonArray = js.native
  /* CompleteClass */
  override def getNamedBoolean(name: String): Boolean = js.native
  /* CompleteClass */
  override def getNamedNumber(name: String): Double = js.native
  /* CompleteClass */
  override def getNamedObject(name: String): JsonObject = js.native
  /* CompleteClass */
  override def getNamedString(name: String): String = js.native
  /* CompleteClass */
  override def getNamedValue(name: String): JsonValue = js.native
  /* CompleteClass */
  override def getNumber(): Double = js.native
  /* CompleteClass */
  override def getObject(): JsonObject = js.native
  /* CompleteClass */
  override def getString(): String = js.native
  /* CompleteClass */
  override def getView(): IMapView[String, IJsonValue] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def insert(key: String, value: IJsonValue): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): IJsonValue = js.native
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
  /* CompleteClass */
  override def setNamedValue(name: String, value: IJsonValue): Unit = js.native
  /* CompleteClass */
  override def stringify(): String = js.native
}

/* static members */
@JSGlobal("Windows.Data.Json.JsonObject")
@js.native
object JsonObject extends js.Object {
  def parse(input: String): JsonObject = js.native
  def tryParse(input: String): AnonSucceeded = js.native
}

