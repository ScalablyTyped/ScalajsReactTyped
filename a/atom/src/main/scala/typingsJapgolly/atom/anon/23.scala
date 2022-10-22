package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.default
import typingsJapgolly.atom.atomStrings.srgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: default | srgb
}
object `23` {
  
  inline def apply(scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor, value: default | srgb): `23` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  
  extension [Self <: `23`](x: Self) {
    
    inline def setScopeDescriptor(value: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: default | srgb): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
