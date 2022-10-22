package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /** Gets the field that is currently being filtered. */
  def getFieldAsync(): js.Promise[Field]
  
  /** Gets the name of the field being filtered. Note that this is the caption as shown in the UI and not the actual database field name. */
  def getFieldName(): String
  
  /** Gets the type of the filter. See FilterType Enum for the values in the enum. */
  def getFilterType(): FilterType
  
  /** Gets the parent worksheet */
  def getWorksheet(): Worksheet
}
object Filter {
  
  inline def apply(
    getFieldAsync: CallbackTo[js.Promise[Field]],
    getFieldName: CallbackTo[String],
    getFilterType: CallbackTo[FilterType],
    getWorksheet: CallbackTo[Worksheet]
  ): Filter = {
    val __obj = js.Dynamic.literal(getFieldAsync = getFieldAsync.toJsFn, getFieldName = getFieldName.toJsFn, getFilterType = getFilterType.toJsFn, getWorksheet = getWorksheet.toJsFn)
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setGetFieldAsync(value: CallbackTo[js.Promise[Field]]): Self = StObject.set(x, "getFieldAsync", value.toJsFn)
    
    inline def setGetFieldName(value: CallbackTo[String]): Self = StObject.set(x, "getFieldName", value.toJsFn)
    
    inline def setGetFilterType(value: CallbackTo[FilterType]): Self = StObject.set(x, "getFilterType", value.toJsFn)
    
    inline def setGetWorksheet(value: CallbackTo[Worksheet]): Self = StObject.set(x, "getWorksheet", value.toJsFn)
  }
}
