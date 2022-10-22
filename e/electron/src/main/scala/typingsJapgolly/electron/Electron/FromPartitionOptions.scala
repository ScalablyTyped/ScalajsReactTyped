package typingsJapgolly.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromPartitionOptions extends StObject {
  
  /**
    * Whether to enable cache.
    */
  var cache: Boolean
}
object FromPartitionOptions {
  
  inline def apply(cache: Boolean): FromPartitionOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromPartitionOptions]
  }
  
  extension [Self <: FromPartitionOptions](x: Self) {
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
  }
}
