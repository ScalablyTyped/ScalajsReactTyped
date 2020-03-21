package typingsJapgolly.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.std.Event_ because Already inherited
- typingsJapgolly.angular.BaseJQueryEventObject because Already inherited
- typingsJapgolly.std.Event_ because Already inherited
- typingsJapgolly.angular.JQueryInputEventObject because Already inherited
- typingsJapgolly.angular.BaseJQueryEventObject because Already inherited
- typingsJapgolly.angular.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, currentTarget, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target, which. Inlined char, charCode, key, keyCode
- typingsJapgolly.angular.JQueryCustomEventObject because var conflicts: cancelBubble, currentTarget, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, target, which. Inlined detail */ @js.native
trait JQueryEventObject extends JQueryMouseEventObject {
  /** @deprecated */
  var char: String = js.native
  /** @deprecated */
  var charCode: Double = js.native
  /**
    * @see {@link https://api.jquery.com/category/events/event-object/}
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/API/CustomEvent}
    */
  var detail: js.UndefOr[js.Any] = js.native
  var key: String = js.native
  /** @deprecated */
  var keyCode: Double = js.native
}

