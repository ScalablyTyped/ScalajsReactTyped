package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to a read-write layer of configuration data for a given component and entity.
  * @since OOo 1.1.2
  */
trait XUpdatableLayer
  extends StObject
     with XLayer {
  
  /**
    * Replaces the current layer with the layer given as input parameter.
    *
    * After the replacement has been performed, reading the layer will return the new content. Some implementations may not support this, so after an update
    * {@link XLayer.readData()} may fail.
    * @param aNewLayer replacement layer
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during the replacement.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the layer contains invalid data.
    */
  def replaceWith(aNewLayer: XLayer): Unit
}
object XUpdatableLayer {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    readData: XLayerHandler => Callback,
    release: Callback,
    replaceWith: XLayer => Callback
  ): XUpdatableLayer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1((t0: XLayerHandler) => readData(t0).runNow()), release = release.toJsFn, replaceWith = js.Any.fromFunction1((t0: XLayer) => replaceWith(t0).runNow()))
    __obj.asInstanceOf[XUpdatableLayer]
  }
  
  extension [Self <: XUpdatableLayer](x: Self) {
    
    inline def setReplaceWith(value: XLayer => Callback): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1((t0: XLayer) => value(t0).runNow()))
  }
}
