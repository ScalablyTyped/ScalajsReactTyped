package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive events from a layout manager.
  * @see com.sun.star.frame.LayoutManager
  * @since OOo 2.0
  */
trait XLayoutManagerEventBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * adds a layout manager event listener to the object's listener list.
    * @param aLayoutManagerListener a listener that wants to receive events regarding user interface elements that are controlled by a layout manager.
    */
  def addLayoutManagerEventListener(aLayoutManagerListener: XLayoutManagerListener): Unit
  
  /**
    * removes a layout manager event listener from the object's listener list.
    * @param aLayoutManagerListener a listener that don't want to receive events regarding user interface elements that are controlled by a layout manager.
    */
  def removeLayoutManagerEventListener(aLayoutManagerListener: XLayoutManagerListener): Unit
}
object XLayoutManagerEventBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addLayoutManagerEventListener: XLayoutManagerListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeLayoutManagerEventListener: XLayoutManagerListener => Callback
  ): XLayoutManagerEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addLayoutManagerEventListener = js.Any.fromFunction1((t0: XLayoutManagerListener) => addLayoutManagerEventListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeLayoutManagerEventListener = js.Any.fromFunction1((t0: XLayoutManagerListener) => removeLayoutManagerEventListener(t0).runNow()))
    __obj.asInstanceOf[XLayoutManagerEventBroadcaster]
  }
  
  extension [Self <: XLayoutManagerEventBroadcaster](x: Self) {
    
    inline def setAddLayoutManagerEventListener(value: XLayoutManagerListener => Callback): Self = StObject.set(x, "addLayoutManagerEventListener", js.Any.fromFunction1((t0: XLayoutManagerListener) => value(t0).runNow()))
    
    inline def setRemoveLayoutManagerEventListener(value: XLayoutManagerListener => Callback): Self = StObject.set(x, "removeLayoutManagerEventListener", js.Any.fromFunction1((t0: XLayoutManagerListener) => value(t0).runNow()))
  }
}
