package typingsJapgolly.activexMshtml.global.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.DOMMSTransitionEvent")
@js.native
/* private */ open class DOMMSTransitionEvent ()
  extends StObject
     with typingsJapgolly.activexMshtml.MSHTML.DOMMSTransitionEvent {
  
  /* private */ /* CompleteClass */
  @JSName("MSHTML.DOMMSTransitionEvent_typekey")
  var MSHTMLDotDOMMSTransitionEvent_typekey: typingsJapgolly.activexMshtml.MSHTML.DOMMSTransitionEvent = js.native
  
  /* CompleteClass */
  override val bubbles: Boolean = js.native
  
  /* CompleteClass */
  var cancelBubble: Boolean = js.native
  
  /* CompleteClass */
  override val cancelable: Boolean = js.native
  
  /* CompleteClass */
  override val currentTarget: typingsJapgolly.activexMshtml.MSHTML.IEventTarget = js.native
  
  /* CompleteClass */
  override val defaultPrevented: Boolean = js.native
  
  /* CompleteClass */
  override val elapsedTime: Double = js.native
  
  /* CompleteClass */
  override val eventPhase: Double = js.native
  
  /* CompleteClass */
  override def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def initMSTransitionEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    propertyName: String,
    elapsedTime: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override val isTrusted: Boolean = js.native
  
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  
  /* CompleteClass */
  override val propertyName: String = js.native
  
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
