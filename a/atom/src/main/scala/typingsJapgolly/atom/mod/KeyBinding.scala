package typingsJapgolly.atom.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyBinding extends js.Object {
  var command: String
  // Properties
  var enabled: Boolean
  var keystrokeArray: js.Array[String]
  var keystrokeCount: Double
  var keystrokes: String
  var selector: String
  var source: String
  var specificity: Double
  /**
    *  Compare another KeyBinding to this instance.
    *  Returns <= -1 if the argument is considered lesser or of lower priority.
    *  Returns 0 if this binding is equivalent to the argument.
    *  Returns >= 1 if the argument is considered greater or of higher priority.
    */
  def compare(other: KeyBinding): Double
  // Comparison
  /** Determines whether the given keystroke matches any contained within this binding. */
  def matches(keystroke: String): Boolean
}

object KeyBinding {
  @scala.inline
  def apply(
    command: String,
    compare: KeyBinding => CallbackTo[Double],
    enabled: Boolean,
    keystrokeArray: js.Array[String],
    keystrokeCount: Double,
    keystrokes: String,
    matches: String => CallbackTo[Boolean],
    selector: String,
    source: String,
    specificity: Double
  ): KeyBinding = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], keystrokeArray = keystrokeArray.asInstanceOf[js.Any], keystrokeCount = keystrokeCount.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
    __obj.updateDynamic("compare")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.KeyBinding) => compare(t0).runNow()))
    __obj.updateDynamic("matches")(js.Any.fromFunction1((t0: java.lang.String) => matches(t0).runNow()))
    __obj.asInstanceOf[KeyBinding]
  }
}

