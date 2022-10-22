package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the cell style name for a condition in a conditional format.
  * @see com.sun.star.sheet.TableConditionalEntry
  */
trait XSheetConditionalEntry
  extends StObject
     with XInterface {
  
  /** returns the name of the cell style that is used when the condition is fulfilled. */
  var StyleName: String
  
  /** returns the name of the cell style that is used when the condition is fulfilled. */
  def getStyleName(): String
  
  /** sets the name of the cell style that is used when the condition is fulfilled. */
  def setStyleName(aStyleName: String): Unit
}
object XSheetConditionalEntry {
  
  inline def apply(
    StyleName: String,
    acquire: Callback,
    getStyleName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setStyleName: String => Callback
  ): XSheetConditionalEntry = {
    val __obj = js.Dynamic.literal(StyleName = StyleName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getStyleName = getStyleName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setStyleName = js.Any.fromFunction1((t0: String) => setStyleName(t0).runNow()))
    __obj.asInstanceOf[XSheetConditionalEntry]
  }
  
  extension [Self <: XSheetConditionalEntry](x: Self) {
    
    inline def setGetStyleName(value: CallbackTo[String]): Self = StObject.set(x, "getStyleName", value.toJsFn)
    
    inline def setSetStyleName(value: String => Callback): Self = StObject.set(x, "setStyleName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStyleName(value: String): Self = StObject.set(x, "StyleName", value.asInstanceOf[js.Any])
  }
}
