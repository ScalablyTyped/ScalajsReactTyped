package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides read access to the data contained in a layer.
  * @since OOo 1.1.2
  */
trait XLayer
  extends StObject
     with XInterface {
  
  /**
    * describes the contents of the layer to an {@link XLayerHandler} .
    * @param aHandler Handler object that will receive calls describing the contents of the layer
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the access to or processing of the data.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XLayerHandler} .
    */
  def readData(aHandler: XLayerHandler): Unit
}
object XLayer {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    readData: XLayerHandler => Callback,
    release: Callback
  ): XLayer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1((t0: XLayerHandler) => readData(t0).runNow()), release = release.toJsFn)
    __obj.asInstanceOf[XLayer]
  }
  
  extension [Self <: XLayer](x: Self) {
    
    inline def setReadData(value: XLayerHandler => Callback): Self = StObject.set(x, "readData", js.Any.fromFunction1((t0: XLayerHandler) => value(t0).runNow()))
  }
}
