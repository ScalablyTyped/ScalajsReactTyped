package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.Subsequence
import typingsJapgolly.atom.atomStrings.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: Subsequence | Symbol
}
object `15` {
  
  inline def apply(
    scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor,
    value: Subsequence | Symbol
  ): `15` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
  
  extension [Self <: `15`](x: Self) {
    
    inline def setScopeDescriptor(value: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Subsequence | Symbol): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
