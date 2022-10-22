package typingsJapgolly.chrome.anon

import typingsJapgolly.chrome.chrome.sessions.Device
import typingsJapgolly.chrome.chrome.sessions.Filter
import typingsJapgolly.chrome.chrome.sessions.Session
import typingsJapgolly.chrome.chrome.sessions.SessionChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsessions extends StObject {
  
  var MAX_SESSION_RESULTS: Double = js.native
  
  def getDevices(callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
  def getDevices(filter: Filter, callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
  
  def getRecentlyClosed(callback: js.Function1[/* sessions */ js.Array[Session], Unit]): Unit = js.native
  def getRecentlyClosed(filter: Filter, callback: js.Function1[/* sessions */ js.Array[Session], Unit]): Unit = js.native
  
  var onChanged: SessionChangedEvent = js.native
  
  def restore(): Unit = js.native
  def restore(sessionId: String): Unit = js.native
  def restore(sessionId: String, callback: js.Function1[/* restoredSession */ Session, Unit]): Unit = js.native
  def restore(sessionId: Unit, callback: js.Function1[/* restoredSession */ Session, Unit]): Unit = js.native
}
