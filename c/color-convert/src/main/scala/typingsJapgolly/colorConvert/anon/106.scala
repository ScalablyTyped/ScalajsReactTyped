package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HSL_
import typingsJapgolly.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `106` extends StObject {
  
  def raw(from: HSL_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, HSV_]
}
object `106` {
  
  inline def apply(raw: /* from */ HSL_ => HSV_): `106` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`106`]
  }
  
  extension [Self <: `106`](x: Self) {
    
    inline def setRaw(value: /* from */ HSL_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
