package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI16_
import typingsJapgolly.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `166` extends StObject {
  
  def raw(from: LAB_): ANSI16_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, ANSI16_]
}
object `166` {
  
  inline def apply(raw: /* from */ LAB_ => ANSI16_): `166` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`166`]
  }
  
  extension [Self <: `166`](x: Self) {
    
    inline def setRaw(value: /* from */ LAB_ => ANSI16_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
