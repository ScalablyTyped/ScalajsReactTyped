package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoidLiteral
  extends StObject
     with Type_ {
  
  var `type`: typingsJapgolly.doctrine.doctrineStrings.VoidLiteral
}
object VoidLiteral {
  
  inline def apply(): VoidLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VoidLiteral")
    __obj.asInstanceOf[VoidLiteral]
  }
  
  extension [Self <: VoidLiteral](x: Self) {
    
    inline def setType(value: typingsJapgolly.doctrine.doctrineStrings.VoidLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
