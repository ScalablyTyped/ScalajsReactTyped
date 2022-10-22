package typingsJapgolly.yjs.anon

import typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet
import typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  var filter: js.UndefOr[js.Function2[/* arg0 */ Transaction, /* arg1 */ DeleteSet, Boolean]] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setFilter(value: (/* arg0 */ Transaction, /* arg1 */ DeleteSet) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
