package typingsJapgolly.winrtUwp.Windows.ApplicationModel

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  /** Provides an app's display info such as its display name and description, and a method to launch the app. */
  trait AppListEntry extends StObject {
    
    /** Provides an app's display name, description, and logo. */
    var displayInfo: AppDisplayInfo
    
    /**
      * Launches the app associated with this AppListEntry
      * @return If the launch fails for any reason, the Boolean value is false
      */
    def launchAsync(): IPromiseWithIAsyncOperation[Boolean]
  }
  object AppListEntry {
    
    inline def apply(displayInfo: AppDisplayInfo, launchAsync: CallbackTo[IPromiseWithIAsyncOperation[Boolean]]): AppListEntry = {
      val __obj = js.Dynamic.literal(displayInfo = displayInfo.asInstanceOf[js.Any], launchAsync = launchAsync.toJsFn)
      __obj.asInstanceOf[AppListEntry]
    }
    
    extension [Self <: AppListEntry](x: Self) {
      
      inline def setDisplayInfo(value: AppDisplayInfo): Self = StObject.set(x, "displayInfo", value.asInstanceOf[js.Any])
      
      inline def setLaunchAsync(value: CallbackTo[IPromiseWithIAsyncOperation[Boolean]]): Self = StObject.set(x, "launchAsync", value.toJsFn)
    }
  }
}
