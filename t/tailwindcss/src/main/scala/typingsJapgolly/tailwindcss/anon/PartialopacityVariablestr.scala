package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  opacityVariable :string,   opacityValue :number}> */
trait PartialopacityVariablestr extends StObject {
  
  var opacityValue: js.UndefOr[Double] = js.undefined
  
  var opacityVariable: js.UndefOr[String] = js.undefined
}
object PartialopacityVariablestr {
  
  inline def apply(): PartialopacityVariablestr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialopacityVariablestr]
  }
  
  extension [Self <: PartialopacityVariablestr](x: Self) {
    
    inline def setOpacityValue(value: Double): Self = StObject.set(x, "opacityValue", value.asInstanceOf[js.Any])
    
    inline def setOpacityValueUndefined: Self = StObject.set(x, "opacityValue", js.undefined)
    
    inline def setOpacityVariable(value: String): Self = StObject.set(x, "opacityVariable", value.asInstanceOf[js.Any])
    
    inline def setOpacityVariableUndefined: Self = StObject.set(x, "opacityVariable", js.undefined)
  }
}
