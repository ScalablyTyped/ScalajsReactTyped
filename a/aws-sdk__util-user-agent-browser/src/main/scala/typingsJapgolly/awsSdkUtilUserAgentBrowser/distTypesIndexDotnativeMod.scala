package typingsJapgolly.awsSdkUtilUserAgentBrowser

import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.UserAgent
import typingsJapgolly.awsSdkUtilUserAgentBrowser.distTypesConfigurationsMod.DefaultUserAgentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIndexDotnativeMod {
  
  @JSImport("@aws-sdk/util-user-agent-browser/dist-types/index.native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultUserAgent(hasServiceIdClientVersion: DefaultUserAgentOptions): Provider[UserAgent] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultUserAgent")(hasServiceIdClientVersion.asInstanceOf[js.Any]).asInstanceOf[Provider[UserAgent]]
}
