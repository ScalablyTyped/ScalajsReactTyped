package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XDriverManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is not to be used anymore.
  * @deprecated Deprecated
  */
trait XDatabaseEnvironment
  extends StObject
     with XDriverManager {
  
  def createDatabaseAccess(URL: String, title: String): XDatabaseAccess
  
  def getDatabaseAccess(URL: String): XDatabaseAccess
}
object XDatabaseEnvironment {
  
  inline def apply(
    LoginTimeout: Double,
    acquire: Callback,
    createDatabaseAccess: (String, String) => XDatabaseAccess,
    getConnection: String => XConnection,
    getConnectionWithInfo: (String, SeqEquiv[PropertyValue]) => XConnection,
    getDatabaseAccess: String => XDatabaseAccess,
    getLoginTimeout: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setLoginTimeout: Double => Callback
  ): XDatabaseEnvironment = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout.asInstanceOf[js.Any], acquire = acquire.toJsFn, createDatabaseAccess = js.Any.fromFunction2(createDatabaseAccess), getConnection = js.Any.fromFunction1(getConnection), getConnectionWithInfo = js.Any.fromFunction2(getConnectionWithInfo), getDatabaseAccess = js.Any.fromFunction1(getDatabaseAccess), getLoginTimeout = getLoginTimeout.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setLoginTimeout = js.Any.fromFunction1((t0: Double) => setLoginTimeout(t0).runNow()))
    __obj.asInstanceOf[XDatabaseEnvironment]
  }
  
  extension [Self <: XDatabaseEnvironment](x: Self) {
    
    inline def setCreateDatabaseAccess(value: (String, String) => XDatabaseAccess): Self = StObject.set(x, "createDatabaseAccess", js.Any.fromFunction2(value))
    
    inline def setGetDatabaseAccess(value: String => XDatabaseAccess): Self = StObject.set(x, "getDatabaseAccess", js.Any.fromFunction1(value))
  }
}
