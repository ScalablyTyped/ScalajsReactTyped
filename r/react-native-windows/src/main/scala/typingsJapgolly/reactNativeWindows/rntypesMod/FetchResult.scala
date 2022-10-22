package typingsJapgolly.reactNativeWindows.rntypesMod

import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.UIBackgroundFetchResultFailed
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.UIBackgroundFetchResultNewData
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.UIBackgroundFetchResultNoData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchResult extends StObject {
  
  var NewData: UIBackgroundFetchResultNewData
  
  var NoData: UIBackgroundFetchResultNoData
  
  var ResultFailed: UIBackgroundFetchResultFailed
}
object FetchResult {
  
  inline def apply(): FetchResult = {
    val __obj = js.Dynamic.literal(NewData = "UIBackgroundFetchResultNewData", NoData = "UIBackgroundFetchResultNoData", ResultFailed = "UIBackgroundFetchResultFailed")
    __obj.asInstanceOf[FetchResult]
  }
  
  extension [Self <: FetchResult](x: Self) {
    
    inline def setNewData(value: UIBackgroundFetchResultNewData): Self = StObject.set(x, "NewData", value.asInstanceOf[js.Any])
    
    inline def setNoData(value: UIBackgroundFetchResultNoData): Self = StObject.set(x, "NoData", value.asInstanceOf[js.Any])
    
    inline def setResultFailed(value: UIBackgroundFetchResultFailed): Self = StObject.set(x, "ResultFailed", value.asInstanceOf[js.Any])
  }
}
