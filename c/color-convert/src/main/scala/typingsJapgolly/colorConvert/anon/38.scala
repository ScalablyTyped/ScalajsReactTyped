package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.APPLE_
import typingsJapgolly.colorConvert.conversionsMod.HSL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38` extends StObject {
  
  def raw(from: APPLE_): HSL_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, HSL_]
}
object `38` {
  
  inline def apply(raw: /* from */ APPLE_ => HSL_): `38` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`38`]
  }
  
  extension [Self <: `38`](x: Self) {
    
    inline def setRaw(value: /* from */ APPLE_ => HSL_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
