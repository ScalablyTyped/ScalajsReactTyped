package typingsJapgolly.webix.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var config: StringDictionary[Any]
  
  def define(property: String, value: Any): Unit
  
  var name: String
}
object Settings {
  
  @JSImport("webix", "Settings")
  @js.native
  val ^ : Settings = js.native
  
  extension [Self <: Settings](x: Self) {
    
    inline def setConfig(value: StringDictionary[Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDefine(value: (String, Any) => Callback): Self = StObject.set(x, "define", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
