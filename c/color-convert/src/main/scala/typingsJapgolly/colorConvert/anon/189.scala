package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HSV_
import typingsJapgolly.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `189` extends StObject {
  
  def raw(from: RGB_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ RGB_, HSV_]
}
object `189` {
  
  inline def apply(raw: /* from */ RGB_ => HSV_): `189` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`189`]
  }
  
  extension [Self <: `189`](x: Self) {
    
    inline def setRaw(value: /* from */ RGB_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
