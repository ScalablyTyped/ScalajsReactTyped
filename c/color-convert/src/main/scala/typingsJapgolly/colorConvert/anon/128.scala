package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.GRAY_
import typingsJapgolly.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `128` extends StObject {
  
  def raw(from: HWB_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, GRAY_]
}
object `128` {
  
  inline def apply(raw: /* from */ HWB_ => GRAY_): `128` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`128`]
  }
  
  extension [Self <: `128`](x: Self) {
    
    inline def setRaw(value: /* from */ HWB_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
