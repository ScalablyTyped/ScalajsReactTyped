package typingsJapgolly.winrtUwp.Windows.Globalization.NumberFormatting

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface that returns rounded results for provided numbers of several data types. */
trait INumberRounder extends js.Object {
  /**
    * Rounds a Double number.
    * @param value The Double value to be rounded.
    * @return The rounded number. This result is a double precision floating point number, which is not necessarily an integer.
    */
  def roundDouble(value: Double): Double
  /**
    * Rounds an Int32 number.
    * @param value The Int32 value to be rounded.
    * @return The rounded 32 bit integer.
    */
  def roundInt32(value: Double): Double
  /**
    * Rounds an Int64 number.
    * @param value The Int64 value to be rounded.
    * @return The rounded 64 bit integer.
    */
  def roundInt64(value: Double): Double
  /**
    * Rounds a Single number.
    * @param value The Single value to be rounded.
    * @return The rounded number. This result is a single precision floating point number, which is not necessarily an integer.
    */
  def roundSingle(value: Double): Double
  /**
    * Rounds a UInt32 number.
    * @param value The UInt32 value to be rounded.
    * @return The rounded unsigned 32 bit integer.
    */
  def roundUInt32(value: Double): Double
  /**
    * Rounds a UInt64 number.
    * @param value The UInt64 value to be rounded.
    * @return The rounded unsigned 64 bit integer.
    */
  def roundUInt64(value: Double): Double
}

object INumberRounder {
  @scala.inline
  def apply(
    roundDouble: Double => CallbackTo[Double],
    roundInt32: Double => CallbackTo[Double],
    roundInt64: Double => CallbackTo[Double],
    roundSingle: Double => CallbackTo[Double],
    roundUInt32: Double => CallbackTo[Double],
    roundUInt64: Double => CallbackTo[Double]
  ): INumberRounder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("roundDouble")(js.Any.fromFunction1((t0: scala.Double) => roundDouble(t0).runNow()))
    __obj.updateDynamic("roundInt32")(js.Any.fromFunction1((t0: scala.Double) => roundInt32(t0).runNow()))
    __obj.updateDynamic("roundInt64")(js.Any.fromFunction1((t0: scala.Double) => roundInt64(t0).runNow()))
    __obj.updateDynamic("roundSingle")(js.Any.fromFunction1((t0: scala.Double) => roundSingle(t0).runNow()))
    __obj.updateDynamic("roundUInt32")(js.Any.fromFunction1((t0: scala.Double) => roundUInt32(t0).runNow()))
    __obj.updateDynamic("roundUInt64")(js.Any.fromFunction1((t0: scala.Double) => roundUInt64(t0).runNow()))
    __obj.asInstanceOf[INumberRounder]
  }
}

