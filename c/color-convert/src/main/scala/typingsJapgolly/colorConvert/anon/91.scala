package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HEX_
import typingsJapgolly.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `91` extends StObject {
  
  def raw(from: HEX_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, XYZ_]
}
object `91` {
  
  inline def apply(raw: /* from */ HEX_ => XYZ_): `91` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`91`]
  }
  
  extension [Self <: `91`](x: Self) {
    
    inline def setRaw(value: /* from */ HEX_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
