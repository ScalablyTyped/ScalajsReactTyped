package typingsJapgolly.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueString extends StObject {
  
  var scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: String
}
object ValueString {
  
  inline def apply(scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor, value: String): ValueString = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueString]
  }
  
  extension [Self <: ValueString](x: Self) {
    
    inline def setScopeDescriptor(value: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
