package typingsJapgolly.muicss.reactMod

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonProps
  extends StObject
     with ButtonHTMLAttributes[HTMLButtonElement] {
  
  var size: js.UndefOr[String] = js.undefined
  
  var variant: js.UndefOr[String] = js.undefined
}
object ButtonProps {
  
  inline def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  
  extension [Self <: ButtonProps](x: Self) {
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
