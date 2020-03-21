package typingsJapgolly.fridaGum.Java

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fridaGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /**
    * Size in bytes.
    */
  var byteSize: Double
  /**
    * Class name, if applicable.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Converts `value` from a JNI value to a JavaScript value.
    */
  var fromJni: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  /**
    * VM type name. For example `I` for `int`.
    */
  var name: String
  /**
    * Reads a value from memory.
    */
  var read: js.UndefOr[js.Function1[/* address */ NativePointerValue, _]] = js.undefined
  /**
    * Size in words.
    */
  var size: Double
  /**
    * Converts `value` from a JavaScript value to a JNI value.
    */
  var toJni: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  /**
    * Frida type name. For example `pointer` for a handle.
    */
  var `type`: String
  /**
    * Writes a value to memory.
    */
  var write: js.UndefOr[js.Function2[/* address */ NativePointerValue, /* value */ js.Any, Unit]] = js.undefined
  /**
    * Checks whether a given JavaScript `value` is compatible.
    */
  def isCompatible(value: js.Any): Boolean
}

object Type {
  @scala.inline
  def apply(
    byteSize: Double,
    isCompatible: js.Any => CallbackTo[Boolean],
    name: String,
    size: Double,
    `type`: String,
    className: String = null,
    fromJni: /* value */ js.Any => CallbackTo[js.Any] = null,
    read: /* address */ NativePointerValue => CallbackTo[js.Any] = null,
    toJni: /* value */ js.Any => CallbackTo[js.Any] = null,
    write: (/* address */ NativePointerValue, /* value */ js.Any) => Callback = null
  ): Type = {
    val __obj = js.Dynamic.literal(byteSize = byteSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("isCompatible")(js.Any.fromFunction1((t0: js.Any) => isCompatible(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (fromJni != null) __obj.updateDynamic("fromJni")(js.Any.fromFunction1((t0: /* value */ js.Any) => fromJni(t0).runNow()))
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction1((t0: /* address */ typingsJapgolly.fridaGum.NativePointerValue) => read(t0).runNow()))
    if (toJni != null) __obj.updateDynamic("toJni")(js.Any.fromFunction1((t0: /* value */ js.Any) => toJni(t0).runNow()))
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction2((t0: /* address */ typingsJapgolly.fridaGum.NativePointerValue, t1: /* value */ js.Any) => write(t0, t1).runNow()))
    __obj.asInstanceOf[Type]
  }
}

