package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'auto' | 'cover' | 'contain', string> */
trait Recordautocovercontainstr extends StObject {
  
  var auto: String
  
  var contain: String
  
  var cover: String
}
object Recordautocovercontainstr {
  
  inline def apply(auto: String, contain: String, cover: String): Recordautocovercontainstr = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], contain = contain.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordautocovercontainstr]
  }
  
  extension [Self <: Recordautocovercontainstr](x: Self) {
    
    inline def setAuto(value: String): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setContain(value: String): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    inline def setCover(value: String): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
  }
}
