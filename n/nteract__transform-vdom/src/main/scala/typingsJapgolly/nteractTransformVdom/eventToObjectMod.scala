package typingsJapgolly.nteractTransformVdom

import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nteract/transform-vdom/lib/event-to-object", JSImport.Namespace)
@js.native
object eventToObjectMod extends js.Object {
  def serializeEvent[T](event: ReactEventFrom[T with Element]): SerializedEvent[T] = js.native
  type SerializedEvent[T] = (Partial[
    (ReactAnimationEventFrom[T with Element]) | (ReactEventFrom[T with Element]) | (ReactClipboardEventFrom[T with Element]) | (ReactCompositionEventFrom[T with Element]) | (ReactKeyboardEventFrom[T with Element]) | (ReactMouseEventFrom[T with Element]) | (ReactPointerEventFrom[T with Element]) | (ReactTouchEventFrom[T with Element]) | (ReactTransitionEventFrom[T with Element]) | (ReactUIEventFrom[T with Element]) | (ReactWheelEventFrom[T with Element])
  ]) | js.Object
}

