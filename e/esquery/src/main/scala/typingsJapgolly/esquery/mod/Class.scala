package typingsJapgolly.esquery.mod

import typingsJapgolly.esquery.esqueryStrings.`class`
import typingsJapgolly.esquery.esqueryStrings.declaration
import typingsJapgolly.esquery.esqueryStrings.expression
import typingsJapgolly.esquery.esqueryStrings.function
import typingsJapgolly.esquery.esqueryStrings.pattern
import typingsJapgolly.esquery.esqueryStrings.statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Class
  extends StObject
     with Atom
     with Selector {
  
  var name: declaration | expression | function | pattern | statement
  
  @JSName("type")
  var type_Class: `class`
}
object Class {
  
  inline def apply(name: declaration | expression | function | pattern | statement): Class = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("class")
    __obj.asInstanceOf[Class]
  }
  
  extension [Self <: Class](x: Self) {
    
    inline def setName(value: declaration | expression | function | pattern | statement): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `class`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
