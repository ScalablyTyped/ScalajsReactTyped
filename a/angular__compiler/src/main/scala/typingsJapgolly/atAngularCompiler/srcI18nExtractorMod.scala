package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver
import typingsJapgolly.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolverHost
import typingsJapgolly.atAngularCompiler.srcAotSummaryUnderscoreResolverMod.AotSummaryResolverHost
import typingsJapgolly.atAngularCompiler.srcI18nExtractorMod.ExtractorHost
import typingsJapgolly.atAngularCompiler.srcI18nMessageUnderscoreBundleMod.MessageBundle
import typingsJapgolly.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/extractor", JSImport.Namespace)
@js.native
object srcI18nExtractorMod extends js.Object {
  @js.native
  class Extractor protected () extends js.Object {
    def this(
      host: ExtractorHost,
      staticSymbolResolver: StaticSymbolResolver,
      messageBundle: MessageBundle,
      metadataResolver: CompileMetadataResolver
    ) = this()
    var host: ExtractorHost = js.native
    var messageBundle: js.Any = js.native
    var metadataResolver: js.Any = js.native
    var staticSymbolResolver: js.Any = js.native
    def extract(rootFiles: js.Array[String]): js.Promise[MessageBundle] = js.native
  }
  
  @js.native
  trait ExtractorHost
    extends StaticSymbolResolverHost
       with AotSummaryResolverHost {
    /**
      * Loads a resource (e.g. html / css)
      */
    def loadResource(path: String): js.Promise[String] | String = js.native
    /**
      * Converts a path that refers to a resource into an absolute filePath
      * that can be lateron used for loading the resource via `loadResource.
      */
    def resourceNameToFileName(path: String, containingFile: String): String | Null = js.native
  }
  
  /* static members */
  @js.native
  object Extractor extends js.Object {
    def create(host: ExtractorHost): Anon_Extractor = js.native
    def create(host: ExtractorHost, locale: String): Anon_Extractor = js.native
  }
  
}

