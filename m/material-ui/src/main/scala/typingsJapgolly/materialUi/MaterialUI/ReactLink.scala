package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ReactLink is from "react/addons"
trait ReactLink[T] extends StObject {
  
  def requestChange(newValue: T): Unit
  
  var value: T
}
object ReactLink {
  
  inline def apply[T](requestChange: T => Callback, value: T): ReactLink[T] = {
    val __obj = js.Dynamic.literal(requestChange = js.Any.fromFunction1((t0: T) => requestChange(t0).runNow()), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactLink[T]]
  }
  
  extension [Self <: ReactLink[?], T](x: Self & ReactLink[T]) {
    
    inline def setRequestChange(value: T => Callback): Self = StObject.set(x, "requestChange", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
