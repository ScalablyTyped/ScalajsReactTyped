package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An event which takes place in the DOM. */
@js.native
trait Event extends StObject {
  
  /* standard dom */
  val AT_TARGET: Double = js.native
  
  /* standard dom */
  val BUBBLING_PHASE: Double = js.native
  
  /* standard dom */
  val CAPTURING_PHASE: Double = js.native
  
  /* standard dom */
  val NONE: Double = js.native
  
  /** Returns true or false depending on how event was initialized. True if event goes through its target's ancestors in reverse tree order, and false otherwise. */
  /* standard dom */
  val bubbles: scala.Boolean = js.native
  
  /* standard dom */
  var cancelBubble: scala.Boolean = js.native
  
  /** Returns true or false depending on how event was initialized. Its return value does not always carry meaning, but true can indicate that part of the operation during which event was dispatched, can be canceled by invoking the preventDefault() method. */
  /* standard dom */
  val cancelable: scala.Boolean = js.native
  
  /** Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise. */
  /* standard dom */
  val composed: scala.Boolean = js.native
  
  /** Returns the invocation target objects of event's path (objects on which listeners will be invoked), except for any nodes in shadow trees of which the shadow root's mode is "closed" that are not reachable from event's currentTarget. */
  /* standard dom */
  def composedPath(): js.Array[org.scalajs.dom.EventTarget] = js.native
  
  /** Returns the object whose event listener's callback is currently being invoked. */
  /* standard dom */
  val currentTarget: org.scalajs.dom.EventTarget | Null = js.native
  
  /** Returns true if preventDefault() was invoked successfully to indicate cancelation, and false otherwise. */
  /* standard dom */
  val defaultPrevented: scala.Boolean = js.native
  
  /** Returns the event's phase, which is one of NONE, CAPTURING_PHASE, AT_TARGET, and BUBBLING_PHASE. */
  /* standard dom */
  val eventPhase: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  def initEvent(`type`: java.lang.String): Unit = js.native
  def initEvent(`type`: java.lang.String, bubbles: scala.Boolean): Unit = js.native
  def initEvent(`type`: java.lang.String, bubbles: scala.Boolean, cancelable: scala.Boolean): Unit = js.native
  def initEvent(`type`: java.lang.String, bubbles: Unit, cancelable: scala.Boolean): Unit = js.native
  
  /** Returns true if event was dispatched by the user agent, and false otherwise. */
  /* standard dom */
  val isTrusted: scala.Boolean = js.native
  
  /** If invoked when the cancelable attribute value is true, and while executing a listener for the event with passive set to false, signals to the operation that caused event to be dispatched that it needs to be canceled. */
  /* standard dom */
  def preventDefault(): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  var returnValue: scala.Boolean = js.native
  
  /** @deprecated */
  /* standard dom */
  val srcElement: org.scalajs.dom.EventTarget | Null = js.native
  
  /** Invoking this method prevents event from reaching any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any other objects. */
  /* standard dom */
  def stopImmediatePropagation(): Unit = js.native
  
  /** When dispatched in a tree, invoking this method prevents event from reaching any objects other than the current object. */
  /* standard dom */
  def stopPropagation(): Unit = js.native
  
  /** Returns the object to which event is dispatched (its target). */
  /* standard dom */
  val target: org.scalajs.dom.EventTarget | Null = js.native
  
  /** Returns the event's timestamp as the number of milliseconds measured relative to the time origin. */
  /* standard dom */
  val timeStamp: DOMHighResTimeStamp = js.native
  
  /** Returns the type of event, e.g. "click", "hashchange", or "submit". */
  /* standard dom */
  val `type`: java.lang.String = js.native
}
