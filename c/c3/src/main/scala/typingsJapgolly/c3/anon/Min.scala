package typingsJapgolly.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Min extends StObject {
  
  var max: js.UndefOr[
    Double | (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in c3.c3.AxisName ]:? number} */ js.Any)
  ] = js.undefined
  
  var min: js.UndefOr[
    Double | (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in c3.c3.AxisName ]:? number} */ js.Any)
  ] = js.undefined
}
object Min {
  
  inline def apply(): Min = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Min]
  }
  
  extension [Self <: Min](x: Self) {
    
    inline def setMax(
      value: Double | (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in c3.c3.AxisName ]:? number} */ js.Any)
    ): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(
      value: Double | (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in c3.c3.AxisName ]:? number} */ js.Any)
    ): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
