package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI16_
import typingsJapgolly.colorConvert.conversionsMod.CMYK_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53` extends StObject {
  
  def raw(from: CMYK_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, ANSI16_]
}
object `53` {
  
  inline def apply(raw: /* from */ CMYK_ => ANSI16_): `53` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`53`]
  }
  
  extension [Self <: `53`](x: Self) {
    
    inline def setRaw(value: /* from */ CMYK_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
