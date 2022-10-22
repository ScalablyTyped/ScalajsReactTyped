package typingsJapgolly.cqrsDomain.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineCommandResult extends StObject {
  
  def defineEventStreamsToLoad(cb: defineEventStreamsToLoadHandler): Unit
}
object DefineCommandResult {
  
  inline def apply(defineEventStreamsToLoad: defineEventStreamsToLoadHandler => Callback): DefineCommandResult = {
    val __obj = js.Dynamic.literal(defineEventStreamsToLoad = js.Any.fromFunction1((t0: defineEventStreamsToLoadHandler) => defineEventStreamsToLoad(t0).runNow()))
    __obj.asInstanceOf[DefineCommandResult]
  }
  
  extension [Self <: DefineCommandResult](x: Self) {
    
    inline def setDefineEventStreamsToLoad(value: defineEventStreamsToLoadHandler => Callback): Self = StObject.set(x, "defineEventStreamsToLoad", js.Any.fromFunction1((t0: defineEventStreamsToLoadHandler) => value(t0).runNow()))
  }
}
