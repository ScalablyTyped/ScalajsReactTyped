package typingsJapgolly.interactjsTypes.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.interactjsTypes.coreScopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Install extends StObject {
  
  var id: String
  
  def install(scope: Scope): Unit
}
object Install {
  
  inline def apply(id: String, install: Scope => Callback): Install = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], install = js.Any.fromFunction1((t0: Scope) => install(t0).runNow()))
    __obj.asInstanceOf[Install]
  }
  
  extension [Self <: Install](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstall(value: Scope => Callback): Self = StObject.set(x, "install", js.Any.fromFunction1((t0: Scope) => value(t0).runNow()))
  }
}
