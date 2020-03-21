package typingsJapgolly.angularUiRouter.mod.angularAugmentingMod.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IType extends js.Object {
  /**
    * Determines whether two decoded values are equivalent.
    *
    * @param a {any} A value to compare against.
    * @param b {any} A value to compare against.
    *
    * @returns {boolean} Returns true if the values are equivalent/equal, otherwise false.
    */
  @JSName("equals")
  var equals_FIType: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]] = js.undefined
  /**
    * The regular expression pattern used to match values of this type when coming from a substring of a URL.
    */
  var pattern: js.UndefOr[js.RegExp] = js.undefined
  /**
    * Converts a parameter value (from URL string or transition param) to a custom/native value.
    *
    * @param val {string} The URL parameter value to decode.
    * @param key {string} The name of the parameter in which val is stored. Can be used for meta-programming of Type objects.
    *
    * @returns {any} Returns a custom representation of the URL parameter value.
    */
  def decode(`val`: String, key: String): js.Any
  /**
    * Encodes a custom/native type value to a string that can be embedded in a URL. Note that the return value does not need to be URL-safe (i.e. passed through encodeURIComponent()), it only needs to be a representation of val that has been coerced to a string.
    *
    * @param val {any} The value to encode.
    * @param key {string} The name of the parameter in which val is stored. Can be used for meta-programming of Type objects.
    *
    * @returns {string} Returns a string representation of val that can be encoded in a URL.
    */
  def encode(`val`: js.Any, key: String): String
  /**
    * Detects whether a value is of a particular type. Accepts a native (decoded) value and determines whether it matches the current Type object.
    *
    * @param val {any} The value to check.
    * @param key {any} Optional. If the type check is happening in the context of a specific UrlMatcher object, this is the name of the parameter in which val is stored. Can be used for meta-programming of Type objects.
    *
    * @returns {boolean} Returns true if the value matches the type, otherwise false.
    */
  def is(`val`: js.Any, key: String): Boolean
}

object IType {
  @scala.inline
  def apply(
    decode: (String, String) => CallbackTo[js.Any],
    encode: (js.Any, String) => CallbackTo[String],
    is: (js.Any, String) => CallbackTo[Boolean],
    equals: (/* a */ js.Any, /* b */ js.Any) => CallbackTo[Boolean] = null,
    pattern: js.RegExp = null
  ): IType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => decode(t0, t1).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => encode(t0, t1).runNow()))
    __obj.updateDynamic("is")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => is(t0, t1).runNow()))
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction2((t0: /* a */ js.Any, t1: /* b */ js.Any) => equals(t0, t1).runNow()))
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IType]
  }
}

