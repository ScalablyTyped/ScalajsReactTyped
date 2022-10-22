package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to show and hide a dialog and gives access to the title of the dialog. */
trait XDialog
  extends StObject
     with XInterface {
  
  /** gets the title of the dialog. */
  var Title: String
  
  /** hides the dialog and then causes {@link XDialog.execute()} to return. */
  def endExecute(): Unit
  
  /** shows the dialog. */
  def execute(): Double
  
  /** gets the title of the dialog. */
  def getTitle(): String
  
  /** sets the title of the dialog. */
  def setTitle(Title: String): Unit
}
object XDialog {
  
  inline def apply(
    Title: String,
    acquire: Callback,
    endExecute: Callback,
    execute: CallbackTo[Double],
    getTitle: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setTitle: String => Callback
  ): XDialog = {
    val __obj = js.Dynamic.literal(Title = Title.asInstanceOf[js.Any], acquire = acquire.toJsFn, endExecute = endExecute.toJsFn, execute = execute.toJsFn, getTitle = getTitle.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[XDialog]
  }
  
  extension [Self <: XDialog](x: Self) {
    
    inline def setEndExecute(value: Callback): Self = StObject.set(x, "endExecute", value.toJsFn)
    
    inline def setExecute(value: CallbackTo[Double]): Self = StObject.set(x, "execute", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setSetTitle(value: String => Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
