package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HSL_
import typingsJapgolly.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110` extends StObject {
  
  def raw(from: HSL_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSL_, LAB_]
}
object `110` {
  
  inline def apply(raw: /* from */ HSL_ => LAB_): `110` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`110`]
  }
  
  extension [Self <: `110`](x: Self) {
    
    inline def setRaw(value: /* from */ HSL_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
