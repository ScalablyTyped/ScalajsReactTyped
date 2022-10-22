package typingsJapgolly.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLatLongOptions extends StObject {
  
  var checkDMS: js.UndefOr[Boolean] = js.undefined
}
object IsLatLongOptions {
  
  inline def apply(): IsLatLongOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsLatLongOptions]
  }
  
  extension [Self <: IsLatLongOptions](x: Self) {
    
    inline def setCheckDMS(value: Boolean): Self = StObject.set(x, "checkDMS", value.asInstanceOf[js.Any])
    
    inline def setCheckDMSUndefined: Self = StObject.set(x, "checkDMS", js.undefined)
  }
}
