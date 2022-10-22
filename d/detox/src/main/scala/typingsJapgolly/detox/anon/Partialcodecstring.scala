package typingsJapgolly.detox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  codec :string}> */
trait Partialcodecstring extends StObject {
  
  var codec: js.UndefOr[String] = js.undefined
}
object Partialcodecstring {
  
  inline def apply(): Partialcodecstring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialcodecstring]
  }
  
  extension [Self <: Partialcodecstring](x: Self) {
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
  }
}
