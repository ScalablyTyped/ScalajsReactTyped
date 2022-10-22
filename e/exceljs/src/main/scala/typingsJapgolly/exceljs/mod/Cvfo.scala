package typingsJapgolly.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cvfo extends StObject {
  
  var `type`: CfvoTypes
  
  var value: js.UndefOr[Double] = js.undefined
}
object Cvfo {
  
  inline def apply(`type`: CfvoTypes): Cvfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cvfo]
  }
  
  extension [Self <: Cvfo](x: Self) {
    
    inline def setType(value: CfvoTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
