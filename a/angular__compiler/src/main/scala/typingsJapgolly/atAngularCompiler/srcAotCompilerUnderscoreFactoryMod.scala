package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcAotCompilerUnderscoreHostMod.AotCompilerHost
import typingsJapgolly.atAngularCompiler.srcAotCompilerUnderscoreOptionsMod.AotCompilerOptions
import typingsJapgolly.atAngularCompiler.srcUrlUnderscoreResolverMod.UrlResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/compiler_factory", JSImport.Namespace)
@js.native
object srcAotCompilerUnderscoreFactoryMod extends js.Object {
  def createAotCompiler(compilerHost: AotCompilerHost, options: AotCompilerOptions): Anon_Compiler = js.native
  def createAotCompiler(
    compilerHost: AotCompilerHost,
    options: AotCompilerOptions,
    errorCollector: js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], Unit]
  ): Anon_Compiler = js.native
  def createAotUrlResolver(host: Anon_ContainingFileName): UrlResolver = js.native
}

