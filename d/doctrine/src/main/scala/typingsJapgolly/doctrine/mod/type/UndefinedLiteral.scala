package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndefinedLiteral
  extends StObject
     with Type_ {
  
  var `type`: typingsJapgolly.doctrine.doctrineStrings.UndefinedLiteral
}
object UndefinedLiteral {
  
  inline def apply(): UndefinedLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UndefinedLiteral")
    __obj.asInstanceOf[UndefinedLiteral]
  }
  
  extension [Self <: UndefinedLiteral](x: Self) {
    
    inline def setType(value: typingsJapgolly.doctrine.doctrineStrings.UndefinedLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
