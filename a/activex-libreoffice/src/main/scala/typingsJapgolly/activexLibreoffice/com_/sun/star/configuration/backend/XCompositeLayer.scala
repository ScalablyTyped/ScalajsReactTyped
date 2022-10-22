package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides read access to layers that contain sublayers accessible through an additional criterion (for instance the locale they contain data for).
  * @since OOo 1.1.2
  */
trait XCompositeLayer
  extends StObject
     with XLayer {
  
  /**
    * Returns a list of the criteria that can be used to access the sublayers.
    * @returns a list supported sublayer identifiers
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the retrieval of the data.
    */
  def listSubLayerIds(): SafeArray[String]
  
  /**
    * Describes the content of a particular sublayer to an {@link XLayerHandler} .
    * @param aHandler Handler object that will receive calls describing the contents of the sublayer.
    * @param aSubLayerId Identifier of the sublayer to be read. Must be one the identifiers returned by {@link XCompositeLayer.listSubLayerIds()}
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::IllegalArgumentException if the identifier is invalid.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the access to or processing of the data.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XLayerHandler} .
    */
  def readSubLayerData(aHandler: XLayerHandler, aSubLayerId: String): Unit
}
object XCompositeLayer {
  
  inline def apply(
    acquire: Callback,
    listSubLayerIds: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    readData: XLayerHandler => Callback,
    readSubLayerData: (XLayerHandler, String) => Callback,
    release: Callback
  ): XCompositeLayer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, listSubLayerIds = listSubLayerIds.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1((t0: XLayerHandler) => readData(t0).runNow()), readSubLayerData = js.Any.fromFunction2((t0: XLayerHandler, t1: String) => (readSubLayerData(t0, t1)).runNow()), release = release.toJsFn)
    __obj.asInstanceOf[XCompositeLayer]
  }
  
  extension [Self <: XCompositeLayer](x: Self) {
    
    inline def setListSubLayerIds(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "listSubLayerIds", value.toJsFn)
    
    inline def setReadSubLayerData(value: (XLayerHandler, String) => Callback): Self = StObject.set(x, "readSubLayerData", js.Any.fromFunction2((t0: XLayerHandler, t1: String) => (value(t0, t1)).runNow()))
  }
}
