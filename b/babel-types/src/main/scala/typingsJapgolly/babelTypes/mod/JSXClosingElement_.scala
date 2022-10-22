package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.JSXClosingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXClosingElement_
  extends StObject
     with Node
     with Immutable
     with JSX {
  
  var name: JSXIdentifier_ | JSXMemberExpression_
  
  @JSName("type")
  var type_JSXClosingElement_ : JSXClosingElement
}
object JSXClosingElement_ {
  
  inline def apply(end: Double, loc: SourceLocation, name: JSXIdentifier_ | JSXMemberExpression_, start: Double): JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[JSXClosingElement_]
  }
  
  extension [Self <: JSXClosingElement_](x: Self) {
    
    inline def setName(value: JSXIdentifier_ | JSXMemberExpression_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXClosingElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
