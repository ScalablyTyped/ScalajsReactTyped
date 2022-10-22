package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a dialog for displaying database related exceptions.
  *
  * If applications use any of the functionality provided in the modules {@link com.sun.star.sdbc} , {@link com.sun.star.sdbcx} and {@link
  * com.sun.star.sdb} , they will - sooner or later - encounter {@link com.sun.star.sdbc.SQLException} 's. ;  These exceptions can be chained, so the
  * information wrapped in one single {@link com.sun.star.sdbc.SQLException} can be rather complex (e.g., every instance where such an exception is
  * passing before it is finally caught, could append a {@link com.sun.star.sdb.SQLContext} to explain what it was doing), and they should be presented to
  * the user in a consistent way. ;  This can be reached by using this service.
  * @see com.sun.star.sdb.InteractionHandler
  */
trait ErrorMessageDialog
  extends StObject
     with XExecutableDialog {
  
  /**
    * allows initializing the dialog
    *
    * You do not need to call the initialize method directly, instead you may use the createInstanceWithArguments method of your {@link
    * com.sun.star.lang.XMultiServiceFactory} .
    *
    * You specify a parameter by passing one (or more) {@link com.sun.star.beans.PropertyValue} object(s) to the initialize method, where the **Name** field
    * contains a string describing which aspect you want to affect, and the **Value** field containing a value. ;  Imagine the initialization values, as if
    * you use {@link com.sun.star.beans} ">XPropertySet::setPropertyValue() of the {@link com.sun.star.beans.XPropertySet} interface ... ;  allowed
    * parameters are **title**;  String describing the initial title of the dialog. If not specified, a default title is used.**parentWindow**; {@link
    * com.sun.star.awt.XWindow} describing the parent window to use for the dialog.**sqlException**; {@link com.sun.star.sdbc.SQLException} describing the
    * error which is being displayed. ;  When initializing this value, you may use any derivative of {@link com.sun.star.sdbc.SQLException} .
    */
  def create(initialTitle: String, parentWindow: XWindow, sqlException: Any): Unit
}
object ErrorMessageDialog {
  
  inline def apply(
    acquire: Callback,
    create: (String, XWindow, Any) => Callback,
    execute: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setTitle: String => Callback
  ): ErrorMessageDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, create = js.Any.fromFunction3((t0: String, t1: XWindow, t2: Any) => (create(t0, t1, t2)).runNow()), execute = execute.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[ErrorMessageDialog]
  }
  
  extension [Self <: ErrorMessageDialog](x: Self) {
    
    inline def setCreate(value: (String, XWindow, Any) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction3((t0: String, t1: XWindow, t2: Any) => (value(t0, t1, t2)).runNow()))
  }
}
