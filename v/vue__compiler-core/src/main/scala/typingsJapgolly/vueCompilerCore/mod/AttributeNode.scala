package typingsJapgolly.vueCompilerCore.mod

import typingsJapgolly.vueCompilerCore.vueCompilerCoreInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeNode
  extends StObject
     with Node2 {
  
  var name: String
  
  @JSName("type")
  var type_AttributeNode: `6`
  
  var value: js.UndefOr[TextNode] = js.undefined
}
object AttributeNode {
  
  inline def apply(loc: SourceLocation, name: String): AttributeNode = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(6)
    __obj.asInstanceOf[AttributeNode]
  }
  
  extension [Self <: AttributeNode](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `6`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TextNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
