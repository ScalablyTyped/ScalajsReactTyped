package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HEX_
import typingsJapgolly.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `108` extends StObject {
  
  def raw(from: HSL_): HEX_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, HEX_]
}
object `108` {
  
  inline def apply(raw: /* from */ HSL_ => HEX_): `108` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`108`]
  }
  
  extension [Self <: `108`](x: Self) {
    
    inline def setRaw(value: /* from */ HSL_ => HEX_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
