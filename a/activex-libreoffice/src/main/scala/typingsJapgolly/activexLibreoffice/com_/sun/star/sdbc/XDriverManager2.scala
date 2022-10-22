package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the basic interface for managing a set of SDBC drivers.
  *
  * As part of its initialization, the {@link DriverManager} service will attempt to load the registered drivers.
  *
  * When the method `getConnection` is called, the {@link DriverManager} will attempt to locate a suitable driver.
  * @see com.sun.star.sdbc.XDriver
  * @see com.sun.star.sdbc.XConnection
  * @since LibreOffice 4.0
  */
trait XDriverManager2
  extends StObject
     with XDriverManager
     with XDriverAccess
     with XEnumerationAccess
object XDriverManager2 {
  
  inline def apply(
    ElementType: `type`,
    LoginTimeout: Double,
    acquire: Callback,
    createEnumeration: CallbackTo[XEnumeration],
    getConnection: String => XConnection,
    getConnectionWithInfo: (String, SeqEquiv[PropertyValue]) => XConnection,
    getDriverByURL: String => XDriver,
    getElementType: CallbackTo[`type`],
    getLoginTimeout: CallbackTo[Double],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setLoginTimeout: Double => Callback
  ): XDriverManager2 = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], LoginTimeout = LoginTimeout.asInstanceOf[js.Any], acquire = acquire.toJsFn, createEnumeration = createEnumeration.toJsFn, getConnection = js.Any.fromFunction1(getConnection), getConnectionWithInfo = js.Any.fromFunction2(getConnectionWithInfo), getDriverByURL = js.Any.fromFunction1(getDriverByURL), getElementType = getElementType.toJsFn, getLoginTimeout = getLoginTimeout.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setLoginTimeout = js.Any.fromFunction1((t0: Double) => setLoginTimeout(t0).runNow()))
    __obj.asInstanceOf[XDriverManager2]
  }
}
