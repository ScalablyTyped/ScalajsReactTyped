package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HCG_
import typingsJapgolly.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `77` extends StObject {
  
  def raw(from: HCG_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, HSV_]
}
object `77` {
  
  inline def apply(raw: /* from */ HCG_ => HSV_): `77` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`77`]
  }
  
  extension [Self <: `77`](x: Self) {
    
    inline def setRaw(value: /* from */ HCG_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
