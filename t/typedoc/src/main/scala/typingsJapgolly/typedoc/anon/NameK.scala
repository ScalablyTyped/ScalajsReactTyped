package typingsJapgolly.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameK[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.typedoc.typedocStrings.searchCategoryBoosts, typingsJapgolly.typedoc.typedocStrings.version, typingsJapgolly.typedoc.typedocStrings.out */ Any */] extends StObject {
  
  var name: K
}
object NameK {
  
  inline def apply[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.typedoc.typedocStrings.searchCategoryBoosts, typingsJapgolly.typedoc.typedocStrings.version, typingsJapgolly.typedoc.typedocStrings.out */ Any */](name: K): NameK[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameK[K]]
  }
  
  extension [Self <: NameK[?], K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.typedoc.typedocStrings.searchCategoryBoosts, typingsJapgolly.typedoc.typedocStrings.version, typingsJapgolly.typedoc.typedocStrings.out */ Any */](x: Self & NameK[K]) {
    
    inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
