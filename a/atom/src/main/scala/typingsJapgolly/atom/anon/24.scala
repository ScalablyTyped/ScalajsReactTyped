package typingsJapgolly.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: String | Null
}
object `24` {
  
  inline def apply(scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor): `24` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[`24`]
  }
  
  extension [Self <: `24`](x: Self) {
    
    inline def setScopeDescriptor(value: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
