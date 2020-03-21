package typingsJapgolly.phosphorKeyboard.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyboardLayout extends js.Object {
  /**
    * The human readable name of the layout.
    *
    * This value is used primarily for display and debugging purposes.
    */
  val name: String
  /**
    * Test whether the given key is a valid value for the layout.
    *
    * @param key - The user provided key to test for validity.
    *
    * @returns `true` if the key is valid, `false` otherwise.
    */
  def isValidKey(key: String): Boolean
  /**
    * Get the key for a `'keydown'` event.
    *
    * @param event - The event object for a `'keydown'` event.
    *
    * @returns The associated key value, or an empty string if the event
    *   does not represent a valid primary key.
    */
  def keyForKeydownEvent(event: KeyboardEvent): String
  /**
    * Get an array of all key values supported by the layout.
    *
    * @returns A new array of the supported key values.
    *
    * #### Notes
    * This can be useful for authoring tools and debugging, when it's
    * necessary to know which keys are available for shortcut use.
    */
  def keys(): js.Array[String]
}

object IKeyboardLayout {
  @scala.inline
  def apply(
    isValidKey: String => CallbackTo[Boolean],
    keyForKeydownEvent: KeyboardEvent => CallbackTo[String],
    keys: CallbackTo[js.Array[String]],
    name: String
  ): IKeyboardLayout = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("isValidKey")(js.Any.fromFunction1((t0: java.lang.String) => isValidKey(t0).runNow()))
    __obj.updateDynamic("keyForKeydownEvent")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.KeyboardEvent) => keyForKeydownEvent(t0).runNow()))
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.asInstanceOf[IKeyboardLayout]
  }
}

