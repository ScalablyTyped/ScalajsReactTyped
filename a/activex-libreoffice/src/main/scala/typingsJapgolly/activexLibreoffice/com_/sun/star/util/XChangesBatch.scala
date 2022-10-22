package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this interface enables applying a set of changes in one batch transaction.
  *
  * An object implementing this interface allows other interfaces to change its state locally. It will keep a list of pending changes until such changes
  * are committed or canceled.
  *
  * Only when they are explicitly committed will these changes take effect persistently or globally.
  * @see XChangesNotifier
  * @see XChangesSet
  * @see XCancellable
  */
trait XChangesBatch
  extends StObject
     with XInterface {
  
  /** queries for any pending changes that can be committed. */
  val PendingChanges: ChangesSet
  
  /**
    * commits any pending changes.
    *
    * The exact action depends on the concrete service.
    */
  def commitChanges(): Unit
  
  /** queries for any pending changes that can be committed. */
  def getPendingChanges(): ChangesSet
  
  /** checks whether this object has any pending changes that can be committed. */
  def hasPendingChanges(): Boolean
}
object XChangesBatch {
  
  inline def apply(
    PendingChanges: ChangesSet,
    acquire: Callback,
    commitChanges: Callback,
    getPendingChanges: CallbackTo[ChangesSet],
    hasPendingChanges: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XChangesBatch = {
    val __obj = js.Dynamic.literal(PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = acquire.toJsFn, commitChanges = commitChanges.toJsFn, getPendingChanges = getPendingChanges.toJsFn, hasPendingChanges = hasPendingChanges.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XChangesBatch]
  }
  
  extension [Self <: XChangesBatch](x: Self) {
    
    inline def setCommitChanges(value: Callback): Self = StObject.set(x, "commitChanges", value.toJsFn)
    
    inline def setGetPendingChanges(value: CallbackTo[ChangesSet]): Self = StObject.set(x, "getPendingChanges", value.toJsFn)
    
    inline def setHasPendingChanges(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasPendingChanges", value.toJsFn)
    
    inline def setPendingChanges(value: ChangesSet): Self = StObject.set(x, "PendingChanges", value.asInstanceOf[js.Any])
    
    inline def setPendingChangesVarargs(value: ElementChange*): Self = StObject.set(x, "PendingChanges", js.Array(value*))
  }
}
