package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI256_
import typingsJapgolly.colorConvert.conversionsMod.HCG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  def raw(from: ANSI256_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, HCG_]
}
object `19` {
  
  inline def apply(raw: /* from */ ANSI256_ => HCG_): `19` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI256_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
