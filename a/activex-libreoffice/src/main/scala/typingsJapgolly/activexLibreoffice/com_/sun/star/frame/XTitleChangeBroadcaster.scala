package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows to register for title changed events. */
trait XTitleChangeBroadcaster
  extends StObject
     with XInterface {
  
  /** Add a listener */
  def addTitleChangeListener(xListener: XTitleChangeListener): Unit
  
  /** Remove a listener */
  def removeTitleChangeListener(xListener: XTitleChangeListener): Unit
}
object XTitleChangeBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addTitleChangeListener: XTitleChangeListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeTitleChangeListener: XTitleChangeListener => Callback
  ): XTitleChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addTitleChangeListener = js.Any.fromFunction1((t0: XTitleChangeListener) => addTitleChangeListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeTitleChangeListener = js.Any.fromFunction1((t0: XTitleChangeListener) => removeTitleChangeListener(t0).runNow()))
    __obj.asInstanceOf[XTitleChangeBroadcaster]
  }
  
  extension [Self <: XTitleChangeBroadcaster](x: Self) {
    
    inline def setAddTitleChangeListener(value: XTitleChangeListener => Callback): Self = StObject.set(x, "addTitleChangeListener", js.Any.fromFunction1((t0: XTitleChangeListener) => value(t0).runNow()))
    
    inline def setRemoveTitleChangeListener(value: XTitleChangeListener => Callback): Self = StObject.set(x, "removeTitleChangeListener", js.Any.fromFunction1((t0: XTitleChangeListener) => value(t0).runNow()))
  }
}
