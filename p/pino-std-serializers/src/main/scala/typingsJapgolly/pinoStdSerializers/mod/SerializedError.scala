package typingsJapgolly.pinoStdSerializers.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedError
  extends /* key */ NumberDictionary[js.Any]
     with /**
  * Any other extra properties that have been attached to the object will also be present on the serialized object.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * The supplied error message.
    */
  var message: String
  /**
    * Non-enumerable. The original Error object. This will not be included in the logged output.
    * This is available for subsequent serializers to use.
    */
  var raw: js.Error
  /**
    * The stack when the error was generated.
    */
  var stack: String
  /**
    * The name of the object's constructor.
    */
  var `type`: String
}

object SerializedError {
  @scala.inline
  def apply(
    message: String,
    raw: js.Error,
    stack: String,
    `type`: String,
    NumberDictionary: /* key */ NumberDictionary[js.Any] = null,
    StringDictionary: /**
    * Any other extra properties that have been attached to the object will also be present on the serialized object.
    */
  /* key */ StringDictionary[js.Any] = null
  ): SerializedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SerializedError]
  }
}

