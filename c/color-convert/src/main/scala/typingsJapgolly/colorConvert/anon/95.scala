package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI16_
import typingsJapgolly.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95` extends StObject {
  
  def raw(from: HEX_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, ANSI16_]
}
object `95` {
  
  inline def apply(raw: /* from */ HEX_ => ANSI16_): `95` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`95`]
  }
  
  extension [Self <: `95`](x: Self) {
    
    inline def setRaw(value: /* from */ HEX_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
