package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.HCG_
import typingsJapgolly.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `160` extends StObject {
  
  def raw(from: LAB_): HCG_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, HCG_]
}
object `160` {
  
  inline def apply(raw: /* from */ LAB_ => HCG_): `160` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`160`]
  }
  
  extension [Self <: `160`](x: Self) {
    
    inline def setRaw(value: /* from */ LAB_ => HCG_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
