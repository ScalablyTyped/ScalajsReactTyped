package typingsJapgolly.naja.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsHardRedirect extends StObject {
  
  var isHardRedirect: Boolean
  
  var options: typingsJapgolly.naja.distNajaMod.Options
  
  def setHardRedirect(value: Boolean): Unit
  
  var url: String
}
object IsHardRedirect {
  
  inline def apply(
    isHardRedirect: Boolean,
    options: typingsJapgolly.naja.distNajaMod.Options,
    setHardRedirect: Boolean => Callback,
    url: String
  ): IsHardRedirect = {
    val __obj = js.Dynamic.literal(isHardRedirect = isHardRedirect.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setHardRedirect = js.Any.fromFunction1((t0: Boolean) => setHardRedirect(t0).runNow()), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHardRedirect]
  }
  
  extension [Self <: IsHardRedirect](x: Self) {
    
    inline def setIsHardRedirect(value: Boolean): Self = StObject.set(x, "isHardRedirect", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typingsJapgolly.naja.distNajaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSetHardRedirect(value: Boolean => Callback): Self = StObject.set(x, "setHardRedirect", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
