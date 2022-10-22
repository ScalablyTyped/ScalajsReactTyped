package typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.snyk.anon.Results
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpaWasmInstance extends StObject {
  
  def evaluate(data: Record[String, Any]): Results
  
  def setData(data: Record[String, Any]): Unit
}
object OpaWasmInstance {
  
  inline def apply(evaluate: Record[String, Any] => Results, setData: Record[String, Any] => Callback): OpaWasmInstance = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), setData = js.Any.fromFunction1((t0: Record[String, Any]) => setData(t0).runNow()))
    __obj.asInstanceOf[OpaWasmInstance]
  }
  
  extension [Self <: OpaWasmInstance](x: Self) {
    
    inline def setEvaluate(value: Record[String, Any] => Results): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
    
    inline def setSetData(value: Record[String, Any] => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction1((t0: Record[String, Any]) => value(t0).runNow()))
  }
}
