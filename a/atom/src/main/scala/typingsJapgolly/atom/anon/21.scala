package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.limited
import typingsJapgolly.atom.atomStrings.no
import typingsJapgolly.atom.atomStrings.undecided
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: limited | no | undecided
}
object `21` {
  
  inline def apply(
    scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor,
    value: limited | no | undecided
  ): `21` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setScopeDescriptor(value: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: limited | no | undecided): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
