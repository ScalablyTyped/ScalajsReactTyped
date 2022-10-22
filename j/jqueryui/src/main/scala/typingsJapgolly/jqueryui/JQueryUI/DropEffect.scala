package typingsJapgolly.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropEffect extends StObject {
  
  var direction: js.UndefOr[Double] = js.undefined
}
object DropEffect {
  
  inline def apply(): DropEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropEffect]
  }
  
  extension [Self <: DropEffect](x: Self) {
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}
