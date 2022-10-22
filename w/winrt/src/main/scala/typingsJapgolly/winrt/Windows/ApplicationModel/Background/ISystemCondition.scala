package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISystemCondition
  extends StObject
     with IBackgroundCondition {
  
  var conditionType: SystemConditionType
}
object ISystemCondition {
  
  inline def apply(conditionType: SystemConditionType): ISystemCondition = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISystemCondition]
  }
  
  extension [Self <: ISystemCondition](x: Self) {
    
    inline def setConditionType(value: SystemConditionType): Self = StObject.set(x, "conditionType", value.asInstanceOf[js.Any])
  }
}
