package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullableLiteral
  extends StObject
     with Type_ {
  
  var `type`: typingsJapgolly.doctrine.doctrineStrings.NullableLiteral
}
object NullableLiteral {
  
  inline def apply(): NullableLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullableLiteral")
    __obj.asInstanceOf[NullableLiteral]
  }
  
  extension [Self <: NullableLiteral](x: Self) {
    
    inline def setType(value: typingsJapgolly.doctrine.doctrineStrings.NullableLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
