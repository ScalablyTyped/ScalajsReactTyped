package typingsJapgolly.expoDevServer

import typingsJapgolly.expoDevServer.anon.FileName
import typingsJapgolly.expoDevServer.anon.Url
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.webpack.mod.Compiler
import typingsJapgolly.webpack.mod.MultiCompiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildWebpackGetFileAsyncMod {
  
  @JSImport("@expo/dev-server/build/webpack/getFileAsync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createGetFileNameFromUrl(compiler: AnyCompiler): js.Function1[/* hasUrlPlatform */ Url, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGetFileNameFromUrl")(compiler.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hasUrlPlatform */ Url, String]]
  inline def createGetFileNameFromUrl(compiler: AnyCompiler, publicPath: String): js.Function1[/* hasUrlPlatform */ Url, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGetFileNameFromUrl")(compiler.asInstanceOf[js.Any], publicPath.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* hasUrlPlatform */ Url, String]]
  
  inline def getCompilerForPlatform(compiler: AnyCompiler): Compiler = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompilerForPlatform")(compiler.asInstanceOf[js.Any]).asInstanceOf[Compiler]
  inline def getCompilerForPlatform(compiler: AnyCompiler, platform: String): Compiler = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompilerForPlatform")(compiler.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Compiler]
  
  inline def getFileFromCompilerAsync(compiler: AnyCompiler, hasFileNamePlatform: FileName): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileFromCompilerAsync")(compiler.asInstanceOf[js.Any], hasFileNamePlatform.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getPlatformFromRequest(request: IncomingMessage): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatformFromRequest")(request.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  type AnyCompiler = Compiler | MultiCompiler
}
