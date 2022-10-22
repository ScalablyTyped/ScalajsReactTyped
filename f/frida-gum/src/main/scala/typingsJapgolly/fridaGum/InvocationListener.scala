package typingsJapgolly.fridaGum

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvocationListener extends StObject {
  
  /**
    * Detaches listener previously attached through `Interceptor#attach()`.
    */
  def detach(): Unit
}
object InvocationListener {
  
  inline def apply(detach: Callback): InvocationListener = {
    val __obj = js.Dynamic.literal(detach = detach.toJsFn)
    __obj.asInstanceOf[InvocationListener]
  }
  
  extension [Self <: InvocationListener](x: Self) {
    
    inline def setDetach(value: Callback): Self = StObject.set(x, "detach", value.toJsFn)
  }
}
