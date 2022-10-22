package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI16_
import typingsJapgolly.colorConvert.conversionsMod.RGB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Raw extends StObject {
  
  def raw(from: ANSI16_): RGB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI16_, RGB_]
}
object Raw {
  
  inline def apply(raw: /* from */ ANSI16_ => RGB_): Raw = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[Raw]
  }
  
  extension [Self <: Raw](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI16_ => RGB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
