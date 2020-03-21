package typingsJapgolly.datastoreCore.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.interfaceDatastore.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  /**
    * Forward transform function.
    * @param key Input key.
    * @example
    * // Forward prefix transform
    * const convert = (key: Key) => new Key('/abc').child(key)
    */
  def convert(key: Key): Key
  /**
    * Inverse transform function.
    * @param key Input key.
    * @example
    * // Inverse prefix transform
    * const invert = (key: Key) => Key.withNamespaces(key.list().slice(1))
    */
  def invert(key: Key): Key
}

object Transform {
  @scala.inline
  def apply(convert: Key => CallbackTo[Key], invert: Key => CallbackTo[Key]): Transform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convert")(js.Any.fromFunction1((t0: typingsJapgolly.interfaceDatastore.mod.Key) => convert(t0).runNow()))
    __obj.updateDynamic("invert")(js.Any.fromFunction1((t0: typingsJapgolly.interfaceDatastore.mod.Key) => invert(t0).runNow()))
    __obj.asInstanceOf[Transform]
  }
}

