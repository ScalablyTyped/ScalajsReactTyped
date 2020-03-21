package typingsJapgolly.cypress

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cypress.Mocha_.Test_
import typingsJapgolly.cypress.Mocha_.reporters.Base_.ColorMap
import typingsJapgolly.cypress.Mocha_.reporters.Base_.SymbolMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofBase extends js.Object {
  /**
    * Default color map
    *
    * @see https://mochajs.org/api/module-base#.colors
    */
  val colors: ColorMap
  /**
    * ANSI TTY control sequences common among reporters.
    *
    * @see https://mochajs.org/api/module-base#.cursor
    */
  val cursor: Typeofcursor
  /**
    * Inline diffs instead of +/-
    *
    * @see https://mochajs.org/api/module-base#.inlineDiffs
    */
  var inlineDiffs: Boolean
  /**
    * Default symbol map
    *
    * @see https://mochajs.org/api/module-base#.symbols
    */
  val symbols: SymbolMap
  /**
    * Enables coloring by default
    *
    * @see https://mochajs.org/api/module-base#.useColors
    */
  var useColors: Boolean
  /**
    * Expose terminal window size
    *
    * @see https://mochajs.org/api/module-base#.window
    */
  val window: AnonWidth
  /**
    * Color `str` with the given `type` (from `colors`)
    *
    * @see https://mochajs.org/api/module-base#.color
    */
  def color(`type`: String, str: String): String
  /**
    * Returns a diff between two strings with colored ANSI output.
    *
    * @see https://mochajs.org/api/module-base#.generateDiff
    */
  def generateDiff(actual: String, expected: String): String
  /**
    * Output the given `failures` as a list.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.exports.list1
    */
  def list(failures: js.Array[Test_]): Unit
}

object TypeofBase {
  @scala.inline
  def apply(
    color: (String, String) => CallbackTo[String],
    colors: ColorMap,
    cursor: Typeofcursor,
    generateDiff: (String, String) => CallbackTo[String],
    inlineDiffs: Boolean,
    list: js.Array[Test_] => Callback,
    symbols: SymbolMap,
    useColors: Boolean,
    window: AnonWidth
  ): TypeofBase = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], inlineDiffs = inlineDiffs.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], useColors = useColors.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("color")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => color(t0, t1).runNow()))
    __obj.updateDynamic("generateDiff")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => generateDiff(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.cypress.Mocha_.Test_]) => list(t0).runNow()))
    __obj.asInstanceOf[TypeofBase]
  }
}

