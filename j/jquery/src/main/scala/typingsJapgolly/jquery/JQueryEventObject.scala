package typingsJapgolly.jquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated ​ Deprecated. Use \`{@link JQuery.Event }\`.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.std.Event because Already inherited
- typings.jquery.BaseJQueryEventObject because Already inherited
- typings.jquery.JQueryInputEventObject because Already inherited
- typings.jquery.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, currentTarget, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target, which. Inlined char, charCode, key, keyCode */ @js.native
trait JQueryEventObject extends JQueryMouseEventObject {
  /** @deprecated */
  var char: String = js.native
  /** @deprecated */
  var charCode: Double = js.native
  var key: String = js.native
  /** @deprecated */
  var keyCode: Double = js.native
}

