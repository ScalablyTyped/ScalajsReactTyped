package typingsJapgolly.micromarkUtilTypes.anon

import typingsJapgolly.micromarkUtilTypes.mod.Event
import typingsJapgolly.micromarkUtilTypes.mod.Resolver
import typingsJapgolly.micromarkUtilTypes.mod.TokenizeContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<micromark-util-types.micromark-util-types.Construct, 'resolveAll'> */
trait PickConstructresolveAll extends StObject {
  
  var resolveAll: js.UndefOr[Resolver] = js.undefined
}
object PickConstructresolveAll {
  
  inline def apply(): PickConstructresolveAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickConstructresolveAll]
  }
  
  extension [Self <: PickConstructresolveAll](x: Self) {
    
    inline def setResolveAll(value: (/* events */ js.Array[Event], /* context */ TokenizeContext) => js.Array[Event]): Self = StObject.set(x, "resolveAll", js.Any.fromFunction2(value))
    
    inline def setResolveAllUndefined: Self = StObject.set(x, "resolveAll", js.undefined)
  }
}
