package typingsJapgolly.dexie.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreTransaction extends StObject {
  
  def abort(): Unit
}
object DBCoreTransaction {
  
  inline def apply(abort: Callback): DBCoreTransaction = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn)
    __obj.asInstanceOf[DBCoreTransaction]
  }
  
  extension [Self <: DBCoreTransaction](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
  }
}
