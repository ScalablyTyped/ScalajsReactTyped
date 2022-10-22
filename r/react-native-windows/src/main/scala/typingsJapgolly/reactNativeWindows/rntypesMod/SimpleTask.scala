package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleTask extends StObject {
  
  def gen(): Unit
  
  var name: String
}
object SimpleTask {
  
  inline def apply(gen: Callback, name: String): SimpleTask = {
    val __obj = js.Dynamic.literal(gen = gen.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleTask]
  }
  
  extension [Self <: SimpleTask](x: Self) {
    
    inline def setGen(value: Callback): Self = StObject.set(x, "gen", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
