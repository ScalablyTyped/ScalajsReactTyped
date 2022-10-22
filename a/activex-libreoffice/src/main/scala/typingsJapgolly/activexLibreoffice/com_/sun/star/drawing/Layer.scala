package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A layer is an entity inside a document which contains shapes.
  *
  * There could be zero or more {@link Shapes} attached to such a layer.
  *
  * The properties of a {@link Layer} instance affect all {@link Shapes} attached to the {@link Layer} .
  * @see DrawingDocument
  * @see LayerManager
  */
trait Layer
  extends StObject
     with XPropertySet {
  
  /** If a {@link Layer} is locked, the objects in this {@link Layer} cannot be edited in the user interface. */
  var IsLocked: Boolean
  
  /** If a {@link Layer} is not printable, the objects in this {@link Layer} are not printed. */
  var IsPrintable: Boolean
  
  /** If a {@link Layer} is not visible, the objects in this {@link Layer} are not shown in the user interface. */
  var IsVisible: Boolean
  
  /** The name of a {@link Layer} is used to identify the {@link Layer} in the user interface. */
  var Name: String
}
object Layer {
  
  inline def apply(
    IsLocked: Boolean,
    IsPrintable: Boolean,
    IsVisible: Boolean,
    Name: String,
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
  ): Layer = {
    val __obj = js.Dynamic.literal(IsLocked = IsLocked.asInstanceOf[js.Any], IsPrintable = IsPrintable.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[Layer]
  }
  
  extension [Self <: Layer](x: Self) {
    
    inline def setIsLocked(value: Boolean): Self = StObject.set(x, "IsLocked", value.asInstanceOf[js.Any])
    
    inline def setIsPrintable(value: Boolean): Self = StObject.set(x, "IsPrintable", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "IsVisible", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
