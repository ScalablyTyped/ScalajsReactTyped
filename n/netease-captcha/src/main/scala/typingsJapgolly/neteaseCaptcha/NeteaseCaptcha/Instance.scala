package typingsJapgolly.neteaseCaptcha.NeteaseCaptcha

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /**
    * Available when the mode is set to 'popup' - opens the popup to accept verification
    */
  var popUp: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Destroy the current instance
    */
  def destroy(): Unit
  /**
    * Refresh the instance to get new verification information
    */
  def refresh(): Unit
}

object Instance {
  @scala.inline
  def apply(destroy: Callback, refresh: Callback, popUp: js.UndefOr[Callback] = js.undefined): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    popUp.foreach(p => __obj.updateDynamic("popUp")(p.toJsFn))
    __obj.asInstanceOf[Instance]
  }
}

