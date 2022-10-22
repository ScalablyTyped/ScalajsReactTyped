package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * identifies a control.
  *
  * Implementations of this interface are abstract windows. The main reason to instantiate this implementation is to show the window on the screen. Before
  * the window appears on the screen, the {@link XControl.createPeer()} method must be called.
  *
  * If the implementation of the control does not distinguish between model, view and controller, it must allow to set a new {@link XGraphics} in the
  * view, so that the control can be printed.
  */
trait XControl
  extends StObject
     with XComponent {
  
  /** gets the context of the control. */
  var Context: XInterface
  
  /** returns the model for this control. */
  var Model: XControlModel
  
  /** returns the peer which was previously created or set. */
  val Peer: XWindowPeer
  
  /** returns the view of this control. */
  val View: XView
  
  /**
    * creates a "child" window on the screen.
    *
    * If the parent is NULL, then the desktop window of the toolkit is the parent.
    */
  def createPeer(Toolkit: XToolkit, Parent: XWindowPeer): Unit
  
  /** gets the context of the control. */
  def getContext(): XInterface
  
  /** returns the model for this control. */
  def getModel(): XControlModel
  
  /** returns the peer which was previously created or set. */
  def getPeer(): XWindowPeer
  
  /** returns the view of this control. */
  def getView(): XView
  
  /** returns `TRUE` if the control is in design mode, `FALSE` otherwise. */
  def isDesignMode(): Boolean
  
  /** returns `TRUE` if the control is transparent, `FALSE` otherwise. */
  def isTransparent(): Boolean
  
  /** sets the context of the control. */
  def setContext(Context: XInterface): Unit
  
  /**
    * sets the design mode for use in a design editor.
    *
    * Normally the control will be painted directly without a peer.
    */
  def setDesignMode(bOn: Boolean): Unit
  
  /** sets a model for the control. */
  def setModel(Model: XControlModel): Boolean
}
object XControl {
  
  inline def apply(
    Context: XInterface,
    Model: XControlModel,
    Peer: XWindowPeer,
    View: XView,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    createPeer: (XToolkit, XWindowPeer) => Callback,
    dispose: Callback,
    getContext: CallbackTo[XInterface],
    getModel: CallbackTo[XControlModel],
    getPeer: CallbackTo[XWindowPeer],
    getView: CallbackTo[XView],
    isDesignMode: CallbackTo[Boolean],
    isTransparent: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setContext: XInterface => Callback,
    setDesignMode: Boolean => Callback,
    setModel: XControlModel => Boolean
  ): XControl = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), dispose = dispose.toJsFn, getContext = getContext.toJsFn, getModel = getModel.toJsFn, getPeer = getPeer.toJsFn, getView = getView.toJsFn, isDesignMode = isDesignMode.toJsFn, isTransparent = isTransparent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setModel = js.Any.fromFunction1(setModel))
    __obj.asInstanceOf[XControl]
  }
  
  extension [Self <: XControl](x: Self) {
    
    inline def setContext(value: XInterface): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    inline def setCreatePeer(value: (XToolkit, XWindowPeer) => Callback): Self = StObject.set(x, "createPeer", js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (value(t0, t1)).runNow()))
    
    inline def setGetContext(value: CallbackTo[XInterface]): Self = StObject.set(x, "getContext", value.toJsFn)
    
    inline def setGetModel(value: CallbackTo[XControlModel]): Self = StObject.set(x, "getModel", value.toJsFn)
    
    inline def setGetPeer(value: CallbackTo[XWindowPeer]): Self = StObject.set(x, "getPeer", value.toJsFn)
    
    inline def setGetView(value: CallbackTo[XView]): Self = StObject.set(x, "getView", value.toJsFn)
    
    inline def setIsDesignMode(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDesignMode", value.toJsFn)
    
    inline def setIsTransparent(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTransparent", value.toJsFn)
    
    inline def setModel(value: XControlModel): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: XWindowPeer): Self = StObject.set(x, "Peer", value.asInstanceOf[js.Any])
    
    inline def setSetContext(value: XInterface => Callback): Self = StObject.set(x, "setContext", js.Any.fromFunction1((t0: XInterface) => value(t0).runNow()))
    
    inline def setSetDesignMode(value: Boolean => Callback): Self = StObject.set(x, "setDesignMode", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetModel(value: XControlModel => Boolean): Self = StObject.set(x, "setModel", js.Any.fromFunction1(value))
    
    inline def setView(value: XView): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
  }
}
