package typingsJapgolly.vhtml.mod.JSX

import typingsJapgolly.vhtml.vhtmlStrings.A
import typingsJapgolly.vhtml.vhtmlStrings.I
import typingsJapgolly.vhtml.vhtmlStrings.`1`
import typingsJapgolly.vhtml.vhtmlStrings.a_
import typingsJapgolly.vhtml.vhtmlStrings.i_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var reversed: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[`1` | a_ | A | i_ | I] = js.undefined
}
object OlHTMLAttributes {
  
  inline def apply(): OlHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlHTMLAttributes]
  }
  
  extension [Self <: OlHTMLAttributes](x: Self) {
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: `1` | a_ | A | i_ | I): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
