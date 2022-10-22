package typingsJapgolly.bull.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobPromise extends StObject {
  
  /**
    * Abort this job
    */
  def cancel(): Unit
}
object JobPromise {
  
  inline def apply(cancel: Callback): JobPromise = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn)
    __obj.asInstanceOf[JobPromise]
  }
  
  extension [Self <: JobPromise](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
  }
}
