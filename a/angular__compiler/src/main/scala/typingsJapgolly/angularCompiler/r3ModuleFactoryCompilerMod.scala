package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typingsJapgolly.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typingsJapgolly.angularCompiler.outputAstMod.Expression
import typingsJapgolly.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_module_factory_compiler", JSImport.Namespace)
@js.native
object r3ModuleFactoryCompilerMod extends js.Object {
  def compileModuleFactory(
    outputCtx: OutputContext,
    module: CompileNgModuleMetadata,
    backPatchReferenceOf: js.Function1[/* module */ CompileTypeMetadata, Expression],
    resolver: CompileMetadataResolver
  ): Unit = js.native
}

