package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.CMYK_
import typingsJapgolly.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `173` extends StObject {
  
  def raw(from: LCH_): CMYK_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, CMYK_]
}
object `173` {
  
  inline def apply(raw: /* from */ LCH_ => CMYK_): `173` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`173`]
  }
  
  extension [Self <: `173`](x: Self) {
    
    inline def setRaw(value: /* from */ LCH_ => CMYK_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
