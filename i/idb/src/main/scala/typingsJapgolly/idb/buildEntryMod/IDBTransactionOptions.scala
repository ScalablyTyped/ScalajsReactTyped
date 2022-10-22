package typingsJapgolly.idb.buildEntryMod

import typingsJapgolly.idb.idbStrings.default
import typingsJapgolly.idb.idbStrings.relaxed
import typingsJapgolly.idb.idbStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBTransactionOptions extends StObject {
  
  /**
    * The durability of the transaction.
    *
    * The default is "default". Using "relaxed" provides better performance, but with fewer
    * guarantees. Web applications are encouraged to use "relaxed" for ephemeral data such as caches
    * or quickly changing records, and "strict" in cases where reducing the risk of data loss
    * outweighs the impact to performance and power.
    */
  var durability: js.UndefOr[default | strict | relaxed] = js.undefined
}
object IDBTransactionOptions {
  
  inline def apply(): IDBTransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBTransactionOptions]
  }
  
  extension [Self <: IDBTransactionOptions](x: Self) {
    
    inline def setDurability(value: default | strict | relaxed): Self = StObject.set(x, "durability", value.asInstanceOf[js.Any])
    
    inline def setDurabilityUndefined: Self = StObject.set(x, "durability", js.undefined)
  }
}
