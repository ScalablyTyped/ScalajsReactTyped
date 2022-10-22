package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a (form) component which is bound to a data source.
  *
  * The interface provides the possibility of committing its respective data to a data source it is bound to. A {@link commit()} will be performed by the
  * environment (usually, a {@link FormController} ). ;  For example, suppose you have a data-bound control that is connected to a database field. Each
  * time the control loses its focus, the model (component) of the control is triggered by the environment to store its value in the database field.
  *
  * A commit may fail if an {@link XUpdateListener} vetoes the it.
  * @see com.sun.star.form.XUpdateListener
  */
trait XBoundComponent
  extends StObject
     with XUpdateBroadcaster {
  
  /**
    * commits the content of the component into the data source it is bound to.
    * @returns `TRUE` when the commitment was successful, otherwise `FALSE` .
    */
  def commit(): Boolean
}
object XBoundComponent {
  
  inline def apply(
    acquire: Callback,
    addUpdateListener: XUpdateListener => Callback,
    commit: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeUpdateListener: XUpdateListener => Callback
  ): XBoundComponent = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addUpdateListener = js.Any.fromFunction1((t0: XUpdateListener) => addUpdateListener(t0).runNow()), commit = commit.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeUpdateListener = js.Any.fromFunction1((t0: XUpdateListener) => removeUpdateListener(t0).runNow()))
    __obj.asInstanceOf[XBoundComponent]
  }
  
  extension [Self <: XBoundComponent](x: Self) {
    
    inline def setCommit(value: CallbackTo[Boolean]): Self = StObject.set(x, "commit", value.toJsFn)
  }
}
