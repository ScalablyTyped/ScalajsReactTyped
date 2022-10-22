package typingsJapgolly.sipJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parsed extends StObject {
  
  var parsed: js.UndefOr[Any] = js.undefined
  
  var raw: String
}
object Parsed {
  
  inline def apply(raw: String): Parsed = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parsed]
  }
  
  extension [Self <: Parsed](x: Self) {
    
    inline def setParsed(value: Any): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    inline def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
