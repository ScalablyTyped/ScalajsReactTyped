package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.XSidebarProvider
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends the {@link XController} interface
  * @since OOo 3.0
  */
trait XController2
  extends StObject
     with XController {
  
  /**
    * denotes the "root window" of the controller.
    *
    * If the controller is plugged into a frame, this window acts as the frame's `ComponentWindow` .
    * @see XFrame
    */
  var ComponentWindow: XWindow
  
  /**
    * denotes the arguments used to create the instance.
    *
    * Usually, controllers are created via {@link XModel2.createViewController()} , where the caller can pass not only a controller name, but also arguments
    * parameterizing the to-be-created instance. Those arguments used at creation time can subsequently be retrieved using the `CreationArguments` member.
    */
  var CreationArguments: SafeArray[PropertyValue]
  
  /**
    * get the sidebar if exists
    * @since LibreOffice 5.1
    */
  val Sidebar: XSidebarProvider
  
  /**
    * specifies the view name of the controller.
    *
    * A view name is a logical name, which can be used to create views of the same type. The name is meaningful only in conjunction with {@link
    * XModel2.createViewController()}if it's passed there, a view/controller pair of the same type will be created.
    */
  var ViewControllerName: String
  
  /**
    * get the sidebar if exists
    * @since LibreOffice 5.1
    */
  def getSidebar(): XSidebarProvider
}
object XController2 {
  
  inline def apply(
    ComponentWindow: XWindow,
    CreationArguments: SafeArray[PropertyValue],
    Frame: XFrame,
    Model: XModel,
    Sidebar: XSidebarProvider,
    ViewControllerName: String,
    ViewData: Any,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    attachFrame: XFrame => Callback,
    attachModel: XModel => Boolean,
    dispose: Callback,
    getFrame: CallbackTo[XFrame],
    getModel: CallbackTo[XModel],
    getSidebar: CallbackTo[XSidebarProvider],
    getViewData: CallbackTo[Any],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    restoreViewData: Any => Callback,
    suspend: Boolean => Boolean
  ): XController2 = {
    val __obj = js.Dynamic.literal(ComponentWindow = ComponentWindow.asInstanceOf[js.Any], CreationArguments = CreationArguments.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Sidebar = Sidebar.asInstanceOf[js.Any], ViewControllerName = ViewControllerName.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attachFrame = js.Any.fromFunction1((t0: XFrame) => attachFrame(t0).runNow()), attachModel = js.Any.fromFunction1(attachModel), dispose = dispose.toJsFn, getFrame = getFrame.toJsFn, getModel = getModel.toJsFn, getSidebar = getSidebar.toJsFn, getViewData = getViewData.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), restoreViewData = js.Any.fromFunction1((t0: Any) => restoreViewData(t0).runNow()), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[XController2]
  }
  
  extension [Self <: XController2](x: Self) {
    
    inline def setComponentWindow(value: XWindow): Self = StObject.set(x, "ComponentWindow", value.asInstanceOf[js.Any])
    
    inline def setCreationArguments(value: SafeArray[PropertyValue]): Self = StObject.set(x, "CreationArguments", value.asInstanceOf[js.Any])
    
    inline def setGetSidebar(value: CallbackTo[XSidebarProvider]): Self = StObject.set(x, "getSidebar", value.toJsFn)
    
    inline def setSidebar(value: XSidebarProvider): Self = StObject.set(x, "Sidebar", value.asInstanceOf[js.Any])
    
    inline def setViewControllerName(value: String): Self = StObject.set(x, "ViewControllerName", value.asInstanceOf[js.Any])
  }
}
