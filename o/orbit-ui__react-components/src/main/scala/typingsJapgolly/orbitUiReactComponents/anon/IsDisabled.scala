package typingsJapgolly.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDisabled extends StObject {
  
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  
  var keyProp: js.UndefOr[String] = js.undefined
}
object IsDisabled {
  
  inline def apply(): IsDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsDisabled]
  }
  
  extension [Self <: IsDisabled](x: Self) {
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    inline def setKeyProp(value: String): Self = StObject.set(x, "keyProp", value.asInstanceOf[js.Any])
    
    inline def setKeyPropUndefined: Self = StObject.set(x, "keyProp", js.undefined)
  }
}
