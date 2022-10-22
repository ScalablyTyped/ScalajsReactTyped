package typingsJapgolly.jqueryAjaxfile

import org.scalajs.dom.Element
import typingsJapgolly.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of the JQuery extension of the W3C event object
  */
@js.native
trait BaseJQueryEventObject
  extends StObject
     with Event {
  
  var data: Any = js.native
  
  var delegateTarget: Element = js.native
  
  def isDefaultPrevented(): Boolean = js.native
  
  def isImmediatePropagationStopped(): Boolean = js.native
  
  def isPropagationStopped(): Boolean = js.native
  
  var metaKey: Boolean = js.native
  
  var namespace: String = js.native
  
  var originalEvent: org.scalajs.dom.Event = js.native
  
  var pageX: Double = js.native
  
  var pageY: Double = js.native
  
  var relatedTarget: Element = js.native
  
  var result: Any = js.native
  
  @JSName("target")
  var target_BaseJQueryEventObject: Element = js.native
  
  var which: Double = js.native
}
