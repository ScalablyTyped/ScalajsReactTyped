package typingsJapgolly.appletvjs.AppleTVJS

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyboard extends js.Object {
  /** The text inside of a searchField or textField element. */
  var text: String
  /**
  		 * A callback function that is called when the text inside
  		 * of searchField or textField element changes.
  		 * */
  def onTextChange(): Unit
}

object Keyboard {
  @scala.inline
  def apply(onTextChange: Callback, text: String): Keyboard = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("onTextChange")(onTextChange.toJsFn)
    __obj.asInstanceOf[Keyboard]
  }
}

