package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.APPLE_
import typingsJapgolly.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `112` extends StObject {
  
  def raw(from: HSV_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, APPLE_]
}
object `112` {
  
  inline def apply(raw: /* from */ HSV_ => APPLE_): `112` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`112`]
  }
  
  extension [Self <: `112`](x: Self) {
    
    inline def setRaw(value: /* from */ HSV_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
