package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.RGB_
import typingsJapgolly.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `195` extends StObject {
  
  def raw(from: XYZ_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, RGB_]
}
object `195` {
  
  inline def apply(raw: /* from */ XYZ_ => RGB_): `195` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`195`]
  }
  
  extension [Self <: `195`](x: Self) {
    
    inline def setRaw(value: /* from */ XYZ_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
