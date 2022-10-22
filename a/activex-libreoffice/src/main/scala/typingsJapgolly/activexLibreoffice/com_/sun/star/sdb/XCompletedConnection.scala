package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used for establishing connections via a factory which is identified by its name. To complete the information needed for establishing a connection
  * an interaction handler is used.
  */
trait XCompletedConnection
  extends StObject
     with XInterface {
  
  /**
    * attempts to establish a database connection. If information is missing, such as a user's password, they are completed by user interaction.
    * @param handler will be asked when more information is needed
    * @returns the {@link Connection} object
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def connectWithCompletion(handler: XInteractionHandler): XConnection
}
object XCompletedConnection {
  
  inline def apply(
    acquire: Callback,
    connectWithCompletion: XInteractionHandler => XConnection,
    queryInterface: `type` => Any,
    release: Callback
  ): XCompletedConnection = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, connectWithCompletion = js.Any.fromFunction1(connectWithCompletion), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCompletedConnection]
  }
  
  extension [Self <: XCompletedConnection](x: Self) {
    
    inline def setConnectWithCompletion(value: XInteractionHandler => XConnection): Self = StObject.set(x, "connectWithCompletion", js.Any.fromFunction1(value))
  }
}
