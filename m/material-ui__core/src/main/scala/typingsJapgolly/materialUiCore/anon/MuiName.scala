package typingsJapgolly.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MuiName extends StObject {
  
  var muiName: String
}
object MuiName {
  
  inline def apply(muiName: String): MuiName = {
    val __obj = js.Dynamic.literal(muiName = muiName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuiName]
  }
  
  extension [Self <: MuiName](x: Self) {
    
    inline def setMuiName(value: String): Self = StObject.set(x, "muiName", value.asInstanceOf[js.Any])
  }
}
