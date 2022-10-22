package typingsJapgolly.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbCoreTransactionOptions extends StObject {
  
  var durability: ChromeTransactionDurability
}
object DbCoreTransactionOptions {
  
  inline def apply(durability: ChromeTransactionDurability): DbCoreTransactionOptions = {
    val __obj = js.Dynamic.literal(durability = durability.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbCoreTransactionOptions]
  }
  
  extension [Self <: DbCoreTransactionOptions](x: Self) {
    
    inline def setDurability(value: ChromeTransactionDurability): Self = StObject.set(x, "durability", value.asInstanceOf[js.Any])
  }
}
