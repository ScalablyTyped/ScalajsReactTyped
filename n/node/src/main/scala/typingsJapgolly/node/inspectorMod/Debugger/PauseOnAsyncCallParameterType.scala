package typingsJapgolly.node.inspectorMod.Debugger

import typingsJapgolly.node.inspectorMod.Runtime.StackTraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PauseOnAsyncCallParameterType extends StObject {
  
  /**
    * Debugger will pause when async call with given stack trace is started.
    */
  var parentStackTraceId: StackTraceId
}
object PauseOnAsyncCallParameterType {
  
  inline def apply(parentStackTraceId: StackTraceId): PauseOnAsyncCallParameterType = {
    val __obj = js.Dynamic.literal(parentStackTraceId = parentStackTraceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseOnAsyncCallParameterType]
  }
  
  extension [Self <: PauseOnAsyncCallParameterType](x: Self) {
    
    inline def setParentStackTraceId(value: StackTraceId): Self = StObject.set(x, "parentStackTraceId", value.asInstanceOf[js.Any])
  }
}
