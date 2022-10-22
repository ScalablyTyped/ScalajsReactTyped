package typingsJapgolly.estree.mod

import typingsJapgolly.estree.estreeStrings.constructor
import typingsJapgolly.estree.estreeStrings.get
import typingsJapgolly.estree.estreeStrings.method
import typingsJapgolly.estree.estreeStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodDefinition
  extends StObject
     with BaseNode {
  
  var computed: Boolean
  
  var key: Expression | PrivateIdentifier
  
  var kind: constructor | method | get | set
  
  var static: Boolean
  
  @JSName("type")
  var type_MethodDefinition: typingsJapgolly.estree.estreeStrings.MethodDefinition
  
  var value: FunctionExpression
}
object MethodDefinition {
  
  inline def apply(
    computed: Boolean,
    key: Expression | PrivateIdentifier,
    kind: constructor | method | get | set,
    static: Boolean,
    value: FunctionExpression
  ): MethodDefinition = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MethodDefinition")
    __obj.asInstanceOf[MethodDefinition]
  }
  
  extension [Self <: MethodDefinition](x: Self) {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Expression | PrivateIdentifier): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: constructor | method | get | set): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.MethodDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FunctionExpression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
