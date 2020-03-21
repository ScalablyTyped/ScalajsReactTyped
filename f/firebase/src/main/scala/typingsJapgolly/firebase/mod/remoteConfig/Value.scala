package typingsJapgolly.firebase.mod.remoteConfig

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  /**
    * Gets the value as a boolean.
    *
    * The following values (case insensitive) are interpreted as true:
    * "1", "true", "t", "yes", "y", "on". Other values are interpreted as false.
    */
  def asBoolean(): Boolean
  /**
    * Gets the value as a number. Comparable to calling <code>Number(value) || 0</code>.
    */
  def asNumber(): Double
  /**
    * Gets the value as a string.
    */
  def asString(): String
  /**
    * Gets the {@link ValueSource} for the given key.
    */
  def getSource(): ValueSource
}

object Value {
  @scala.inline
  def apply(
    asBoolean: CallbackTo[Boolean],
    asNumber: CallbackTo[Double],
    asString: CallbackTo[String],
    getSource: CallbackTo[ValueSource]
  ): Value = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asBoolean")(asBoolean.toJsFn)
    __obj.updateDynamic("asNumber")(asNumber.toJsFn)
    __obj.updateDynamic("asString")(asString.toJsFn)
    __obj.updateDynamic("getSource")(getSource.toJsFn)
    __obj.asInstanceOf[Value]
  }
}

