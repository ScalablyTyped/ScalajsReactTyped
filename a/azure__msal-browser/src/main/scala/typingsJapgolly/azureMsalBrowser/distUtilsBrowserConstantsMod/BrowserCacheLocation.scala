package typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BrowserCacheLocation extends StObject
@JSImport("@azure/msal-browser/dist/utils/BrowserConstants", "BrowserCacheLocation")
@js.native
object BrowserCacheLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BrowserCacheLocation & String] = js.native
  
  @js.native
  sealed trait LocalStorage
    extends StObject
       with BrowserCacheLocation
  /* "localStorage" */ val LocalStorage: typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.BrowserCacheLocation.LocalStorage & String = js.native
  
  @js.native
  sealed trait MemoryStorage
    extends StObject
       with BrowserCacheLocation
  /* "memoryStorage" */ val MemoryStorage: typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.BrowserCacheLocation.MemoryStorage & String = js.native
  
  @js.native
  sealed trait SessionStorage
    extends StObject
       with BrowserCacheLocation
  /* "sessionStorage" */ val SessionStorage: typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.BrowserCacheLocation.SessionStorage & String = js.native
}
