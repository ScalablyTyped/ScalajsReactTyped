package typingsJapgolly.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceOptions
  extends StObject
     with InsertOptions {
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
  
  var returnOld: js.UndefOr[Boolean] = js.undefined
}
object ReplaceOptions {
  
  inline def apply(): ReplaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceOptions]
  }
  
  extension [Self <: ReplaceOptions](x: Self) {
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setReturnOld(value: Boolean): Self = StObject.set(x, "returnOld", value.asInstanceOf[js.Any])
    
    inline def setReturnOldUndefined: Self = StObject.set(x, "returnOld", js.undefined)
  }
}
