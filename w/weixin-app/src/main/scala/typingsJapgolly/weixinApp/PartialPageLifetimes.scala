package typingsJapgolly.weixinApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<weixin-app.wx.PageLifetimes> */
trait PartialPageLifetimes extends js.Object {
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var show: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PartialPageLifetimes {
  @scala.inline
  def apply(hide: js.UndefOr[Callback] = js.undefined, show: js.UndefOr[Callback] = js.undefined): PartialPageLifetimes = {
    val __obj = js.Dynamic.literal()
    hide.foreach(p => __obj.updateDynamic("hide")(p.toJsFn))
    show.foreach(p => __obj.updateDynamic("show")(p.toJsFn))
    __obj.asInstanceOf[PartialPageLifetimes]
  }
}

