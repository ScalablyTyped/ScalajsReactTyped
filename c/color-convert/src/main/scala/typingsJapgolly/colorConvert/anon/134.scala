package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HWB_
import typingsJapgolly.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `134` extends StObject {
  
  def raw(from: HWB_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, LCH_]
}
object `134` {
  
  inline def apply(raw: /* from */ HWB_ => LCH_): `134` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`134`]
  }
  
  extension [Self <: `134`](x: Self) {
    
    inline def setRaw(value: /* from */ HWB_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
