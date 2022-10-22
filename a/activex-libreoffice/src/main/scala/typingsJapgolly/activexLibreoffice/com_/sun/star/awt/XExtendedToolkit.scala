package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link XExtendedToolkit} is an extension of the {@link com.sun.star.awt.XToolkit} interface. It basically provides access to three event
  * broadcasters which are used for instance in the context of accessibility. It is, however, not restricted to accessibility.
  *
  * The first event broadcaster lets you keep track of the open top-level windows (frames). To get the set of currently open top-level window use the
  * {@link XExtendedToolkit.getTopWindowCount()} and {@link XExtendedToolkit.getTopWindow()} methods.
  *
  * The second event broadcaster informs its listeners of key events. Its listeners can, unlike with most other broadcasters/listeners, consume events, so
  * that other listeners will not be called for consumed events.
  *
  * The last event broadcaster sends events on focus changes of all elements that can have the input focus.
  * @deprecated DeprecatedThis interface was only implemented in an intermediate developer release anyway.
  * @since OOo 1.1.2
  */
trait XExtendedToolkit
  extends StObject
     with XInterface {
  
  /**
    * Return the currently active top-level window, i.e. which has currently the input focus.
    * @returns The returned reference may be empty when no top-level window is active.
    */
  val ActiveTopWindow: XTopWindow
  
  /**
    * This function returns the number of currently existing top-level windows.
    * @returns Returns the number of top-level windows. This includes all top-level windows, regardless of whether they are iconized, visible, or active.
    */
  val TopWindowCount: Double
  
  /**
    * Add a new listener that is called on {@link com.sun.star.awt.FocusEvent} . Use this focus broadcaster to keep track of the object that currently has
    * the input focus.
    * @param xListener If this is a valid reference it is inserted into the list of listeners. It is the task of the caller to not register the same listener
    */
  def addFocusListener(xListener: XFocusListener): Unit
  
  /**
    * Add a new listener that is called on {@link com.sun.star.awt.KeyEvent} . Every listener is given the opportunity to consume the event, i.e. prevent
    * the not yet called listeners from being called.
    * @param xHandler If this is a valid reference it is inserted into the list of handlers. It is the task of the caller to not register the same handler twi
    */
  def addKeyHandler(xHandler: XKeyHandler): Unit
  
  /**
    * Add a new listener that is called for events that involve {@link com.sun.star.awt.XTopWindow} . After having obtained the current list of existing
    * top-level windows you can keep this list up-to-date by listening to opened or closed top-level windows. Wait for activations or deactivations of
    * top-level windows to keep track of the currently active frame.
    * @param xListener If this is a valid reference it is inserted into the list of listeners. It is the task of the caller to not register the same listener
    */
  def addTopWindowListener(xListener: XTopWindowListener): Unit
  
  /**
    * Broadcasts the a focusGained on all registered focus listeners
    * @param source The object that has gained the input focus. It should implement {@link com.sun.star.accessibility.XAccessible} .
    */
  def fireFocusGained(source: XInterface): Unit
  
  /**
    * Broadcasts the a focusGained on all registered focus listeners
    * @param source The object that has lost the input focus. It should implement {@link com.sun.star.accessibility.XAccessible} .
    */
  def fireFocusLost(source: XInterface): Unit
  
  /**
    * Return the currently active top-level window, i.e. which has currently the input focus.
    * @returns The returned reference may be empty when no top-level window is active.
    */
  def getActiveTopWindow(): XTopWindow
  
  /**
    * Return a reference to the specified top-level window. Note that the number of top-level windows may change between a call to {@link
    * getTopWindowCount()} and successive calls to this function.
    * @param nIndex The index should be in the interval from 0 up to but not including the number of top-level windows as returned by {@link getTopWindowCount()} .
    * @returns The returned value is a valid reference to a top-level window.
    * @throws IndexOutOfBoundsException when the specified index is outside the valid range.
    */
  def getTopWindow(nIndex: Double): XTopWindow
  
  /**
    * This function returns the number of currently existing top-level windows.
    * @returns Returns the number of top-level windows. This includes all top-level windows, regardless of whether they are iconized, visible, or active.
    */
  def getTopWindowCount(): Double
  
  /**
    * Remove the specified listener from the list of listeners.
    * @param xListener If the reference is empty then nothing will be changed. If the listener has been registered twice (or more) then all references will be
    */
  def removeFocusListener(xListener: XFocusListener): Unit
  
  /**
    * Remove the specified listener from the list of listeners.
    * @param xHandler If the reference is empty then nothing will be changed. If the handler has been registered twice (or more) then all references will be r
    */
  def removeKeyHandler(xHandler: XKeyHandler): Unit
  
  /**
    * Remove the specified listener from the list of listeners.
    * @param xListener If the reference is empty then nothing will be changed. If the listener has been registered twice (or more) then all references will be
    */
  def removeTopWindowListener(xListener: XTopWindowListener): Unit
}
object XExtendedToolkit {
  
