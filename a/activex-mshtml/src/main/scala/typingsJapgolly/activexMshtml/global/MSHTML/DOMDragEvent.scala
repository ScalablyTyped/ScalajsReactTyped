package typingsJapgolly.activexMshtml.global.MSHTML

import typingsJapgolly.activexMshtml.MSHTML.IHTMLWindow2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.DOMDragEvent")
@js.native
/* private */ open class DOMDragEvent ()
  extends StObject
     with typingsJapgolly.activexMshtml.MSHTML.DOMDragEvent {
  
  /* private */ /* CompleteClass */
  @JSName("MSHTML.DOMDragEvent_typekey")
  var MSHTMLDotDOMDragEvent_typekey: typingsJapgolly.activexMshtml.MSHTML.DOMDragEvent = js.native
  
  /* CompleteClass */
  override val altKey: Boolean = js.native
  
  /* CompleteClass */
  override val bubbles: Boolean = js.native
  
  /* CompleteClass */
  override val button: Double = js.native
  
  /* CompleteClass */
  override val buttons: Double = js.native
  
  /* CompleteClass */
  var cancelBubble: Boolean = js.native
  
  /* CompleteClass */
  override val cancelable: Boolean = js.native
  
  /* CompleteClass */
  override val clientX: Double = js.native
  
  /* CompleteClass */
  override val clientY: Double = js.native
  
  /* CompleteClass */
  override val ctrlKey: Boolean = js.native
  
  /* CompleteClass */
  override val currentTarget: typingsJapgolly.activexMshtml.MSHTML.IEventTarget = js.native
  
  /* CompleteClass */
  override val dataTransfer: typingsJapgolly.activexMshtml.MSHTML.IHTMLDataTransfer = js.native
  
  /* CompleteClass */
  override val defaultPrevented: Boolean = js.native
  
  /* CompleteClass */
  override val detail: Double = js.native
  
  /* CompleteClass */
  override val eventPhase: Double = js.native
  
  /* CompleteClass */
  override val fromElement: typingsJapgolly.activexMshtml.MSHTML.IHTMLElement = js.native
  
  /* CompleteClass */
  override def getModifierState(keyArg: String): Boolean = js.native
  
  /* CompleteClass */
  override def initDragEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    viewArg: IHTMLWindow2,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: Boolean,
    altKeyArg: Boolean,
    shiftKeyArg: Boolean,
    metaKeyArg: Boolean,
    buttonArg: Double,
    relatedTargetArg: typingsJapgolly.activexMshtml.MSHTML.IEventTarget,
    dataTransferArg: typingsJapgolly.activexMshtml.MSHTML.IHTMLDataTransfer
  ): Unit = js.native
  
  /* CompleteClass */
  override def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def initMouseEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    viewArg: IHTMLWindow2,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: Boolean,
    altKeyArg: Boolean,
    shiftKeyArg: Boolean,
    metaKeyArg: Boolean,
    buttonArg: Double,
    relatedTargetArg: typingsJapgolly.activexMshtml.MSHTML.IEventTarget
  ): Unit = js.native
  
  /* CompleteClass */
  override def initUIEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, view: IHTMLWindow2, detail: Double): Unit = js.native
  
  /* CompleteClass */
  override val isTrusted: Boolean = js.native
  
  /* CompleteClass */
  override val layerX: Double = js.native
  
  /* CompleteClass */
  override val layerY: Double = js.native
  
  /* CompleteClass */
  override val metaKey: Boolean = js.native
  
  /* CompleteClass */
  override val offsetX: Double = js.native
  
  /* CompleteClass */
  override val offsetY: Double = js.native
  
  /* CompleteClass */
  override val pageX: Double = js.native
  
  /* CompleteClass */
  override val pageY: Double = js.native
  
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  
  /* CompleteClass */
  override val relatedTarget: typingsJapgolly.activexMshtml.MSHTML.IEventTarget = js.native
  
  /* CompleteClass */
  override val screenX: Double = js.native
  
  /* CompleteClass */
  override val screenY: Double = js.native
  
  /* CompleteClass */
  override val shiftKey: Boolean = js.native
  
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
  override val toElement: typingsJapgolly.activexMshtml.MSHTML.IHTMLElement = js.native
  
  /* CompleteClass */
  override val `type`: String = js.native
  
  /* CompleteClass */
  override def view(pvarIndex: Any): Any = js.native
  /* CompleteClass */
  @JSName("view")
  override val view_Original: IHTMLWindow2 = js.native
  
  /* CompleteClass */
  override val which: Double = js.native
  
  /* CompleteClass */
  override val x: Double = js.native
  
  /* CompleteClass */
  override val y: Double = js.native
}
