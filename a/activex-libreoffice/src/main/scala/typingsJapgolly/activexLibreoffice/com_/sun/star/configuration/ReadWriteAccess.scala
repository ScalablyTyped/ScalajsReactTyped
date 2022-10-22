package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Property
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.ChangesSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides easy read/write access to the complete configuration.
  *
  * This service is still unpublished and unstable.
  * @since LibreOffice 4.0
  */
trait ReadWriteAccess
  extends StObject
     with XReadWriteAccess {
  
  /**
    * Service constructor.
    * @param locale a string representation of the locale to use for localized properties; use `*` for all-locale access
    */
  def create(locale: String): Unit
}
object ReadWriteAccess {
  
  inline def apply(
    PendingChanges: ChangesSet,
    acquire: Callback,
    commitChanges: Callback,
    create: String => Callback,
    getByHierarchicalName: String => Any,
    getPendingChanges: CallbackTo[ChangesSet],
    getPropertyByHierarchicalName: String => Property,
    hasByHierarchicalName: String => Boolean,
    hasPendingChanges: CallbackTo[Boolean],
    hasPropertyByHierarchicalName: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    replaceByHierarchicalName: (String, Any) => Callback
  ): ReadWriteAccess = {
    val __obj = js.Dynamic.literal(PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = acquire.toJsFn, commitChanges = commitChanges.toJsFn, create = js.Any.fromFunction1((t0: String) => create(t0).runNow()), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getPendingChanges = getPendingChanges.toJsFn, getPropertyByHierarchicalName = js.Any.fromFunction1(getPropertyByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasPendingChanges = hasPendingChanges.toJsFn, hasPropertyByHierarchicalName = js.Any.fromFunction1(hasPropertyByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, replaceByHierarchicalName = js.Any.fromFunction2((t0: String, t1: Any) => (replaceByHierarchicalName(t0, t1)).runNow()))
    __obj.asInstanceOf[ReadWriteAccess]
  }
  
  extension [Self <: ReadWriteAccess](x: Self) {
    
    inline def setCreate(value: String => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
