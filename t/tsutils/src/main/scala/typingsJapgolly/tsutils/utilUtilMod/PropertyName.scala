package typingsJapgolly.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyName extends StObject {
  
  var displayName: String
  
  var symbolName: typingsJapgolly.typescript.mod.String
}
object PropertyName {
  
  inline def apply(displayName: String, symbolName: typingsJapgolly.typescript.mod.String): PropertyName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], symbolName = symbolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyName]
  }
  
  extension [Self <: PropertyName](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setSymbolName(value: typingsJapgolly.typescript.mod.String): Self = StObject.set(x, "symbolName", value.asInstanceOf[js.Any])
  }
}
