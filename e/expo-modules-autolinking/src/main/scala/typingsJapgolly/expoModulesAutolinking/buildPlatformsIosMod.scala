package typingsJapgolly.expoModulesAutolinking

import typingsJapgolly.expoModulesAutolinking.buildTypesMod.ModuleDescriptorIos
import typingsJapgolly.expoModulesAutolinking.buildTypesMod.ModuleIosPodspecInfo
import typingsJapgolly.expoModulesAutolinking.buildTypesMod.PackageRevision
import typingsJapgolly.expoModulesAutolinking.buildTypesMod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPlatformsIosMod {
  
  @JSImport("expo-modules-autolinking/build/platforms/ios", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatArrayOfReactDelegateHandler(modules: js.Array[ModuleDescriptorIos]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatArrayOfReactDelegateHandler")(modules.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generatePackageListAsync(modules: js.Array[ModuleDescriptorIos], targetPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePackageListAsync")(modules.asInstanceOf[js.Any], targetPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getSwiftModuleNames(pods: js.Array[ModuleIosPodspecInfo]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwiftModuleNames")(pods.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getSwiftModuleNames(pods: js.Array[ModuleIosPodspecInfo], swiftModuleNames: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwiftModuleNames")(pods.asInstanceOf[js.Any], swiftModuleNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def resolveModuleAsync(packageName: String, revision: PackageRevision, options: SearchOptions): js.Promise[ModuleDescriptorIos | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleAsync")(packageName.asInstanceOf[js.Any], revision.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ModuleDescriptorIos | Null]]
}