  inline def apply(
    ActiveTopWindow: XTopWindow,
    TopWindowCount: Double,
    acquire: Callback,
    addFocusListener: XFocusListener => Callback,
    addKeyHandler: XKeyHandler => Callback,
    addTopWindowListener: XTopWindowListener => Callback,
    fireFocusGained: XInterface => Callback,
    fireFocusLost: XInterface => Callback,
    getActiveTopWindow: CallbackTo[XTopWindow],
    getTopWindow: Double => XTopWindow,
    getTopWindowCount: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    removeFocusListener: XFocusListener => Callback,
    removeKeyHandler: XKeyHandler => Callback,
    removeTopWindowListener: XTopWindowListener => Callback
  ): XExtendedToolkit = {
    val __obj = js.Dynamic.literal(ActiveTopWindow = ActiveTopWindow.asInstanceOf[js.Any], TopWindowCount = TopWindowCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addKeyHandler = js.Any.fromFunction1((t0: XKeyHandler) => addKeyHandler(t0).runNow()), addTopWindowListener = js.Any.fromFunction1((t0: XTopWindowListener) => addTopWindowListener(t0).runNow()), fireFocusGained = js.Any.fromFunction1((t0: XInterface) => fireFocusGained(t0).runNow()), fireFocusLost = js.Any.fromFunction1((t0: XInterface) => fireFocusLost(t0).runNow()), getActiveTopWindow = getActiveTopWindow.toJsFn, getTopWindow = js.Any.fromFunction1(getTopWindow), getTopWindowCount = getTopWindowCount.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeKeyHandler = js.Any.fromFunction1((t0: XKeyHandler) => removeKeyHandler(t0).runNow()), removeTopWindowListener = js.Any.fromFunction1((t0: XTopWindowListener) => removeTopWindowListener(t0).runNow()))
    __obj.asInstanceOf[XExtendedToolkit]
  }
  
  extension [Self <: XExtendedToolkit](x: Self) {
    
    inline def setActiveTopWindow(value: XTopWindow): Self = StObject.set(x, "ActiveTopWindow", value.asInstanceOf[js.Any])
    
    inline def setAddFocusListener(value: XFocusListener => Callback): Self = StObject.set(x, "addFocusListener", js.Any.fromFunction1((t0: XFocusListener) => value(t0).runNow()))
    
    inline def setAddKeyHandler(value: XKeyHandler => Callback): Self = StObject.set(x, "addKeyHandler", js.Any.fromFunction1((t0: XKeyHandler) => value(t0).runNow()))
    
    inline def setAddTopWindowListener(value: XTopWindowListener => Callback): Self = StObject.set(x, "addTopWindowListener", js.Any.fromFunction1((t0: XTopWindowListener) => value(t0).runNow()))
    
    inline def setFireFocusGained(value: XInterface => Callback): Self = StObject.set(x, "fireFocusGained", js.Any.fromFunction1((t0: XInterface) => value(t0).runNow()))
    
    inline def setFireFocusLost(value: XInterface => Callback): Self = StObject.set(x, "fireFocusLost", js.Any.fromFunction1((t0: XInterface) => value(t0).runNow()))
    
    inline def setGetActiveTopWindow(value: CallbackTo[XTopWindow]): Self = StObject.set(x, "getActiveTopWindow", value.toJsFn)
    
    inline def setGetTopWindow(value: Double => XTopWindow): Self = StObject.set(x, "getTopWindow", js.Any.fromFunction1(value))
    
    inline def setGetTopWindowCount(value: CallbackTo[Double]): Self = StObject.set(x, "getTopWindowCount", value.toJsFn)
    
    inline def setRemoveFocusListener(value: XFocusListener => Callback): Self = StObject.set(x, "removeFocusListener", js.Any.fromFunction1((t0: XFocusListener) => value(t0).runNow()))
    
    inline def setRemoveKeyHandler(value: XKeyHandler => Callback): Self = StObject.set(x, "removeKeyHandler", js.Any.fromFunction1((t0: XKeyHandler) => value(t0).runNow()))
    
    inline def setRemoveTopWindowListener(value: XTopWindowListener => Callback): Self = StObject.set(x, "removeTopWindowListener", js.Any.fromFunction1((t0: XTopWindowListener) => value(t0).runNow()))
    
    inline def setTopWindowCount(value: Double): Self = StObject.set(x, "TopWindowCount", value.asInstanceOf[js.Any])
  }
}
