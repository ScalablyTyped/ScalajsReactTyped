package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Property
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XHierarchicalPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XHierarchicalNameReplace
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.ChangesSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XChangesBatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XReadWriteAccess
  extends StObject
     with XHierarchicalNameReplace
     with XChangesBatch
     with XHierarchicalPropertySetInfo
object XReadWriteAccess {
  
  inline def apply(
    PendingChanges: ChangesSet,
    acquire: Callback,
    commitChanges: Callback,
    getByHierarchicalName: String => Any,
    getPendingChanges: CallbackTo[ChangesSet],
    getPropertyByHierarchicalName: String => Property,
    hasByHierarchicalName: String => Boolean,
    hasPendingChanges: CallbackTo[Boolean],
    hasPropertyByHierarchicalName: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    replaceByHierarchicalName: (String, Any) => Callback
  ): XReadWriteAccess = {
    val __obj = js.Dynamic.literal(PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = acquire.toJsFn, commitChanges = commitChanges.toJsFn, getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getPendingChanges = getPendingChanges.toJsFn, getPropertyByHierarchicalName = js.Any.fromFunction1(getPropertyByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasPendingChanges = hasPendingChanges.toJsFn, hasPropertyByHierarchicalName = js.Any.fromFunction1(hasPropertyByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, replaceByHierarchicalName = js.Any.fromFunction2((t0: String, t1: Any) => (replaceByHierarchicalName(t0, t1)).runNow()))
    __obj.asInstanceOf[XReadWriteAccess]
  }
}
