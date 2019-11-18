package typingsJapgolly.googlemaps.google.maps

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Events *****/
trait MapsEventListener extends js.Object {
  /**
    * Removes the listener.  Equivalent to calling
    * google.maps.event.removeListener(listener).
    */
  def remove(): Unit
}

object MapsEventListener {
  @scala.inline
  def apply(remove: Callback): MapsEventListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[MapsEventListener]
  }
}

