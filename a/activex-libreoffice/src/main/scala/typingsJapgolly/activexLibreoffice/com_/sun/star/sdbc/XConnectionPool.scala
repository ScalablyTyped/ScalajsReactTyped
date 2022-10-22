package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XConnectionPool
  extends StObject
     with XDriverManager
     with XDriverAccess
object XConnectionPool {
  
  inline def apply(
    LoginTimeout: Double,
    acquire: Callback,
    getConnection: String => XConnection,
    getConnectionWithInfo: (String, SeqEquiv[PropertyValue]) => XConnection,
    getDriverByURL: String => XDriver,
    getLoginTimeout: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setLoginTimeout: Double => Callback
  ): XConnectionPool = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout.asInstanceOf[js.Any], acquire = acquire.toJsFn, getConnection = js.Any.fromFunction1(getConnection), getConnectionWithInfo = js.Any.fromFunction2(getConnectionWithInfo), getDriverByURL = js.Any.fromFunction1(getDriverByURL), getLoginTimeout = getLoginTimeout.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setLoginTimeout = js.Any.fromFunction1((t0: Double) => setLoginTimeout(t0).runNow()))
    __obj.asInstanceOf[XConnectionPool]
  }
}
