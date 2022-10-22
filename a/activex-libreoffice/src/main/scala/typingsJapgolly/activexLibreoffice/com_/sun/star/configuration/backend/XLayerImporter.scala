package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows importing a layer into a {@link Backend}
  * @since OOo 1.1.2
  */
trait XLayerImporter
  extends StObject
     with XInterface {
  
  /**
    * gets the target backend for importing.
    * @returns the {@link Backend} into which layers are imported by {@link XLayerImporter.importLayer()} .
    */
  var TargetBackend: XBackend
  
  /**
    * gets the target backend for importing.
    * @returns the {@link Backend} into which layers are imported by {@link XLayerImporter.importLayer()} .
    */
  def getTargetBackend(): XBackend
  
  /**
    * Imports the layer given into the backend.
    *
    * This method imports data for the current entity of the backend.
    * @param aLayer a layer whose data will be imported into the backend
    * @see com.sun.star.configuration.backend.XBackend.getOwnUpdateHandler()
    * @throws com::sun::star::lang::NullPointerException if the layer passed is `NULL` or no backend is available.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the layer passed is invalid
    * @throws com::sun::star::lang::IllegalArgumentException if the layer passed is for a component that doesn't exist in the backend
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the backend or source layer.
    */
  def importLayer(aLayer: XLayer): Unit
  
  /**
    * Imports the layer given into the backend for a given entity.
    *
    * This method imports data for the current entity of the backend.
    * @param aLayer a layer whose data will be imported into the backend
    * @param aEntity a entity into whose data the layer will be imported
    * @see com.sun.star.configuration.backend.XBackend.getUpdateHandler()
    * @throws com::sun::star::lang::NullPointerException if the layer passed is `NULL` or no backend is available.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the layer passed is invalid
    * @throws com::sun::star::lang::IllegalArgumentException if the layer passed is for a component that doesn't exist in the backend or if the entity doesn't
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the backend or source layer.
    */
  def importLayerForEntity(aLayer: XLayer, aEntity: String): Unit
  
  /**
    * sets the target backend for importing.
    * @param aBackend a {@link Backend} into which layers should be imported by {@link XLayerImporter.importLayer()} .
    * @throws com::sun::star::lang::NullPointerException if the backend passed is `NULL` .
    */
  def setTargetBackend(aBackend: XBackend): Unit
}
object XLayerImporter {
  
  inline def apply(
    TargetBackend: XBackend,
    acquire: Callback,
    getTargetBackend: CallbackTo[XBackend],
    importLayer: XLayer => Callback,
    importLayerForEntity: (XLayer, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setTargetBackend: XBackend => Callback
  ): XLayerImporter = {
    val __obj = js.Dynamic.literal(TargetBackend = TargetBackend.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTargetBackend = getTargetBackend.toJsFn, importLayer = js.Any.fromFunction1((t0: XLayer) => importLayer(t0).runNow()), importLayerForEntity = js.Any.fromFunction2((t0: XLayer, t1: String) => (importLayerForEntity(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setTargetBackend = js.Any.fromFunction1((t0: XBackend) => setTargetBackend(t0).runNow()))
    __obj.asInstanceOf[XLayerImporter]
  }
  
  extension [Self <: XLayerImporter](x: Self) {
    
    inline def setGetTargetBackend(value: CallbackTo[XBackend]): Self = StObject.set(x, "getTargetBackend", value.toJsFn)
    
    inline def setImportLayer(value: XLayer => Callback): Self = StObject.set(x, "importLayer", js.Any.fromFunction1((t0: XLayer) => value(t0).runNow()))
    
    inline def setImportLayerForEntity(value: (XLayer, String) => Callback): Self = StObject.set(x, "importLayerForEntity", js.Any.fromFunction2((t0: XLayer, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetTargetBackend(value: XBackend => Callback): Self = StObject.set(x, "setTargetBackend", js.Any.fromFunction1((t0: XBackend) => value(t0).runNow()))
    
    inline def setTargetBackend(value: XBackend): Self = StObject.set(x, "TargetBackend", value.asInstanceOf[js.Any])
  }
}
