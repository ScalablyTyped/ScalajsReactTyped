package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HWB_
import typingsJapgolly.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `172` extends StObject {
  
  def raw(from: LCH_): HWB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, HWB_]
}
object `172` {
  
  inline def apply(raw: /* from */ LCH_ => HWB_): `172` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`172`]
  }
  
  extension [Self <: `172`](x: Self) {
    
    inline def setRaw(value: /* from */ LCH_ => HWB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
