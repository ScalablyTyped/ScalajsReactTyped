package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeFlags extends js.Object

@JSImport("typescript", "NodeFlags")
@js.native
object NodeFlags extends js.Object {
  @js.native
  sealed trait AwaitContext extends NodeFlags
  
  @js.native
  sealed trait BlockScoped extends NodeFlags
  
  @js.native
  sealed trait Const extends NodeFlags
  
  @js.native
  sealed trait ContainsThis extends NodeFlags
  
  @js.native
  sealed trait ContextFlags extends NodeFlags
  
  @js.native
  sealed trait DecoratorContext extends NodeFlags
  
  @js.native
  sealed trait DisallowInContext extends NodeFlags
  
  @js.native
  sealed trait ExportContext extends NodeFlags
  
  @js.native
  sealed trait GlobalAugmentation extends NodeFlags
  
  @js.native
  sealed trait HasAggregatedChildData extends NodeFlags
  
  @js.native
  sealed trait HasAsyncFunctions extends NodeFlags
  
  @js.native
  sealed trait HasExplicitReturn extends NodeFlags
  
  @js.native
  sealed trait HasImplicitReturn extends NodeFlags
  
  @js.native
  sealed trait JSDoc extends NodeFlags
  
  @js.native
  sealed trait JavaScriptFile extends NodeFlags
  
  @js.native
  sealed trait JsonFile extends NodeFlags
  
  @js.native
  sealed trait Let extends NodeFlags
  
  @js.native
  sealed trait Namespace extends NodeFlags
  
  @js.native
  sealed trait NestedNamespace extends NodeFlags
  
  @js.native
  sealed trait None extends NodeFlags
  
  @js.native
  sealed trait OptionalChain extends NodeFlags
  
  @js.native
  sealed trait ReachabilityAndEmitFlags extends NodeFlags
  
  @js.native
  sealed trait ReachabilityCheckFlags extends NodeFlags
  
  @js.native
  sealed trait Synthesized extends NodeFlags
  
  @js.native
  sealed trait ThisNodeHasError extends NodeFlags
  
  @js.native
  sealed trait ThisNodeOrAnySubNodesHasError extends NodeFlags
  
  @js.native
  sealed trait TypeExcludesFlags extends NodeFlags
  
  @js.native
  sealed trait YieldContext extends NodeFlags
  
  /* 32768 */ val AwaitContext: typingsJapgolly.typescript.typescriptMod.NodeFlags.AwaitContext with Double = js.native
  /* 3 */ val BlockScoped: typingsJapgolly.typescript.typescriptMod.NodeFlags.BlockScoped with Double = js.native
  /* 2 */ val Const: typingsJapgolly.typescript.typescriptMod.NodeFlags.Const with Double = js.native
  /* 128 */ val ContainsThis: typingsJapgolly.typescript.typescriptMod.NodeFlags.ContainsThis with Double = js.native
  /* 25358336 */ val ContextFlags: typingsJapgolly.typescript.typescriptMod.NodeFlags.ContextFlags with Double = js.native
  /* 16384 */ val DecoratorContext: typingsJapgolly.typescript.typescriptMod.NodeFlags.DecoratorContext with Double = js.native
  /* 4096 */ val DisallowInContext: typingsJapgolly.typescript.typescriptMod.NodeFlags.DisallowInContext with Double = js.native
  /* 64 */ val ExportContext: typingsJapgolly.typescript.typescriptMod.NodeFlags.ExportContext with Double = js.native
  /* 1024 */ val GlobalAugmentation: typingsJapgolly.typescript.typescriptMod.NodeFlags.GlobalAugmentation with Double = js.native
  /* 524288 */ val HasAggregatedChildData: typingsJapgolly.typescript.typescriptMod.NodeFlags.HasAggregatedChildData with Double = js.native
  /* 2048 */ val HasAsyncFunctions: typingsJapgolly.typescript.typescriptMod.NodeFlags.HasAsyncFunctions with Double = js.native
  /* 512 */ val HasExplicitReturn: typingsJapgolly.typescript.typescriptMod.NodeFlags.HasExplicitReturn with Double = js.native
  /* 256 */ val HasImplicitReturn: typingsJapgolly.typescript.typescriptMod.NodeFlags.HasImplicitReturn with Double = js.native
  /* 4194304 */ val JSDoc: typingsJapgolly.typescript.typescriptMod.NodeFlags.JSDoc with Double = js.native
  /* 131072 */ val JavaScriptFile: typingsJapgolly.typescript.typescriptMod.NodeFlags.JavaScriptFile with Double = js.native
  /* 33554432 */ val JsonFile: typingsJapgolly.typescript.typescriptMod.NodeFlags.JsonFile with Double = js.native
  /* 1 */ val Let: typingsJapgolly.typescript.typescriptMod.NodeFlags.Let with Double = js.native
  /* 16 */ val Namespace: typingsJapgolly.typescript.typescriptMod.NodeFlags.Namespace with Double = js.native
  /* 4 */ val NestedNamespace: typingsJapgolly.typescript.typescriptMod.NodeFlags.NestedNamespace with Double = js.native
  /* 0 */ val None: typingsJapgolly.typescript.typescriptMod.NodeFlags.None with Double = js.native
  /* 32 */ val OptionalChain: typingsJapgolly.typescript.typescriptMod.NodeFlags.OptionalChain with Double = js.native
  /* 2816 */ val ReachabilityAndEmitFlags: typingsJapgolly.typescript.typescriptMod.NodeFlags.ReachabilityAndEmitFlags with Double = js.native
  /* 768 */ val ReachabilityCheckFlags: typingsJapgolly.typescript.typescriptMod.NodeFlags.ReachabilityCheckFlags with Double = js.native
  /* 8 */ val Synthesized: typingsJapgolly.typescript.typescriptMod.NodeFlags.Synthesized with Double = js.native
  /* 65536 */ val ThisNodeHasError: typingsJapgolly.typescript.typescriptMod.NodeFlags.ThisNodeHasError with Double = js.native
  /* 262144 */ val ThisNodeOrAnySubNodesHasError: typingsJapgolly.typescript.typescriptMod.NodeFlags.ThisNodeOrAnySubNodesHasError with Double = js.native
  /* 40960 */ val TypeExcludesFlags: typingsJapgolly.typescript.typescriptMod.NodeFlags.TypeExcludesFlags with Double = js.native
  /* 8192 */ val YieldContext: typingsJapgolly.typescript.typescriptMod.NodeFlags.YieldContext with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeFlags with Double] = js.native
}

