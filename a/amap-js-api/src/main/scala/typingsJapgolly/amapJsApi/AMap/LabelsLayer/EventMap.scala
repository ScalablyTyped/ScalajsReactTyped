package typingsJapgolly.amapJsApi.AMap.LabelsLayer

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApi.amapJsApiStrings.click
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousedown
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousemove
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseout
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseover
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseup
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchend
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var click: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.click, LabelsLayerEvent[I]]
  var mousedown: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.mousedown, LabelsLayerEvent[I]]
  var mousemove: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.mousemove, LabelsLayerEvent[I]]
  var mouseout: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.mouseout, LabelsLayerEvent[I]]
  var mouseover: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.mouseover, LabelsLayerEvent[I]]
  var mouseup: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.mouseup, LabelsLayerEvent[I]]
  var touchend: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.touchend, LabelsLayerEvent[I]]
  var touchstart: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.touchstart, LabelsLayerEvent[I]]
}

object EventMap {
  @scala.inline
  def apply[I](
    click: Event_[click, LabelsLayerEvent[I]],
    mousedown: Event_[mousedown, LabelsLayerEvent[I]],
    mousemove: Event_[mousemove, LabelsLayerEvent[I]],
    mouseout: Event_[mouseout, LabelsLayerEvent[I]],
    mouseover: Event_[mouseover, LabelsLayerEvent[I]],
    mouseup: Event_[mouseup, LabelsLayerEvent[I]],
    touchend: Event_[touchend, LabelsLayerEvent[I]],
    touchstart: Event_[touchstart, LabelsLayerEvent[I]]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

