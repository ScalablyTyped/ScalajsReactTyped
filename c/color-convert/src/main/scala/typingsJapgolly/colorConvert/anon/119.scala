package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HSV_
import typingsJapgolly.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `119` extends StObject {
  
  def raw(from: HSV_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, XYZ_]
}
object `119` {
  
  inline def apply(raw: /* from */ HSV_ => XYZ_): `119` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`119`]
  }
  
  extension [Self <: `119`](x: Self) {
    
    inline def setRaw(value: /* from */ HSV_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
