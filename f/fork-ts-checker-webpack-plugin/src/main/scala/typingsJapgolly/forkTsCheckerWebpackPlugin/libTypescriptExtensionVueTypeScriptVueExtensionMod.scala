package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.forkTsCheckerWebpackPlugin.libTypescriptExtensionTypeScriptExtensionMod.TypeScriptExtension
import typingsJapgolly.forkTsCheckerWebpackPlugin.libTypescriptExtensionVueTypeScriptVueExtensionConfigMod.TypeScriptVueExtensionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptExtensionVueTypeScriptVueExtensionMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/extension/vue/type-script-vue-extension", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTypeScriptVueExtension(config: TypeScriptVueExtensionConfig): TypeScriptExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeScriptVueExtension")(config.asInstanceOf[js.Any]).asInstanceOf[TypeScriptExtension]
}
