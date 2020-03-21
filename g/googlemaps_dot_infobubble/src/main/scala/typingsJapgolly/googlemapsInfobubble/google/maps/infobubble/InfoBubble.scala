package typingsJapgolly.googlemapsInfobubble.google.maps.infobubble

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.googlemaps.google.maps.LatLng
import typingsJapgolly.googlemaps.google.maps.Map
import typingsJapgolly.googlemaps.google.maps.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoBubble extends js.Object {
  /**
    * Closes the infobubble
    */
  def close(): Unit
  /**
    * Returns the position of the InfoBubble
    */
  def getPosition(): LatLng
  /**
    * Checks if the infobubble is currently open
    */
  def isOpen(): Boolean
  /**
    * Opens the infobubble
    * @map The google map object
    * @marker The marker used for anchoring the infobubble to
    */
  def open(map: Map[Element], marker: Marker): Unit
}

object InfoBubble {
  @scala.inline
  def apply(
    close: Callback,
    getPosition: CallbackTo[LatLng],
    isOpen: CallbackTo[Boolean],
    open: (Map[Element], Marker) => Callback
  ): InfoBubble = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("getPosition")(getPosition.toJsFn)
    __obj.updateDynamic("isOpen")(isOpen.toJsFn)
    __obj.updateDynamic("open")(js.Any.fromFunction2((t0: typingsJapgolly.googlemaps.google.maps.Map[org.scalajs.dom.raw.Element], t1: typingsJapgolly.googlemaps.google.maps.Marker) => open(t0, t1).runNow()))
    __obj.asInstanceOf[InfoBubble]
  }
}

