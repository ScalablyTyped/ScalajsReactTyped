package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.ANSI256_
import typingsJapgolly.colorConvert.conversionsMod.HWB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  def raw(from: ANSI256_): HWB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ ANSI256_, HWB_]
}
object `17` {
  
  inline def apply(raw: /* from */ ANSI256_ => HWB_): `17` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`17`]
  }
  
  extension [Self <: `17`](x: Self) {
    
    inline def setRaw(value: /* from */ ANSI256_ => HWB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
