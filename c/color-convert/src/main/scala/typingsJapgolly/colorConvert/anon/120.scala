package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HSV_
import typingsJapgolly.colorConvert.conversionsMod.LCH_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `120` extends StObject {
  
  def raw(from: HSV_): LCH_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ HSV_, LCH_]
}
object `120` {
  
  inline def apply(raw: /* from */ HSV_ => LCH_): `120` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`120`]
  }
  
  extension [Self <: `120`](x: Self) {
    
    inline def setRaw(value: /* from */ HSV_ => LCH_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
