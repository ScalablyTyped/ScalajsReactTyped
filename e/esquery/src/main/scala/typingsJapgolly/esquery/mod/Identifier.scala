package typingsJapgolly.esquery.mod

import typingsJapgolly.esquery.esqueryStrings.identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identifier
  extends StObject
     with SubjectSelectorAtom
     with Selector
     with SubjectSelector {
  
  @JSName("type")
  var type_Identifier: identifier
  
  var value: String
}
object Identifier {
  
  inline def apply(value: String): Identifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identifier")
    __obj.asInstanceOf[Identifier]
  }
  
  extension [Self <: Identifier](x: Self) {
    
    inline def setType(value: identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
