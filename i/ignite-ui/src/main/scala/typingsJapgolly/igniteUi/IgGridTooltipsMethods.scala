package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridTooltipsMethods extends js.Object {
  /**
  	 * Destroys the tooltip widget.
  	 */
  def destroy(): Unit
  /**
  	 * Returns the ID of the parent div element bounding the ruler and the tooltip container
  	 */
  def id(): String
}

object IgGridTooltipsMethods {
  @scala.inline
  def apply(destroy: Callback, id: CallbackTo[String]): IgGridTooltipsMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("id")(id.toJsFn)
    __obj.asInstanceOf[IgGridTooltipsMethods]
  }
}

