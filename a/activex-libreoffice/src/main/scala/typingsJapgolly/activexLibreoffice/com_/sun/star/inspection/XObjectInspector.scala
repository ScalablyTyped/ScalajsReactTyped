package typingsJapgolly.activexLibreoffice.com_.sun.star.inspection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.DispatchDescriptor
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XController
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XDispatch
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XDispatchProvider
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the main interface of an {@link ObjectInspector} .
  * @see ObjectInspector
  * @since OOo 2.0.3
  */
trait XObjectInspector
  extends StObject
     with XController
     with XDispatchProvider {
  
  /**
    * provides access to the current model of the inspector
    *
    * The model is mainly responsible for providing the property handlers. Additionally, it can provide user interface names and help URLs for property
    * categories.
    *
    * Note that there are two ways of setting or retrieving the current model: You can either use com::sun::star::frame::XModel::setModel(), or, if you do
    * not want or need to implement the full-blown {@link com.sun.star.frame.XModel} interface, you can use this property directly. Both approaches are
    * semantically equivalent.
    *
    * If a new model is set at the inspector, the complete UI will be rebuilt to reflect the change, using the new property handlers provided by the new
    * model.
    */
  var InspectorModel: XObjectInspectorModel
  
  /**
    * provides access to the user interface of the object inspector.
    *
    * This interface can be used to access and manipulate various aspects of the user interface. For instance, you can enable and disable certain property
    * controls (or parts thereof), or register observers for all property controls.
    * @since OOo 2.2
    */
  var InspectorUI: XObjectInspectorUI
  
  /**
    * inspects a new collection of one or more objects.
    *
    * If the sequence is empty, the UI of the {@link ObjectInspector} will be cleared.
    *
    * If the sequence contains more than one object, the {@link XObjectInspector} will create a complete set of property handlers (as indicated by {@link
    * XObjectInspectorModel.HandlerFactories} ) for **every** of the objects, and compose their output.
    * @see XPropertyHandler.isComposable
    * @see XPropertyHandler.onInteractivePropertySelection
    * @see XPropertyHandler.suspend
    * @throws com::sun::star::util::VetoException if the inspector cannot switch to another object set. This typically happens if one of the active {@link XPro
    */
  def inspect(Objects: SeqEquiv[XInterface]): Unit
}
object XObjectInspector {
  
  inline def apply(
    Frame: XFrame,
    InspectorModel: XObjectInspectorModel,
    InspectorUI: XObjectInspectorUI,
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
    inspect: SeqEquiv[XInterface] => Callback,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    restoreViewData: Any => Callback,
    suspend: Boolean => Boolean
  ): XObjectInspector = {
    val __obj = js.Dynamic.literal(Frame = Frame.asInstanceOf[js.Any], InspectorModel = InspectorModel.asInstanceOf[js.Any], InspectorUI = InspectorUI.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attachFrame = js.Any.fromFunction1((t0: XFrame) => attachFrame(t0).runNow()), attachModel = js.Any.fromFunction1(attachModel), dispose = dispose.toJsFn, getFrame = getFrame.toJsFn, getModel = getModel.toJsFn, getViewData = getViewData.toJsFn, inspect = js.Any.fromFunction1((t0: SeqEquiv[XInterface]) => inspect(t0).runNow()), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), restoreViewData = js.Any.fromFunction1((t0: Any) => restoreViewData(t0).runNow()), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[XObjectInspector]
  }
  
  extension [Self <: XObjectInspector](x: Self) {
    
    inline def setInspect(value: SeqEquiv[XInterface] => Callback): Self = StObject.set(x, "inspect", js.Any.fromFunction1((t0: SeqEquiv[XInterface]) => value(t0).runNow()))
    
    inline def setInspectorModel(value: XObjectInspectorModel): Self = StObject.set(x, "InspectorModel", value.asInstanceOf[js.Any])
    
    inline def setInspectorUI(value: XObjectInspectorUI): Self = StObject.set(x, "InspectorUI", value.asInstanceOf[js.Any])
  }
}
