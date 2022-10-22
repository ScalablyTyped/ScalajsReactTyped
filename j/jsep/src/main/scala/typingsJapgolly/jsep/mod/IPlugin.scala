package typingsJapgolly.jsep.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlugin extends StObject {
  
  def init(): Unit
  
  var name: String
}
object IPlugin {
  
  inline def apply(init: Callback, name: String): IPlugin = {
    val __obj = js.Dynamic.literal(init = init.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlugin]
  }
  
  extension [Self <: IPlugin](x: Self) {
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
