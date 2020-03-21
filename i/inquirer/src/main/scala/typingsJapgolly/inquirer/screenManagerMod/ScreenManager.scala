package typingsJapgolly.inquirer.screenManagerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the functionality to manage the content of a console-screen.
  */
trait ScreenManager extends js.Object {
  /**
    * Gets or sets the number of extra-lines below the prompt.
    */
  var extraLinesUnderPrompt: Double
  /**
    * Gets or sets the height of the screen.
    */
  var height: Double
  /**
    * Gets or sets an object for performing read from and write to the console.
    */
  var rl: Interface
  /**
    * Splits the `text` into multiple lines with the specified max `width`.
    *
    * @param text
    * The text to process.
    *
    * @param width
    * The max width of each line.
    */
  /* protected */ def breakLines(text: String, width: Double): js.Array[String]
  /**
    * Cleans all lines expect the first `extraLines`.
    *
    * @param extraLines
    * The number of lines at the begin to skip.
    */
  def clean(extraLines: Double): Unit
  /**
    * Releases all unmanaged resources.
    */
  def done(): Unit
  /**
    * Adds line-breaks to the specified `text` with the specified max `width`.
    *
    * @param text
    * The text to process.
    *
    * @param width
    * The max width of each line.
    */
  /* protected */ def forceLineReturn(text: String, width: Double): String
  /**
    * Identifies the width of the screen.
    *
    * @returns
    * The width of the screen.
    */
  /* protected */ def normalizedCliWidth(): Double
  /**
    * Releases the cursor.
    */
  def releaseCursor(): Unit
  /**
    * Renders content to the screen.
    *
    * @param content
    * The content to render.
    *
    * @param bottomContent
    * The content to render to the bottom of the screen.
    */
  def render(content: String, bottomContent: String): Unit
}

object ScreenManager {
  @scala.inline
  def apply(
    breakLines: (String, Double) => CallbackTo[js.Array[String]],
    clean: Double => Callback,
    done: Callback,
    extraLinesUnderPrompt: Double,
    forceLineReturn: (String, Double) => CallbackTo[String],
    height: Double,
    normalizedCliWidth: CallbackTo[Double],
    releaseCursor: Callback,
    render: (String, String) => Callback,
    rl: Interface
  ): ScreenManager = {
    val __obj = js.Dynamic.literal(extraLinesUnderPrompt = extraLinesUnderPrompt.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rl = rl.asInstanceOf[js.Any])
    __obj.updateDynamic("breakLines")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => breakLines(t0, t1).runNow()))
    __obj.updateDynamic("clean")(js.Any.fromFunction1((t0: scala.Double) => clean(t0).runNow()))
    __obj.updateDynamic("done")(done.toJsFn)
    __obj.updateDynamic("forceLineReturn")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => forceLineReturn(t0, t1).runNow()))
    __obj.updateDynamic("normalizedCliWidth")(normalizedCliWidth.toJsFn)
    __obj.updateDynamic("releaseCursor")(releaseCursor.toJsFn)
    __obj.updateDynamic("render")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => render(t0, t1).runNow()))
    __obj.asInstanceOf[ScreenManager]
  }
}

