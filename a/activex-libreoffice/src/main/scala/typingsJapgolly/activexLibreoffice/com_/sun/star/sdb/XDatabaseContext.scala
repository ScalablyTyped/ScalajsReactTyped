package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainerListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XSingleServiceFactory
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XNamingService
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides an interface for the new-style {@link DatabaseContext} service to implement.
  * @since LibreOffice 4.0
  */
trait XDatabaseContext
  extends StObject
     with XEnumerationAccess
     with XNameAccess
     with XNamingService
     with XContainer
     with XSingleServiceFactory
     with XDatabaseRegistrations
object XDatabaseContext {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    RegistrationNames: SafeArray[String],
    acquire: Callback,
    addContainerListener: XContainerListener => Callback,
    addDatabaseRegistrationsListener: XDatabaseRegistrationsListener => Callback,
    changeDatabaseLocation: (String, String) => Callback,
    createEnumeration: CallbackTo[XEnumeration],
    createInstance: CallbackTo[XInterface],
    createInstanceWithArguments: SeqEquiv[Any] => XInterface,
    getByName: String => Any,
    getDatabaseLocation: String => String,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    getRegisteredObject: String => XInterface,
    getRegistrationNames: CallbackTo[SafeArray[String]],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    hasRegisteredDatabase: String => Boolean,
    isDatabaseRegistrationReadOnly: String => Boolean,
    queryInterface: `type` => Any,
    registerDatabaseLocation: (String, String) => Callback,
    registerObject: (String, XInterface) => Callback,
    release: Callback,
    removeContainerListener: XContainerListener => Callback,
    removeDatabaseRegistrationsListener: XDatabaseRegistrationsListener => Callback,
    revokeDatabaseLocation: String => Callback,
    revokeObject: String => Callback
  ): XDatabaseContext = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], RegistrationNames = RegistrationNames.asInstanceOf[js.Any], acquire = acquire.toJsFn, addContainerListener = js.Any.fromFunction1((t0: XContainerListener) => addContainerListener(t0).runNow()), addDatabaseRegistrationsListener = js.Any.fromFunction1((t0: XDatabaseRegistrationsListener) => addDatabaseRegistrationsListener(t0).runNow()), changeDatabaseLocation = js.Any.fromFunction2((t0: String, t1: String) => (changeDatabaseLocation(t0, t1)).runNow()), createEnumeration = createEnumeration.toJsFn, createInstance = createInstance.toJsFn, createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), getByName = js.Any.fromFunction1(getByName), getDatabaseLocation = js.Any.fromFunction1(getDatabaseLocation), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, getRegisteredObject = js.Any.fromFunction1(getRegisteredObject), getRegistrationNames = getRegistrationNames.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, hasRegisteredDatabase = js.Any.fromFunction1(hasRegisteredDatabase), isDatabaseRegistrationReadOnly = js.Any.fromFunction1(isDatabaseRegistrationReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), registerDatabaseLocation = js.Any.fromFunction2((t0: String, t1: String) => (registerDatabaseLocation(t0, t1)).runNow()), registerObject = js.Any.fromFunction2((t0: String, t1: XInterface) => (registerObject(t0, t1)).runNow()), release = release.toJsFn, removeContainerListener = js.Any.fromFunction1((t0: XContainerListener) => removeContainerListener(t0).runNow()), removeDatabaseRegistrationsListener = js.Any.fromFunction1((t0: XDatabaseRegistrationsListener) => removeDatabaseRegistrationsListener(t0).runNow()), revokeDatabaseLocation = js.Any.fromFunction1((t0: String) => revokeDatabaseLocation(t0).runNow()), revokeObject = js.Any.fromFunction1((t0: String) => revokeObject(t0).runNow()))
    __obj.asInstanceOf[XDatabaseContext]
  }
}
