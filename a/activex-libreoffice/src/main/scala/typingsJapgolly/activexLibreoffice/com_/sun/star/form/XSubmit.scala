package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.MouseEvent
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControl
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functionality to submit data from a component.
  *
  * Usually, this is used by com::sun::star::form::component::HTMLForms.
  *
  * See the [HTML specification]{@link url="http://www.w3.org/TR/1999/REC-html401-19991224/interact/forms.html#h-17.13"} to learn about submitting forms.
  */
trait XSubmit
  extends StObject
     with XInterface {
  
  /**
    * adds the specified listener to receive the "approveSubmit" event.
    * @param aListener the listener to add.
    * @see com.sun.star.form.XSubmitListener
    */
  def addSubmitListener(aListener: XSubmitListener): Unit
  
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XSubmitListener
    */
  def removeSubmitListener(aListener: XSubmitListener): Unit
  
  /**
    * submits the component's data to a specified target.
    * @param aControl the control whose data is to be submitted
    * @param aMouseEvt the event which triggered the submit, if it was a mouse event
    * @see com.sun.star.awt.MouseEvent
    */
  def submit(aControl: XControl, aMouseEvt: MouseEvent): Unit
}
object XSubmit {
  
  inline def apply(
    acquire: Callback,
    addSubmitListener: XSubmitListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeSubmitListener: XSubmitListener => Callback,
    submit: (XControl, MouseEvent) => Callback
  ): XSubmit = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addSubmitListener = js.Any.fromFunction1((t0: XSubmitListener) => addSubmitListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSubmitListener = js.Any.fromFunction1((t0: XSubmitListener) => removeSubmitListener(t0).runNow()), submit = js.Any.fromFunction2((t0: XControl, t1: MouseEvent) => (submit(t0, t1)).runNow()))
    __obj.asInstanceOf[XSubmit]
  }
  
  extension [Self <: XSubmit](x: Self) {
    
    inline def setAddSubmitListener(value: XSubmitListener => Callback): Self = StObject.set(x, "addSubmitListener", js.Any.fromFunction1((t0: XSubmitListener) => value(t0).runNow()))
    
    inline def setRemoveSubmitListener(value: XSubmitListener => Callback): Self = StObject.set(x, "removeSubmitListener", js.Any.fromFunction1((t0: XSubmitListener) => value(t0).runNow()))
    
    inline def setSubmit(value: (XControl, MouseEvent) => Callback): Self = StObject.set(x, "submit", js.Any.fromFunction2((t0: XControl, t1: MouseEvent) => (value(t0, t1)).runNow()))
  }
}
