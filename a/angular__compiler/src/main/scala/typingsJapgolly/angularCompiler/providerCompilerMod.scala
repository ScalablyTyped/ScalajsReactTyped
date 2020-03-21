package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.compileMetadataMod.CompileDiDependencyMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileEntryComponentMetadata
import typingsJapgolly.angularCompiler.compileReflectorMod.CompileReflector
import typingsJapgolly.angularCompiler.coreMod.NodeFlags
import typingsJapgolly.angularCompiler.lifecycleReflectorMod.LifecycleHooks
import typingsJapgolly.angularCompiler.outputAstMod.Expression
import typingsJapgolly.angularCompiler.srcUtilMod.OutputContext
import typingsJapgolly.angularCompiler.templateAstMod.ProviderAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/view_compiler/provider_compiler", JSImport.Namespace)
@js.native
object providerCompilerMod extends js.Object {
  def componentFactoryResolverProviderDef(
    reflector: CompileReflector,
    ctx: OutputContext,
    flags: NodeFlags,
    entryComponents: js.Array[CompileEntryComponentMetadata]
  ): AnonDepsExpr = js.native
  def depDef(ctx: OutputContext, dep: CompileDiDependencyMetadata): Expression = js.native
  def lifecycleHookToNodeFlag(lifecycleHook: LifecycleHooks): NodeFlags = js.native
  def providerDef(ctx: OutputContext, providerAst: ProviderAst): AnonDepsExpr = js.native
}

