package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HSL_
import typingsJapgolly.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `136` extends StObject {
  
  def raw(from: HWB_): HSL_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HWB_, HSL_]
}
object `136` {
  
  inline def apply(raw: /* from */ HWB_ => HSL_): `136` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`136`]
  }
  
  extension [Self <: `136`](x: Self) {
    
    inline def setRaw(value: /* from */ HWB_ => HSL_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
