package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementEventMap extends js.Object {
  var fullscreenchange: Event_
  var fullscreenerror: Event_
}

object ElementEventMap {
  @scala.inline
  def apply(fullscreenchange: Event_, fullscreenerror: Event_): ElementEventMap = {
    val __obj = js.Dynamic.literal(fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementEventMap]
  }
}

