package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI256_
import typingsJapgolly.colorConvert.conversionsMod.KEYWORD_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  def raw(from: ANSI256_): KEYWORD_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, KEYWORD_]
}
object `15` {
  
  inline def apply(raw: /* from */ ANSI256_ => KEYWORD_): `15` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`15`]
  }
  
  extension [Self <: `15`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI256_ => KEYWORD_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
