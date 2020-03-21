package typingsJapgolly.leafletRotatedmarker.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Marker extends js.Object {
  /*
    * Sets the rotation angle value.
    */
  def setRotationAngle(newAngle: Double): this.type
  /**
    * Sets the rotation origin value.
    */
  def setRotationOrigin(newOrigin: String): this.type
}

object Marker {
  @scala.inline
  def apply(setRotationAngle: Double => CallbackTo[Marker], setRotationOrigin: String => CallbackTo[Marker]): Marker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setRotationAngle")(js.Any.fromFunction1((t0: scala.Double) => setRotationAngle(t0).runNow()))
    __obj.updateDynamic("setRotationOrigin")(js.Any.fromFunction1((t0: java.lang.String) => setRotationOrigin(t0).runNow()))
    __obj.asInstanceOf[Marker]
  }
}

