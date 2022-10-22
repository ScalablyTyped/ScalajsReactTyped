package typingsJapgolly.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchIndexesOptions extends StObject {
  
  /**
    * Timeout for the operation in milliseconds.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object WatchIndexesOptions {
  
  inline def apply(): WatchIndexesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchIndexesOptions]
  }
  
  extension [Self <: WatchIndexesOptions](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
