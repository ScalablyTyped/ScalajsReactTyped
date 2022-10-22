package typingsJapgolly.reactNativeCommunityCliConfig

import typingsJapgolly.reactNativeCommunityCliConfig.anon.Description
import typingsJapgolly.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/cli-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Loads CLI configuration
    */
  inline def default(): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Config]
  inline def default(projectRoot: String): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Config]
  
  @JSImport("@react-native-community/cli-config", "commands")
  @js.native
  val commands: js.Array[Description] = js.native
}
