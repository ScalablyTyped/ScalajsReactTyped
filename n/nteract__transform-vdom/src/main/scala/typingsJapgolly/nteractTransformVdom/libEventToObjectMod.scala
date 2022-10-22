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
import org.scalajs.dom.Element
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventToObjectMod {
  
  @JSImport("@nteract/transform-vdom/lib/event-to-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializeEvent[T](event: ReactEventFrom[T & Element]): SerializedEvent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeEvent")(event.asInstanceOf[js.Any]).asInstanceOf[SerializedEvent[T]]
  
  type SerializedEvent[T] = (Partial[
    (ReactAnimationEventFrom[T & Element]) | (ReactEventFrom[T & Element]) | (ReactClipboardEventFrom[T & Element]) | (ReactCompositionEventFrom[T & Element]) | (ReactKeyboardEventFrom[T & Element]) | (ReactMouseEventFrom[T & Element]) | (ReactPointerEventFrom[T & Element]) | (ReactTouchEventFrom[T & Element]) | (ReactTransitionEventFrom[T & Element]) | (ReactUIEventFrom[T & Element]) | (ReactWheelEventFrom[T & Element])
  ]) | js.Object
}
