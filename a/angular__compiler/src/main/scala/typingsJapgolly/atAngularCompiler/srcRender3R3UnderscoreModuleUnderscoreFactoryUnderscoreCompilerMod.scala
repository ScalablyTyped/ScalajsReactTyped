package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTypeMetadata
import typingsJapgolly.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typingsJapgolly.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_module_factory_compiler", JSImport.Namespace)
@js.native
object srcRender3R3UnderscoreModuleUnderscoreFactoryUnderscoreCompilerMod extends js.Object {
  def compileModuleFactory(
    outputCtx: OutputContext,
    module: CompileNgModuleMetadata,
    backPatchReferenceOf: js.Function1[/* module */ CompileTypeMetadata, Expression],
    resolver: CompileMetadataResolver
  ): Unit = js.native
}

