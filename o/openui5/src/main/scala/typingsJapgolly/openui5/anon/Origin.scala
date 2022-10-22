package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.sapMButtonMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Origin extends StObject {
  
  /**
    * This indicates the trigger of closing the Dialog. If the Dialog is closed by either the `beginButton`
    * or the `endButton`, the button that closes the Dialog is set to this parameter. Otherwise, the parameter
    * is set to `null`.
    */
  var origin: js.UndefOr[default] = js.undefined
}
object Origin {
  
  inline def apply(): Origin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Origin]
  }
  
  extension [Self <: Origin](x: Self) {
    
    inline def setOrigin(value: default): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
