package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.APPLE_
import typingsJapgolly.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `168` extends StObject {
  
  def raw(from: LCH_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LCH_, APPLE_]
}
object `168` {
  
  inline def apply(raw: /* from */ LCH_ => APPLE_): `168` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`168`]
  }
  
  extension [Self <: `168`](x: Self) {
    
    inline def setRaw(value: /* from */ LCH_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
