package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HEX_
import typingsJapgolly.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `96` extends StObject {
  
  def raw(from: HEX_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HEX_, LAB_]
}
object `96` {
  
  inline def apply(raw: /* from */ HEX_ => LAB_): `96` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`96`]
  }
  
  extension [Self <: `96`](x: Self) {
    
    inline def setRaw(value: /* from */ HEX_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
