package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is an abstract service for a component which offers a more complex user interface to users within a toolbar.
  *
  * A generic toolbar function is represented as a button which has a state (enabled,disabled and selected, not selected). A toolbar controller can be
  * added to a toolbar and provide information or functions with a more sophisticated user interface. ;  A typical example for toolbar controller is a
  * font chooser on a toolbar. It provides all available fonts in a dropdown box and shows the current chosen font.
  * @see com.sun.star.frame.XDispatchProvider
  * @since OOo 2.0
  */
trait XToolbarController
  extends StObject
     with XInterface {
  
  /** notifies a component that a single click has been made on the toolbar item. */
  def click(): Unit
  
  /**
    * requests to create an item window which can be added to the toolbar.
    * @param Parent a {@link com.sun.star.awt.XWindow} which must be used as a parent for the requested item window.
    * @returns a {@link com.sun.star.awt.XWindow} which can be added to a toolbar. The reference must be empty if a component does not want to provide an item w
    */
  def createItemWindow(Parent: XWindow): XWindow
  
  /**
    * requests to create a pop-up window for additional functions.
    * @returns a {@link com.sun.star.awt.XWindow} which provides additional functions to the user. The reference must be empty if component does not want to pro
    */
  def createPopupWindow(): XWindow
  
  /** notifies a component that a double click has been made on the toolbar item. */
  def doubleClick(): Unit
  
  /**
    * provides a function to execute the command which is bound to the toolbar controller.
    * @param KeyModifier a combination of {@link com.sun.star.awt.KeyModifier} value that represent the current state of the modifier keys.  This function is
    */
  def execute(KeyModifier: Double): Unit
}
object XToolbarController {
  
  inline def apply(
    acquire: Callback,
    click: Callback,
    createItemWindow: XWindow => XWindow,
    createPopupWindow: CallbackTo[XWindow],
    doubleClick: Callback,
    execute: Double => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XToolbarController = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, click = click.toJsFn, createItemWindow = js.Any.fromFunction1(createItemWindow), createPopupWindow = createPopupWindow.toJsFn, doubleClick = doubleClick.toJsFn, execute = js.Any.fromFunction1((t0: Double) => execute(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XToolbarController]
  }
  
  extension [Self <: XToolbarController](x: Self) {
    
    inline def setClick(value: Callback): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setCreateItemWindow(value: XWindow => XWindow): Self = StObject.set(x, "createItemWindow", js.Any.fromFunction1(value))
    
    inline def setCreatePopupWindow(value: CallbackTo[XWindow]): Self = StObject.set(x, "createPopupWindow", value.toJsFn)
    
    inline def setDoubleClick(value: Callback): Self = StObject.set(x, "doubleClick", value.toJsFn)
    
    inline def setExecute(value: Double => Callback): Self = StObject.set(x, "execute", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
