package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.Bottom
import typingsJapgolly.atom.atomStrings.Left
import typingsJapgolly.atom.atomStrings.Right
import typingsJapgolly.atom.atomStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: Top | Right | Bottom | Left
}
object `18` {
  
  inline def apply(
    scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor,
    value: Top | Right | Bottom | Left
  ): `18` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`]
  }
  
  extension [Self <: `18`](x: Self) {
    
    inline def setScopeDescriptor(value: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Top | Right | Bottom | Left): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
