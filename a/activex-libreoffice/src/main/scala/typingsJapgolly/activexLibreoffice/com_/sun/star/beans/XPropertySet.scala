package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides information about and access to the properties from an implementation.
  *
  * There are three types of properties:
  *
  * bound propertiesconstrained propertiesfree properties
  *
  * You can listen to changes of bound properties with the {@link XPropertyChangeListener} and you can veto changes of constrained properties with the
  * {@link XVetoableChangeListener} .
  *
  * To implement inaccurate name access, you must support the interface {@link XExactName} .
  * @see com.sun.star.beans.XExactName
  */
trait XPropertySet
  extends StObject
     with XInterface {
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  val PropertySetInfo: XPropertySetInfo
  
  /**
    * adds an {@link XPropertyChangeListener} to the specified property.
    *
    * An empty name ("") registers the listener to all bound properties. If the property is not bound, the behavior is not specified.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see removePropertyChangeListener
    */
  def addPropertyChangeListener(aPropertyName: String, xListener: XPropertyChangeListener): Unit
  
  /**
    * adds an {@link XVetoableChangeListener} to the specified property with the name PropertyName.
    *
    * An empty name ("") registers the listener to all constrained properties. If the property is not constrained, the behavior is not specified.
    * @see removeVetoableChangeListener
    */
  def addVetoableChangeListener(PropertyName: String, aListener: XVetoableChangeListener): Unit
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  def getPropertySetInfo(): XPropertySetInfo
  
  /**
    * @param PropertyName This parameter specifies the name of the property.
    * @returns the value of the property with the specified name.
    * @throws UnknownPropertyException if the property does not exist.
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getPropertyValue(PropertyName: String): Any
  
  /**
    * removes an {@link XPropertyChangeListener} from the listener list.
    *
    * It is a "noop" if the listener is not registered.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see addPropertyChangeListener
    */
  def removePropertyChangeListener(aPropertyName: String, aListener: XPropertyChangeListener): Unit
  
  /**
    * removes an {@link XVetoableChangeListener} from the listener list.
    *
    * It is a "noop" if the listener is not registered.
    * @see addVetoableChangeListener
    */
  def removeVetoableChangeListener(PropertyName: String, aListener: XVetoableChangeListener): Unit
  
  /**
    * sets the value of the property with the specified name.
    *
    * If it is a bound property the value will be changed before the change event is fired. If it is a constrained property a vetoable event is fired before
    * the property value can be changed.
    * @throws com::sun::star::beans::PropertyVetoException if the property is read-only or vetoable and one of the listeners throws this exception because of a
    */
  def setPropertyValue(aPropertyName: String, aValue: Any): Unit
}
object XPropertySet {
  
  inline def apply(
    PropertySetInfo: XPropertySetInfo,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback
  ): XPropertySet = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[XPropertySet]
  }
  
  extension [Self <: XPropertySet](x: Self) {
    
    inline def setAddPropertyChangeListener(value: (String, XPropertyChangeListener) => Callback): Self = StObject.set(x, "addPropertyChangeListener", js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (value(t0, t1)).runNow()))
    
    inline def setAddVetoableChangeListener(value: (String, XVetoableChangeListener) => Callback): Self = StObject.set(x, "addVetoableChangeListener", js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (value(t0, t1)).runNow()))
    
    inline def setGetPropertySetInfo(value: CallbackTo[XPropertySetInfo]): Self = StObject.set(x, "getPropertySetInfo", value.toJsFn)
    
    inline def setGetPropertyValue(value: String => Any): Self = StObject.set(x, "getPropertyValue", js.Any.fromFunction1(value))
    
    inline def setPropertySetInfo(value: XPropertySetInfo): Self = StObject.set(x, "PropertySetInfo", value.asInstanceOf[js.Any])
    
    inline def setRemovePropertyChangeListener(value: (String, XPropertyChangeListener) => Callback): Self = StObject.set(x, "removePropertyChangeListener", js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (value(t0, t1)).runNow()))
    
    inline def setRemoveVetoableChangeListener(value: (String, XVetoableChangeListener) => Callback): Self = StObject.set(x, "removeVetoableChangeListener", js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (value(t0, t1)).runNow()))
    
    inline def setSetPropertyValue(value: (String, Any) => Callback): Self = StObject.set(x, "setPropertyValue", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
