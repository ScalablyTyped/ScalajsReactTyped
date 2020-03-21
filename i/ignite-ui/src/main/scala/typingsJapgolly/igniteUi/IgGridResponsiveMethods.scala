package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridResponsiveMethods extends js.Object {
  /**
  	 * Destroys the responsive widget.
  	 */
  def destroy(): Unit
  /**
  	 * Returns the currently active responsive mode.
  	 */
  def getCurrentResponsiveMode(): Unit
}

object IgGridResponsiveMethods {
  @scala.inline
  def apply(destroy: Callback, getCurrentResponsiveMode: Callback): IgGridResponsiveMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getCurrentResponsiveMode")(getCurrentResponsiveMode.toJsFn)
    __obj.asInstanceOf[IgGridResponsiveMethods]
  }
}

