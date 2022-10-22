package typingsJapgolly.activexMshtml.global.MSHTML

import typingsJapgolly.activexMshtml.MSHTML.IHTMLWindow2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.DOMMessageEvent")
@js.native
/* private */ open class DOMMessageEvent ()
  extends StObject
     with typingsJapgolly.activexMshtml.MSHTML.DOMMessageEvent {
  
  /* private */ /* CompleteClass */
  @JSName("MSHTML.DOMMessageEvent_typekey")
  var MSHTMLDotDOMMessageEvent_typekey: typingsJapgolly.activexMshtml.MSHTML.DOMMessageEvent = js.native
  
  /* CompleteClass */
  override val bubbles: Boolean = js.native
  
  /* CompleteClass */
  var cancelBubble: Boolean = js.native
  
  /* CompleteClass */
  override val cancelable: Boolean = js.native
  
  /* CompleteClass */
  override val currentTarget: typingsJapgolly.activexMshtml.MSHTML.IEventTarget = js.native
  
  /* CompleteClass */
  override val data: String = js.native
  
  /* CompleteClass */
  override val defaultPrevented: Boolean = js.native
  
  /* CompleteClass */
  override val eventPhase: Double = js.native
  
  /* CompleteClass */
  override def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def initMessageEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    data: String,
    origin: String,
    lastEventId: String,
    source: IHTMLWindow2
  ): Unit = js.native
  
  /* CompleteClass */
  override val isTrusted: Boolean = js.native
  
  /* CompleteClass */
  override val origin: String = js.native
  
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  
  /* CompleteClass */
  override def source(pvarIndex: Any): Any = js.native
  /* CompleteClass */
  @JSName("source")
  override val source_Original: IHTMLWindow2 = js.native
  
  /* CompleteClass */
  override val srcElement: typingsJapgolly.activexMshtml.MSHTML.IHTMLElement = js.native
  
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
  
  /* CompleteClass */
  override val target: typingsJapgolly.activexMshtml.MSHTML.IEventTarget = js.native
  
  /* CompleteClass */
  override val timeStamp: Double = js.native
  
  /* CompleteClass */
  override val `type`: String = js.native
}
