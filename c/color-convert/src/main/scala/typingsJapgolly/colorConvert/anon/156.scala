package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.GRAY_
import typingsJapgolly.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `156` extends StObject {
  
  def raw(from: LAB_): GRAY_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, GRAY_]
}
object `156` {
  
  inline def apply(raw: /* from */ LAB_ => GRAY_): `156` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`156`]
  }
  
  extension [Self <: `156`](x: Self) {
    
    inline def setRaw(value: /* from */ LAB_ => GRAY_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
