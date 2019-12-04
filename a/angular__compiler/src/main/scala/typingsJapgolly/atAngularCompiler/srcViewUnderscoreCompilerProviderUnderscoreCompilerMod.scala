package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDiDependencyMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileEntryComponentMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typingsJapgolly.atAngularCompiler.srcCoreMod.NodeFlags
import typingsJapgolly.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks
import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAst
import typingsJapgolly.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/view_compiler/provider_compiler", JSImport.Namespace)
@js.native
object srcViewUnderscoreCompilerProviderUnderscoreCompilerMod extends js.Object {
  def componentFactoryResolverProviderDef(
    reflector: CompileReflector,
    ctx: OutputContext,
    flags: NodeFlags,
    entryComponents: js.Array[CompileEntryComponentMetadata]
  ): Anon_DepsExpr = js.native
  def depDef(ctx: OutputContext, dep: CompileDiDependencyMetadata): Expression = js.native
  def lifecycleHookToNodeFlag(lifecycleHook: LifecycleHooks): NodeFlags = js.native
  def providerDef(ctx: OutputContext, providerAst: ProviderAst): Anon_DepsExpr = js.native
}

