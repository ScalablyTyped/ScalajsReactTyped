package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateCondition
  extends StObject
     with XConditionEntry {
  
  /** See {@link com.sun.star.sheet.DateType} for possible values */
  var DateType: Double
  
  var StyleName: String
}
object DateCondition {
  
  inline def apply(
    DateType: Double,
    StyleName: String,
    Type: Double,
    acquire: Callback,
    getType: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback
  ): DateCondition = {
    val __obj = js.Dynamic.literal(DateType = DateType.asInstanceOf[js.Any], StyleName = StyleName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, getType = getType.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[DateCondition]
  }
  
  extension [Self <: DateCondition](x: Self) {
    
    inline def setDateType(value: Double): Self = StObject.set(x, "DateType", value.asInstanceOf[js.Any])
    
    inline def setStyleName(value: String): Self = StObject.set(x, "StyleName", value.asInstanceOf[js.Any])
  }
}
