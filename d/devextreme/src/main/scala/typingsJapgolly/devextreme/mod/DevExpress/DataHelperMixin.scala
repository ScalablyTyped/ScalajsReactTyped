package typingsJapgolly.devextreme.mod.DevExpress

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHelperMixin extends StObject {
  
  /**
    * Gets the DataSource instance.
    */
  def getDataSource(): DataSource[Any, Any]
}
object DataHelperMixin {
  
  inline def apply(getDataSource: CallbackTo[DataSource[Any, Any]]): DataHelperMixin = {
    val __obj = js.Dynamic.literal(getDataSource = getDataSource.toJsFn)
    __obj.asInstanceOf[DataHelperMixin]
  }
  
  extension [Self <: DataHelperMixin](x: Self) {
    
    inline def setGetDataSource(value: CallbackTo[DataSource[Any, Any]]): Self = StObject.set(x, "getDataSource", value.toJsFn)
  }
}
