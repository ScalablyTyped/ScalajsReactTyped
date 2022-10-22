package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISetVersionDeferral extends StObject {
  
  def complete(): Unit
}
object ISetVersionDeferral {
  
  inline def apply(complete: Callback): ISetVersionDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[ISetVersionDeferral]
  }
  
  extension [Self <: ISetVersionDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
