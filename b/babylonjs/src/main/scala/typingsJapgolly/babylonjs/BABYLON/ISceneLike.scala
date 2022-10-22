package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISceneLike extends StObject {
  
  def addPendingData(data: Any): Unit
  
  var offlineProvider: IOfflineProvider
  
  def removePendingData(data: Any): Unit
}
object ISceneLike {
  
  inline def apply(
    addPendingData: Any => Callback,
    offlineProvider: IOfflineProvider,
    removePendingData: Any => Callback
  ): ISceneLike = {
    val __obj = js.Dynamic.literal(addPendingData = js.Any.fromFunction1((t0: Any) => addPendingData(t0).runNow()), offlineProvider = offlineProvider.asInstanceOf[js.Any], removePendingData = js.Any.fromFunction1((t0: Any) => removePendingData(t0).runNow()))
    __obj.asInstanceOf[ISceneLike]
  }
  
  extension [Self <: ISceneLike](x: Self) {
    
    inline def setAddPendingData(value: Any => Callback): Self = StObject.set(x, "addPendingData", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOfflineProvider(value: IOfflineProvider): Self = StObject.set(x, "offlineProvider", value.asInstanceOf[js.Any])
    
    inline def setRemovePendingData(value: Any => Callback): Self = StObject.set(x, "removePendingData", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
