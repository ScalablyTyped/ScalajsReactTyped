package typingsJapgolly.pgPromise.anon

import typingsJapgolly.pgPromise.mod.isolationLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deferrable extends StObject {
  
  var deferrable: js.UndefOr[Boolean] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var tiLevel: js.UndefOr[isolationLevel] = js.undefined
}
object Deferrable {
  
  inline def apply(): Deferrable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deferrable]
  }
  
  extension [Self <: Deferrable](x: Self) {
    
    inline def setDeferrable(value: Boolean): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
    
    inline def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setTiLevel(value: isolationLevel): Self = StObject.set(x, "tiLevel", value.asInstanceOf[js.Any])
    
    inline def setTiLevelUndefined: Self = StObject.set(x, "tiLevel", js.undefined)
  }
}
