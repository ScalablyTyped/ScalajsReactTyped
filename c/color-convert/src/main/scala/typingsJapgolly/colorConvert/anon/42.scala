package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.APPLE_
import typingsJapgolly.colorConvert.conversionsMod.CMYK_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42` extends StObject {
  
  def raw(from: CMYK_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ CMYK_, APPLE_]
}
object `42` {
  
  inline def apply(raw: /* from */ CMYK_ => APPLE_): `42` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`42`]
  }
  
  extension [Self <: `42`](x: Self) {
    
    inline def setRaw(value: /* from */ CMYK_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
