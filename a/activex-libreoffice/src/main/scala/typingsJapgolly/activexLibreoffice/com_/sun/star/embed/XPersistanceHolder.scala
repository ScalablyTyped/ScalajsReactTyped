package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to disconnect an object from its persistence. */
trait XPersistanceHolder
  extends StObject
     with XInterface {
  
  /**
    * connects the object to a persistence.
    * @param xStream a stream that specify the persistence
    * @throws com::sun::star::io::IOException in case of io problems
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def connectPersistance(xStream: XStream): Unit
  
  /**
    * disconnects the object from the persistence.
    * @throws com::sun::star::io::IOException in case of io problems
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def disconnectPersistence(): Unit
}
object XPersistanceHolder {
  
  inline def apply(
    acquire: Callback,
    connectPersistance: XStream => Callback,
    disconnectPersistence: Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XPersistanceHolder = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, connectPersistance = js.Any.fromFunction1((t0: XStream) => connectPersistance(t0).runNow()), disconnectPersistence = disconnectPersistence.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPersistanceHolder]
  }
  
  extension [Self <: XPersistanceHolder](x: Self) {
    
    inline def setConnectPersistance(value: XStream => Callback): Self = StObject.set(x, "connectPersistance", js.Any.fromFunction1((t0: XStream) => value(t0).runNow()))
    
    inline def setDisconnectPersistence(value: Callback): Self = StObject.set(x, "disconnectPersistence", value.toJsFn)
  }
}
