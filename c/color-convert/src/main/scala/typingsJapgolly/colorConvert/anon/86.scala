package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.GRAY_
import typingsJapgolly.colorConvert.conversionsMod.HEX_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `86` extends StObject {
  
  def raw(from: HEX_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, GRAY_]
}
object `86` {
  
  inline def apply(raw: /* from */ HEX_ => GRAY_): `86` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`86`]
  }
  
  extension [Self <: `86`](x: Self) {
    
    inline def setRaw(value: /* from */ HEX_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
