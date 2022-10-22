package typingsJapgolly.jsfl

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait xjsfl extends StObject {
  
  def init(_this: Any): Unit
  
  var uri: String
}
object xjsfl {
  
  inline def apply(init: Any => Callback, uri: String): xjsfl = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1((t0: Any) => init(t0).runNow()), uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[xjsfl]
  }
  
  extension [Self <: xjsfl](x: Self) {
    
    inline def setInit(value: Any => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
