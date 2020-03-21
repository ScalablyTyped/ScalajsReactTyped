package typingsJapgolly.cypress.mochaMod.reporters

import typingsJapgolly.cypress.Mocha_.IRunner
import typingsJapgolly.cypress.Mocha_.MochaOptions
import typingsJapgolly.cypress.Mocha_.Runner
import typingsJapgolly.cypress.Mocha_.Test_
import typingsJapgolly.cypress.Mocha_.reporters.Base_.ColorMap
import typingsJapgolly.cypress.Mocha_.reporters.Base_.SymbolMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Base` reporter.
  *
  * All other reporters generally inherit from this reporter, providing stats such as test duration,
  * number of tests passed / failed, etc.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Base.html
  */
@JSImport("mocha", "reporters.Base")
@js.native
class Base_ protected ()
  extends typingsJapgolly.cypress.Mocha_.reporters.Base_ {
  /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
  def this(runner: IRunner) = this()
  def this(runner: Runner) = this()
  def this(runner: IRunner, options: MochaOptions) = this()
  def this(runner: Runner, options: MochaOptions) = this()
}

@JSImport("mocha", "reporters.Base")
@js.native
object Base_ extends js.Object {
  /**
    * Default color map
    *
    * @see https://mochajs.org/api/module-base#.colors
    */
  val colors: ColorMap = js.native
  /**
    * Inline diffs instead of +/-
    *
    * @see https://mochajs.org/api/module-base#.inlineDiffs
    */
  var inlineDiffs: Boolean = js.native
  /**
    * Default symbol map
    *
    * @see https://mochajs.org/api/module-base#.symbols
    */
  val symbols: SymbolMap = js.native
  /**
    * Enables coloring by default
    *
    * @see https://mochajs.org/api/module-base#.useColors
    */
  var useColors: Boolean = js.native
  /**
    * Color `str` with the given `type` (from `colors`)
    *
    * @see https://mochajs.org/api/module-base#.color
    */
  def color(`type`: String, str: String): String = js.native
  /**
    * Returns a diff between two strings with colored ANSI output.
    *
    * @see https://mochajs.org/api/module-base#.generateDiff
    */
  def generateDiff(actual: String, expected: String): String = js.native
  /**
    * Output the given `failures` as a list.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.exports.list1
    */
  def list(failures: js.Array[Test_]): Unit = js.native
  /**
    * ANSI TTY control sequences common among reporters.
    *
    * @see https://mochajs.org/api/module-base#.cursor
    */
  @js.native
  object cursor extends js.Object {
    /**
      * Clears the line and moves to the beginning of the line.
      */
    def CR(): Unit = js.native
    /**
      * Moves to the beginning of the line
      */
    def beginningOfLine(): Unit = js.native
    /**
      * Deletes the current line
      */
    def deleteLine(): Unit = js.native
    /**
      * Hides the cursor
      */
    def hide(): Unit = js.native
    /**
      * Shows the cursor
      */
    def show(): Unit = js.native
  }
  
  /**
    * Expose terminal window size
    *
    * @see https://mochajs.org/api/module-base#.window
    */
  @js.native
  object window extends js.Object {
    var width: Double = js.native
  }
  
}

