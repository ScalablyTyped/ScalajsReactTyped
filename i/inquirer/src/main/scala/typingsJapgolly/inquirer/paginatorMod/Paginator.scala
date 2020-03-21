package typingsJapgolly.inquirer.paginatorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the functionality to draw paginated content using a `ScreenManager`.
  */
trait Paginator extends js.Object {
  /**
    * Gets or sets the index of the last focused line.
    */
  var lastIndex: Double
  /**
    * Gets or sets the index of the currently focused line.
    */
  var pointer: Double
  /**
    * Gets or sets an object for drawing the paginated content.
    */
  var screen: typingsJapgolly.inquirer.screenManagerMod.^
  /**
    * Paginates the specified `content`.
    *
    * @param content
    * The content to paginate.
    *
    * @param selectedIndex
    * The number of the selected line.
    *
    * @returns
    * The paginated content.
    */
  def paginate(content: String, selectedIndex: Double): String
}

object Paginator {
  @scala.inline
  def apply(
    lastIndex: Double,
    paginate: (String, Double) => CallbackTo[String],
    pointer: Double,
    screen: typingsJapgolly.inquirer.screenManagerMod.^
  ): Paginator = {
    val __obj = js.Dynamic.literal(lastIndex = lastIndex.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any])
    __obj.updateDynamic("paginate")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => paginate(t0, t1).runNow()))
    __obj.asInstanceOf[Paginator]
  }
}

