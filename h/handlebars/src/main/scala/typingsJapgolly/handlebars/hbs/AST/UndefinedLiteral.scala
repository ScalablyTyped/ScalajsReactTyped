package typingsJapgolly.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndefinedLiteral
  extends StObject
     with Node {
  
  @JSName("type")
  var type_UndefinedLiteral: typingsJapgolly.handlebars.handlebarsStrings.UndefinedLiteral
}
object UndefinedLiteral {
  
  inline def apply(loc: SourceLocation): UndefinedLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UndefinedLiteral")
    __obj.asInstanceOf[UndefinedLiteral]
  }
  
  extension [Self <: UndefinedLiteral](x: Self) {
    
    inline def setType(value: typingsJapgolly.handlebars.handlebarsStrings.UndefinedLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
