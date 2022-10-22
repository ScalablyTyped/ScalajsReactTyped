package typingsJapgolly.akamaiEdgeworkers.EW

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutatesVariables extends StObject {
  
  /**
    * Sets the value of a metadata variable, throwing an error if the
    * variable name does not start with 'PMUSER_'
    */
  def setVariable(name: String, value: String): Unit
}
object MutatesVariables {
  
  inline def apply(setVariable: (String, String) => Callback): MutatesVariables = {
    val __obj = js.Dynamic.literal(setVariable = js.Any.fromFunction2((t0: String, t1: String) => (setVariable(t0, t1)).runNow()))
    __obj.asInstanceOf[MutatesVariables]
  }
  
  extension [Self <: MutatesVariables](x: Self) {
    
    inline def setSetVariable(value: (String, String) => Callback): Self = StObject.set(x, "setVariable", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
