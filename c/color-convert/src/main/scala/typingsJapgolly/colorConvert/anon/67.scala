package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI16_
import typingsJapgolly.colorConvert.conversionsMod.GRAY_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `67` extends StObject {
  
  def raw(from: GRAY_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, ANSI16_]
}
object `67` {
  
  inline def apply(raw: /* from */ GRAY_ => ANSI16_): `67` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`67`]
  }
  
  extension [Self <: `67`](x: Self) {
    
    inline def setRaw(value: /* from */ GRAY_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
