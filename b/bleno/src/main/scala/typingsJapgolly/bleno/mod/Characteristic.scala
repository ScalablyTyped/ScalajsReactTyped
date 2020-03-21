package typingsJapgolly.bleno.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Characteristic extends js.Object {
  val RESULT_ATTR_NOT_LONG: Double
  val RESULT_INVALID_ATTRIBUTE_LENGTH: Double
  val RESULT_INVALID_OFFSET: Double
  val RESULT_SUCCESS: Double
  val RESULT_UNLIKELY_ERROR: Double
  var descriptors: js.Array[Descriptor]
  var properties: js.Array[Property]
  var secure: js.Array[Property]
  var uuid: String
  var value: Buffer | Null
  def onIndicate(): Unit
  def onNotify(): Unit
  def onReadRequest(offset: Double, callback: js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]): Unit
  def onSubscribe(maxValueSize: Double, updateValueCallback: js.Any): Unit
  def onUnsubscribe(): Unit
  def onWriteRequest(
    data: Buffer,
    offset: Double,
    withoutResponse: Boolean,
    callback: js.Function1[/* result */ Double, Unit]
  ): Unit
}

object Characteristic {
  @scala.inline
  def apply(
    RESULT_ATTR_NOT_LONG: Double,
    RESULT_INVALID_ATTRIBUTE_LENGTH: Double,
    RESULT_INVALID_OFFSET: Double,
    RESULT_SUCCESS: Double,
    RESULT_UNLIKELY_ERROR: Double,
    descriptors: js.Array[Descriptor],
    onIndicate: Callback,
    onNotify: Callback,
    onReadRequest: (Double, js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Callback,
    onSubscribe: (Double, js.Any) => Callback,
    onUnsubscribe: Callback,
    onWriteRequest: (Buffer, Double, Boolean, js.Function1[/* result */ Double, Unit]) => Callback,
    properties: js.Array[Property],
    secure: js.Array[Property],
    uuid: String,
    value: Buffer = null
  ): Characteristic = {
    val __obj = js.Dynamic.literal(RESULT_ATTR_NOT_LONG = RESULT_ATTR_NOT_LONG.asInstanceOf[js.Any], RESULT_INVALID_ATTRIBUTE_LENGTH = RESULT_INVALID_ATTRIBUTE_LENGTH.asInstanceOf[js.Any], RESULT_INVALID_OFFSET = RESULT_INVALID_OFFSET.asInstanceOf[js.Any], RESULT_SUCCESS = RESULT_SUCCESS.asInstanceOf[js.Any], RESULT_UNLIKELY_ERROR = RESULT_UNLIKELY_ERROR.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("onIndicate")(onIndicate.toJsFn)
    __obj.updateDynamic("onNotify")(onNotify.toJsFn)
    __obj.updateDynamic("onReadRequest")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function2[
  /* result */ scala.Double, 
  /* data */ js.UndefOr[typingsJapgolly.node.Buffer], 
  scala.Unit]) => onReadRequest(t0, t1).runNow()))
    __obj.updateDynamic("onSubscribe")(js.Any.fromFunction2((t0: scala.Double, t1: js.Any) => onSubscribe(t0, t1).runNow()))
    __obj.updateDynamic("onUnsubscribe")(onUnsubscribe.toJsFn)
    __obj.updateDynamic("onWriteRequest")(js.Any.fromFunction4((t0: typingsJapgolly.node.Buffer, t1: scala.Double, t2: scala.Boolean, t3: js.Function1[/* result */ scala.Double, scala.Unit]) => onWriteRequest(t0, t1, t2, t3).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Characteristic]
  }
}

