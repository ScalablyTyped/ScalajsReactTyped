package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the VCL container window implementation.
  * @deprecated Deprecated
  */
trait XVclContainerPeer
  extends StObject
     with XInterface {
  
  /** enable as dialog control. */
  def enableDialogControl(bEnable: Boolean): Unit
  
  /** sets a group. */
  def setGroup(Windows: SeqEquiv[XWindow]): Unit
  
  /** sets the tab order. */
  def setTabOrder(WindowOrder: SeqEquiv[XWindow], Tabs: SeqEquiv[Any], GroupControl: Boolean): Unit
}
object XVclContainerPeer {
  
  inline def apply(
    acquire: Callback,
    enableDialogControl: Boolean => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setGroup: SeqEquiv[XWindow] => Callback,
    setTabOrder: (SeqEquiv[XWindow], SeqEquiv[Any], Boolean) => Callback
  ): XVclContainerPeer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, enableDialogControl = js.Any.fromFunction1((t0: Boolean) => enableDialogControl(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setGroup = js.Any.fromFunction1((t0: SeqEquiv[XWindow]) => setGroup(t0).runNow()), setTabOrder = js.Any.fromFunction3((t0: SeqEquiv[XWindow], t1: SeqEquiv[Any], t2: Boolean) => (setTabOrder(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XVclContainerPeer]
  }
  
  extension [Self <: XVclContainerPeer](x: Self) {
    
    inline def setEnableDialogControl(value: Boolean => Callback): Self = StObject.set(x, "enableDialogControl", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetGroup(value: SeqEquiv[XWindow] => Callback): Self = StObject.set(x, "setGroup", js.Any.fromFunction1((t0: SeqEquiv[XWindow]) => value(t0).runNow()))
    
    inline def setSetTabOrder(value: (SeqEquiv[XWindow], SeqEquiv[Any], Boolean) => Callback): Self = StObject.set(x, "setTabOrder", js.Any.fromFunction3((t0: SeqEquiv[XWindow], t1: SeqEquiv[Any], t2: Boolean) => (value(t0, t1, t2)).runNow()))
  }
}
