package typingsJapgolly.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxInline extends StObject {
  
  var maxInline: js.UndefOr[Double] = js.undefined
}
object MaxInline {
  
  inline def apply(): MaxInline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxInline]
  }
  
  extension [Self <: MaxInline](x: Self) {
    
    inline def setMaxInline(value: Double): Self = StObject.set(x, "maxInline", value.asInstanceOf[js.Any])
    
    inline def setMaxInlineUndefined: Self = StObject.set(x, "maxInline", js.undefined)
  }
}
