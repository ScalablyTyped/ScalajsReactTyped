package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI256_
import typingsJapgolly.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `87` extends StObject {
  
  def raw(from: HEX_): ANSI256_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, ANSI256_]
}
object `87` {
  
  inline def apply(raw: /* from */ HEX_ => ANSI256_): `87` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`87`]
  }
  
  extension [Self <: `87`](x: Self) {
    
    inline def setRaw(value: /* from */ HEX_ => ANSI256_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
