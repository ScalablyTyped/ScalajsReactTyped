package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI256_
import typingsJapgolly.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `101` extends StObject {
  
  def raw(from: HSL_): ANSI256_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, ANSI256_]
}
object `101` {
  
  inline def apply(raw: /* from */ HSL_ => ANSI256_): `101` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`101`]
  }
  
  extension [Self <: `101`](x: Self) {
    
    inline def setRaw(value: /* from */ HSL_ => ANSI256_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
