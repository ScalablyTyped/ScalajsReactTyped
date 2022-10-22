package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  respectPrefix :boolean,   respectImportant :boolean}> */
trait PartialrespectPrefixboole extends StObject {
  
  var respectImportant: js.UndefOr[Boolean] = js.undefined
  
  var respectPrefix: js.UndefOr[Boolean] = js.undefined
}
object PartialrespectPrefixboole {
  
  inline def apply(): PartialrespectPrefixboole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialrespectPrefixboole]
  }
  
  extension [Self <: PartialrespectPrefixboole](x: Self) {
    
    inline def setRespectImportant(value: Boolean): Self = StObject.set(x, "respectImportant", value.asInstanceOf[js.Any])
    
    inline def setRespectImportantUndefined: Self = StObject.set(x, "respectImportant", js.undefined)
    
    inline def setRespectPrefix(value: Boolean): Self = StObject.set(x, "respectPrefix", value.asInstanceOf[js.Any])
    
    inline def setRespectPrefixUndefined: Self = StObject.set(x, "respectPrefix", js.undefined)
  }
}
