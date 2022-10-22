package typingsJapgolly.wixUiCore

import typingsJapgolly.std.Partial
import typingsJapgolly.wixUiCore.anon.Formatted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcClientsGoogleMapsGoogle2addressGoogle2addressMod {
  
  @JSImport("wix-ui-core/dist/es/src/clients/GoogleMaps/google2address/google2address", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToFullAddress(googleResponse: Any): Formatted = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToFullAddress")(googleResponse.asInstanceOf[js.Any]).asInstanceOf[Formatted]
  
  inline def convertToPartialAddress(googleResponse: Any): Partial[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPartialAddress")(googleResponse.asInstanceOf[js.Any]).asInstanceOf[Partial[Any]]
  
  inline def trySetStreetNumberIfNotReceived(google: Any, inputValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("trySetStreetNumberIfNotReceived")(google.asInstanceOf[js.Any], inputValue.asInstanceOf[js.Any])).asInstanceOf[Any]
}
