package typingsJapgolly.reactQuery.typesCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefetchOptions
  extends StObject
     with ResultOptions {
  
  var cancelRefetch: js.UndefOr[Boolean] = js.undefined
}
object RefetchOptions {
  
  inline def apply(): RefetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefetchOptions]
  }
  
  extension [Self <: RefetchOptions](x: Self) {
    
    inline def setCancelRefetch(value: Boolean): Self = StObject.set(x, "cancelRefetch", value.asInstanceOf[js.Any])
    
    inline def setCancelRefetchUndefined: Self = StObject.set(x, "cancelRefetch", js.undefined)
  }
}
