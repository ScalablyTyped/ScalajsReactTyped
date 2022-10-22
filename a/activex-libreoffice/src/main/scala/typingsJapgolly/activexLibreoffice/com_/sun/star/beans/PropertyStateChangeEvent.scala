package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is delivered whenever the state of a "bound" property is changed.
  *
  * It is sent as an argument to the method of {@link XPropertyStateChangeListener} .
  *
  * Normally these events are accompanied by the name, and the old and new values of the changed property.
  *
  * Void values may be provided for the old and new values if their true values are not known.
  */
trait PropertyStateChangeEvent
  extends StObject
     with EventObject {
  
  /** contains the new value of the property. */
  var NewValue: PropertyState
  
  /** contains the old value of the property. */
  var OldValue: PropertyState
  
  /**
    * contains the implementation handle for the property.
    *
    * It may be -1 if the implementation has no handle. You can use this handle to get values from the {@link XFastPropertySet} interface.
    */
  var PropertyHandle: Double
  
  /**
    * specifies the name of the property which changes its value.
    *
    * This name identifies the property uniquely within an {@link XPropertySet} . Upper and lower case are distinguished.
    */
  var PropertyName: String
}
object PropertyStateChangeEvent {
  
  inline def apply(
    NewValue: PropertyState,
    OldValue: PropertyState,
    PropertyHandle: Double,
    PropertyName: String,
    Source: XInterface
  ): PropertyStateChangeEvent = {
    val __obj = js.Dynamic.literal(NewValue = NewValue.asInstanceOf[js.Any], OldValue = OldValue.asInstanceOf[js.Any], PropertyHandle = PropertyHandle.asInstanceOf[js.Any], PropertyName = PropertyName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyStateChangeEvent]
  }
  
  extension [Self <: PropertyStateChangeEvent](x: Self) {
    
    inline def setNewValue(value: PropertyState): Self = StObject.set(x, "NewValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: PropertyState): Self = StObject.set(x, "OldValue", value.asInstanceOf[js.Any])
    
    inline def setPropertyHandle(value: Double): Self = StObject.set(x, "PropertyHandle", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "PropertyName", value.asInstanceOf[js.Any])
  }
}
