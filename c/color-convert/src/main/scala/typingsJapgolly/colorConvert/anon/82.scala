package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HCG_
import typingsJapgolly.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `82` extends StObject {
  
  def raw(from: HCG_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, LAB_]
}
object `82` {
  
  inline def apply(raw: /* from */ HCG_ => LAB_): `82` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`82`]
  }
  
  extension [Self <: `82`](x: Self) {
    
    inline def setRaw(value: /* from */ HCG_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
