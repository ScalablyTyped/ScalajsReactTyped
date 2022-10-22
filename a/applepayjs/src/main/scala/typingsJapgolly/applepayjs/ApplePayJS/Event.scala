package typingsJapgolly.applepayjs.ApplePayJS

import org.scalajs.dom.EventTarget
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends StObject {
  
  val bubbles: Boolean = js.native
  
  var cancelBubble: Boolean = js.native
  
  val cancelable: Boolean = js.native
  
  val composed: Boolean = js.native
  
  def composedPath(): js.Array[Node] = js.native
  
  val currentTarget: EventTarget = js.native
  
  val defaultPrevented: Boolean = js.native
  
  val eventPhase: Double = js.native
  
  def initEvent(): Unit = js.native
  def initEvent(`type`: String): Unit = js.native
  def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
  def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
  def initEvent(`type`: String, bubbles: Unit, cancelable: Boolean): Unit = js.native
  def initEvent(`type`: Unit, bubbles: Boolean): Unit = js.native
  def initEvent(`type`: Unit, bubbles: Boolean, cancelable: Boolean): Unit = js.native
  def initEvent(`type`: Unit, bubbles: Unit, cancelable: Boolean): Unit = js.native
  
  val isTrusted: Boolean = js.native
  
  def preventDefault(): Unit = js.native
  
  var returnValue: Boolean = js.native
  
  val srcElement: EventTarget = js.native
  
  def stopImmediatePropagation(): Unit = js.native
  
  def stopPropagation(): Unit = js.native
  
  val target: EventTarget = js.native
  
  val timeStamp: String = js.native
  
  val `type`: String = js.native
}
