package typingsJapgolly.eonasdanBootstrapDatetimepicker.mod

import typingsJapgolly.jquery.JQueryMouseEventObject
import typingsJapgolly.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.std.Event_ because Already inherited
- typingsJapgolly.jquery.BaseJQueryEventObject because Already inherited
- typingsJapgolly.jquery.JQueryInputEventObject because Already inherited
- typingsJapgolly.jquery.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, currentTarget_BaseJQueryEventObject, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target_BaseJQueryEventObject, which. Inlined char, charCode, key, keyCode */ @js.native
trait ErrorEventObject extends JQueryMouseEventObject {
  /** @deprecated */
  var char: String = js.native
  /** @deprecated */
  var charCode: Double = js.native
  /**
    * The invalid date. Type: moment object (clone)
    */
  var date: Moment = js.native
  var key: String = js.native
  /** @deprecated */
  var keyCode: Double = js.native
}

