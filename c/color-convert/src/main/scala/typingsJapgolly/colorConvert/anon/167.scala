package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.LCH_
import typingsJapgolly.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `167` extends StObject {
  
  def raw(from: LCH_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, RGB_]
}
object `167` {
  
  inline def apply(raw: /* from */ LCH_ => RGB_): `167` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`167`]
  }
  
  extension [Self <: `167`](x: Self) {
    
    inline def setRaw(value: /* from */ LCH_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
