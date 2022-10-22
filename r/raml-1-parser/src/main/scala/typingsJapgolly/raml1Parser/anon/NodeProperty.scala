package typingsJapgolly.raml1Parser.anon

import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreMod.BasicNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeProperty extends StObject {
  
  var node: BasicNode
  
  var property: java.lang.String
}
object NodeProperty {
  
  inline def apply(node: BasicNode, property: java.lang.String): NodeProperty = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProperty]
  }
  
  extension [Self <: NodeProperty](x: Self) {
    
    inline def setNode(value: BasicNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: java.lang.String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
