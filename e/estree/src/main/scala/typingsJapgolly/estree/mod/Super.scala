package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Super
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_Super: typingsJapgolly.estree.estreeStrings.Super
}
object Super {
  
  inline def apply(): Super = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[Super]
  }
  
  extension [Self <: Super](x: Self) {
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.Super): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
