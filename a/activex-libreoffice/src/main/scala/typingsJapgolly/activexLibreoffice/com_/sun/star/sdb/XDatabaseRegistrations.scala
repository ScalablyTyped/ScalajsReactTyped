package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the application-wide registered databases.
  *
  * This interface provides a mere wrapper around the respective configuration data, this way hiding the concrete configuration structure from its
  * clients. You should, if possible at all, use this interface, instead of modifying or querying the configuration data directly.
  * @since OOo 3.3
  */
trait XDatabaseRegistrations extends StObject {
  
  /** returns the names of all registered databases */
  val RegistrationNames: SafeArray[String]
  
  /** registers a listener which is notified of changes in the registered databases */
  def addDatabaseRegistrationsListener(Listener: XDatabaseRegistrationsListener): Unit
  
  /**
    * changes the location of a given database registration
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty, or the given location is invalid.
    * @throws com::sun::star::container::NoSuchElementException if there is no database registered under this name
    * @throws com::sun::star::lang::IllegalAccessException if the registration data for this database is read-only
    */
  def changeDatabaseLocation(Name: String, NewLocation: String): Unit
  
  /**
    * returns the location of the database registered under the given name
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty
    * @throws com::sun::star::container::NoSuchElementException if there is no database registered under this name
    */
  def getDatabaseLocation(Name: String): String
  
  /** returns the names of all registered databases */
  def getRegistrationNames(): SafeArray[String]
  
  /**
    * determines whether a database is registered under the given name.
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty
    */
  def hasRegisteredDatabase(Name: String): Boolean
  
  /**
    * determines whether the registration data for a database given by name is read-only.
    *
    * In this case, attempts to revoke this registration will fail.
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty
    * @throws com::sun::star::container::NoSuchElementException if there is no database registered under this name
    */
  def isDatabaseRegistrationReadOnly(Name: String): Boolean
  
  /**
    * registers a database, given by location, under a given name
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty, or the given location is invalid.
    * @throws com::sun::star::container::ElementExistException if there already is a databases registered under the given name.
    */
  def registerDatabaseLocation(Name: String, Location: String): Unit
  
  /** revokes a previously registered listener */
  def removeDatabaseRegistrationsListener(Listener: XDatabaseRegistrationsListener): Unit
  
  /**
    * revokes the registration of a database, given by name
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty
    * @throws com::sun::star::container::NoSuchElementException if there is no database registered under this name
    * @throws com::sun::star::lang::IllegalAccessException if the registration data for this database is read-only
    */
  def revokeDatabaseLocation(Name: String): Unit
}
object XDatabaseRegistrations {
  
  inline def apply(
    RegistrationNames: SafeArray[String],
    addDatabaseRegistrationsListener: XDatabaseRegistrationsListener => Callback,
    changeDatabaseLocation: (String, String) => Callback,
    getDatabaseLocation: String => String,
    getRegistrationNames: CallbackTo[SafeArray[String]],
    hasRegisteredDatabase: String => Boolean,
    isDatabaseRegistrationReadOnly: String => Boolean,
    registerDatabaseLocation: (String, String) => Callback,
    removeDatabaseRegistrationsListener: XDatabaseRegistrationsListener => Callback,
    revokeDatabaseLocation: String => Callback
  ): XDatabaseRegistrations = {
    val __obj = js.Dynamic.literal(RegistrationNames = RegistrationNames.asInstanceOf[js.Any], addDatabaseRegistrationsListener = js.Any.fromFunction1((t0: XDatabaseRegistrationsListener) => addDatabaseRegistrationsListener(t0).runNow()), changeDatabaseLocation = js.Any.fromFunction2((t0: String, t1: String) => (changeDatabaseLocation(t0, t1)).runNow()), getDatabaseLocation = js.Any.fromFunction1(getDatabaseLocation), getRegistrationNames = getRegistrationNames.toJsFn, hasRegisteredDatabase = js.Any.fromFunction1(hasRegisteredDatabase), isDatabaseRegistrationReadOnly = js.Any.fromFunction1(isDatabaseRegistrationReadOnly), registerDatabaseLocation = js.Any.fromFunction2((t0: String, t1: String) => (registerDatabaseLocation(t0, t1)).runNow()), removeDatabaseRegistrationsListener = js.Any.fromFunction1((t0: XDatabaseRegistrationsListener) => removeDatabaseRegistrationsListener(t0).runNow()), revokeDatabaseLocation = js.Any.fromFunction1((t0: String) => revokeDatabaseLocation(t0).runNow()))
    __obj.asInstanceOf[XDatabaseRegistrations]
  }
  
  extension [Self <: XDatabaseRegistrations](x: Self) {
    
    inline def setAddDatabaseRegistrationsListener(value: XDatabaseRegistrationsListener => Callback): Self = StObject.set(x, "addDatabaseRegistrationsListener", js.Any.fromFunction1((t0: XDatabaseRegistrationsListener) => value(t0).runNow()))
    
    inline def setChangeDatabaseLocation(value: (String, String) => Callback): Self = StObject.set(x, "changeDatabaseLocation", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setGetDatabaseLocation(value: String => String): Self = StObject.set(x, "getDatabaseLocation", js.Any.fromFunction1(value))
    
    inline def setGetRegistrationNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getRegistrationNames", value.toJsFn)
    
    inline def setHasRegisteredDatabase(value: String => Boolean): Self = StObject.set(x, "hasRegisteredDatabase", js.Any.fromFunction1(value))
    
    inline def setIsDatabaseRegistrationReadOnly(value: String => Boolean): Self = StObject.set(x, "isDatabaseRegistrationReadOnly", js.Any.fromFunction1(value))
    
    inline def setRegisterDatabaseLocation(value: (String, String) => Callback): Self = StObject.set(x, "registerDatabaseLocation", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setRegistrationNames(value: SafeArray[String]): Self = StObject.set(x, "RegistrationNames", value.asInstanceOf[js.Any])
    
    inline def setRemoveDatabaseRegistrationsListener(value: XDatabaseRegistrationsListener => Callback): Self = StObject.set(x, "removeDatabaseRegistrationsListener", js.Any.fromFunction1((t0: XDatabaseRegistrationsListener) => value(t0).runNow()))
    
    inline def setRevokeDatabaseLocation(value: String => Callback): Self = StObject.set(x, "revokeDatabaseLocation", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
