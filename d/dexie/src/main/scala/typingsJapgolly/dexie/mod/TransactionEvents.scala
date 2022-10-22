package typingsJapgolly.dexie.mod

import typingsJapgolly.dexie.dexieStrings.abort
import typingsJapgolly.dexie.dexieStrings.complete
import typingsJapgolly.dexie.dexieStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionEvents
  extends StObject
     with DexieEventSet {
  
  def apply(eventName: abort, subscriber: js.Function0[Any]): Unit = js.native
  def apply(eventName: complete, subscriber: js.Function0[Any]): Unit = js.native
  def apply(eventName: error, subscriber: js.Function1[/* error */ Any, Any]): Unit = js.native
  
  var abort: DexieEvent = js.native
  
  var complete: DexieEvent = js.native
  
  var error: DexieEvent = js.native
}
