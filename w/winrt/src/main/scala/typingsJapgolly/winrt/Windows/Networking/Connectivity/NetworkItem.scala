package typingsJapgolly.winrt.Windows.Networking.Connectivity

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkItem
  extends StObject
     with INetworkItem
object NetworkItem {
  
  inline def apply(getNetworkTypes: CallbackTo[NetworkTypes], networkId: String): NetworkItem = {
    val __obj = js.Dynamic.literal(getNetworkTypes = getNetworkTypes.toJsFn, networkId = networkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkItem]
  }
}
