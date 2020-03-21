package typingsJapgolly.getValue.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The default value to return when get-value cannot result a value from the given object.
    *
    * default: `undefined`
    */
  var default: js.UndefOr[js.Any] = js.undefined
  /**
    * If defined, this function is called on each resolved value.
    * Useful if you want to do `.hasOwnProperty` or `Object.prototype.propertyIsEnumerable`.
    */
  var isValid: js.UndefOr[js.Function2[/* key */ String, /* object */ Record[String, _], Boolean]] = js.undefined
  /**
    * Customize how the object path is created when iterating over path segments.
    *
    * default: `Array.join`
    */
  var join: js.UndefOr[js.Function1[/* segs */ js.Array[String], String]] = js.undefined
  /**
    * The character to use when re-joining the string to check for keys
    * with dots in them (this is probably not needed when `options.join` is used).
    * This can be a different value than the separator, since the separator can be a string or regex.
    *
    * default: `"."`
    */
  var joinChar: js.UndefOr[String] = js.undefined
  /**
    * The separator to use for spliting the string.
    * (this is probably not needed when `options.split` is used).
    *
    *  default: `"."`
    */
  var separator: js.UndefOr[String | js.RegExp] = js.undefined
  /**
    * Custom function to use for splitting the string into object path segments.
    *
    * default: `String.split`
    */
  var split: js.UndefOr[js.Function1[/* s */ String, js.Array[String]]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    default: js.Any = null,
    isValid: (/* key */ String, /* object */ Record[String, js.Any]) => CallbackTo[Boolean] = null,
    join: /* segs */ js.Array[String] => CallbackTo[String] = null,
    joinChar: String = null,
    separator: String | js.RegExp = null,
    split: /* s */ String => CallbackTo[js.Array[String]] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (isValid != null) __obj.updateDynamic("isValid")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* object */ typingsJapgolly.std.Record[java.lang.String, js.Any]) => isValid(t0, t1).runNow()))
    if (join != null) __obj.updateDynamic("join")(js.Any.fromFunction1((t0: /* segs */ js.Array[java.lang.String]) => join(t0).runNow()))
    if (joinChar != null) __obj.updateDynamic("joinChar")(joinChar.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(js.Any.fromFunction1((t0: /* s */ java.lang.String) => split(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

