package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI256_
import typingsJapgolly.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  def raw(from: ANSI256_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, LCH_]
}
object `22` {
  
  inline def apply(raw: /* from */ ANSI256_ => LCH_): `22` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`22`]
  }
  
  extension [Self <: `22`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI256_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
