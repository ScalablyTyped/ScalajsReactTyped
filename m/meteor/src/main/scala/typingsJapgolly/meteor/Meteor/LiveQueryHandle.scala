package typingsJapgolly.meteor.Meteor

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveQueryHandle extends StObject {
  
  def stop(): Unit
}
object LiveQueryHandle {
  
  inline def apply(stop: Callback): LiveQueryHandle = {
    val __obj = js.Dynamic.literal(stop = stop.toJsFn)
    __obj.asInstanceOf[LiveQueryHandle]
  }
  
  extension [Self <: LiveQueryHandle](x: Self) {
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
