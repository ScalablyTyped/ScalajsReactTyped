package typingsJapgolly.kiiCloudSdk.KiiCloud

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a server side code execution result in KiiCloud.
  */
trait KiiServerCodeExecResult extends StObject {
  
  /**
    * Get calculated number of executed steps.
    *
    * @return calculated number of executed steps
    */
  def getExecutedSteps(): Double
  
  /**
    * Get Object returned by server code entry.
    *
    * @return returned by server code entry.
    */
  def getReturnedValue(): Any
}
object KiiServerCodeExecResult {
  
  inline def apply(getExecutedSteps: CallbackTo[Double], getReturnedValue: CallbackTo[Any]): KiiServerCodeExecResult = {
    val __obj = js.Dynamic.literal(getExecutedSteps = getExecutedSteps.toJsFn, getReturnedValue = getReturnedValue.toJsFn)
    __obj.asInstanceOf[KiiServerCodeExecResult]
  }
  
  extension [Self <: KiiServerCodeExecResult](x: Self) {
    
    inline def setGetExecutedSteps(value: CallbackTo[Double]): Self = StObject.set(x, "getExecutedSteps", value.toJsFn)
    
    inline def setGetReturnedValue(value: CallbackTo[Any]): Self = StObject.set(x, "getReturnedValue", value.toJsFn)
  }
}
