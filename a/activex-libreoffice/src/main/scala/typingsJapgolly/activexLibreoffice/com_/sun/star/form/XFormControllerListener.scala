package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to be notified when the activation status of a {@link FormController} changes.
  *
  * A form controller is activated if a form control gains the focus and none of its controls currently owned the focus before.
  * @see XFormController
  */
trait XFormControllerListener
  extends StObject
     with XEventListener {
  
  /**
    * is invoked when a control of the controller gained the focus and the controller was not previously activated.
    * @param rEvent the event happened.
    */
  def formActivated(rEvent: EventObject): Unit
  
  /**
    * is invoked when a control of the "XFormController" lost the focus and no control of the controller received the focus. In other words, no control of
    * the controller owns the focus.
    * @param rEvent the event happened.
    */
  def formDeactivated(rEvent: EventObject): Unit
}
object XFormControllerListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    formActivated: EventObject => Callback,
    formDeactivated: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XFormControllerListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), formActivated = js.Any.fromFunction1((t0: EventObject) => formActivated(t0).runNow()), formDeactivated = js.Any.fromFunction1((t0: EventObject) => formDeactivated(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFormControllerListener]
  }
  
  extension [Self <: XFormControllerListener](x: Self) {
    
    inline def setFormActivated(value: EventObject => Callback): Self = StObject.set(x, "formActivated", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setFormDeactivated(value: EventObject => Callback): Self = StObject.set(x, "formDeactivated", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
