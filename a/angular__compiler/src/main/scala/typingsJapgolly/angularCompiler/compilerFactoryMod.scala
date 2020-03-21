package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.compilerHostMod.AotCompilerHost
import typingsJapgolly.angularCompiler.compilerOptionsMod.AotCompilerOptions
import typingsJapgolly.angularCompiler.urlResolverMod.UrlResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/compiler_factory", JSImport.Namespace)
@js.native
object compilerFactoryMod extends js.Object {
  def createAotCompiler(compilerHost: AotCompilerHost, options: AotCompilerOptions): AnonCompiler = js.native
  def createAotCompiler(
    compilerHost: AotCompilerHost,
    options: AotCompilerOptions,
    errorCollector: js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], Unit]
  ): AnonCompiler = js.native
  def createAotUrlResolver(host: AnonResourceNameToFileName): UrlResolver = js.native
}

