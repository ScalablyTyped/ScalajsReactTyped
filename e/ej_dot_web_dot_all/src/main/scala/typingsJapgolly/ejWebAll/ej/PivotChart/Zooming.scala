package typingsJapgolly.ejWebAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zooming extends js.Object {
  /** Enables or disables the horizontal scrollbar.
    * @Default {false}
    */
  var enableScrollbar: js.UndefOr[Boolean] = js.undefined
}

object Zooming {
  @scala.inline
  def apply(enableScrollbar: js.UndefOr[Boolean] = js.undefined): Zooming = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableScrollbar)) __obj.updateDynamic("enableScrollbar")(enableScrollbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zooming]
  }
}

