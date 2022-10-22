package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an interface which can be used to call back an implementation */
trait XCallback extends StObject {
  
  /**
    * notifies the callback implementation
    * @param aData private data which was provided when the callback was requested.
    */
  def notify(aData: Any): Unit
}
object XCallback {
  
  inline def apply(notify_ : Any => Callback): XCallback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("notify")(js.Any.fromFunction1((t0: Any) => notify_(t0).runNow()))
    __obj.asInstanceOf[XCallback]
  }
  
  extension [Self <: XCallback](x: Self) {
    
    inline def setNotify_(value: Any => Callback): Self = StObject.set(x, "notify", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
