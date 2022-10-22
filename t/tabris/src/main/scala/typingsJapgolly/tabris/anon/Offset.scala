package typingsJapgolly.tabris.anon

import typingsJapgolly.tabris.mod.ConstraintLikeObject
import typingsJapgolly.tabris.mod.PercentValue
import typingsJapgolly.tabris.mod.SiblingReferenceValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset
  extends StObject
     with ConstraintLikeObject {
  
  var offset: js.UndefOr[typingsJapgolly.tabris.mod.Offset] = js.undefined
  
  var reference: SiblingReferenceValue | PercentValue
}
object Offset {
  
  inline def apply(reference: SiblingReferenceValue | PercentValue): Offset = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  extension [Self <: Offset](x: Self) {
    
    inline def setOffset(value: typingsJapgolly.tabris.mod.Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setReference(value: SiblingReferenceValue | PercentValue): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
