package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.Cursor
import typingsJapgolly.atom.atomStrings.Word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopeDescriptorScopeDescriptorValue extends StObject {
  
  var scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: Word | Cursor
}
object ScopeDescriptorScopeDescriptorValue {
  
  inline def apply(scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor, value: Word | Cursor): ScopeDescriptorScopeDescriptorValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeDescriptorScopeDescriptorValue]
  }
  
  extension [Self <: ScopeDescriptorScopeDescriptorValue](x: Self) {
    
    inline def setScopeDescriptor(value: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Word | Cursor): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
