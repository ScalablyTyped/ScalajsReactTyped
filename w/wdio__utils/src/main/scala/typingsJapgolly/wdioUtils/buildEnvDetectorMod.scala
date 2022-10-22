package typingsJapgolly.wdioUtils

import typingsJapgolly.wdioTypes.buildCapabilitiesMod.Capabilities
import typingsJapgolly.wdioTypes.buildCapabilitiesMod.DesiredCapabilities
import typingsJapgolly.wdioUtils.anon.IsAndroid
import typingsJapgolly.wdioUtils.anon.IsChrome
import typingsJapgolly.wdioUtils.anon.IsFirefox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEnvDetectorMod {
  
  @JSImport("@wdio/utils/build/envDetector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def capabilitiesEnvironmentDetector(capabilities: Capabilities, automationProtocol: String): IsAndroid = (^.asInstanceOf[js.Dynamic].applyDynamic("capabilitiesEnvironmentDetector")(capabilities.asInstanceOf[js.Any], automationProtocol.asInstanceOf[js.Any])).asInstanceOf[IsAndroid]
  
  inline def devtoolsEnvironmentDetector(hasBrowserName: Capabilities): IsChrome = ^.asInstanceOf[js.Dynamic].applyDynamic("devtoolsEnvironmentDetector")(hasBrowserName.asInstanceOf[js.Any]).asInstanceOf[IsChrome]
  
  inline def isW3C(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isW3C")().asInstanceOf[Boolean]
  inline def isW3C(capabilities: DesiredCapabilities): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isW3C")(capabilities.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def sessionEnvironmentDetector(hasCapabilitiesRequestedCapabilities: typingsJapgolly.wdioUtils.anon.Capabilities): IsFirefox = ^.asInstanceOf[js.Dynamic].applyDynamic("sessionEnvironmentDetector")(hasCapabilitiesRequestedCapabilities.asInstanceOf[js.Any]).asInstanceOf[IsFirefox]
  
  inline def webdriverEnvironmentDetector(capabilities: Capabilities): IsAndroid = ^.asInstanceOf[js.Dynamic].applyDynamic("webdriverEnvironmentDetector")(capabilities.asInstanceOf[js.Any]).asInstanceOf[IsAndroid]
}
