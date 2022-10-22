package typingsJapgolly.dexie.mod

import org.scalajs.dom.Event
import org.scalajs.dom.IDBVersionChangeEvent
import typingsJapgolly.dexie.dexieStrings.blocked
import typingsJapgolly.dexie.dexieStrings.close
import typingsJapgolly.dexie.dexieStrings.populate
import typingsJapgolly.dexie.dexieStrings.ready
import typingsJapgolly.dexie.dexieStrings.versionchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbEvents
  extends StObject
     with DexieEventSet {
  
  def apply(eventName: blocked, subscriber: js.Function1[/* event */ IDBVersionChangeEvent, Any]): Unit = js.native
  def apply(eventName: close, subscriber: js.Function1[/* event */ Event, Any]): Unit = js.native
  def apply(eventName: populate, subscriber: js.Function1[/* trans */ Transaction, Any]): Unit = js.native
  def apply(eventName: ready, subscriber: js.Function1[/* vipDb */ Dexie, Any]): Unit = js.native
  def apply(eventName: ready, subscriber: js.Function1[/* vipDb */ Dexie, Any], bSticky: Boolean): Unit = js.native
  def apply(eventName: versionchange, subscriber: js.Function1[/* event */ IDBVersionChangeEvent, Any]): Unit = js.native
  
  var blocked: DexieEvent = js.native
  
  var close: DexieCloseEvent = js.native
  
  var populate: DexiePopulateEvent = js.native
  
  var ready: DexieOnReadyEvent = js.native
  
  var versionchange: DexieVersionChangeEvent = js.native
}
