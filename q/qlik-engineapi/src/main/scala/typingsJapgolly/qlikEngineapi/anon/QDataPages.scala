package typingsJapgolly.qlikEngineapi.anon

import typingsJapgolly.qlikEngineapi.EngineAPI.INxAxisData
import typingsJapgolly.qlikEngineapi.EngineAPI.INxDataPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QDataPages extends StObject {
  
  var qAxisData: js.Array[INxAxisData]
  
  var qDataPages: INxDataPage
}
object QDataPages {
  
  inline def apply(qAxisData: js.Array[INxAxisData], qDataPages: INxDataPage): QDataPages = {
    val __obj = js.Dynamic.literal(qAxisData = qAxisData.asInstanceOf[js.Any], qDataPages = qDataPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[QDataPages]
  }
  
  extension [Self <: QDataPages](x: Self) {
    
    inline def setQAxisData(value: js.Array[INxAxisData]): Self = StObject.set(x, "qAxisData", value.asInstanceOf[js.Any])
    
    inline def setQAxisDataVarargs(value: INxAxisData*): Self = StObject.set(x, "qAxisData", js.Array(value*))
    
    inline def setQDataPages(value: INxDataPage): Self = StObject.set(x, "qDataPages", value.asInstanceOf[js.Any])
  }
}
