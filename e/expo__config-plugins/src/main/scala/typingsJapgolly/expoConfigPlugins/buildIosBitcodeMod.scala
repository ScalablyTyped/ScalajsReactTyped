package typingsJapgolly.expoConfigPlugins

import typingsJapgolly.expoConfigPlugins.anon.PickExpoConfigios
import typingsJapgolly.expoConfigPlugins.anon.Project
import typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosBitcodeMod {
  
  @JSImport("@expo/config-plugins/build/ios/Bitcode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBitcode(config: PickExpoConfigios): Bitcode = ^.asInstanceOf[js.Dynamic].applyDynamic("getBitcode")(config.asInstanceOf[js.Any]).asInstanceOf[Bitcode]
  
  inline def setBitcode(bitcode: Bitcode, hasProject: Project): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setBitcode")(bitcode.asInstanceOf[js.Any], hasProject.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setBitcodeWithConfig(config: PickExpoConfigios, hasProject: Project): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setBitcodeWithConfig")(config.asInstanceOf[js.Any], hasProject.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/config-plugins/build/ios/Bitcode", "withBitcode")
  @js.native
  val withBitcode: ConfigPlugin[Unit] = js.native
  
  @JSImport("@expo/config-plugins/build/ios/Bitcode", "withCustomBitcode")
  @js.native
  val withCustomBitcode: ConfigPlugin[Bitcode] = js.native
  
  type Bitcode = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@expo/config-types.@expo/config-types.IOS | undefined>['bitcode'] */ js.Any
}
