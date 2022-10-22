package typingsJapgolly.nodeSass.mod.types

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait String
  extends StObject
     with Value {
  
  def getValue(): java.lang.String
  
  def setValue(s: java.lang.String): Unit
}
object String {
  
  @JSImport("node-sass", "types.String")
  @js.native
  val ^ : StringConstructor = js.native
  
  extension [Self <: String](x: Self) {
    
    inline def setGetValue(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setSetValue(value: java.lang.String => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: java.lang.String) => value(t0).runNow()))
  }
}
