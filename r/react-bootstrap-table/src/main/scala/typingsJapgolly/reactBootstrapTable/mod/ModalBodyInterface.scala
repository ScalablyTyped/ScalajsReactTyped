package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalBodyInterface[TRow /* <: js.Object */] extends StObject {
  
  /**
    * The required getFieldValue method that must be implemented on a customized insert modal body that returns the
    * new row data when the save button is clicked in the modal window.
    */
  def getFieldValue(): TRow
}
object ModalBodyInterface {
  
  inline def apply[TRow /* <: js.Object */](getFieldValue: CallbackTo[TRow]): ModalBodyInterface[TRow] = {
    val __obj = js.Dynamic.literal(getFieldValue = getFieldValue.toJsFn)
    __obj.asInstanceOf[ModalBodyInterface[TRow]]
  }
  
  extension [Self <: ModalBodyInterface[?], TRow /* <: js.Object */](x: Self & ModalBodyInterface[TRow]) {
    
    inline def setGetFieldValue(value: CallbackTo[TRow]): Self = StObject.set(x, "getFieldValue", value.toJsFn)
  }
}
