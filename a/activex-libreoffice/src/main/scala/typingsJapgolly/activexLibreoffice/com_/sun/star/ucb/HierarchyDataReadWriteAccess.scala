package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XSingleServiceFactory
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.ChangesSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XChangesBatch
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XChangesListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides read and write access to a fragment of the hierarchy data. */
trait HierarchyDataReadWriteAccess
  extends StObject
     with HierarchyDataReadAccess
     with XNameContainer
     with XSingleServiceFactory
     with XChangesBatch
object HierarchyDataReadWriteAccess {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    PendingChanges: ChangesSet,
    acquire: Callback,
    addChangesListener: XChangesListener => Callback,
    addEventListener: XEventListener => Callback,
    commitChanges: Callback,
    createInstance: CallbackTo[XInterface],
    createInstanceWithArguments: SeqEquiv[Any] => XInterface,
    dispose: Callback,
    getByHierarchicalName: String => Any,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    getPendingChanges: CallbackTo[ChangesSet],
    hasByHierarchicalName: String => Boolean,
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    hasPendingChanges: CallbackTo[Boolean],
    insertByName: (String, Any) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByName: String => Callback,
    removeChangesListener: XChangesListener => Callback,
    removeEventListener: XEventListener => Callback,
    replaceByName: (String, Any) => Callback
  ): HierarchyDataReadWriteAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = acquire.toJsFn, addChangesListener = js.Any.fromFunction1((t0: XChangesListener) => addChangesListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), commitChanges = commitChanges.toJsFn, createInstance = createInstance.toJsFn, createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), dispose = dispose.toJsFn, getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, getPendingChanges = getPendingChanges.toJsFn, hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, hasPendingChanges = hasPendingChanges.toJsFn, insertByName = js.Any.fromFunction2((t0: String, t1: Any) => (insertByName(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()), removeChangesListener = js.Any.fromFunction1((t0: XChangesListener) => removeChangesListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), replaceByName = js.Any.fromFunction2((t0: String, t1: Any) => (replaceByName(t0, t1)).runNow()))
    __obj.asInstanceOf[HierarchyDataReadWriteAccess]
  }
}
