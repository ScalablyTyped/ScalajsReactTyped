package typingsJapgolly.maxmind.decoderMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decoder extends js.Object {
  var baseOffset: js.Any
  var cache: js.Any
  var db: js.Any
  var telemetry: Record[String, _]
  def decode(offset: Double): js.Any
  def decodeArray(size: Double, offset: Double): Cursor
  def decodeBigUint(offset: Double, size: Double): String
  def decodeBoolean(size: Double): Boolean
  def decodeByType(`type`: String, offset: Double, size: Double): Cursor
  def decodeBytes(offset: Double, size: Double): Buffer
  def decodeDouble(offset: Double): Double
  def decodeFast(offset: Double): js.Any
  def decodeFloat(offset: Double): Double
  def decodeInt32(offset: Double, size: Double): Double
  def decodeMap(size: Double, offset: Double): Cursor
  def decodePointer(ctrlByte: Double, offset: Double): Cursor
  def decodeString(offset: Double, size: Double): js.Any
  def decodeUint(offset: Double, size: Double): String | Double
  def sizeFromCtrlByte(ctrlByte: Double, offset: Double): Cursor
}

object Decoder {
  @scala.inline
  def apply(
    baseOffset: js.Any,
    cache: js.Any,
    db: js.Any,
    decode: Double => CallbackTo[js.Any],
    decodeArray: (Double, Double) => CallbackTo[Cursor],
    decodeBigUint: (Double, Double) => CallbackTo[String],
    decodeBoolean: Double => CallbackTo[Boolean],
    decodeByType: (String, Double, Double) => CallbackTo[Cursor],
    decodeBytes: (Double, Double) => CallbackTo[Buffer],
    decodeDouble: Double => CallbackTo[Double],
    decodeFast: Double => CallbackTo[js.Any],
    decodeFloat: Double => CallbackTo[Double],
    decodeInt32: (Double, Double) => CallbackTo[Double],
    decodeMap: (Double, Double) => CallbackTo[Cursor],
    decodePointer: (Double, Double) => CallbackTo[Cursor],
    decodeString: (Double, Double) => CallbackTo[js.Any],
    decodeUint: (Double, Double) => CallbackTo[String | Double],
    sizeFromCtrlByte: (Double, Double) => CallbackTo[Cursor],
    telemetry: Record[String, _]
  ): Decoder = {
    val __obj = js.Dynamic.literal(baseOffset = baseOffset.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], telemetry = telemetry.asInstanceOf[js.Any])
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: scala.Double) => decode(t0).runNow()))
    __obj.updateDynamic("decodeArray")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => decodeArray(t0, t1).runNow()))
    __obj.updateDynamic("decodeBigUint")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => decodeBigUint(t0, t1).runNow()))
    __obj.updateDynamic("decodeBoolean")(js.Any.fromFunction1((t0: scala.Double) => decodeBoolean(t0).runNow()))
    __obj.updateDynamic("decodeByType")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => decodeByType(t0, t1, t2).runNow()))
    __obj.updateDynamic("decodeBytes")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => decodeBytes(t0, t1).runNow()))
    __obj.updateDynamic("decodeDouble")(js.Any.fromFunction1((t0: scala.Double) => decodeDouble(t0).runNow()))
    __obj.updateDynamic("decodeFast")(js.Any.fromFunction1((t0: scala.Double) => decodeFast(t0).runNow()))
    __obj.updateDynamic("decodeFloat")(js.Any.fromFunction1((t0: scala.Double) => decodeFloat(t0).runNow()))
    __obj.updateDynamic("decodeInt32")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => decodeInt32(t0, t1).runNow()))
    __obj.updateDynamic("decodeMap")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => decodeMap(t0, t1).runNow()))
    __obj.updateDynamic("decodePointer")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => decodePointer(t0, t1).runNow()))
    __obj.updateDynamic("decodeString")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => decodeString(t0, t1).runNow()))
    __obj.updateDynamic("decodeUint")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => decodeUint(t0, t1).runNow()))
    __obj.updateDynamic("sizeFromCtrlByte")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => sizeFromCtrlByte(t0, t1).runNow()))
    __obj.asInstanceOf[Decoder]
  }
}

