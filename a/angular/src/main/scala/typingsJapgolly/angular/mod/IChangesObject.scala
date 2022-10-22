package typingsJapgolly.angular.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChangesObject[T] extends StObject {
  
  var currentValue: T
  
  def isFirstChange(): Boolean
  
  var previousValue: T
}
object IChangesObject {
  
  inline def apply[T](currentValue: T, isFirstChange: CallbackTo[Boolean], previousValue: T): IChangesObject[T] = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], isFirstChange = isFirstChange.toJsFn, previousValue = previousValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangesObject[T]]
  }
  
  extension [Self <: IChangesObject[?], T](x: Self & IChangesObject[T]) {
    
    inline def setCurrentValue(value: T): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    inline def setIsFirstChange(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFirstChange", value.toJsFn)
    
    inline def setPreviousValue(value: T): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
  }
}
