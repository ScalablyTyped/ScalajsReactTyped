package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XFastPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XController
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a controller which can be used to browse and modify properties of form controls.
  *
  * The controller can be plugged into an {@link com.sun.star.frame.XFrame} , and will provide a visual component for inspecting control properties. This
  * means it allows to interactively control several aspects of a {@link FormControlModel} or {@link DataAwareControlModel} , such as it's data binding,
  * it's layout, and it's event binding
  *
  * For using a {@link PropertyBrowserController} , you need to instantiate it at a service factory of your choiceattach it to an empty frame of your
  * choiceset the IntrospectedObject property to the control model which you wish to analyze
  *
  * {{program example here, see documentation}}
  * @deprecated Deprecated  Note that nowadays, this service is only a legacy wrapper using the {@link com.sun.star.inspection.ObjectInspector} and the {@link co
  * @see com.sun.star.frame.XController
  */
trait PropertyBrowserController
  extends StObject
     with XController
     with XPropertySet
     with XFastPropertySet
     with XMultiPropertySet {
  
  /**
    * controls the actually visible page.
    *
    * The aspects of a {@link DataAwareControlModel} which can be browsed and modified using this controller can be separated into 3 groups: common aspects,
    * data-awareness related aspects, and bound events. ;  The appearance of the visual component created by the controller is that 3 tab pages, one for
    * each group, are displayed (of course if the control does not support any aspects of a given group, the group is omitted). ;  With this property, it
    * can be controller which page is currently active.
    *
    * Valid values are (this list may be extended in the future): GenericDataEvents
    */
  var CurrentPage: String
  
  /**
    * contains the object to inspect.
    *
    * Changing this property from outside causes the controller to update its view with the data of the new object
    */
  var IntrospectedObject: XPropertySet
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override val PropertySetInfo: XPropertySetInfo
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo
}
object PropertyBrowserController {
  
  inline def apply(
    CurrentPage: String,
    Frame: XFrame,
    IntrospectedObject: XPropertySet,
    Model: XModel,
    PropertySetInfo: XPropertySetInfo,
    ViewData: Any,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    attachFrame: XFrame => Callback,
    attachModel: XModel => Boolean,
    dispose: Callback,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    getFastPropertyValue: Double => Any,
    getFrame: CallbackTo[XFrame],
    getModel: CallbackTo[XModel],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[Any],
    getViewData: CallbackTo[Any],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertiesChangeListener: XPropertiesChangeListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    restoreViewData: Any => Callback,
    setFastPropertyValue: (Double, Any) => Callback,
    setPropertyValue: (String, Any) => Callback,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[Any]) => Callback,
    suspend: Boolean => Boolean
  ): PropertyBrowserController = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], IntrospectedObject = IntrospectedObject.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertiesChangeListener = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (addPropertiesChangeListener(t0, t1)).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), attachFrame = js.Any.fromFunction1((t0: XFrame) => attachFrame(t0).runNow()), attachModel = js.Any.fromFunction1(attachModel), dispose = dispose.toJsFn, firePropertiesChangeEvent = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (firePropertiesChangeEvent(t0, t1)).runNow()), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), getFrame = getFrame.toJsFn, getModel = getModel.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getViewData = getViewData.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertiesChangeListener = js.Any.fromFunction1((t0: XPropertiesChangeListener) => removePropertiesChangeListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), restoreViewData = js.Any.fromFunction1((t0: Any) => restoreViewData(t0).runNow()), setFastPropertyValue = js.Any.fromFunction2((t0: Double, t1: Any) => (setFastPropertyValue(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setPropertyValues = js.Any.fromFunction2((t0: SeqEquiv[String], t1: SeqEquiv[Any]) => (setPropertyValues(t0, t1)).runNow()), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[PropertyBrowserController]
  }
  
  extension [Self <: PropertyBrowserController](x: Self) {
    
    inline def setCurrentPage(value: String): Self = StObject.set(x, "CurrentPage", value.asInstanceOf[js.Any])
    
    inline def setGetPropertySetInfo(value: CallbackTo[XPropertySetInfo]): Self = StObject.set(x, "getPropertySetInfo", value.toJsFn)
    
    inline def setIntrospectedObject(value: XPropertySet): Self = StObject.set(x, "IntrospectedObject", value.asInstanceOf[js.Any])
    
    inline def setPropertySetInfo(value: XPropertySetInfo): Self = StObject.set(x, "PropertySetInfo", value.asInstanceOf[js.Any])
  }
}
