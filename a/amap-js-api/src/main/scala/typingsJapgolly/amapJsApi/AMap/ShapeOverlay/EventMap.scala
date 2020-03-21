package typingsJapgolly.amapJsApi.AMap.ShapeOverlay

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApi.AMap.MapsEvent
import typingsJapgolly.amapJsApi.AnonTargetI
import typingsJapgolly.amapJsApi.amapJsApiStrings.change
import typingsJapgolly.amapJsApi.amapJsApiStrings.click
import typingsJapgolly.amapJsApi.amapJsApiStrings.dblclick
import typingsJapgolly.amapJsApi.amapJsApiStrings.hide
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousedown
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousemove
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseover
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseup
import typingsJapgolly.amapJsApi.amapJsApiStrings.options
import typingsJapgolly.amapJsApi.amapJsApiStrings.rightclick
import typingsJapgolly.amapJsApi.amapJsApiStrings.show
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchend
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchmove
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I]
  extends typingsJapgolly.amapJsApi.AMap.Overlay.EventMap[I] {
  var change: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.change, AnonTargetI[I]]
  var hide: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.hide, AnonTargetI[I]]
  var options: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.options, js.UndefOr[scala.Nothing]]
  var show: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.show, AnonTargetI[I]]
}

object EventMap {
  @scala.inline
  def apply[I](
    change: Event_[change, AnonTargetI[I]],
    click: MapsEvent[click, I],
    dblclick: MapsEvent[dblclick, I],
    hide: Event_[hide, AnonTargetI[I]],
    mousedown: MapsEvent[mousedown, I],
    mousemove: MapsEvent[mousemove, I],
    mouseover: MapsEvent[mouseover, I],
    mouseup: MapsEvent[mouseup, I],
    options: Event_[options, js.UndefOr[scala.Nothing]],
    rightclick: MapsEvent[rightclick, I],
    show: Event_[show, AnonTargetI[I]],
    touchend: MapsEvent[touchend, I],
    touchmove: MapsEvent[touchmove, I],
    touchstart: MapsEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

