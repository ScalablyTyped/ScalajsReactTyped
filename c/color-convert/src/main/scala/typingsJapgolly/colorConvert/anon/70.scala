package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.APPLE_
import typingsJapgolly.colorConvert.conversionsMod.HCG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `70` extends StObject {
  
  def raw(from: HCG_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, APPLE_]
}
object `70` {
  
  inline def apply(raw: /* from */ HCG_ => APPLE_): `70` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`70`]
  }
  
  extension [Self <: `70`](x: Self) {
    
    inline def setRaw(value: /* from */ HCG_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
