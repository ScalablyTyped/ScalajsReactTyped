package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.forkTsCheckerWebpackPlugin.anon.Canceled
import typingsJapgolly.std.ReturnType
import typingsJapgolly.webpack.mod.Compiler
import typingsJapgolly.webpack.mod.MultiCompiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPluginHooksMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/plugin-hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPluginHooks(compiler: Compiler): Canceled = ^.asInstanceOf[js.Dynamic].applyDynamic("getPluginHooks")(compiler.asInstanceOf[js.Any]).asInstanceOf[Canceled]
  inline def getPluginHooks(compiler: MultiCompiler): Canceled = ^.asInstanceOf[js.Dynamic].applyDynamic("getPluginHooks")(compiler.asInstanceOf[js.Any]).asInstanceOf[Canceled]
  
  type ForkTsCheckerWebpackPluginHooks = ReturnType[js.Function0[Canceled]]
}
