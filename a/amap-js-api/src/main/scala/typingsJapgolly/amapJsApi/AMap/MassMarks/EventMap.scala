package typingsJapgolly.amapJsApi.AMap.MassMarks

import typingsJapgolly.amapJsApi.amapJsApiStrings.click
import typingsJapgolly.amapJsApi.amapJsApiStrings.dblclick
import typingsJapgolly.amapJsApi.amapJsApiStrings.mousedown
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseout
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseover
import typingsJapgolly.amapJsApi.amapJsApiStrings.mouseup
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchend
import typingsJapgolly.amapJsApi.amapJsApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var click: UIEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.click, I]
  var dblclick: UIEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.dblclick, I]
  var mousedown: UIEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mousedown, I]
  var mouseout: UIEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mouseout, I]
  var mouseover: UIEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mouseover, I]
  var mouseup: UIEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.mouseup, I]
  var touchend: UIEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.touchend, I]
  var touchstart: UIEvent[typingsJapgolly.amapJsApi.amapJsApiStrings.touchstart, I]
}

object EventMap {
  @scala.inline
  def apply[I](
    click: UIEvent[click, I],
    dblclick: UIEvent[dblclick, I],
    mousedown: UIEvent[mousedown, I],
    mouseout: UIEvent[mouseout, I],
    mouseover: UIEvent[mouseover, I],
    mouseup: UIEvent[mouseup, I],
    touchend: UIEvent[touchend, I],
    touchstart: UIEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

