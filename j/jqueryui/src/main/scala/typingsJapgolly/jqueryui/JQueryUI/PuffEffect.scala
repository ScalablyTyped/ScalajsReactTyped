package typingsJapgolly.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PuffEffect extends StObject {
  
  var percent: js.UndefOr[Double] = js.undefined
}
object PuffEffect {
  
  inline def apply(): PuffEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PuffEffect]
  }
  
  extension [Self <: PuffEffect](x: Self) {
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
  }
}
