package typingsJapgolly.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Line extends StObject {
  
  var line: js.UndefOr[Dash] = js.undefined
}
object Line {
  
  inline def apply(): Line = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Line]
  }
  
  extension [Self <: Line](x: Self) {
    
    inline def setLine(value: Dash): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
