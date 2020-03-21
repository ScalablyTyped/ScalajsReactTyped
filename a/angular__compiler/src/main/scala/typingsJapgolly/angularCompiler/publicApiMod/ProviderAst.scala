package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileTokenMetadata
import typingsJapgolly.angularCompiler.lifecycleReflectorMod.LifecycleHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ProviderAst")
@js.native
class ProviderAst protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.ProviderAst {
  def this(
    token: CompileTokenMetadata,
    multiProvider: Boolean,
    eager: Boolean,
    providers: js.Array[CompileProviderMetadata],
    providerType: typingsJapgolly.angularCompiler.templateAstMod.ProviderAstType,
    lifecycleHooks: js.Array[LifecycleHooks],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    isModule: Boolean
  ) = this()
}

