package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** manages the functionality specific for a top window. */
trait XTopWindow
  extends StObject
     with XInterface {
  
  /** adds the specified top window listener to receive window events from this window. */
  def addTopWindowListener(xListener: XTopWindowListener): Unit
  
  /** removes the specified top window listener so that it no longer receives window events from this window. */
  def removeTopWindowListener(xListener: XTopWindowListener): Unit
  
  /** sets a menu bar. */
  def setMenuBar(xMenu: XMenuBar): Unit
  
  /** places this window at the bottom of the stacking order and makes the corresponding adjustment to other visible windows. */
  def toBack(): Unit
  
  /** places this window at the top of the stacking order and shows it in front of any other windows. */
  def toFront(): Unit
}
object XTopWindow {
  
  inline def apply(
    acquire: Callback,
    addTopWindowListener: XTopWindowListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeTopWindowListener: XTopWindowListener => Callback,
    setMenuBar: XMenuBar => Callback,
    toBack: Callback,
    toFront: Callback
  ): XTopWindow = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addTopWindowListener = js.Any.fromFunction1((t0: XTopWindowListener) => addTopWindowListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeTopWindowListener = js.Any.fromFunction1((t0: XTopWindowListener) => removeTopWindowListener(t0).runNow()), setMenuBar = js.Any.fromFunction1((t0: XMenuBar) => setMenuBar(t0).runNow()), toBack = toBack.toJsFn, toFront = toFront.toJsFn)
    __obj.asInstanceOf[XTopWindow]
  }
  
  extension [Self <: XTopWindow](x: Self) {
    
    inline def setAddTopWindowListener(value: XTopWindowListener => Callback): Self = StObject.set(x, "addTopWindowListener", js.Any.fromFunction1((t0: XTopWindowListener) => value(t0).runNow()))
    
    inline def setRemoveTopWindowListener(value: XTopWindowListener => Callback): Self = StObject.set(x, "removeTopWindowListener", js.Any.fromFunction1((t0: XTopWindowListener) => value(t0).runNow()))
    
    inline def setSetMenuBar(value: XMenuBar => Callback): Self = StObject.set(x, "setMenuBar", js.Any.fromFunction1((t0: XMenuBar) => value(t0).runNow()))
    
    inline def setToBack(value: Callback): Self = StObject.set(x, "toBack", value.toJsFn)
    
    inline def setToFront(value: Callback): Self = StObject.set(x, "toFront", value.toJsFn)
  }
}
