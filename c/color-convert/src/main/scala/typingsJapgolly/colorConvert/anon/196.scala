package typingsJapgolly.colorConvert.anon

import typingsJapgolly.colorConvert.conversionsMod.APPLE_
import typingsJapgolly.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `196` extends StObject {
  
  def raw(from: XYZ_): APPLE_
  @JSName("raw")
  var raw_Original: js.Function1[/* from */ XYZ_, APPLE_]
}
object `196` {
  
  inline def apply(raw: /* from */ XYZ_ => APPLE_): `196` = {
    val __obj = js.Dynamic.literal(raw = js.Any.fromFunction1(raw))
    __obj.asInstanceOf[`196`]
  }
  
  extension [Self <: `196`](x: Self) {
    
    inline def setRaw(value: /* from */ XYZ_ => APPLE_): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
  }
}
