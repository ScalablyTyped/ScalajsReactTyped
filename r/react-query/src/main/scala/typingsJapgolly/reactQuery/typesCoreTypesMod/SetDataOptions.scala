package typingsJapgolly.reactQuery.typesCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDataOptions extends StObject {
  
  var updatedAt: js.UndefOr[Double] = js.undefined
}
object SetDataOptions {
  
  inline def apply(): SetDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetDataOptions]
  }
  
  extension [Self <: SetDataOptions](x: Self) {
    
    inline def setUpdatedAt(value: Double): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
