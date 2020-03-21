package typingsJapgolly.amapJsApiToolBar.AMap.ToolBar

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApiToolBar.AnonLnglat
import typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.`location-failed`
import typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.`location-success`
import typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.hide
import typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.location
import typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.show
import typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.zoomin
import typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.zoomout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var hide: Event_[
    typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.hide, 
    js.UndefOr[scala.Nothing]
  ]
  var location: Event_[typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.location, AnonLnglat]
   // TODO geolocation.getCurrentPosition
  var `location-failed`: Event_[
    typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.`location-failed`, 
    js.UndefOr[scala.Nothing]
  ]
  // internal
  var `location-success`: Event_[
    typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.`location-success`, 
    js.UndefOr[scala.Nothing]
  ]
  var show: Event_[
    typingsJapgolly.amapJsApiToolBar.amapJsApiToolBarStrings.show, 
    js.UndefOr[scala.Nothing]
  ]
  var zoomchanged: Event_[zoomin | zoomout, js.UndefOr[scala.Nothing]]
}

object EventMap {
  @scala.inline
  def apply(
    hide: Event_[hide, js.UndefOr[scala.Nothing]],
    location: Event_[location, AnonLnglat],
    `location-failed`: Event_[`location-failed`, js.UndefOr[scala.Nothing]],
    `location-success`: Event_[`location-success`, js.UndefOr[scala.Nothing]],
    show: Event_[show, js.UndefOr[scala.Nothing]],
    zoomchanged: Event_[zoomin | zoomout, js.UndefOr[scala.Nothing]]
  ): EventMap = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], zoomchanged = zoomchanged.asInstanceOf[js.Any])
    __obj.updateDynamic("location-failed")(`location-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("location-success")(`location-success`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

