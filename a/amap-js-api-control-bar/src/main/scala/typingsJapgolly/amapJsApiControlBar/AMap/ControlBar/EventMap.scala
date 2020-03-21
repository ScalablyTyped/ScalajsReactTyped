package typingsJapgolly.amapJsApiControlBar.AMap.ControlBar

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApiControlBar.amapJsApiControlBarStrings.hide
import typingsJapgolly.amapJsApiControlBar.amapJsApiControlBarStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var hide: Event_[
    typingsJapgolly.amapJsApiControlBar.amapJsApiControlBarStrings.hide, 
    js.UndefOr[scala.Nothing]
  ]
  var show: Event_[
    typingsJapgolly.amapJsApiControlBar.amapJsApiControlBarStrings.show, 
    js.UndefOr[scala.Nothing]
  ]
}

object EventMap {
  @scala.inline
  def apply(hide: Event_[hide, js.UndefOr[scala.Nothing]], show: Event_[show, js.UndefOr[scala.Nothing]]): EventMap = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

