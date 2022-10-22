package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the basic operations for a tab controller. */
trait XTabController
  extends StObject
     with XInterface {
  
  /** returns the control container. */
  var Container: XControlContainer
  
  /** returns all controls of the control container. */
  val Controls: SafeArray[XControl]
  
  /** sets the focus to the first control that can be reached with the TAB key. */
  def activateFirst(): Unit
  
  /** sets the focus to the last control that can be reached with the TAB key. */
  def activateLast(): Unit
  
  /** activates tab order. */
  def activateTabOrder(): Unit
  
  /** enables automatic tab order. */
  def autoTabOrder(): Unit
  
  /** returns the control container. */
  def getContainer(): XControlContainer
  
  /** returns all controls of the control container. */
  def getControls(): SafeArray[XControl]
  
  /** returns the tab controller model. */
  def getModel(): XTabControllerModel
  
  /** set the control container. */
  def setContainer(Container: XControlContainer): Unit
  
  /** sets the tab controller model. */
  def setModel(Model: XTabControllerModel): Unit
}
object XTabController {
  
  inline def apply(
    Container: XControlContainer,
    Controls: SafeArray[XControl],
    acquire: Callback,
    activateFirst: Callback,
    activateLast: Callback,
    activateTabOrder: Callback,
    autoTabOrder: Callback,
    getContainer: CallbackTo[XControlContainer],
    getControls: CallbackTo[SafeArray[XControl]],
    getModel: CallbackTo[XTabControllerModel],
    queryInterface: `type` => Any,
    release: Callback,
    setContainer: XControlContainer => Callback,
    setModel: XTabControllerModel => Callback
  ): XTabController = {
    val __obj = js.Dynamic.literal(Container = Container.asInstanceOf[js.Any], Controls = Controls.asInstanceOf[js.Any], acquire = acquire.toJsFn, activateFirst = activateFirst.toJsFn, activateLast = activateLast.toJsFn, activateTabOrder = activateTabOrder.toJsFn, autoTabOrder = autoTabOrder.toJsFn, getContainer = getContainer.toJsFn, getControls = getControls.toJsFn, getModel = getModel.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setContainer = js.Any.fromFunction1((t0: XControlContainer) => setContainer(t0).runNow()), setModel = js.Any.fromFunction1((t0: XTabControllerModel) => setModel(t0).runNow()))
    __obj.asInstanceOf[XTabController]
  }
  
  extension [Self <: XTabController](x: Self) {
    
    inline def setActivateFirst(value: Callback): Self = StObject.set(x, "activateFirst", value.toJsFn)
    
    inline def setActivateLast(value: Callback): Self = StObject.set(x, "activateLast", value.toJsFn)
    
    inline def setActivateTabOrder(value: Callback): Self = StObject.set(x, "activateTabOrder", value.toJsFn)
    
    inline def setAutoTabOrder(value: Callback): Self = StObject.set(x, "autoTabOrder", value.toJsFn)
    
    inline def setContainer(value: XControlContainer): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    inline def setControls(value: SafeArray[XControl]): Self = StObject.set(x, "Controls", value.asInstanceOf[js.Any])
    
    inline def setGetContainer(value: CallbackTo[XControlContainer]): Self = StObject.set(x, "getContainer", value.toJsFn)
    
    inline def setGetControls(value: CallbackTo[SafeArray[XControl]]): Self = StObject.set(x, "getControls", value.toJsFn)
    
    inline def setGetModel(value: CallbackTo[XTabControllerModel]): Self = StObject.set(x, "getModel", value.toJsFn)
    
    inline def setSetContainer(value: XControlContainer => Callback): Self = StObject.set(x, "setContainer", js.Any.fromFunction1((t0: XControlContainer) => value(t0).runNow()))
    
    inline def setSetModel(value: XTabControllerModel => Callback): Self = StObject.set(x, "setModel", js.Any.fromFunction1((t0: XTabControllerModel) => value(t0).runNow()))
  }
}
