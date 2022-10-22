package typingsJapgolly.tabris.anon

import typingsJapgolly.tabris.mod.ConstraintLikeObject
import typingsJapgolly.tabris.mod.PercentValue
import typingsJapgolly.tabris.mod.SiblingReferenceValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reference
  extends StObject
     with ConstraintLikeObject {
  
  var offset: typingsJapgolly.tabris.mod.Offset
  
  var reference: js.UndefOr[SiblingReferenceValue | PercentValue] = js.undefined
}
object Reference {
  
  inline def apply(offset: typingsJapgolly.tabris.mod.Offset): Reference = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  
  extension [Self <: Reference](x: Self) {
    
    inline def setOffset(value: typingsJapgolly.tabris.mod.Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setReference(value: SiblingReferenceValue | PercentValue): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
