package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageInformationEventCallback extends StObject {
  
  /**
    * Called when a package is installed.
    *
    * @param info The information of the installed package.
    */
  def oninstalled(info: PackageInformation): Unit
  
  /**
    * Called when a package is uninstalled.
    *
    * @param id The ID of the uninstalled package.
    */
  def onuninstalled(id: PackageId): Unit
  
  /**
    * Called when a package is updated.
    *
    * @param info The information of the updated package.
    */
  def onupdated(info: PackageInformation): Unit
}
object PackageInformationEventCallback {
  
  inline def apply(
    oninstalled: PackageInformation => Callback,
    onuninstalled: PackageId => Callback,
    onupdated: PackageInformation => Callback
  ): PackageInformationEventCallback = {
    val __obj = js.Dynamic.literal(oninstalled = js.Any.fromFunction1((t0: PackageInformation) => oninstalled(t0).runNow()), onuninstalled = js.Any.fromFunction1((t0: PackageId) => onuninstalled(t0).runNow()), onupdated = js.Any.fromFunction1((t0: PackageInformation) => onupdated(t0).runNow()))
    __obj.asInstanceOf[PackageInformationEventCallback]
  }
  
  extension [Self <: PackageInformationEventCallback](x: Self) {
    
    inline def setOninstalled(value: PackageInformation => Callback): Self = StObject.set(x, "oninstalled", js.Any.fromFunction1((t0: PackageInformation) => value(t0).runNow()))
    
    inline def setOnuninstalled(value: PackageId => Callback): Self = StObject.set(x, "onuninstalled", js.Any.fromFunction1((t0: PackageId) => value(t0).runNow()))
    
    inline def setOnupdated(value: PackageInformation => Callback): Self = StObject.set(x, "onupdated", js.Any.fromFunction1((t0: PackageInformation) => value(t0).runNow()))
  }
}
