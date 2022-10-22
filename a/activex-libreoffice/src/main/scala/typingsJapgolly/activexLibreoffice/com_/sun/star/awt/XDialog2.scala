package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Makes it possible to end a dialog and set a help id.
  * @since OOo 3.0
  */
trait XDialog2
  extends StObject
     with XDialog {
  
  /** hides the dialog and then causes {@link XDialog.execute()} to return with the given result value. */
  def endDialog(Result: Double): Unit
  
  /** sets the help id so that the standard help button action will show the appropriate help page. */
  def setHelpId(Id: String): Unit
}
object XDialog2 {
  
  inline def apply(
    Title: String,
    acquire: Callback,
    endDialog: Double => Callback,
    endExecute: Callback,
    execute: CallbackTo[Double],
    getTitle: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setHelpId: String => Callback,
    setTitle: String => Callback
  ): XDialog2 = {
    val __obj = js.Dynamic.literal(Title = Title.asInstanceOf[js.Any], acquire = acquire.toJsFn, endDialog = js.Any.fromFunction1((t0: Double) => endDialog(t0).runNow()), endExecute = endExecute.toJsFn, execute = execute.toJsFn, getTitle = getTitle.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setHelpId = js.Any.fromFunction1((t0: String) => setHelpId(t0).runNow()), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[XDialog2]
  }
  
  extension [Self <: XDialog2](x: Self) {
    
    inline def setEndDialog(value: Double => Callback): Self = StObject.set(x, "endDialog", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetHelpId(value: String => Callback): Self = StObject.set(x, "setHelpId", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
