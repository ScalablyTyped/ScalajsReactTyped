package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * With this interface, components viewed in a {@link Frame} can serve events (by supplying dispatches).
  * @see XFrame
  * @see com.sun.star.awt.XWindow
  * @see XModel
  */
trait XController
  extends StObject
     with XComponent {
  
  /**
    * provides access to owner frame of this controller
    * @returns the frame containing this controller.
    */
  val Frame: XFrame
  
  /**
    * provides access to currently attached model
    * @returns the currently attached model.
    */
  val Model: XModel
  
  /**
    * provides access to current view status
    * @returns set of data that can be used to restore the current view status at later time by using {@link XController.restoreViewData()}
    */
  val ViewData: Any
  
  /**
    * is called to attach the controller with its managing frame.
    * @param Frame the new owner frame of this controller
    */
  def attachFrame(Frame: XFrame): Unit
  
  /**
    * is called to attach the controller to a new model.
    * @param Model the new model for this controller
    * @returns `TRUE` if attach was successfully ; `FALSE` otherwise
    */
  def attachModel(Model: XModel): Boolean
  
  /**
    * provides access to owner frame of this controller
    * @returns the frame containing this controller.
    */
  def getFrame(): XFrame
  
  /**
    * provides access to currently attached model
    * @returns the currently attached model.
    */
  def getModel(): XModel
  
  /**
    * provides access to current view status
    * @returns set of data that can be used to restore the current view status at later time by using {@link XController.restoreViewData()}
    */
  def getViewData(): Any
  
  /**
    * restores the view status using the data gotten from a previous call to {@link XController.getViewData()} .
    * @param Data set of data to restore it
    */
  def restoreViewData(Data: Any): Unit
  
  /**
    * is called to prepare the controller for closing the view
    * @param Suspend `TRUE` force the controller to suspend its work `FALSE` try to reactivate the controller
    * @returns `TRUE` if request was accepted and of course successfully finished ; `FALSE` otherwise
    */
  def suspend(Suspend: Boolean): Boolean
}
object XController {
  
  inline def apply(
    Frame: XFrame,
    Model: XModel,
    ViewData: Any,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    attachFrame: XFrame => Callback,
    attachModel: XModel => Boolean,
    dispose: Callback,
    getFrame: CallbackTo[XFrame],
    getModel: CallbackTo[XModel],
    getViewData: CallbackTo[Any],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    restoreViewData: Any => Callback,
    suspend: Boolean => Boolean
  ): XController = {
    val __obj = js.Dynamic.literal(Frame = Frame.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attachFrame = js.Any.fromFunction1((t0: XFrame) => attachFrame(t0).runNow()), attachModel = js.Any.fromFunction1(attachModel), dispose = dispose.toJsFn, getFrame = getFrame.toJsFn, getModel = getModel.toJsFn, getViewData = getViewData.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), restoreViewData = js.Any.fromFunction1((t0: Any) => restoreViewData(t0).runNow()), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[XController]
  }
  
  extension [Self <: XController](x: Self) {
    
    inline def setAttachFrame(value: XFrame => Callback): Self = StObject.set(x, "attachFrame", js.Any.fromFunction1((t0: XFrame) => value(t0).runNow()))
    
    inline def setAttachModel(value: XModel => Boolean): Self = StObject.set(x, "attachModel", js.Any.fromFunction1(value))
    
    inline def setFrame(value: XFrame): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    inline def setGetFrame(value: CallbackTo[XFrame]): Self = StObject.set(x, "getFrame", value.toJsFn)
    
    inline def setGetModel(value: CallbackTo[XModel]): Self = StObject.set(x, "getModel", value.toJsFn)
    
    inline def setGetViewData(value: CallbackTo[Any]): Self = StObject.set(x, "getViewData", value.toJsFn)
    
    inline def setModel(value: XModel): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setRestoreViewData(value: Any => Callback): Self = StObject.set(x, "restoreViewData", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSuspend(value: Boolean => Boolean): Self = StObject.set(x, "suspend", js.Any.fromFunction1(value))
    
    inline def setViewData(value: Any): Self = StObject.set(x, "ViewData", value.asInstanceOf[js.Any])
  }
}
