package typingsJapgolly.hammerjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.hammerjs.hammerjsInts.`16`
import typingsJapgolly.hammerjs.hammerjsInts.`1`
import typingsJapgolly.hammerjs.hammerjsInts.`24`
import typingsJapgolly.hammerjs.hammerjsInts.`2`
import typingsJapgolly.hammerjs.hammerjsInts.`30`
import typingsJapgolly.hammerjs.hammerjsInts.`32`
import typingsJapgolly.hammerjs.hammerjsInts.`4`
import typingsJapgolly.hammerjs.hammerjsInts.`6`
import typingsJapgolly.hammerjs.hammerjsInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HammerStatic
  extends StObject
     with Instantiable1[(/* element */ HTMLElement) | (/* element */ SVGElement), HammerManager]
     with Instantiable2[
      (/* element */ HTMLElement) | (/* element */ SVGElement), 
      /* options */ HammerOptions, 
      HammerManager
    ] {
  
  var AttrRecognizer: AttrRecognizerStatic = js.native
  
  // DIRECTION_UP | DIRECTION_DOWN
  var DIRECTION_ALL: `30` = js.native
  
  var DIRECTION_DOWN: `16` = js.native
  
  var DIRECTION_HORIZONTAL: `6` = js.native
  
  var DIRECTION_LEFT: `2` = js.native
  
  var DIRECTION_NONE: `1` = js.native
  
  var DIRECTION_RIGHT: `4` = js.native
  
  var DIRECTION_UP: `8` = js.native
  
  // DIRECTION_LEFT | DIRECTION_RIGHT
  var DIRECTION_VERTICAL: `24` = js.native
  
  var INPUT_CANCEL: `8` = js.native
  
  var INPUT_END: `4` = js.native
  
  var INPUT_MOVE: `2` = js.native
  
  var INPUT_START: `1` = js.native
  
  var Input: HammerInput = js.native
  
  // DIRECTION_HORIZONTAL | DIRECTION_VERTICAL
  var Manager: HammerManagerConstructor = js.native
  
  var MouseInput: typingsJapgolly.hammerjs.MouseInput = js.native
  
  var Pan: PanRecognizerStatic = js.native
  
  var Pinch: PinchRecognizerStatic = js.native
  
  var PointerEventInput: typingsJapgolly.hammerjs.PointerEventInput = js.native
  
  var Press: PressRecognizerStatic = js.native
  
  var Recognizer: RecognizerStatic = js.native
  
  var Rotate: RotateRecognizerStatic = js.native
  
  var STATE_BEGAN: `2` = js.native
  
  // same as STATE_ENDED
  var STATE_CANCELLED: `16` = js.native
  
  var STATE_CHANGED: `4` = js.native
  
  var STATE_ENDED: `8` = js.native
  
  var STATE_FAILED: `32` = js.native
  
  var STATE_POSSIBLE: `1` = js.native
  
  var STATE_RECOGNIZED: `8` = js.native
  
  var SingleTouchInput: typingsJapgolly.hammerjs.SingleTouchInput = js.native
  
  var Swipe: SwipeRecognizerStatic = js.native
  
  var Tap: TapRecognizerStatic = js.native
  
  var TouchAction: typingsJapgolly.hammerjs.TouchAction = js.native
  
  var TouchInput: typingsJapgolly.hammerjs.TouchInput = js.native
  
  var TouchMouseInput: typingsJapgolly.hammerjs.TouchMouseInput = js.native
  
  var VERSION: Double = js.native
  
  def bindFn(fn: js.Function, context: Any): js.Function = js.native
  
  var defaults: HammerDefaults = js.native
  
  def each(obj: Any, iterator: js.Function, context: Any): Unit = js.native
  
  def extend(dest: Any, src: Any, merge: Boolean): Any = js.native
  
  def inherit(child: js.Function, base: js.Function, properties: Any): Any = js.native
  
  def merge(dest: Any, src: Any): Any = js.native
  
  def off(target: EventTarget, types: String, handler: js.Function): Unit = js.native
  
  def on(target: EventTarget, types: String, handler: js.Function): Unit = js.native
  
  def prefixed(obj: Any, property: String): String = js.native
}
