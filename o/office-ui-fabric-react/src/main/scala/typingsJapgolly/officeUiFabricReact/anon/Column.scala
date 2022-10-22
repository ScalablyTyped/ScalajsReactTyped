package typingsJapgolly.officeUiFabricReact.anon

import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  var column: IColumn
  
  var index: Double
  
  def onMeasureDone(measuredWidth: Double): scala.Unit
}
object Column {
  
  inline def apply(column: IColumn, index: Double, onMeasureDone: Double => japgolly.scalajs.react.Callback): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onMeasureDone = js.Any.fromFunction1((t0: Double) => onMeasureDone(t0).runNow()))
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setColumn(value: IColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOnMeasureDone(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onMeasureDone", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
