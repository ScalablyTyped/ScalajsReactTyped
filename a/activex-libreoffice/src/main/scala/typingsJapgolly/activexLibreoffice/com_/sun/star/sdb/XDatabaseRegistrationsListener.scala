package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * implemented by components which want to be notified of changes in the application-wide registered databases.
  * @see XDatabaseRegistrations
  * @since OOo 3.3
  */
trait XDatabaseRegistrationsListener
  extends StObject
     with XEventListener {
  
  /**
    * called when a the location of a registered database changed
    *
    * Note that this talks about registration data only. That is, if the actual file denoted by the database registration is moved, this is in no way
    * monitored or reported. Only (successful) calls to {@link XDatabaseRegistrations.changeDatabaseLocation()} are reported here.
    */
  def changedDatabaseLocation(Event: DatabaseRegistrationEvent): Unit
  
  /** called when a database has been registered */
  def registeredDatabaseLocation(Event: DatabaseRegistrationEvent): Unit
  
  /** called when a database registration has been revoked */
  def revokedDatabaseLocation(Event: DatabaseRegistrationEvent): Unit
}
object XDatabaseRegistrationsListener {
  
  inline def apply(
    acquire: Callback,
    changedDatabaseLocation: DatabaseRegistrationEvent => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    registeredDatabaseLocation: DatabaseRegistrationEvent => Callback,
    release: Callback,
    revokedDatabaseLocation: DatabaseRegistrationEvent => Callback
  ): XDatabaseRegistrationsListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, changedDatabaseLocation = js.Any.fromFunction1((t0: DatabaseRegistrationEvent) => changedDatabaseLocation(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), registeredDatabaseLocation = js.Any.fromFunction1((t0: DatabaseRegistrationEvent) => registeredDatabaseLocation(t0).runNow()), release = release.toJsFn, revokedDatabaseLocation = js.Any.fromFunction1((t0: DatabaseRegistrationEvent) => revokedDatabaseLocation(t0).runNow()))
    __obj.asInstanceOf[XDatabaseRegistrationsListener]
  }
  
  extension [Self <: XDatabaseRegistrationsListener](x: Self) {
    
    inline def setChangedDatabaseLocation(value: DatabaseRegistrationEvent => Callback): Self = StObject.set(x, "changedDatabaseLocation", js.Any.fromFunction1((t0: DatabaseRegistrationEvent) => value(t0).runNow()))
    
    inline def setRegisteredDatabaseLocation(value: DatabaseRegistrationEvent => Callback): Self = StObject.set(x, "registeredDatabaseLocation", js.Any.fromFunction1((t0: DatabaseRegistrationEvent) => value(t0).runNow()))
    
    inline def setRevokedDatabaseLocation(value: DatabaseRegistrationEvent => Callback): Self = StObject.set(x, "revokedDatabaseLocation", js.Any.fromFunction1((t0: DatabaseRegistrationEvent) => value(t0).runNow()))
  }
}
