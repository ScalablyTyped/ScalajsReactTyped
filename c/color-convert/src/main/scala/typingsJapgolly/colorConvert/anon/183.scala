package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.GRAY_
import typingsJapgolly.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `183` extends StObject {
  
  def raw(from: RGB_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, GRAY_]
}
object `183` {
  
  inline def apply(raw: /* from */ RGB_ => GRAY_): `183` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`183`]
  }
  
  extension [Self <: `183`](x: Self) {
    
    inline def setRaw(value: /* from */ RGB_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
