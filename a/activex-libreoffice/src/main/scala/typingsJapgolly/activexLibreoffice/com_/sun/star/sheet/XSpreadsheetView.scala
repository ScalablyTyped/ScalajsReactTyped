package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is the main interface of a {@link SpreadsheetView} . It manages the active sheet within this view. */
trait XSpreadsheetView
  extends StObject
     with XInterface {
  
  /** returns the sheet that is shown in the view. */
  var ActiveSheet: XSpreadsheet
  
  /** returns the sheet that is shown in the view. */
  def getActiveSheet(): XSpreadsheet
  
  /** sets the sheet that is shown in the view. */
  def setActiveSheet(xActiveSheet: XSpreadsheet): Unit
}
object XSpreadsheetView {
  
  inline def apply(
    ActiveSheet: XSpreadsheet,
    acquire: Callback,
    getActiveSheet: CallbackTo[XSpreadsheet],
    queryInterface: `type` => Any,
    release: Callback,
    setActiveSheet: XSpreadsheet => Callback
  ): XSpreadsheetView = {
    val __obj = js.Dynamic.literal(ActiveSheet = ActiveSheet.asInstanceOf[js.Any], acquire = acquire.toJsFn, getActiveSheet = getActiveSheet.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setActiveSheet = js.Any.fromFunction1((t0: XSpreadsheet) => setActiveSheet(t0).runNow()))
    __obj.asInstanceOf[XSpreadsheetView]
  }
  
  extension [Self <: XSpreadsheetView](x: Self) {
    
    inline def setActiveSheet(value: XSpreadsheet): Self = StObject.set(x, "ActiveSheet", value.asInstanceOf[js.Any])
    
    inline def setGetActiveSheet(value: CallbackTo[XSpreadsheet]): Self = StObject.set(x, "getActiveSheet", value.toJsFn)
    
    inline def setSetActiveSheet(value: XSpreadsheet => Callback): Self = StObject.set(x, "setActiveSheet", js.Any.fromFunction1((t0: XSpreadsheet) => value(t0).runNow()))
  }
}
