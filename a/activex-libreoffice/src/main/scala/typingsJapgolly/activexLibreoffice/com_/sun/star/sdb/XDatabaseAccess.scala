package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is not to be used anymore
  * @deprecated Deprecated
  */
trait XDatabaseAccess
  extends StObject
     with XDataSource {
  
  def addDatabaseAccessListener(listener: XDatabaseAccessListener): Unit
  
  def getIsolatedConnection(user: String, password: String): XConnection
  
  def hasConnections(): Boolean
  
  def removeDatabaseAccessListener(listener: XDatabaseAccessListener): Unit
  
  def suspendConnections(): Boolean
}
object XDatabaseAccess {
  
  inline def apply(
    LoginTimeout: Double,
    acquire: Callback,
    addDatabaseAccessListener: XDatabaseAccessListener => Callback,
    getConnection: (String, String) => XConnection,
    getIsolatedConnection: (String, String) => XConnection,
    getLoginTimeout: CallbackTo[Double],
    hasConnections: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeDatabaseAccessListener: XDatabaseAccessListener => Callback,
    setLoginTimeout: Double => Callback,
    suspendConnections: CallbackTo[Boolean]
  ): XDatabaseAccess = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout.asInstanceOf[js.Any], acquire = acquire.toJsFn, addDatabaseAccessListener = js.Any.fromFunction1((t0: XDatabaseAccessListener) => addDatabaseAccessListener(t0).runNow()), getConnection = js.Any.fromFunction2(getConnection), getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getLoginTimeout = getLoginTimeout.toJsFn, hasConnections = hasConnections.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeDatabaseAccessListener = js.Any.fromFunction1((t0: XDatabaseAccessListener) => removeDatabaseAccessListener(t0).runNow()), setLoginTimeout = js.Any.fromFunction1((t0: Double) => setLoginTimeout(t0).runNow()), suspendConnections = suspendConnections.toJsFn)
    __obj.asInstanceOf[XDatabaseAccess]
  }
  
  extension [Self <: XDatabaseAccess](x: Self) {
    
    inline def setAddDatabaseAccessListener(value: XDatabaseAccessListener => Callback): Self = StObject.set(x, "addDatabaseAccessListener", js.Any.fromFunction1((t0: XDatabaseAccessListener) => value(t0).runNow()))
    
    inline def setGetIsolatedConnection(value: (String, String) => XConnection): Self = StObject.set(x, "getIsolatedConnection", js.Any.fromFunction2(value))
    
    inline def setHasConnections(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasConnections", value.toJsFn)
    
    inline def setRemoveDatabaseAccessListener(value: XDatabaseAccessListener => Callback): Self = StObject.set(x, "removeDatabaseAccessListener", js.Any.fromFunction1((t0: XDatabaseAccessListener) => value(t0).runNow()))
    
    inline def setSuspendConnections(value: CallbackTo[Boolean]): Self = StObject.set(x, "suspendConnections", value.toJsFn)
  }
}
