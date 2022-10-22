package typingsJapgolly.chartist.distCoreTypesMod

import typingsJapgolly.chartist.chartistStrings.initial
import typingsJapgolly.chartist.chartistStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataEvent extends StObject {
  
  var data: Data[AllSeriesTypes]
  
  var `type`: initial | update
}
object DataEvent {
  
  inline def apply(data: Data[AllSeriesTypes], `type`: initial | update): DataEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEvent]
  }
  
  extension [Self <: DataEvent](x: Self) {
    
    inline def setData(value: Data[AllSeriesTypes]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: initial | update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
