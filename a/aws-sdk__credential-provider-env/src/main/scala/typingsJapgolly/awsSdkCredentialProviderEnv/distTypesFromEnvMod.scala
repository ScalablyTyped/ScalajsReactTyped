package typingsJapgolly.awsSdkCredentialProviderEnv

import typingsJapgolly.awsSdkTypes.distTypesCredentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromEnvMod {
  
  @JSImport("@aws-sdk/credential-provider-env/dist-types/fromEnv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/credential-provider-env/dist-types/fromEnv", "ENV_EXPIRATION")
  @js.native
  val ENV_EXPIRATION: /* "AWS_CREDENTIAL_EXPIRATION" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-env/dist-types/fromEnv", "ENV_KEY")
  @js.native
  val ENV_KEY: /* "AWS_ACCESS_KEY_ID" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-env/dist-types/fromEnv", "ENV_SECRET")
  @js.native
  val ENV_SECRET: /* "AWS_SECRET_ACCESS_KEY" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-env/dist-types/fromEnv", "ENV_SESSION")
  @js.native
  val ENV_SESSION: /* "AWS_SESSION_TOKEN" */ String = js.native
  
  inline def fromEnv(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEnv")().asInstanceOf[CredentialProvider]
}
