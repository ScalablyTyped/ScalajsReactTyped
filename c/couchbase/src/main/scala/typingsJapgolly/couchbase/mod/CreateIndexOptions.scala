package typingsJapgolly.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIndexOptions extends StObject {
  
  /**
    * True to defer building of the index until buildDeferredIndexes is called (or a direct call to the corresponding query service API).
    */
  var deferred: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If a secondary index already exists, an error will be thrown unless this is set to true.
    */
  var ignoreIfExists: js.UndefOr[Boolean] = js.undefined
}
object CreateIndexOptions {
  
  inline def apply(): CreateIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIndexOptions]
  }
  
  extension [Self <: CreateIndexOptions](x: Self) {
    
    inline def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    inline def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
    
    inline def setIgnoreIfExists(value: Boolean): Self = StObject.set(x, "ignoreIfExists", value.asInstanceOf[js.Any])
    
    inline def setIgnoreIfExistsUndefined: Self = StObject.set(x, "ignoreIfExists", js.undefined)
  }
}
