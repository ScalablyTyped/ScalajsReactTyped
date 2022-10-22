package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to make UNO objects persistent
  *
  * Every UNO object, that wants to be serializable, should implement this interface. The object stores stores itself, when the write method is called.
  *
  * The object needs to be created before it deserializes itself again (by using the read method). Therefore it must be creatable by name via a factory,
  * which is in general the global service manager. The create and read mechanism is implemented by the {@link com.sun.star.io.ObjectInputStream} .
  *
  * The serialization format (the series of strings, integers, objects) must be specified at the specification of the concrete service.
  *
  * The interface does not support any special versioning mechanism.
  * @see com.sun.star.io.XObjectOutputStream
  * @see com.sun.star.io.XObjectInputStream
  */
trait XPersistObject
  extends StObject
     with XInterface {
  
  /**
    * gives the service name of the object
    *
    * This name is used to create such an object by a factory during deserialization.
    * @returns the service name that specifies the behavior and the persistent data format of this implementation.
    * @see com.sun.star.lang.XMultiComponentFactory.getAvailableServiceNames()
    */
  val ServiceName: String
  
  /**
    * gives the service name of the object
    *
    * This name is used to create such an object by a factory during deserialization.
    * @returns the service name that specifies the behavior and the persistent data format of this implementation.
    * @see com.sun.star.lang.XMultiComponentFactory.getAvailableServiceNames()
    */
  def getServiceName(): String
  
  /**
    * reads all the persistent data of the object from the stream.
    *
    * In case other XPersistObjects are read from the stream, the implementation uses a factory to create these objects (in general the global service
    * manager).
    *
    * The implementation must read the data in the order documented at the service specification.
    * @param InStream the stream, the data shall be read from.
    */
  def read(InStream: XObjectInputStream): Unit
  
  /**
    * writes all the persistent data of the object to the stream.
    *
    * The implementation must write the data in the order documented in the service specification.
    * @param OutStream the stream, the data shall be written to. The stream supports simple types and other {@link XPersistObject} implementations.
    */
  def write(OutStream: XObjectOutputStream): Unit
}
object XPersistObject {
  
  inline def apply(
    ServiceName: String,
    acquire: Callback,
    getServiceName: CallbackTo[String],
    queryInterface: `type` => Any,
    read: XObjectInputStream => Callback,
    release: Callback,
    write: XObjectOutputStream => Callback
  ): XPersistObject = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getServiceName = getServiceName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1((t0: XObjectInputStream) => read(t0).runNow()), release = release.toJsFn, write = js.Any.fromFunction1((t0: XObjectOutputStream) => write(t0).runNow()))
    __obj.asInstanceOf[XPersistObject]
  }
  
  extension [Self <: XPersistObject](x: Self) {
    
    inline def setGetServiceName(value: CallbackTo[String]): Self = StObject.set(x, "getServiceName", value.toJsFn)
    
    inline def setRead(value: XObjectInputStream => Callback): Self = StObject.set(x, "read", js.Any.fromFunction1((t0: XObjectInputStream) => value(t0).runNow()))
    
    inline def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: XObjectOutputStream => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: XObjectOutputStream) => value(t0).runNow()))
  }
}
