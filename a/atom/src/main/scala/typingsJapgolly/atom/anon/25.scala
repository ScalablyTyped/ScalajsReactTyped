package typingsJapgolly.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  var scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: String | Double
}
object `25` {
  
  inline def apply(
    scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor,
    value: String | Double
  ): `25` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setScopeDescriptor(value: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
