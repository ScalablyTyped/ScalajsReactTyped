package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI16_
import typingsJapgolly.colorConvert.conversionsMod.APPLE_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  def raw(from: APPLE_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, ANSI16_]
}
object `39` {
  
  inline def apply(raw: /* from */ APPLE_ => ANSI16_): `39` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`39`]
  }
  
  extension [Self <: `39`](x: Self) {
    
    inline def setRaw(value: /* from */ APPLE_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
