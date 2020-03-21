package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typingsJapgolly.angularCompiler.srcUtilMod.OutputContext
import typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbol
import typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbolCache
import typingsJapgolly.angularCompiler.staticSymbolResolverMod.ResolvedStaticSymbol
import typingsJapgolly.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/summary_serializer", JSImport.Namespace)
@js.native
object summarySerializerMod extends js.Object {
  def createForJitStub(outputCtx: OutputContext, reference: StaticSymbol): Unit = js.native
  def deserializeSummaries(
    symbolCache: StaticSymbolCache,
    summaryResolver: SummaryResolver[StaticSymbol],
    libraryFileName: String,
    json: String
  ): AnonModuleName = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[AnonMetadata]
  ): AnonJson = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[AnonMetadata],
    createExternalSymbolReexports: Boolean
  ): AnonJson = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[AnonMetadata]
  ): AnonJson = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[AnonMetadata],
    createExternalSymbolReexports: Boolean
  ): AnonJson = js.native
}

