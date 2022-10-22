package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generic control access interface.
  *
  * Use this interface to access user interface controls supported by the implementing service. The supported controls, control properties and the
  * appropriate values are documented in the description of the implementing service.
  * @see com.sun.star.ui.dialogs.FilePicker
  * @see com.sun.star.ui.dialogs.FilePicker
  * @since OOo 1.1.2
  */
trait XControlAccess
  extends StObject
     with XInterface {
  
  /**
    * Query for a control property.
    * @param aControlName The name of the control. Common control names are for instance "OkButton" or "CancelButton".
    * @param aControlProperty The requested control property. Common control properties are for instance "Label" or "State".
    * @returns the requested value.
    * @throws com::sun::star::lang::IllegalArgumentException when the control is not supported or the control property is invalid.
    */
  def getControlProperty(aControlName: String, aControlProperty: String): Any
  
  /**
    * Change a control property.
    * @param aControlName The name of the control. Common control names are for instance "OkButton" or "CancelButton".
    * @param aControlProperty The control property to manipulate. Common control properties are for instance "Label" or "State".
    * @param aValue A value appropriated for the property.
    * @throws com::sun::star::lang::IllegalArgumentException when the control is not supported, the control property is invalid or the value fits not the contr
    */
  def setControlProperty(aControlName: String, aControlProperty: String, aValue: Any): Unit
}
object XControlAccess {
  
  inline def apply(
    acquire: Callback,
    getControlProperty: (String, String) => Any,
    queryInterface: `type` => Any,
    release: Callback,
    setControlProperty: (String, String, Any) => Callback
  ): XControlAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getControlProperty = js.Any.fromFunction2(getControlProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setControlProperty = js.Any.fromFunction3((t0: String, t1: String, t2: Any) => (setControlProperty(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XControlAccess]
  }
  
  extension [Self <: XControlAccess](x: Self) {
    
    inline def setGetControlProperty(value: (String, String) => Any): Self = StObject.set(x, "getControlProperty", js.Any.fromFunction2(value))
    
    inline def setSetControlProperty(value: (String, String, Any) => Callback): Self = StObject.set(x, "setControlProperty", js.Any.fromFunction3((t0: String, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
  }
}
