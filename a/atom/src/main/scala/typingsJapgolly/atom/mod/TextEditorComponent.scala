package typingsJapgolly.atom.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atom.AnonClientX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditorComponent extends js.Object {
  def pixelPositionForMouseEvent(event: AnonClientX): PixelPosition
  /** Does not clip screenPosition, unlike similar method on TextEditorElement */
  def pixelPositionForScreenPosition(screenPosition: PointLike): PixelPosition
  def screenPositionForMouseEvent(event: AnonClientX): Point
  def screenPositionForPixelPosition(pos: PixelPosition): Point
}

object TextEditorComponent {
  @scala.inline
  def apply(
    pixelPositionForMouseEvent: AnonClientX => CallbackTo[PixelPosition],
    pixelPositionForScreenPosition: PointLike => CallbackTo[PixelPosition],
    screenPositionForMouseEvent: AnonClientX => CallbackTo[Point],
    screenPositionForPixelPosition: PixelPosition => CallbackTo[Point]
  ): TextEditorComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pixelPositionForMouseEvent")(js.Any.fromFunction1((t0: typingsJapgolly.atom.AnonClientX) => pixelPositionForMouseEvent(t0).runNow()))
    __obj.updateDynamic("pixelPositionForScreenPosition")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.PointLike) => pixelPositionForScreenPosition(t0).runNow()))
    __obj.updateDynamic("screenPositionForMouseEvent")(js.Any.fromFunction1((t0: typingsJapgolly.atom.AnonClientX) => screenPositionForMouseEvent(t0).runNow()))
    __obj.updateDynamic("screenPositionForPixelPosition")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.PixelPosition) => screenPositionForPixelPosition(t0).runNow()))
    __obj.asInstanceOf[TextEditorComponent]
  }
}

