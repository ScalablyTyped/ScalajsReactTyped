package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HSL_
import typingsJapgolly.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97` extends StObject {
  
  def raw(from: HSL_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, RGB_]
}
object `97` {
  
  inline def apply(raw: /* from */ HSL_ => RGB_): `97` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`97`]
  }
  
  extension [Self <: `97`](x: Self) {
    
    inline def setRaw(value: /* from */ HSL_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
