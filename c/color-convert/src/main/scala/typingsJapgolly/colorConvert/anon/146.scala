package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.KEYWORD_
import typingsJapgolly.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `146` extends StObject {
  
  def raw(from: KEYWORD_): XYZ_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ KEYWORD_, XYZ_]
}
object `146` {
  
  inline def apply(raw: /* from */ KEYWORD_ => XYZ_): `146` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`146`]
  }
  
  extension [Self <: `146`](x: Self) {
    
    inline def setRaw(value: /* from */ KEYWORD_ => XYZ_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
