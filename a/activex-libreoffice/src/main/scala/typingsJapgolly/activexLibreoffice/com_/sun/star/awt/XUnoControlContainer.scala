package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the tab controllers of a {@link UnoControlContainer} . */
trait XUnoControlContainer
  extends StObject
     with XInterface {
  
  /** returns all currently specified tab controllers. */
  var TabControllers: SafeArray[XTabController]
  
  /** adds a single tab controller. */
  def addTabController(TabController: XTabController): Unit
  
  /** returns all currently specified tab controllers. */
  def getTabControllers(): SafeArray[XTabController]
  
  /** removes a single tab controller. */
  def removeTabController(TabController: XTabController): Unit
  
  /** sets a set of tab controllers. */
  def setTabControllers(TabControllers: SeqEquiv[XTabController]): Unit
}
object XUnoControlContainer {
  
  inline def apply(
    TabControllers: SafeArray[XTabController],
    acquire: Callback,
    addTabController: XTabController => Callback,
    getTabControllers: CallbackTo[SafeArray[XTabController]],
    queryInterface: `type` => Any,
    release: Callback,
    removeTabController: XTabController => Callback,
    setTabControllers: SeqEquiv[XTabController] => Callback
  ): XUnoControlContainer = {
    val __obj = js.Dynamic.literal(TabControllers = TabControllers.asInstanceOf[js.Any], acquire = acquire.toJsFn, addTabController = js.Any.fromFunction1((t0: XTabController) => addTabController(t0).runNow()), getTabControllers = getTabControllers.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeTabController = js.Any.fromFunction1((t0: XTabController) => removeTabController(t0).runNow()), setTabControllers = js.Any.fromFunction1((t0: SeqEquiv[XTabController]) => setTabControllers(t0).runNow()))
    __obj.asInstanceOf[XUnoControlContainer]
  }
  
  extension [Self <: XUnoControlContainer](x: Self) {
    
    inline def setAddTabController(value: XTabController => Callback): Self = StObject.set(x, "addTabController", js.Any.fromFunction1((t0: XTabController) => value(t0).runNow()))
    
    inline def setGetTabControllers(value: CallbackTo[SafeArray[XTabController]]): Self = StObject.set(x, "getTabControllers", value.toJsFn)
    
    inline def setRemoveTabController(value: XTabController => Callback): Self = StObject.set(x, "removeTabController", js.Any.fromFunction1((t0: XTabController) => value(t0).runNow()))
    
    inline def setSetTabControllers(value: SeqEquiv[XTabController] => Callback): Self = StObject.set(x, "setTabControllers", js.Any.fromFunction1((t0: SeqEquiv[XTabController]) => value(t0).runNow()))
    
    inline def setTabControllers(value: SafeArray[XTabController]): Self = StObject.set(x, "TabControllers", value.asInstanceOf[js.Any])
  }
}
