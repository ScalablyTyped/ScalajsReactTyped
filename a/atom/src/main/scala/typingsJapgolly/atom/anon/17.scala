package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.`12px`
import typingsJapgolly.atom.atomStrings.`14px`
import typingsJapgolly.atom.atomStrings.`16px`
import typingsJapgolly.atom.atomStrings.`18px`
import typingsJapgolly.atom.atomStrings.`21px`
import typingsJapgolly.atom.atomStrings.`24px`
import typingsJapgolly.atom.atomStrings.`28px`
import typingsJapgolly.atom.atomStrings.`32px`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  var scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`
}
object `17` {
  
  inline def apply(
    scopeDescriptor: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor,
    value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`
  ): `17` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`17`]
  }
  
  extension [Self <: `17`](x: Self) {
    
    inline def setScopeDescriptor(value: typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
