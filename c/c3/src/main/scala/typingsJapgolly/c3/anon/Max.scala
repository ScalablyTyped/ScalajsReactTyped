package typingsJapgolly.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  var max: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in c3.c3.AxisName ]: number} */ js.Any
  
  var min: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in c3.c3.AxisName ]: number} */ js.Any
}
object Max {
  
  inline def apply(
    max: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in c3.c3.AxisName ]: number} */ js.Any,
    min: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in c3.c3.AxisName ]: number} */ js.Any
  ): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
  
  extension [Self <: Max](x: Self) {
    
    inline def setMax(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in c3.c3.AxisName ]: number} */ js.Any
    ): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in c3.c3.AxisName ]: number} */ js.Any
    ): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
