package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.GRAY_
import typingsJapgolly.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `66` extends StObject {
  
  def raw(from: GRAY_): HSL_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, HSL_]
}
object `66` {
  
  inline def apply(raw: /* from */ GRAY_ => HSL_): `66` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`66`]
  }
  
  extension [Self <: `66`](x: Self) {
    
    inline def setRaw(value: /* from */ GRAY_ => HSL_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
