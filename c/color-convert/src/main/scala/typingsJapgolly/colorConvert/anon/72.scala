package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.GRAY_
import typingsJapgolly.colorConvert.conversionsMod.HCG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `72` extends StObject {
  
  def raw(from: HCG_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HCG_, GRAY_]
}
object `72` {
  
  inline def apply(raw: /* from */ HCG_ => GRAY_): `72` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`72`]
  }
  
  extension [Self <: `72`](x: Self) {
    
    inline def setRaw(value: /* from */ HCG_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
