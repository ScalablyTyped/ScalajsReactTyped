package typingsJapgolly.awsSdkPropertyProvider

import typingsJapgolly.awsSdkPropertyProvider.distTypesProviderErrorMod.ProviderError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCredentialsProviderErrorMod {
  
  @JSImport("@aws-sdk/property-provider/dist-types/CredentialsProviderError", "CredentialsProviderError")
  @js.native
  open class CredentialsProviderError protected () extends ProviderError {
    def this(message: String) = this()
    def this(message: String, tryNextLink: Boolean) = this()
  }
}
