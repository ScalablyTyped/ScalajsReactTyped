package typingsJapgolly.minappEnv.WXNS

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRequestTask extends StObject {
  
  def abort(): Unit
}
object IRequestTask {
  
  inline def apply(abort: Callback): IRequestTask = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn)
    __obj.asInstanceOf[IRequestTask]
  }
  
  extension [Self <: IRequestTask](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
  }
}
