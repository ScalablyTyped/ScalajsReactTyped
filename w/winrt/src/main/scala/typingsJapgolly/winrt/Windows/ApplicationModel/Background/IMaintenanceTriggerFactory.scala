package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMaintenanceTriggerFactory extends StObject {
  
  def create(freshnessTime: Double, oneShot: Boolean): MaintenanceTrigger
}
object IMaintenanceTriggerFactory {
  
  inline def apply(create: (Double, Boolean) => MaintenanceTrigger): IMaintenanceTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[IMaintenanceTriggerFactory]
  }
  
  extension [Self <: IMaintenanceTriggerFactory](x: Self) {
    
    inline def setCreate(value: (Double, Boolean) => MaintenanceTrigger): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
  }
}
