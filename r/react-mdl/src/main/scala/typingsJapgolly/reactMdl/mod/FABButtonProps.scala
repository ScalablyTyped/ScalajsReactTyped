package typingsJapgolly.reactMdl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FABButtonProps
  extends StObject
     with ButtonProps {
  
  var mini: js.UndefOr[Boolean] = js.undefined
}
object FABButtonProps {
  
  inline def apply(): FABButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FABButtonProps]
  }
  
  extension [Self <: FABButtonProps](x: Self) {
    
    inline def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    inline def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
  }
}
