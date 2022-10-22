package typingsJapgolly.nodeSass.mod.types

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List
  extends StObject
     with Enumerable
     with Value {
  
  def getSeparator(): scala.Boolean
  
  def setSeparator(isComma: scala.Boolean): Unit
}
object List {
  
  @JSImport("node-sass", "types.List")
  @js.native
  val ^ : ListConstructor = js.native
  
  extension [Self <: typingsJapgolly.nodeSass.mod.types.List](x: Self) {
    
    inline def setGetSeparator(value: CallbackTo[scala.Boolean]): Self = StObject.set(x, "getSeparator", value.toJsFn)
    
    inline def setSetSeparator(value: scala.Boolean => Callback): Self = StObject.set(x, "setSeparator", js.Any.fromFunction1((t0: scala.Boolean) => value(t0).runNow()))
  }
}
