package typingsJapgolly.amapJsApi.AMap.Overlay

import typingsJapgolly.amapJsApi.AMap.MapsEvent
import typingsJapgolly.amapJsApi.amapJsApiStrings.click
import typingsJapgolly.amapJsApi.amapJsApiStrings.dblclick
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousedown
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousemove
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseover
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseup
import typingsJapgolly.amapJsApi.amapJsApiStrings.rightclick
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchend
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchmove
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var click: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.click, I]
  var dblclick: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.dblclick, I]
  var mousedown: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mousedown, I]
  var mousemove: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mousemove, I]
  var mouseover: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mouseover, I]
  var mouseup: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mouseup, I]
  var rightclick: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.rightclick, I]
  var touchend: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.touchend, I]
  var touchmove: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.touchmove, I]
  var touchstart: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.touchstart, I]
}

object EventMap {
  @scala.inline
  def apply[I](
    click: MapsEvent[click, I],
    dblclick: MapsEvent[dblclick, I],
    mousedown: MapsEvent[mousedown, I],
    mousemove: MapsEvent[mousemove, I],
    mouseover: MapsEvent[mouseover, I],
    mouseup: MapsEvent[mouseup, I],
    rightclick: MapsEvent[rightclick, I],
    touchend: MapsEvent[touchend, I],
    touchmove: MapsEvent[touchmove, I],
    touchstart: MapsEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

