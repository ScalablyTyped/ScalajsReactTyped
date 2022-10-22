package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageProgressCallback extends StObject {
  
  /**
    * Called when the request is completed.
    *
    * @param id The package ID.
    */
  def oncomplete(id: PackageId): Unit
  
  /**
    * Called while the request is in progress.
    *
    * @param id The package ID.
    * @param progress The progress in percentage.
    */
  def onprogress(id: PackageId, progress: Double): Unit
}
object PackageProgressCallback {
  
  inline def apply(oncomplete: PackageId => Callback, onprogress: (PackageId, Double) => Callback): PackageProgressCallback = {
    val __obj = js.Dynamic.literal(oncomplete = js.Any.fromFunction1((t0: PackageId) => oncomplete(t0).runNow()), onprogress = js.Any.fromFunction2((t0: PackageId, t1: Double) => (onprogress(t0, t1)).runNow()))
    __obj.asInstanceOf[PackageProgressCallback]
  }
  
  extension [Self <: PackageProgressCallback](x: Self) {
    
    inline def setOncomplete(value: PackageId => Callback): Self = StObject.set(x, "oncomplete", js.Any.fromFunction1((t0: PackageId) => value(t0).runNow()))
    
    inline def setOnprogress(value: (PackageId, Double) => Callback): Self = StObject.set(x, "onprogress", js.Any.fromFunction2((t0: PackageId, t1: Double) => (value(t0, t1)).runNow()))
  }
}
