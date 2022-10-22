package typingsJapgolly.activexMshtml.global.MSHTML

import typingsJapgolly.activexMshtml.MSHTML.IHTMLWindow2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.DOMTextEvent")
@js.native
/* private */ open class DOMTextEvent ()
  extends StObject
     with typingsJapgolly.activexMshtml.MSHTML.DOMTextEvent {
  
  /* private */ /* CompleteClass */
  @JSName("MSHTML.DOMTextEvent_typekey")
  var MSHTMLDotDOMTextEvent_typekey: typingsJapgolly.activexMshtml.MSHTML.DOMTextEvent = js.native
  
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
  override val detail: Double = js.native
  
  /* CompleteClass */
  override val eventPhase: Double = js.native
  
  /* CompleteClass */
  override def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def initTextEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    viewArg: IHTMLWindow2,
    dataArg: String,
    inputMethod: Double,
    locale: String
  ): Unit = js.native
  
  /* CompleteClass */
  override def initUIEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, view: IHTMLWindow2, detail: Double): Unit = js.native
  
  /* CompleteClass */
  override val inputMethod: Double = js.native
  
  /* CompleteClass */
  override val isTrusted: Boolean = js.native
  
  /* CompleteClass */
  override val locale: String = js.native
  
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  
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
  
  /* CompleteClass */
  override def view(pvarIndex: Any): Any = js.native
  /* CompleteClass */
  @JSName("view")
  override val view_Original: IHTMLWindow2 = js.native
}
