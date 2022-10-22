package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.clipboard.XClipboard
import typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.dnd.XDragGestureRecognizer
import typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.dnd.XDragSource
import typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.dnd.XDropTarget
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Work in progress, don't use unless you know what you are doing. */
trait XToolkitExperimental
  extends StObject
     with XToolkit2 {
  
  /** Get the number of OpenGL buffer swaps. */
  val OpenGLBufferSwapCounter: Double
  
  /** Get the number of OpenGL buffer swaps. */
  def getOpenGLBufferSwapCounter(): Double
  
  /** Pause the main thread of LibreOffice for the requested amount of time. */
  def pause(nMilliseconds: Double): Unit
  
  /** Process all pending idle events */
  def processEventsToIdle(): Unit
  
  /** Turn on or off deterministic scheduling (off is the default). */
  def setDeterministicScheduling(bDeterministicMode: Boolean): Unit
}
object XToolkitExperimental {
  
  inline def apply(
    ActiveTopWindow: XTopWindow,
    DesktopWindow: XWindowPeer,
    OpenGLBufferSwapCounter: Double,
    TopWindowCount: Double,
    WorkArea: Rectangle,
    acquire: Callback,
    addFocusListener: XFocusListener => Callback,
    addKeyHandler: XKeyHandler => Callback,
    addTopWindowListener: XTopWindowListener => Callback,
    createMessageBox: (XWindowPeer, MessageBoxType, Double, String, String) => XMessageBox,
    createRegion: CallbackTo[XRegion],
    createScreenCompatibleDevice: (Double, Double) => XDevice,
    createSystemChild: (Any, SeqEquiv[Double], Double) => XWindowPeer,
    createWindow: WindowDescriptor => XWindowPeer,
    createWindows: SeqEquiv[WindowDescriptor] => SafeArray[XWindowPeer],
    fireFocusGained: XInterface => Callback,
    fireFocusLost: XInterface => Callback,
    getActiveTopWindow: CallbackTo[XTopWindow],
    getClipboard: String => XClipboard,
    getDesktopWindow: CallbackTo[XWindowPeer],
    getDragGestureRecognizer: XWindow => XDragGestureRecognizer,
    getDragSource: XWindow => XDragSource,
    getDropTarget: XWindow => XDropTarget,
    getOpenGLBufferSwapCounter: CallbackTo[Double],
    getTopWindow: Double => XTopWindow,
    getTopWindowCount: CallbackTo[Double],
    getWorkArea: CallbackTo[Rectangle],
    pause: Double => Callback,
    processEventsToIdle: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeFocusListener: XFocusListener => Callback,
    removeKeyHandler: XKeyHandler => Callback,
    removeTopWindowListener: XTopWindowListener => Callback,
    reschedule: Callback,
    setDeterministicScheduling: Boolean => Callback
  ): XToolkitExperimental = {
    val __obj = js.Dynamic.literal(ActiveTopWindow = ActiveTopWindow.asInstanceOf[js.Any], DesktopWindow = DesktopWindow.asInstanceOf[js.Any], OpenGLBufferSwapCounter = OpenGLBufferSwapCounter.asInstanceOf[js.Any], TopWindowCount = TopWindowCount.asInstanceOf[js.Any], WorkArea = WorkArea.asInstanceOf[js.Any], acquire = acquire.toJsFn, addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addKeyHandler = js.Any.fromFunction1((t0: XKeyHandler) => addKeyHandler(t0).runNow()), addTopWindowListener = js.Any.fromFunction1((t0: XTopWindowListener) => addTopWindowListener(t0).runNow()), createMessageBox = js.Any.fromFunction5(createMessageBox), createRegion = createRegion.toJsFn, createScreenCompatibleDevice = js.Any.fromFunction2(createScreenCompatibleDevice), createSystemChild = js.Any.fromFunction3(createSystemChild), createWindow = js.Any.fromFunction1(createWindow), createWindows = js.Any.fromFunction1(createWindows), fireFocusGained = js.Any.fromFunction1((t0: XInterface) => fireFocusGained(t0).runNow()), fireFocusLost = js.Any.fromFunction1((t0: XInterface) => fireFocusLost(t0).runNow()), getActiveTopWindow = getActiveTopWindow.toJsFn, getClipboard = js.Any.fromFunction1(getClipboard), getDesktopWindow = getDesktopWindow.toJsFn, getDragGestureRecognizer = js.Any.fromFunction1(getDragGestureRecognizer), getDragSource = js.Any.fromFunction1(getDragSource), getDropTarget = js.Any.fromFunction1(getDropTarget), getOpenGLBufferSwapCounter = getOpenGLBufferSwapCounter.toJsFn, getTopWindow = js.Any.fromFunction1(getTopWindow), getTopWindowCount = getTopWindowCount.toJsFn, getWorkArea = getWorkArea.toJsFn, pause = js.Any.fromFunction1((t0: Double) => pause(t0).runNow()), processEventsToIdle = processEventsToIdle.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeKeyHandler = js.Any.fromFunction1((t0: XKeyHandler) => removeKeyHandler(t0).runNow()), removeTopWindowListener = js.Any.fromFunction1((t0: XTopWindowListener) => removeTopWindowListener(t0).runNow()), reschedule = reschedule.toJsFn, setDeterministicScheduling = js.Any.fromFunction1((t0: Boolean) => setDeterministicScheduling(t0).runNow()))
    __obj.asInstanceOf[XToolkitExperimental]
  }
  
  extension [Self <: XToolkitExperimental](x: Self) {
    
    inline def setGetOpenGLBufferSwapCounter(value: CallbackTo[Double]): Self = StObject.set(x, "getOpenGLBufferSwapCounter", value.toJsFn)
    
    inline def setOpenGLBufferSwapCounter(value: Double): Self = StObject.set(x, "OpenGLBufferSwapCounter", value.asInstanceOf[js.Any])
    
    inline def setPause(value: Double => Callback): Self = StObject.set(x, "pause", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setProcessEventsToIdle(value: Callback): Self = StObject.set(x, "processEventsToIdle", value.toJsFn)
    
    inline def setSetDeterministicScheduling(value: Boolean => Callback): Self = StObject.set(x, "setDeterministicScheduling", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
