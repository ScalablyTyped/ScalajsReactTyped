package typingsJapgolly.mocha

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcursor extends js.Object {
  /**
    * Clears the line and moves to the beginning of the line.
    */
  def CR(): Unit
  /**
    * Moves to the beginning of the line
    */
  def beginningOfLine(): Unit
  /**
    * Deletes the current line
    */
  def deleteLine(): Unit
  /**
    * Hides the cursor
    */
  def hide(): Unit
  /**
    * Shows the cursor
    */
  def show(): Unit
}

object Typeofcursor {
  @scala.inline
  def apply(CR: Callback, beginningOfLine: Callback, deleteLine: Callback, hide: Callback, show: Callback): Typeofcursor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CR")(CR.toJsFn)
    __obj.updateDynamic("beginningOfLine")(beginningOfLine.toJsFn)
    __obj.updateDynamic("deleteLine")(deleteLine.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[Typeofcursor]
  }
}

