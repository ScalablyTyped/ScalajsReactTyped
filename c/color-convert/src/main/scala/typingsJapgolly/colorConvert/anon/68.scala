package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.GRAY_
import typingsJapgolly.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `68` extends StObject {
  
  def raw(from: GRAY_): LAB_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ GRAY_, LAB_]
}
object `68` {
  
  inline def apply(raw: /* from */ GRAY_ => LAB_): `68` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`68`]
  }
  
  extension [Self <: `68`](x: Self) {
    
    inline def setRaw(value: /* from */ GRAY_ => LAB_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
