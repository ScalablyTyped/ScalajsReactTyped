package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describe the contents of a layer to an {@link XLayerHandler} object. The contents of the layer is contained in the sequence of {@link PropertyInfo}
  * structures
  * @see PropertyInfo
  */
trait XLayerContentDescriber
  extends StObject
     with XInterface {
  
  /**
    * describes the contents of the layer to an {@link XLayerHandler} .
    * @param aHandler Handler object that will receive calls describing the contents of the layer
    * @param aPropertyInfos sequence of {@link PropertyInfo} structs contained all required property information
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XLayerHandler} .
    */
  def describeLayer(aHandler: XLayerHandler, aPropertyInfos: SeqEquiv[PropertyInfo]): Unit
}
object XLayerContentDescriber {
  
  inline def apply(
    acquire: Callback,
    describeLayer: (XLayerHandler, SeqEquiv[PropertyInfo]) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XLayerContentDescriber = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, describeLayer = js.Any.fromFunction2((t0: XLayerHandler, t1: SeqEquiv[PropertyInfo]) => (describeLayer(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLayerContentDescriber]
  }
  
  extension [Self <: XLayerContentDescriber](x: Self) {
    
    inline def setDescribeLayer(value: (XLayerHandler, SeqEquiv[PropertyInfo]) => Callback): Self = StObject.set(x, "describeLayer", js.Any.fromFunction2((t0: XLayerHandler, t1: SeqEquiv[PropertyInfo]) => (value(t0, t1)).runNow()))
  }
}
