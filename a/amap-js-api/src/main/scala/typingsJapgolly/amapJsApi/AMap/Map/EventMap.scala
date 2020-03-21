package typingsJapgolly.amapJsApi.AMap.Map

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApi.AMap.MapsEvent
import typingsJapgolly.amapJsApi.amapJsApiStrings.click
import typingsJapgolly.amapJsApi.amapJsApiStrings.complete
import typingsJapgolly.amapJsApi.amapJsApiStrings.contextmenu
import typingsJapgolly.amapJsApi.amapJsApiStrings.dblclick
import typingsJapgolly.amapJsApi.amapJsApiStrings.dragend
import typingsJapgolly.amapJsApi.amapJsApiStrings.dragging
import typingsJapgolly.amapJsApi.amapJsApiStrings.dragstart
import typingsJapgolly.amapJsApi.amapJsApiStrings.hotspotclick
import typingsJapgolly.amapJsApi.amapJsApiStrings.hotspotout
import typingsJapgolly.amapJsApi.amapJsApiStrings.hotspotover
import typingsJapgolly.amapJsApi.amapJsApiStrings.mapmove
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousedown
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousemove
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseout
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseover
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseup
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousewheel
import typingsJapgolly.amapJsApi.amapJsApiStrings.moveend
import typingsJapgolly.amapJsApi.amapJsApiStrings.movestart
import typingsJapgolly.amapJsApi.amapJsApiStrings.rdblclick
import typingsJapgolly.amapJsApi.amapJsApiStrings.resize
import typingsJapgolly.amapJsApi.amapJsApiStrings.rightclick
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchend
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchmove
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchstart
import typingsJapgolly.amapJsApi.amapJsApiStrings.zoomchange
import typingsJapgolly.amapJsApi.amapJsApiStrings.zoomend
import typingsJapgolly.amapJsApi.amapJsApiStrings.zoomstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var click: MapsEvent[
    typingsJapgolly.amapJsApi.amapJsApiStrings.click, 
    typingsJapgolly.amapJsApi.AMap.Map
  ]
  var complete: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.complete, js.UndefOr[scala.Nothing]]
  var contextmenu: MapsEvent[
    typingsJapgolly.amapJsApi.amapJsApiStrings.contextmenu, 
    typingsJapgolly.amapJsApi.AMap.Map
  ]
  var dblclick: MapsEvent[
    typingsJapgolly.amapJsApi.amapJsApiStrings.dblclick, 
    typingsJapgolly.amapJsApi.AMap.Map
  ]
  var dragend: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.dragend, js.UndefOr[scala.Nothing]]
  var dragging: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.dragging, js.UndefOr[scala.Nothing]]
  var dragstart: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.dragstart, js.UndefOr[scala.Nothing]]
  var hotspotclick: HotspotEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.hotspotclick]
  var hotspotout: HotspotEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.hotspotout]
  var hotspotover: HotspotEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.hotspotover]
  var mapmove: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.mapmove, js.UndefOr[scala.Nothing]]
  var mousedown: MapsEvent[
    typingsJapgolly.amapJsApi.amapJsApiStrings.mousedown, 
    typingsJapgolly.amapJsApi.AMap.Map
  ]
  var mousemove: MapsEvent[
    typingsJapgolly.amapJsApi.amapJsApiStrings.mousemove, 
    typingsJapgolly.amapJsApi.AMap.Map
  ]
  var mouseout: MapsEvent[
    typingsJapgolly.amapJsApi.amapJsApiStrings.mouseout, 
    typingsJapgolly.amapJsApi.AMap.Map
  ]
  var mouseover: MapsEvent[
    typingsJapgolly.amapJsApi.amapJsApiStrings.mouseover, 
    typingsJapgolly.amapJsApi.AMap.Map
  ]
  var mouseup: MapsEvent[
    typingsJapgolly.amapJsApi.amapJsApiStrings.mouseup, 
    typingsJapgolly.amapJsApi.AMap.Map
  ]
  var mousewheel: MapsEvent[
    typingsJapgolly.amapJsApi.amapJsApiStrings.mousewheel, 
    typingsJapgolly.amapJsApi.AMap.Map
  ]
  var moveend: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.moveend, js.UndefOr[scala.Nothing]]
  var movestart: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.movestart, js.UndefOr[scala.Nothing]]
  var rdblclick: MapsEvent[
    typingsJapgolly.amapJsApi.amapJsApiStrings.rdblclick, 
    typingsJapgolly.amapJsApi.AMap.Map
  ]
  var resize: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.resize, js.UndefOr[scala.Nothing]]
  var rightclick: MapsEvent[
    typingsJapgolly.amapJsApi.amapJsApiStrings.rightclick, 
    typingsJapgolly.amapJsApi.AMap.Map
  ]
  var touchend: MapsEvent[
    typingsJapgolly.amapJsApi.amapJsApiStrings.touchend, 
    typingsJapgolly.amapJsApi.AMap.Map
  ]
  var touchmove: MapsEvent[
    typingsJapgolly.amapJsApi.amapJsApiStrings.touchmove, 
    typingsJapgolly.amapJsApi.AMap.Map
  ]
  var touchstart: MapsEvent[
    typingsJapgolly.amapJsApi.amapJsApiStrings.touchstart, 
    typingsJapgolly.amapJsApi.AMap.Map
  ]
  var zoomchange: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.zoomchange, js.UndefOr[scala.Nothing]]
  var zoomend: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.zoomend, js.UndefOr[scala.Nothing]]
  var zoomstart: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.zoomstart, js.UndefOr[scala.Nothing]]
}

