package typingsJapgolly.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColgroupHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var span: js.UndefOr[Numberish] = js.undefined
}
object ColgroupHTMLAttributes {
  
  inline def apply(): ColgroupHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColgroupHTMLAttributes]
  }
  
  extension [Self <: ColgroupHTMLAttributes](x: Self) {
    
    inline def setSpan(value: Numberish): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
  }
}
