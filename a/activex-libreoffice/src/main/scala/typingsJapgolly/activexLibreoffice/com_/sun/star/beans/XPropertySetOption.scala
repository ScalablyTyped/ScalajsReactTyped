package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XPropertySetOption
  extends StObject
     with XInterface {
  
  /** Turn on or off notifying change listeners on property value change. This option is turned on by default. */
  def enableChangeListenerNotification(bEnable: Boolean): Unit
}
object XPropertySetOption {
  
  inline def apply(
    acquire: Callback,
    enableChangeListenerNotification: Boolean => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XPropertySetOption = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, enableChangeListenerNotification = js.Any.fromFunction1((t0: Boolean) => enableChangeListenerNotification(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPropertySetOption]
  }
  
  extension [Self <: XPropertySetOption](x: Self) {
    
    inline def setEnableChangeListenerNotification(value: Boolean => Callback): Self = StObject.set(x, "enableChangeListenerNotification", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
