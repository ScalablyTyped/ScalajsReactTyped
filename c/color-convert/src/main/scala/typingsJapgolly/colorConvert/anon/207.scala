package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI16_
import typingsJapgolly.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `207` extends StObject {
  
  def raw(from: XYZ_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, ANSI16_]
}
object `207` {
  
  inline def apply(raw: /* from */ XYZ_ => ANSI16_): `207` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`207`]
  }
  
  extension [Self <: `207`](x: Self) {
    
    inline def setRaw(value: /* from */ XYZ_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
