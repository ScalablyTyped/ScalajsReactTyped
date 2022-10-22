package typingsJapgolly.tabris.global

import typingsJapgolly.tabris.MessageEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MessageEvent")
@js.native
open class MessageEvent protected ()
  extends StObject
     with typingsJapgolly.tabris.MessageEvent {
  def this(`type`: String) = this()
  def this(`type`: String, eventInitDict: MessageEventInit) = this()
  
  /* CompleteClass */
  override val AT_TARGET: Double = js.native
  
  /* CompleteClass */
  override val BUBBLING_PHASE: Double = js.native
  
  /* CompleteClass */
  override val CAPTURING_PHASE: Double = js.native
  
  /* CompleteClass */
  override val bubbles: Boolean = js.native
  
  /* CompleteClass */
  override val cancelable: Boolean = js.native
  
  /* CompleteClass */
  override val currentTarget: typingsJapgolly.tabris.EventTarget = js.native
  
  /* CompleteClass */
  override val data: Any = js.native
  
  /* CompleteClass */
  override val defaultPrevented: Boolean = js.native
  
  /* CompleteClass */
  override val eventPhase: Double = js.native
  
  /* CompleteClass */
  override def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def initMessageEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    dataArg: Any,
    originArg: String,
    lastEventIdArg: String,
    sourceArg: Any
  ): Unit = js.native
  
  /* CompleteClass */
  override val isTrusted: Boolean = js.native
  
  /* CompleteClass */
  override val origin: String = js.native
  
  /* CompleteClass */
  override val ports: Any = js.native
  
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  
  /* CompleteClass */
  override val source: Any = js.native
  
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
  
  /* CompleteClass */
  override val target: typingsJapgolly.tabris.EventTarget = js.native
  
  /* CompleteClass */
  override val timeStamp: Double = js.native
  
  /* CompleteClass */
  override val `type`: String = js.native
}
