package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.APPLE_
import typingsJapgolly.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `84` extends StObject {
  
  def raw(from: HEX_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, APPLE_]
}
object `84` {
  
  inline def apply(raw: /* from */ HEX_ => APPLE_): `84` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`84`]
  }
  
  extension [Self <: `84`](x: Self) {
    
    inline def setRaw(value: /* from */ HEX_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
