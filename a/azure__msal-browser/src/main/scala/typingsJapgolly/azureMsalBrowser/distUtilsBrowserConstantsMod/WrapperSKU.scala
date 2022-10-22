package typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WrapperSKU extends StObject
@JSImport("@azure/msal-browser/dist/utils/BrowserConstants", "WrapperSKU")
@js.native
object WrapperSKU extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WrapperSKU & String] = js.native
  
  @js.native
  sealed trait Angular
    extends StObject
       with WrapperSKU
  /* "@azure/msal-angular" */ val Angular: typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.WrapperSKU.Angular & String = js.native
  
  @js.native
  sealed trait React
    extends StObject
       with WrapperSKU
  /* "@azure/msal-react" */ val React: typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.WrapperSKU.React & String = js.native
}
