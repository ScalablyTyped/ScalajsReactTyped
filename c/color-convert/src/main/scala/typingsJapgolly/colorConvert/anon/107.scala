package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HSL_
import typingsJapgolly.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `107` extends StObject {
  
  def raw(from: HSL_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, LCH_]
}
object `107` {
  
  inline def apply(raw: /* from */ HSL_ => LCH_): `107` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`107`]
  }
  
  extension [Self <: `107`](x: Self) {
    
    inline def setRaw(value: /* from */ HSL_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
