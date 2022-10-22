package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the interface that every driver class must implement.
  *
  * Each driver should supply a service that implements the {@link Driver} interface.
  *
  * The {@link DriverManager} will try to load as many drivers as it can find, and then for any given connection request, it will ask each driver in turn
  * to try to connect to the target URL.
  *
  * It is strongly recommended that each {@link Driver} object should be small and standalone so that the {@link Driver} object can be loaded and queried
  * without bringing in vast quantities of supporting code.
  * @see com.sun.star.sdbc.XDriverManager
  * @see com.sun.star.sdbc.XConnection
  */
trait XDriver
  extends StObject
     with XInterface {
  
  /**
    * gets the driver's major version number. Initially this should be 1.
    * @returns this driver's major version number
    */
  val MajorVersion: Double
  
  /**
    * gets the driver's minor version number. Initially this should be 0.
    * @returns this driver's minor version number.
    */
  val MinorVersion: Double
  
  /**
    * returns `TRUE` if the driver thinks that it can open a connection to the given URL. Typically drivers will return `TRUE` if they understand the
    * subprotocol specified in the URL and `FALSE` if they do not.
    * @param url is the URL of the database to which to connect.
    * @returns `TRUE` if this driver can connect to the given URL.
    * @throws SQLException if a database access error occurs.
    */
  def acceptsURL(url: String): Boolean
  
  /**
    * attempts to make a database connection to the given URL. The driver should return `NULL` if it realizes it is the wrong kind of driver to connect to
    * the given URL. This will be common, as when the driver manager is asked to connect to a given URL it passes the URL to each loaded driver in turn.
    *
    * The driver should raise a {@link com.sun.star.sdbc.SQLException} if it is the right driver to connect to the given URL, but has trouble connecting to
    * the database.
    *
    * The info argument can be used to pass arbitrary string tag/value pairs as connection arguments. Normally at least "user" and "password" properties
    * should be included in the Properties. For a JDBC driver also the Java class must be supplied in the property named JavaDriverClass, and a class path
    * (a space-separated list of URLs) needed to locate that class can optionally be supplied in a property named JavaDriverClassPath. Possible property
    * value names are when supported by the driver:
    * @param url is the URL of the database to which to connect.
    * @param info a list of arbitrary string tag/value pairs as connection arguments. Normally at least a "user" and "password" property should be included.
    * @returns a {@link Connection} object that represents a connection to the URL
    * @see com.sun.star.sdbc.ConnectionProperties
    * @see com.sun.star.sdbc.ConnectionProperties
    * @throws SQLException if a database access error occurs
    */
  def connect(url: String, info: SeqEquiv[PropertyValue]): XConnection
  
  /**
    * gets the driver's major version number. Initially this should be 1.
    * @returns this driver's major version number
    */
  def getMajorVersion(): Double
  
  /**
    * gets the driver's minor version number. Initially this should be 0.
    * @returns this driver's minor version number.
    */
  def getMinorVersion(): Double
  
  /**
    * gets information about the possible properties for this driver.
    *
    * The getPropertyInfo method is intended to allow a generic GUI tool to discover what properties it should prompt a human for in order to get enough
    * information to connect to a database. Note that depending on the values the human has supplied so far, additional values may become necessary, so it
    * may be necessary to iterate though several calls to getPropertyInfo.
    * @param url is the URL of the database to which to connect.
    * @param info is a proposed list of tag/value pairs that will be sent on connect open.
    * @returns an array of {@link DriverPropertyInfo} objects describing possible properties. This array may be an empty array if no properties are required.
    * @throws SQLException if a database access error occurs.
    */
  def getPropertyInfo(url: String, info: SeqEquiv[PropertyValue]): SafeArray[DriverPropertyInfo]
}
object XDriver {
  
  inline def apply(
    MajorVersion: Double,
    MinorVersion: Double,
    acceptsURL: String => Boolean,
    acquire: Callback,
    connect: (String, SeqEquiv[PropertyValue]) => XConnection,
    getMajorVersion: CallbackTo[Double],
    getMinorVersion: CallbackTo[Double],
    getPropertyInfo: (String, SeqEquiv[PropertyValue]) => SafeArray[DriverPropertyInfo],
    queryInterface: `type` => Any,
    release: Callback
  ): XDriver = {
    val __obj = js.Dynamic.literal(MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], acceptsURL = js.Any.fromFunction1(acceptsURL), acquire = acquire.toJsFn, connect = js.Any.fromFunction2(connect), getMajorVersion = getMajorVersion.toJsFn, getMinorVersion = getMinorVersion.toJsFn, getPropertyInfo = js.Any.fromFunction2(getPropertyInfo), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDriver]
  }
  
  extension [Self <: XDriver](x: Self) {
    
    inline def setAcceptsURL(value: String => Boolean): Self = StObject.set(x, "acceptsURL", js.Any.fromFunction1(value))
    
    inline def setConnect(value: (String, SeqEquiv[PropertyValue]) => XConnection): Self = StObject.set(x, "connect", js.Any.fromFunction2(value))
    
    inline def setGetMajorVersion(value: CallbackTo[Double]): Self = StObject.set(x, "getMajorVersion", value.toJsFn)
    
    inline def setGetMinorVersion(value: CallbackTo[Double]): Self = StObject.set(x, "getMinorVersion", value.toJsFn)
    
    inline def setGetPropertyInfo(value: (String, SeqEquiv[PropertyValue]) => SafeArray[DriverPropertyInfo]): Self = StObject.set(x, "getPropertyInfo", js.Any.fromFunction2(value))
    
    inline def setMajorVersion(value: Double): Self = StObject.set(x, "MajorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(value: Double): Self = StObject.set(x, "MinorVersion", value.asInstanceOf[js.Any])
  }
}
