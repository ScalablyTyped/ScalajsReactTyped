package typingsJapgolly.activexMshtml.global.MSHTML

import typingsJapgolly.activexMshtml.MSHTML.IHTMLWindow2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.SVGZoomEvent")
@js.native
/* private */ open class SVGZoomEvent ()
  extends StObject
     with typingsJapgolly.activexMshtml.MSHTML.SVGZoomEvent {
  
  /* private */ /* CompleteClass */
  @JSName("MSHTML.SVGZoomEvent_typekey")
  var MSHTMLDotSVGZoomEvent_typekey: typingsJapgolly.activexMshtml.MSHTML.SVGZoomEvent = js.native
  
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
  override val detail: Double = js.native
  
  /* CompleteClass */
  override val eventPhase: Double = js.native
  
  /* CompleteClass */
  override def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def initUIEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, view: IHTMLWindow2, detail: Double): Unit = js.native
  
  /* CompleteClass */
  override val isTrusted: Boolean = js.native
  
  /* CompleteClass */
  override val newScale: Double = js.native
  
  /* CompleteClass */
  override val newTranslate: typingsJapgolly.activexMshtml.MSHTML.SVGPoint = js.native
  
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  
  /* CompleteClass */
  override val previousScale: Double = js.native
  
  /* CompleteClass */
  override val previousTranslate: typingsJapgolly.activexMshtml.MSHTML.SVGPoint = js.native
  
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
  
  /* CompleteClass */
  override val zoomRectScreen: typingsJapgolly.activexMshtml.MSHTML.SVGRect = js.native
}
