package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI16_
import typingsJapgolly.colorConvert.conversionsMod.ANSI256_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  def raw(from: ANSI256_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, ANSI16_]
}
object `25` {
  
  inline def apply(raw: /* from */ ANSI256_ => ANSI16_): `25` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI256_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
