package typingsJapgolly.amapJsApi.AMap.Marker

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApi.AMap.MapsEvent
import typingsJapgolly.amapJsApi.AnonPassedPath
import typingsJapgolly.amapJsApi.amapJsApiStrings.click
import typingsJapgolly.amapJsApi.amapJsApiStrings.dblclick
import typingsJapgolly.amapJsApi.amapJsApiStrings.dragend
import typingsJapgolly.amapJsApi.amapJsApiStrings.dragging
import typingsJapgolly.amapJsApi.amapJsApiStrings.dragstart
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousedown
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousemove
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseout
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseover
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseup
import typingsJapgolly.amapJsApi.amapJsApiStrings.movealong
import typingsJapgolly.amapJsApi.amapJsApiStrings.moveend
import typingsJapgolly.amapJsApi.amapJsApiStrings.moving
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
  var dragend: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.dragend, I]
  var dragging: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.dragging, I]
  var dragstart: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.dragstart, I]
  var mousedown: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mousedown, I]
  var mousemove: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mousemove, I]
  var mouseout: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mouseout, I]
  var mouseover: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mouseover, I]
  var mouseup: MapsEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mouseup, I]
  var movealong: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.movealong, js.UndefOr[scala.Nothing]]
  var moveend: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.moveend, js.UndefOr[scala.Nothing]]
  var moving: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.moving, AnonPassedPath]
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
    dragend: MapsEvent[dragend, I],
    dragging: MapsEvent[dragging, I],
    dragstart: MapsEvent[dragstart, I],
    mousedown: MapsEvent[mousedown, I],
    mousemove: MapsEvent[mousemove, I],
    mouseout: MapsEvent[mouseout, I],
    mouseover: MapsEvent[mouseover, I],
    mouseup: MapsEvent[mouseup, I],
    movealong: Event_[movealong, js.UndefOr[scala.Nothing]],
    moveend: Event_[moveend, js.UndefOr[scala.Nothing]],
    moving: Event_[moving, AnonPassedPath],
    rightclick: MapsEvent[rightclick, I],
    touchend: MapsEvent[touchend, I],
    touchmove: MapsEvent[touchmove, I],
    touchstart: MapsEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], movealong = movealong.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

