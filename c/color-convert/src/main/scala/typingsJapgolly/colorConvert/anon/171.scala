package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI256_
import typingsJapgolly.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `171` extends StObject {
  
  def raw(from: LCH_): ANSI256_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, ANSI256_]
}
object `171` {
  
  inline def apply(raw: /* from */ LCH_ => ANSI256_): `171` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`171`]
  }
  
  extension [Self <: `171`](x: Self) {
    
    inline def setRaw(value: /* from */ LCH_ => ANSI256_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