object EventMap {
  @scala.inline
  def apply(
    click: MapsEvent[click, typingsJapgolly.amapJsApi.AMap.Map],
    complete: Event_[complete, js.UndefOr[scala.Nothing]],
    contextmenu: MapsEvent[contextmenu, typingsJapgolly.amapJsApi.AMap.Map],
    dblclick: MapsEvent[dblclick, typingsJapgolly.amapJsApi.AMap.Map],
    dragend: Event_[dragend, js.UndefOr[scala.Nothing]],
    dragging: Event_[dragging, js.UndefOr[scala.Nothing]],
    dragstart: Event_[dragstart, js.UndefOr[scala.Nothing]],
    hotspotclick: HotspotEvent[hotspotclick],
    hotspotout: HotspotEvent[hotspotout],
    hotspotover: HotspotEvent[hotspotover],
    mapmove: Event_[mapmove, js.UndefOr[scala.Nothing]],
    mousedown: MapsEvent[mousedown, typingsJapgolly.amapJsApi.AMap.Map],
    mousemove: MapsEvent[mousemove, typingsJapgolly.amapJsApi.AMap.Map],
    mouseout: MapsEvent[mouseout, typingsJapgolly.amapJsApi.AMap.Map],
    mouseover: MapsEvent[mouseover, typingsJapgolly.amapJsApi.AMap.Map],
    mouseup: MapsEvent[mouseup, typingsJapgolly.amapJsApi.AMap.Map],
    mousewheel: MapsEvent[mousewheel, typingsJapgolly.amapJsApi.AMap.Map],
    moveend: Event_[moveend, js.UndefOr[scala.Nothing]],
    movestart: Event_[movestart, js.UndefOr[scala.Nothing]],
    rdblclick: MapsEvent[rdblclick, typingsJapgolly.amapJsApi.AMap.Map],
    resize: Event_[resize, js.UndefOr[scala.Nothing]],
    rightclick: MapsEvent[rightclick, typingsJapgolly.amapJsApi.AMap.Map],
    touchend: MapsEvent[touchend, typingsJapgolly.amapJsApi.AMap.Map],
    touchmove: MapsEvent[touchmove, typingsJapgolly.amapJsApi.AMap.Map],
    touchstart: MapsEvent[touchstart, typingsJapgolly.amapJsApi.AMap.Map],
    zoomchange: Event_[zoomchange, js.UndefOr[scala.Nothing]],
    zoomend: Event_[zoomend, js.UndefOr[scala.Nothing]],
    zoomstart: Event_[zoomstart, js.UndefOr[scala.Nothing]]
  ): EventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], hotspotclick = hotspotclick.asInstanceOf[js.Any], hotspotout = hotspotout.asInstanceOf[js.Any], hotspotover = hotspotover.asInstanceOf[js.Any], mapmove = mapmove.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], mousewheel = mousewheel.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], movestart = movestart.asInstanceOf[js.Any], rdblclick = rdblclick.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], zoomchange = zoomchange.asInstanceOf[js.Any], zoomend = zoomend.asInstanceOf[js.Any], zoomstart = zoomstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

