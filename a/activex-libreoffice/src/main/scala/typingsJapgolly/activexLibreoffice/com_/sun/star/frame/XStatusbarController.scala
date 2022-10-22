package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.MouseEvent
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XGraphics
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XUpdatable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * interface to be implemented by a component offering a more complex user interface to users within a status bar.
  *
  * A generic status bar field is represented as a simple text field. A status bar controller can be added to a Statusbar and provide information or
  * functions with a more sophisticated user interface. ;  A typical example for status bar controller is a zoom chooser. It shows the current zoom and
  * provides general zoom levels on a pop-up menu that can be activated by a mouse action for context menus.
  * @see com.sun.star.frame.XDispatchProvider
  * @since OOo 2.0
  */
trait XStatusbarController
  extends StObject
     with XComponent
     with XInitialization
     with XStatusListener
     with XUpdatable {
  
  /**
    * is called by a status bar if the user clicked with mouse into the field of the corresponding control.
    * @param aPos the current mouse position in pixel.
    */
  def click(aPos: Point): Unit
  
  /**
    * is called by a status bar if a command event is available for a controller.
    * @param aPos the current mouse position in pixel.
    * @param nCommand describes which command has been invoked. ;  See {@link com.sun.star.awt.Command} for possible values.
    * @param bMouseEvent `TRUE` if the command is based on a mouse event, otherwise `FALSE` .
    * @param aData for future use only.
    */
  def command(aPos: Point, nCommand: Double, bMouseEvent: Boolean, aData: Any): Unit
  
  /**
    * is called by a status bar if the user double-clicked with mouse into the field of the corresponding control.
    * @param aPos the current mouse position in pixel.
    */
  def doubleClick(aPos: Point): Unit
  
  /**
    * is called by a status bar if the mouse position is within the controller and a mouse button has been pressed. If the controller has captured the mouse
    * input this function is also called when the mouse position is not within the controller.
    * @param aMouseEvent current information about the mouse pointer.
    * @returns return `TRUE` if the event should not be processed and `FALSE` if the event should be processed by the status bar.
    */
  def mouseButtonDown(aMouseEvent: MouseEvent): Boolean
  
  /**
    * is called by a status bar if the mouse position is within the controller and a mouse button has been released. If the controller has captured the
    * mouse input this function is also called when the mouse position is not within the controller.
    * @param aMouseEvent current information about the mouse pointer.
    * @returns return `TRUE` if the event should not be processed and `FALSE` if the event should be processed by the status bar.
    */
  def mouseButtonUp(aMouseEvent: MouseEvent): Boolean
  
  /**
    * is called by a status bar if the mouse position is within the controller and a mouse has been moved. If the controller has captured the mouse input
    * this function is also called when the mouse position is not within the controller.
    * @param aMouseEvent current information about the mouse pointer.
    * @returns return `TRUE` if the event should not be processed and `FALSE` if the event should be processed by the status bar.
    */
  def mouseMove(aMouseEvent: MouseEvent): Boolean
  
  /**
    * is called by a status bar if the controller has to update the visual representation.
    * @param xGraphics a reference to a {@link com.sun.star.awt.XGraphics} which has to be used to update the visual representation.
    * @param OutputRectangle a {@link com.sun.star.awt.Rectangle} which determine the output rectangle for all drawing operations
    * @param nStyle reserved for future use.
    */
  def paint(xGraphics: XGraphics, OutputRectangle: Rectangle, nStyle: Double): Unit
}
object XStatusbarController {
  
  inline def apply(
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    click: Point => Callback,
    command: (Point, Double, Boolean, Any) => Callback,
    dispose: Callback,
    disposing: EventObject => Callback,
    doubleClick: Point => Callback,
    initialize: SeqEquiv[Any] => Callback,
    mouseButtonDown: MouseEvent => Boolean,
    mouseButtonUp: MouseEvent => Boolean,
    mouseMove: MouseEvent => Boolean,
    paint: (XGraphics, Rectangle, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    statusChanged: FeatureStateEvent => Callback,
    update: Callback
  ): XStatusbarController = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), click = js.Any.fromFunction1((t0: Point) => click(t0).runNow()), command = js.Any.fromFunction4((t0: Point, t1: Double, t2: Boolean, t3: Any) => (command(t0, t1, t2, t3)).runNow()), dispose = dispose.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), doubleClick = js.Any.fromFunction1((t0: Point) => doubleClick(t0).runNow()), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), mouseButtonDown = js.Any.fromFunction1(mouseButtonDown), mouseButtonUp = js.Any.fromFunction1(mouseButtonUp), mouseMove = js.Any.fromFunction1(mouseMove), paint = js.Any.fromFunction3((t0: XGraphics, t1: Rectangle, t2: Double) => (paint(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), statusChanged = js.Any.fromFunction1((t0: FeatureStateEvent) => statusChanged(t0).runNow()), update = update.toJsFn)
    __obj.asInstanceOf[XStatusbarController]
  }
  
  extension [Self <: XStatusbarController](x: Self) {
    
    inline def setClick(value: Point => Callback): Self = StObject.set(x, "click", js.Any.fromFunction1((t0: Point) => value(t0).runNow()))
    
    inline def setCommand(value: (Point, Double, Boolean, Any) => Callback): Self = StObject.set(x, "command", js.Any.fromFunction4((t0: Point, t1: Double, t2: Boolean, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setDoubleClick(value: Point => Callback): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1((t0: Point) => value(t0).runNow()))
    
    inline def setMouseButtonDown(value: MouseEvent => Boolean): Self = StObject.set(x, "mouseButtonDown", js.Any.fromFunction1(value))
    
    inline def setMouseButtonUp(value: MouseEvent => Boolean): Self = StObject.set(x, "mouseButtonUp", js.Any.fromFunction1(value))
    
    inline def setMouseMove(value: MouseEvent => Boolean): Self = StObject.set(x, "mouseMove", js.Any.fromFunction1(value))
    
    inline def setPaint(value: (XGraphics, Rectangle, Double) => Callback): Self = StObject.set(x, "paint", js.Any.fromFunction3((t0: XGraphics, t1: Rectangle, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
