package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataExpressionMixin extends StObject {
  
  def getDataSource(): DataSource[Any, Any]
}
object DataExpressionMixin {
  
  inline def apply(getDataSource: CallbackTo[DataSource[Any, Any]]): DataExpressionMixin = {
    val __obj = js.Dynamic.literal(getDataSource = getDataSource.toJsFn)
    __obj.asInstanceOf[DataExpressionMixin]
  }
  
  extension [Self <: DataExpressionMixin](x: Self) {
    
    inline def setGetDataSource(value: CallbackTo[DataSource[Any, Any]]): Self = StObject.set(x, "getDataSource", value.toJsFn)
  }
}
