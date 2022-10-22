package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The request object does not initially contain any information about the result of the operation, but once information becomes available, an event is fired on the request, and the information becomes available through the properties of the IDBRequest instance. */
@js.native
trait IDBRequest[T]
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typingsJapgolly.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.IDBRequest[Any, T], /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typingsJapgolly.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.IDBRequest[Any, T], /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typingsJapgolly.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.IDBRequest[Any, T], /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.IDBRequest[Any, T], /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.IDBRequest[Any, T], /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.IDBRequest[Any, T], /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** When a request is completed, returns the error (a DOMException), or null if the request succeeded. Throws a "InvalidStateError" DOMException if the request is still pending. */
  /* standard dom */
  val error: org.scalajs.dom.DOMException | Null = js.native
  
  /* standard dom */
  var onerror: (js.ThisFunction1[/* this */ org.scalajs.dom.IDBRequest[Any, T], /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var onsuccess: (js.ThisFunction1[/* this */ org.scalajs.dom.IDBRequest[Any, T], /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** Returns "pending" until a request is complete, then returns "done". */
  /* standard dom */
  val readyState: IDBRequestReadyState = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typingsJapgolly.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.IDBRequest[Any, T], /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typingsJapgolly.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.IDBRequest[Any, T], /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typingsJapgolly.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.IDBRequest[Any, T], /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.IDBRequest[Any, T], /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.IDBRequest[Any, T], /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.IDBRequest[Any, T], /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /** When a request is completed, returns the result, or undefined if the request failed. Throws a "InvalidStateError" DOMException if the request is still pending. */
  /* standard dom */
  val result: T = js.native
  
  /** Returns the IDBObjectStore, IDBIndex, or IDBCursor the request was made against, or null if is was an open request. */
  /* standard dom */
  val source: org.scalajs.dom.IDBObjectStore | org.scalajs.dom.IDBIndex | org.scalajs.dom.IDBCursor[Any] = js.native
  
  /** Returns the IDBTransaction the request was made within. If this as an open request, then it returns an upgrade transaction while it is running, or null otherwise. */
  /* standard dom */
  val transaction: org.scalajs.dom.IDBTransaction | Null = js.native
}
