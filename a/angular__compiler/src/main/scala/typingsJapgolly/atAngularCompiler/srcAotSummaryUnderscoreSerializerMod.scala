package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import typingsJapgolly.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbolCache
import typingsJapgolly.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.ResolvedStaticSymbol
import typingsJapgolly.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver
import typingsJapgolly.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver
import typingsJapgolly.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/summary_serializer", JSImport.Namespace)
@js.native
object srcAotSummaryUnderscoreSerializerMod extends js.Object {
  def createForJitStub(outputCtx: OutputContext, reference: StaticSymbol): Unit = js.native
  def deserializeSummaries(
    symbolCache: StaticSymbolCache,
    summaryResolver: SummaryResolver[StaticSymbol],
    libraryFileName: String,
    json: String
  ): Anon_ImportAsModuleName = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Anon_Metadata]
  ): Anon_ExportAsJson = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: Null,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Anon_Metadata],
    createExternalSymbolReexports: Boolean
  ): Anon_ExportAsJson = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Anon_Metadata]
  ): Anon_ExportAsJson = js.native
  def serializeSummaries(
    srcFileName: String,
    forJitCtx: OutputContext,
    summaryResolver: SummaryResolver[StaticSymbol],
    symbolResolver: StaticSymbolResolver,
    symbols: js.Array[ResolvedStaticSymbol],
    types: js.Array[Anon_Metadata],
    createExternalSymbolReexports: Boolean
  ): Anon_ExportAsJson = js.native
}

