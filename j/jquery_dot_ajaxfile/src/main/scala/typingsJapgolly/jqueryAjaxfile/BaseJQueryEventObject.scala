package typingsJapgolly.jqueryAjaxfile

import org.scalajs.dom.raw.Element
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of the JQuery extension of the W3C event object
  */
@js.native
trait BaseJQueryEventObject extends Event_ {
  var data: js.Any = js.native
  var delegateTarget: Element = js.native
  var metaKey: Boolean = js.native
  var namespace: String = js.native
  var originalEvent: Event_ = js.native
  var pageX: Double = js.native
  var pageY: Double = js.native
  var relatedTarget: Element = js.native
  var result: js.Any = js.native
  @JSName("target")
  var target_BaseJQueryEventObject: Element = js.native
  var which: Double = js.native
  def isDefaultPrevented(): Boolean = js.native
  def isImmediatePropagationStopped(): Boolean = js.native
  def isPropagationStopped(): Boolean = js.native
}

