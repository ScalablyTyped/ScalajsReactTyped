package typingsJapgolly.winrtUwp.Windows.Services.Store

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides info about a completed package update request for the current app. */
trait StorePackageUpdateResult extends StObject {
  
  /** Gets the state of the completed package update request. */
  var overallState: StorePackageUpdateState
  
  /** Gets info about the status of each of the package updates that are associated with the completed request. */
  var storePackageUpdateStatuses: IVectorView[StorePackageUpdateStatus]
}
object StorePackageUpdateResult {
  
  inline def apply(
    overallState: StorePackageUpdateState,
    storePackageUpdateStatuses: IVectorView[StorePackageUpdateStatus]
  ): StorePackageUpdateResult = {
    val __obj = js.Dynamic.literal(overallState = overallState.asInstanceOf[js.Any], storePackageUpdateStatuses = storePackageUpdateStatuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePackageUpdateResult]
  }
  
  extension [Self <: StorePackageUpdateResult](x: Self) {
    
    inline def setOverallState(value: StorePackageUpdateState): Self = StObject.set(x, "overallState", value.asInstanceOf[js.Any])
    
    inline def setStorePackageUpdateStatuses(value: IVectorView[StorePackageUpdateStatus]): Self = StObject.set(x, "storePackageUpdateStatuses", value.asInstanceOf[js.Any])
  }
}
