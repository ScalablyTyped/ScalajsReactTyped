package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.APPLE_
import typingsJapgolly.colorConvert.conversionsMod.HSV_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  def raw(from: APPLE_): HSV_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ APPLE_, HSV_]
}
object `35` {
  
  inline def apply(raw: /* from */ APPLE_ => HSV_): `35` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`35`]
  }
  
  extension [Self <: `35`](x: Self) {
    
    inline def setRaw(value: /* from */ APPLE_ => HSV_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
