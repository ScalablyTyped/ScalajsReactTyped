package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.KEYWORD_
import typingsJapgolly.colorConvert.conversionsMod.LAB_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `155` extends StObject {
  
  def raw(from: LAB_): KEYWORD_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ LAB_, KEYWORD_]
}
object `155` {
  
  inline def apply(raw: /* from */ LAB_ => KEYWORD_): `155` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`155`]
  }
  
  extension [Self <: `155`](x: Self) {
    
    inline def setRaw(value: /* from */ LAB_ => KEYWORD_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
