package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XStatusIndicator
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XStatusIndicatorFactory
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
trait XFrame2
  extends StObject
     with XDispatchProvider
     with XDispatchInformationProvider
     with XDispatchProviderInterception
     with XFramesSupplier
     with XStatusIndicatorFactory {
  
  /**
    * provides access to the dispatch recorder of the frame
    *
    * Such recorder can be used to record dispatch requests. The supplier contains a dispatch recorder and provide the functionality to use it for any
    * dispatch object from outside which supports the interface {@link XDispatch} . A supplier is available only, if recording was enabled. That means: if
    * someone wishes to enable recoding on a frame they must set a supplier with a recorder object inside of it. Every user of dispatches has to check then if
    * such supplier is available at this frame property. If value of this property is `NULL` they must call {@link XDispatch.dispatch()} on the original
    * dispatch object. If it's a valid value they must use the supplier by calling its method {@link XDispatchRecorderSupplier.dispatchAndRecord()} with the
    * original dispatch object as argument.
    *
    * Note: ;  It's not recommended to cache an already gotten supplier. Because there exist no possibility to check for enabled/disabled recording then.
    * @since OOo 1.1.2
    */
  var DispatchRecorderSupplier: XDispatchRecorderSupplier
  
  /**
    * Provides access to the {@link LayoutManager} of the frame. This is actually of type {@link XLayoutManager} , but this API is still experimental
    * (unpublished).
    */
  var LayoutManager: XInterface
  
  /**
    * if possible it sets/gets the UI title on/from the frame container window
    *
    * It depends from the type of the frame container window. If it is a system task window all will be OK. Otherwise the title can't be set.
    * Setting/getting of the pure value of this property must be possible in every case. Only showing on the UI can be fail.
    */
  var Title: String
  
  /** contains user defined attributes. */
  var UserDefinedAttributes: XNameContainer
}
object XFrame2 {
  
  inline def apply(
    ActiveFrame: XFrame,
    ComponentWindow: XWindow,
    ContainerWindow: XWindow,
    Controller: XController,
    Creator: XFramesSupplier,
    DispatchRecorderSupplier: XDispatchRecorderSupplier,
    Frames: XFrames,
    LayoutManager: XInterface,
    Name: String,
    SupportedCommandGroups: SafeArray[Double],
    Title: String,
    UserDefinedAttributes: XNameContainer,
    acquire: Callback,
    activate: Callback,
    addEventListener: XEventListener => Callback,
    addFrameActionListener: XFrameActionListener => Callback,
    contextChanged: Callback,
    createStatusIndicator: CallbackTo[XStatusIndicator],
    deactivate: Callback,
    dispose: Callback,
    findFrame: (String, Double) => XFrame,
    getActiveFrame: CallbackTo[XFrame],
    getComponentWindow: CallbackTo[XWindow],
    getConfigurableDispatchInformation: Double => SafeArray[DispatchInformation],
    getContainerWindow: CallbackTo[XWindow],
    getController: CallbackTo[XController],
    getCreator: CallbackTo[XFramesSupplier],
    getFrames: CallbackTo[XFrames],
    getName: CallbackTo[String],
    getSupportedCommandGroups: CallbackTo[SafeArray[Double]],
    initialize: XWindow => Callback,
    isActive: CallbackTo[Boolean],
    isTop: CallbackTo[Boolean],
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => Any,
    registerDispatchProviderInterceptor: XDispatchProviderInterceptor => Callback,
    release: Callback,
    releaseDispatchProviderInterceptor: XDispatchProviderInterceptor => Callback,
    removeEventListener: XEventListener => Callback,
    removeFrameActionListener: XFrameActionListener => Callback,
    setActiveFrame: XFrame => Callback,
    setComponent: (XWindow, XController) => Boolean,
    setCreator: XFramesSupplier => Callback,
    setName: String => Callback
  ): XFrame2 = {
    val __obj = js.Dynamic.literal(ActiveFrame = ActiveFrame.asInstanceOf[js.Any], ComponentWindow = ComponentWindow.asInstanceOf[js.Any], ContainerWindow = ContainerWindow.asInstanceOf[js.Any], Controller = Controller.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DispatchRecorderSupplier = DispatchRecorderSupplier.asInstanceOf[js.Any], Frames = Frames.asInstanceOf[js.Any], LayoutManager = LayoutManager.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SupportedCommandGroups = SupportedCommandGroups.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], acquire = acquire.toJsFn, activate = activate.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFrameActionListener = js.Any.fromFunction1((t0: XFrameActionListener) => addFrameActionListener(t0).runNow()), contextChanged = contextChanged.toJsFn, createStatusIndicator = createStatusIndicator.toJsFn, deactivate = deactivate.toJsFn, dispose = dispose.toJsFn, findFrame = js.Any.fromFunction2(findFrame), getActiveFrame = getActiveFrame.toJsFn, getComponentWindow = getComponentWindow.toJsFn, getConfigurableDispatchInformation = js.Any.fromFunction1(getConfigurableDispatchInformation), getContainerWindow = getContainerWindow.toJsFn, getController = getController.toJsFn, getCreator = getCreator.toJsFn, getFrames = getFrames.toJsFn, getName = getName.toJsFn, getSupportedCommandGroups = getSupportedCommandGroups.toJsFn, initialize = js.Any.fromFunction1((t0: XWindow) => initialize(t0).runNow()), isActive = isActive.toJsFn, isTop = isTop.toJsFn, queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerDispatchProviderInterceptor = js.Any.fromFunction1((t0: XDispatchProviderInterceptor) => registerDispatchProviderInterceptor(t0).runNow()), release = release.toJsFn, releaseDispatchProviderInterceptor = js.Any.fromFunction1((t0: XDispatchProviderInterceptor) => releaseDispatchProviderInterceptor(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFrameActionListener = js.Any.fromFunction1((t0: XFrameActionListener) => removeFrameActionListener(t0).runNow()), setActiveFrame = js.Any.fromFunction1((t0: XFrame) => setActiveFrame(t0).runNow()), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1((t0: XFramesSupplier) => setCreator(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[XFrame2]
  }
  
  extension [Self <: XFrame2](x: Self) {
    
    inline def setDispatchRecorderSupplier(value: XDispatchRecorderSupplier): Self = StObject.set(x, "DispatchRecorderSupplier", value.asInstanceOf[js.Any])
    
    inline def setLayoutManager(value: XInterface): Self = StObject.set(x, "LayoutManager", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedAttributes(value: XNameContainer): Self = StObject.set(x, "UserDefinedAttributes", value.asInstanceOf[js.Any])
  }
}
