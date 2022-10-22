package typingsJapgolly.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricMatrix extends StObject {
  
  /** The rows of the matrix. */
  var rows: js.UndefOr[js.Array[MetricMatrixRow]] = js.undefined
}
object MetricMatrix {
  
  inline def apply(): MetricMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricMatrix]
  }
  
  extension [Self <: MetricMatrix](x: Self) {
    
    inline def setRows(value: js.Array[MetricMatrixRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: MetricMatrixRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
