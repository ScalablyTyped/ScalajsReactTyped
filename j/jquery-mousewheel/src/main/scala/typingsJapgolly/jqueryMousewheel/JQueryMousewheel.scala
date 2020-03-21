package typingsJapgolly.jqueryMousewheel

import typingsJapgolly.jquery.JQueryMouseEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JQueryMousewheel")
@js.native
object JQueryMousewheel extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.std.Event_ because Already inherited
  - typingsJapgolly.jquery.BaseJQueryEventObject because Already inherited
  - typingsJapgolly.jquery.JQueryInputEventObject because Already inherited
  - typingsJapgolly.jquery.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, currentTarget_BaseJQueryEventObject, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target_BaseJQueryEventObject, which. Inlined char, charCode, key, keyCode */ @js.native
  trait JQueryMousewheelEventObject extends JQueryMouseEventObject {
    var absDelta: Double = js.native
    /** @deprecated */
    var char: String = js.native
    /** @deprecated */
    var charCode: Double = js.native
    var deltaFactor: Double = js.native
    var deltaMode: Double = js.native
    var deltaX: Double = js.native
    var deltaY: Double = js.native
    var key: String = js.native
    /** @deprecated */
    var keyCode: Double = js.native
  }
  
}

