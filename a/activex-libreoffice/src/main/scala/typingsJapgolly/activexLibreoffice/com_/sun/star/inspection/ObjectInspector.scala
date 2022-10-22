package typingsJapgolly.activexLibreoffice.com_.sun.star.inspection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.DispatchDescriptor
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XDispatch
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
  * describes an {@link com.sun.star.frame.Controller} which can be used to browse and modify properties of components.
  *
  * The controller can be plugged into an {@link com.sun.star.frame.XFrame} , and will provide a visual component for inspecting and modifying component
  * properties. ;  Note that "property" here is a generic term - any aspect of a component can be considered a property, as long as some property handler
  * is able to describe this aspect in a property-like way.
  *
  * The basic idea is that one facet of the inspected component is represented by a single line of controls: A label, an input control, and optionally one
  * or two buttons which, when pressed, trigger additional user interaction (e.g. a more sophisticated dialog to enter a property value).
  *
  * Additionally, property lines can be grouped into different categories. A usual implementation of such categories would be tab pages, but other
  * implementations are possible, too.
  *
  * Even more, the inspector can optionally display a help section at the bottom of its window, which can display arbitrary (context-sensitive) help
  * texts.
  *
  * An {@link ObjectInspector} needs one or more property handlers which describe the facets of an inspected component - without such handlers, the
  * inspector window will simply stay empty.
  *
  * The property handlers, as well as more information about the layout of the inspector, are provided by a inspector model, which has to be implemented
  * by the user of the inspector.
  *
  * Since property handlers might have the need to raise UI, they will be created with a context value named "DialogParentWindow", which contains an
  * XWindow which should be used as parent of any windows to raise. ;  If the {@link com.sun.star.uno.XComponentContext} in which the {@link
  * ObjectInspector} was created already contains such a value, it is not overwritten. Only if it doesn't, the inspector will add an own value - which
  * contains the inspector's main window - to the context when creating handlers.
  * @see XPropertyHandler
  * @see LineDescriptor
  * @see PropertyControlType
  * @see ObjectInspectorModel
  * @see com.sun.star.uno.XComponentContext
  * @see com.sun.star.lang.XMultiComponentFactory
  * @since OOo 2.0.3
  */
trait ObjectInspector
  extends StObject
     with XObjectInspector {
  
  /**
    * creates a default instance of the {@link ObjectInspector}
    * @since OOo 2.2
    */
  def createDefault(): Unit
  
  /**
    * creates an instance of the {@link ObjectInspector} , using a given {@link ObjectInspectorModel}
    * @since OOo 2.2
    * @throws com::sun::star::lang::IllegalArgumentException if Model is `NULL` .
    */
  def createWithModel(Model: XObjectInspectorModel): Unit
}
object ObjectInspector {
  
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
    createDefault: Callback,
    createWithModel: XObjectInspectorModel => Callback,
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
  ): ObjectInspector = {
    val __obj = js.Dynamic.literal(Frame = Frame.asInstanceOf[js.Any], InspectorModel = InspectorModel.asInstanceOf[js.Any], InspectorUI = InspectorUI.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attachFrame = js.Any.fromFunction1((t0: XFrame) => attachFrame(t0).runNow()), attachModel = js.Any.fromFunction1(attachModel), createDefault = createDefault.toJsFn, createWithModel = js.Any.fromFunction1((t0: XObjectInspectorModel) => createWithModel(t0).runNow()), dispose = dispose.toJsFn, getFrame = getFrame.toJsFn, getModel = getModel.toJsFn, getViewData = getViewData.toJsFn, inspect = js.Any.fromFunction1((t0: SeqEquiv[XInterface]) => inspect(t0).runNow()), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), restoreViewData = js.Any.fromFunction1((t0: Any) => restoreViewData(t0).runNow()), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[ObjectInspector]
  }
  
  extension [Self <: ObjectInspector](x: Self) {
    
    inline def setCreateDefault(value: Callback): Self = StObject.set(x, "createDefault", value.toJsFn)
    
    inline def setCreateWithModel(value: XObjectInspectorModel => Callback): Self = StObject.set(x, "createWithModel", js.Any.fromFunction1((t0: XObjectInspectorModel) => value(t0).runNow()))
  }
}
