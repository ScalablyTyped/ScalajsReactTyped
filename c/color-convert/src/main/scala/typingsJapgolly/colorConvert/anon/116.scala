package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HSV_
import typingsJapgolly.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `116` extends StObject {
  
  def raw(from: HSV_): HWB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, HWB_]
}
object `116` {
  
  inline def apply(raw: /* from */ HSV_ => HWB_): `116` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`116`]
  }
  
  extension [Self <: `116`](x: Self) {
    
    inline def setRaw(value: /* from */ HSV_ => HWB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
