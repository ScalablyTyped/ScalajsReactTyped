package typingsJapgolly.vhtml.mod.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var open: js.UndefOr[Boolean] = js.undefined
}
object DialogHTMLAttributes {
  
  inline def apply(): DialogHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogHTMLAttributes]
  }
  
  extension [Self <: DialogHTMLAttributes](x: Self) {
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
