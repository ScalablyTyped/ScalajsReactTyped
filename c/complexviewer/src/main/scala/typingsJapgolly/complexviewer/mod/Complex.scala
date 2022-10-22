package typingsJapgolly.complexviewer.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complex extends StObject {
  
  var id: String
  
  def initLink(naryLink: NAryLink): Unit
}
object Complex {
  
  inline def apply(id: String, initLink: NAryLink => Callback): Complex = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], initLink = js.Any.fromFunction1((t0: NAryLink) => initLink(t0).runNow()))
    __obj.asInstanceOf[Complex]
  }
  
  extension [Self <: Complex](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitLink(value: NAryLink => Callback): Self = StObject.set(x, "initLink", js.Any.fromFunction1((t0: NAryLink) => value(t0).runNow()))
  }
}
