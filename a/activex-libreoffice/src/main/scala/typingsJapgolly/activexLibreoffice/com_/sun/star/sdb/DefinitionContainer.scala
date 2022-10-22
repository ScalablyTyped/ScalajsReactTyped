package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XSingleServiceFactory
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XRefreshable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a container which provides access to database related definitions like commands, forms, and reports.
  *
  * The container supports access to its elements by the elements name or by the elements position.
  *
  * Simple enumeration must be supported as well.
  *
  * To reflect the changes with the underlying database, a refresh mechanism needs to be supported.
  */
trait DefinitionContainer
  extends StObject
     with XNameContainer
     with XIndexAccess
     with XEnumerationAccess
     with XRefreshable
     with XSingleServiceFactory
object DefinitionContainer {
  
  inline def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    addRefreshListener: XRefreshListener => Callback,
    createEnumeration: CallbackTo[XEnumeration],
    createInstance: CallbackTo[XInterface],
    createInstanceWithArguments: SeqEquiv[Any] => XInterface,
    getByIndex: Double => Any,
    getByName: String => Any,
    getCount: CallbackTo[Double],
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    insertByName: (String, Any) => Callback,
    queryInterface: `type` => Any,
    refresh: Callback,
    release: Callback,
    removeByName: String => Callback,
    removeRefreshListener: XRefreshListener => Callback,
    replaceByName: (String, Any) => Callback
  ): DefinitionContainer = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => addRefreshListener(t0).runNow()), createEnumeration = createEnumeration.toJsFn, createInstance = createInstance.toJsFn, createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = getCount.toJsFn, getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, insertByName = js.Any.fromFunction2((t0: String, t1: Any) => (insertByName(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), refresh = refresh.toJsFn, release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()), removeRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => removeRefreshListener(t0).runNow()), replaceByName = js.Any.fromFunction2((t0: String, t1: Any) => (replaceByName(t0, t1)).runNow()))
    __obj.asInstanceOf[DefinitionContainer]
  }
}
