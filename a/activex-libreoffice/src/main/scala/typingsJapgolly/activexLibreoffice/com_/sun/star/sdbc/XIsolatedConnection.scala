package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used for establishing isolated connections via a factory.
  *
  * The {@link XIsolatedConnection} allows to create connections which are not shared among others as it is the case when creating connections in normal
  * way.
  * @see com.sun.star.sdb.DataSource
  * @since OOo 1.1.2
  */
trait XIsolatedConnection
  extends StObject
     with XInterface {
  
  /**
    * attempts to establish a database connection.
    * @param user The user name.
    * @param password The password.
    * @returns A connection which is not shared.
    * @throws com::sun::star::sdbc::SQLException when an error occurs.
    */
  def getIsolatedConnection(user: String, password: String): XConnection
  
  /**
    * attempts to establish a database connection.
    *
    * If information is missing, such as a user's password, they are completed by user interaction.
    * @param handler The handler which ask for the needed information when they are missing.
    * @returns A connection which is not shared.
    * @throws com::sun::star::sdbc::SQLException when an error occurs.
    */
  def getIsolatedConnectionWithCompletion(handler: XInteractionHandler): XConnection
}
object XIsolatedConnection {
  
  inline def apply(
    acquire: Callback,
    getIsolatedConnection: (String, String) => XConnection,
    getIsolatedConnectionWithCompletion: XInteractionHandler => XConnection,
    queryInterface: `type` => Any,
    release: Callback
  ): XIsolatedConnection = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getIsolatedConnectionWithCompletion = js.Any.fromFunction1(getIsolatedConnectionWithCompletion), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XIsolatedConnection]
  }
  
  extension [Self <: XIsolatedConnection](x: Self) {
    
    inline def setGetIsolatedConnection(value: (String, String) => XConnection): Self = StObject.set(x, "getIsolatedConnection", js.Any.fromFunction2(value))
    
    inline def setGetIsolatedConnectionWithCompletion(value: XInteractionHandler => XConnection): Self = StObject.set(x, "getIsolatedConnectionWithCompletion", js.Any.fromFunction1(value))
  }
}
