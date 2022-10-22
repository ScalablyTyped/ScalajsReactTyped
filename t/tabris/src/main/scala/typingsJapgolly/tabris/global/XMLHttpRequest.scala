package typingsJapgolly.tabris.global

import typingsJapgolly.tabris.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("XMLHttpRequest")
@js.native
open class XMLHttpRequest ()
  extends StObject
     with typingsJapgolly.tabris.XMLHttpRequest {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListener): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListener, useCapture: Boolean): Unit = js.native
}
object XMLHttpRequest {
  
  @JSGlobal("XMLHttpRequest.DONE")
  @js.native
  val DONE: Double = js.native
  
  @JSGlobal("XMLHttpRequest.HEADERS_RECEIVED")
  @js.native
  val HEADERS_RECEIVED: Double = js.native
  
  @JSGlobal("XMLHttpRequest.LOADING")
  @js.native
  val LOADING: Double = js.native
  
  @JSGlobal("XMLHttpRequest.OPENED")
  @js.native
  val OPENED: Double = js.native
  
  @JSGlobal("XMLHttpRequest.UNSENT")
  @js.native
  val UNSENT: Double = js.native
}
