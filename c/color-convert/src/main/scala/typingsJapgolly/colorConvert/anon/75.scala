package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.CMYK_
import typingsJapgolly.colorConvert.conversionsMod.HCG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `75` extends StObject {
  
  def raw(from: HCG_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, CMYK_]
}
object `75` {
  
  inline def apply(raw: /* from */ HCG_ => CMYK_): `75` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`75`]
  }
  
  extension [Self <: `75`](x: Self) {
    
    inline def setRaw(value: /* from */ HCG_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
