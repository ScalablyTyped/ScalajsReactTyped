package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
trait StatusIndicatorFactory
  extends StObject
     with XStatusIndicatorFactory {
  
  def createWithFrame(Frame: XFrame, DisableReschedule: Boolean, AllowParentShow: Boolean): Unit
  
  def createWithWindow(ParentWindow: XWindow, DisableReschedule: Boolean, AllowParentShow: Boolean): Unit
}
object StatusIndicatorFactory {
  
  inline def apply(
    acquire: Callback,
    createStatusIndicator: CallbackTo[XStatusIndicator],
    createWithFrame: (XFrame, Boolean, Boolean) => Callback,
    createWithWindow: (XWindow, Boolean, Boolean) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): StatusIndicatorFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createStatusIndicator = createStatusIndicator.toJsFn, createWithFrame = js.Any.fromFunction3((t0: XFrame, t1: Boolean, t2: Boolean) => (createWithFrame(t0, t1, t2)).runNow()), createWithWindow = js.Any.fromFunction3((t0: XWindow, t1: Boolean, t2: Boolean) => (createWithWindow(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[StatusIndicatorFactory]
  }
  
  extension [Self <: StatusIndicatorFactory](x: Self) {
    
    inline def setCreateWithFrame(value: (XFrame, Boolean, Boolean) => Callback): Self = StObject.set(x, "createWithFrame", js.Any.fromFunction3((t0: XFrame, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setCreateWithWindow(value: (XWindow, Boolean, Boolean) => Callback): Self = StObject.set(x, "createWithWindow", js.Any.fromFunction3((t0: XWindow, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
  }
}
