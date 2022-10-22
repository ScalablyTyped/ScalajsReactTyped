package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeDataSource extends StObject {
  
  /**
    * Returns the current converter instance
    */
  def converter(): js.Object
  
  /**
    * Loads to the current data source
    */
  def dataBind(): Unit
  
  def dataView(): Unit
  
  /**
    * Returns true if data is loaded
    */
  def isBound(): Boolean
}
object ShapeDataSource {
  
  inline def apply(
    converter: CallbackTo[js.Object],
    dataBind: Callback,
    dataView: Callback,
    isBound: CallbackTo[Boolean]
  ): ShapeDataSource = {
    val __obj = js.Dynamic.literal(converter = converter.toJsFn, dataBind = dataBind.toJsFn, dataView = dataView.toJsFn, isBound = isBound.toJsFn)
    __obj.asInstanceOf[ShapeDataSource]
  }
  
  extension [Self <: ShapeDataSource](x: Self) {
    
    inline def setConverter(value: CallbackTo[js.Object]): Self = StObject.set(x, "converter", value.toJsFn)
    
    inline def setDataBind(value: Callback): Self = StObject.set(x, "dataBind", value.toJsFn)
    
    inline def setDataView(value: Callback): Self = StObject.set(x, "dataView", value.toJsFn)
    
    inline def setIsBound(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBound", value.toJsFn)
  }
}
