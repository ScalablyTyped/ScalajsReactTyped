package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HCG_
import typingsJapgolly.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `104` extends StObject {
  
  def raw(from: HSL_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, HCG_]
}
object `104` {
  
  inline def apply(raw: /* from */ HSL_ => HCG_): `104` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`104`]
  }
  
  extension [Self <: `104`](x: Self) {
    
    inline def setRaw(value: /* from */ HSL_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
