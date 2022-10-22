package typingsJapgolly.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextScrollTop extends StObject {
  
  var nextScrollLeft: js.UndefOr[Double] = js.undefined
  
  var nextScrollTop: js.UndefOr[Double] = js.undefined
}
object NextScrollTop {
  
  inline def apply(): NextScrollTop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NextScrollTop]
  }
  
  extension [Self <: NextScrollTop](x: Self) {
    
    inline def setNextScrollLeft(value: Double): Self = StObject.set(x, "nextScrollLeft", value.asInstanceOf[js.Any])
    
    inline def setNextScrollLeftUndefined: Self = StObject.set(x, "nextScrollLeft", js.undefined)
    
    inline def setNextScrollTop(value: Double): Self = StObject.set(x, "nextScrollTop", value.asInstanceOf[js.Any])
    
    inline def setNextScrollTopUndefined: Self = StObject.set(x, "nextScrollTop", js.undefined)
  }
}
