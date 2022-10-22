package typingsJapgolly.reactNativeCommunityCliPlatformAndroid

import typingsJapgolly.reactNativeCommunityCliPlatformAndroid.anon.Description
import typingsJapgolly.reactNativeCommunityCliPlatformAndroid.anon.Func
import typingsJapgolly.reactNativeCommunityCliTypes.buildAndroidMod.AndroidDependencyConfig
import typingsJapgolly.reactNativeCommunityCliTypes.buildAndroidMod.AndroidDependencyParams
import typingsJapgolly.reactNativeCommunityCliTypes.buildAndroidMod.AndroidProjectConfig
import typingsJapgolly.reactNativeCommunityCliTypes.buildAndroidMod.AndroidProjectParams
import typingsJapgolly.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("@react-native-community/cli-platform-android/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-native-community/cli-platform-android/build", "commands")
  @js.native
  val commands: js.Array[Description | Func] = js.native
  
  inline def dependencyConfig(root: String): AndroidDependencyConfig | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("dependencyConfig")(root.asInstanceOf[js.Any]).asInstanceOf[AndroidDependencyConfig | Null]
  inline def dependencyConfig(root: String, userConfig: AndroidDependencyParams): AndroidDependencyConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("dependencyConfig")(root.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[AndroidDependencyConfig | Null]
  
  inline def getAndroidProject(config: Config): AndroidProjectConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidProject")(config.asInstanceOf[js.Any]).asInstanceOf[AndroidProjectConfig]
  
  inline def getPackageName(manifestPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageName")(manifestPath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def projectConfig(root: String): AndroidProjectConfig | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("projectConfig")(root.asInstanceOf[js.Any]).asInstanceOf[AndroidProjectConfig | Null]
  inline def projectConfig(root: String, userConfig: AndroidProjectParams): AndroidProjectConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("projectConfig")(root.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[AndroidProjectConfig | Null]
}
