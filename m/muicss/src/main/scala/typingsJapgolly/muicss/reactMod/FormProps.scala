package typingsJapgolly.muicss.reactMod

import org.scalajs.dom.HTMLFormElement
import typingsJapgolly.react.mod.FormHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormProps
  extends StObject
     with FormHTMLAttributes[HTMLFormElement] {
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
}
object FormProps {
  
  inline def apply(): FormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormProps]
  }
  
  extension [Self <: FormProps](x: Self) {
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
  }
}
