package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.AnonExtractor
import typingsJapgolly.angularCompiler.extractorMod.ExtractorHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "Extractor")
@js.native
class Extractor protected ()
  extends typingsJapgolly.angularCompiler.i18nMod.Extractor {
  def this(
    host: ExtractorHost,
    staticSymbolResolver: typingsJapgolly.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    messageBundle: typingsJapgolly.angularCompiler.messageBundleMod.MessageBundle,
    metadataResolver: typingsJapgolly.angularCompiler.metadataResolverMod.CompileMetadataResolver
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/src/compiler", "Extractor")
@js.native
object Extractor extends js.Object {
  def create(host: ExtractorHost): AnonExtractor = js.native
  def create(host: ExtractorHost, locale: String): AnonExtractor = js.native
}

