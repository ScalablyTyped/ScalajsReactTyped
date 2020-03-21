package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.AnonCtor
import typingsJapgolly.angularCompiler.AnonFilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "StaticReflector")
@js.native
class StaticReflector protected ()
  extends typingsJapgolly.angularCompiler.staticReflectorMod.StaticReflector {
  def this(
    summaryResolver: typingsJapgolly.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typingsJapgolly.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
  ) = this()
  def this(
    summaryResolver: typingsJapgolly.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typingsJapgolly.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[AnonCtor]
  ) = this()
  def this(
    summaryResolver: typingsJapgolly.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typingsJapgolly.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[AnonCtor],
    knownMetadataFunctions: js.Array[AnonFilePath]
  ) = this()
  def this(
    summaryResolver: typingsJapgolly.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbol],
    symbolResolver: typingsJapgolly.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    knownMetadataClasses: js.Array[AnonCtor],
    knownMetadataFunctions: js.Array[AnonFilePath],
    errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
  ) = this()
}

