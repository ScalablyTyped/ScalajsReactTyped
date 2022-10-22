package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI256_
import typingsJapgolly.colorConvert.conversionsMod.CMYK_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  def raw(from: ANSI256_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, CMYK_]
}
object `18` {
  
  inline def apply(raw: /* from */ ANSI256_ => CMYK_): `18` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`18`]
  }
  
  extension [Self <: `18`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI256_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
