package typingsJapgolly.iabVpaid

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.iabVpaid.iab.vpaid.VpaidCreative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  /** VPAID entry point */
  var getVPAIDAd: js.UndefOr[js.Function0[VpaidCreative]] = js.undefined
}

object Window {
  @scala.inline
  def apply(getVPAIDAd: js.UndefOr[CallbackTo[VpaidCreative]] = js.undefined): Window = {
    val __obj = js.Dynamic.literal()
    getVPAIDAd.foreach(p => __obj.updateDynamic("getVPAIDAd")(p.toJsFn))
    __obj.asInstanceOf[Window]
  }
}

