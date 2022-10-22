package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControl
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControlModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.XForm
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.runtime.XFormController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the form layer elements in a view
  * @since OOo 2.3
  */
trait XFormLayerAccess
  extends StObject
     with XControlAccess {
  
  /**
    * returns the {@link com.sun.star.form.FormController} instance which operates on a given form.
    *
    * A form controller is a component which controls the user interaction with the form layer, as long as the form is not in design mode.
    * @returns the requested form controller, or `NULL` if the view's form layer is currently in design mode. Note that the returned instance becomes non-functi
    * @see isDesignMode
    * @see setDesignMode
    * @see com.sun.star.form.runtime.FormController
    * @see com.sun.star.form.runtime.FormOperations
    */
  def getFormController(Form: XForm): XFormController
  
  /**
    * determines whether the view's form layer is currently in design or alive mode
    *
    * **Note** : This is a convenience method. In the user interface, the design mode is coupled with the `.uno:SwitchControlDesignMode` feature (see {@link
    * com.sun.star.frame.XDispatchProvider} ), and asking for the current mode is the same as asking for the state of this feature.
    */
  def isFormDesignMode(): Boolean
  
  /**
    * determines whether the view's form layer is currently in design or alive mode
    *
    * **Note** : This is a convenience method. In the user interface, the design mode is coupled with the `.uno:SwitchControlDesignMode` feature (see {@link
    * com.sun.star.frame.XDispatchProvider} ), and changing the current mode is the same as dispatching this feature URL.
    */
  def setFormDesignMode(DesignMode: Boolean): Unit
}
object XFormLayerAccess {
  
  inline def apply(
    acquire: Callback,
    getControl: XControlModel => XControl,
    getFormController: XForm => XFormController,
    isFormDesignMode: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setFormDesignMode: Boolean => Callback
  ): XFormLayerAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getControl = js.Any.fromFunction1(getControl), getFormController = js.Any.fromFunction1(getFormController), isFormDesignMode = isFormDesignMode.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFormDesignMode = js.Any.fromFunction1((t0: Boolean) => setFormDesignMode(t0).runNow()))
    __obj.asInstanceOf[XFormLayerAccess]
  }
  
  extension [Self <: XFormLayerAccess](x: Self) {
    
    inline def setGetFormController(value: XForm => XFormController): Self = StObject.set(x, "getFormController", js.Any.fromFunction1(value))
    
    inline def setIsFormDesignMode(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFormDesignMode", value.toJsFn)
    
    inline def setSetFormDesignMode(value: Boolean => Callback): Self = StObject.set(x, "setFormDesignMode", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
