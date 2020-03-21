package typingsJapgolly.amapJsApiOverview.AMap.OverView

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApiOverview.amapJsApiOverviewStrings.close
import typingsJapgolly.amapJsApiOverview.amapJsApiOverviewStrings.hide
import typingsJapgolly.amapJsApiOverview.amapJsApiOverviewStrings.open
import typingsJapgolly.amapJsApiOverview.amapJsApiOverviewStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var close: Event_[
    typingsJapgolly.amapJsApiOverview.amapJsApiOverviewStrings.close, 
    js.UndefOr[scala.Nothing]
  ]
  var hide: Event_[
    typingsJapgolly.amapJsApiOverview.amapJsApiOverviewStrings.hide, 
    js.UndefOr[scala.Nothing]
  ]
  var open: Event_[
    typingsJapgolly.amapJsApiOverview.amapJsApiOverviewStrings.open, 
    js.UndefOr[scala.Nothing]
  ]
  var show: Event_[
    typingsJapgolly.amapJsApiOverview.amapJsApiOverviewStrings.show, 
    js.UndefOr[scala.Nothing]
  ]
}

object EventMap {
  @scala.inline
  def apply(
    close: Event_[close, js.UndefOr[scala.Nothing]],
    hide: Event_[hide, js.UndefOr[scala.Nothing]],
    open: Event_[open, js.UndefOr[scala.Nothing]],
    show: Event_[show, js.UndefOr[scala.Nothing]]
  ): EventMap = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

