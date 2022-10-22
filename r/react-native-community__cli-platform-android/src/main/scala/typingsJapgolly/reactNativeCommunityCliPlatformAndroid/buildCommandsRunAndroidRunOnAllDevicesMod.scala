package typingsJapgolly.reactNativeCommunityCliPlatformAndroid

import typingsJapgolly.reactNativeCommunityCliPlatformAndroid.buildCommandsRunAndroidMod.Flags
import typingsJapgolly.reactNativeCommunityCliTypes.buildAndroidMod.AndroidProjectConfig
import typingsJapgolly.reactNativeCommunityCliTypes.buildAndroidMod.AndroidProjectParams
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsRunAndroidRunOnAllDevicesMod {
  
  @JSImport("@react-native-community/cli-platform-android/build/commands/runAndroid/runOnAllDevices", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Flags, cmd: String, adbPath: String, androidProject: AndroidProject): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], adbPath.asInstanceOf[js.Any], androidProject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  type AndroidProject = NonNullable[
    js.UndefOr[
      Exclude[
        ReturnType[
          js.Function2[
            /* projectRoot */ String, 
            /* projectParams */ AndroidProjectParams | Unit, 
            AndroidProjectConfig | Unit
          ]
        ], 
        Unit
      ]
    ]
  ]
}
