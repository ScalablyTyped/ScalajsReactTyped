package typingsJapgolly.intercomjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.intercomjs.intercom.Intercom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntercomStatic extends StObject {
  
  /**
    * Removes all data associated with intercom from localStorage.
    */
  def destroy(): Unit
  
  /**
    * Returns an instance of Intercom. If one doesn't exist, it will be instantiated.
    * @return an instance of Intercom.
    */
  def getInstance(): Intercom
}
object IntercomStatic {
  
  inline def apply(destroy: Callback, getInstance: CallbackTo[Intercom]): IntercomStatic = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getInstance = getInstance.toJsFn)
    __obj.asInstanceOf[IntercomStatic]
  }
  
  extension [Self <: IntercomStatic](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetInstance(value: CallbackTo[Intercom]): Self = StObject.set(x, "getInstance", value.toJsFn)
  }
}
