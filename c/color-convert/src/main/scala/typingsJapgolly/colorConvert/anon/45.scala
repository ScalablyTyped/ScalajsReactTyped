package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI256_
import typingsJapgolly.colorConvert.conversionsMod.CMYK_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  def raw(from: CMYK_): ANSI256_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, ANSI256_]
}
object `45` {
  
  inline def apply(raw: /* from */ CMYK_ => ANSI256_): `45` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`45`]
  }
  
  extension [Self <: `45`](x: Self) {
    
    inline def setRaw(value: /* from */ CMYK_ => ANSI256_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
