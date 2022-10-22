package typingsJapgolly.angularLocalize

import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typingsJapgolly.angularLocalize.mod.ɵParsedMessage
import typingsJapgolly.angularLocalize.mod.ɵParsedTranslation
import typingsJapgolly.angularLocalize.mod.ɵSourceLocation
import typingsJapgolly.angularLocalize.toolsSrcBabelCoreMod.PluginObj
import typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.DiagnosticHandlingStrategy
import typingsJapgolly.angularLocalize.toolsSrcExtractExtractionMod.ExtractionOptions
import typingsJapgolly.angularLocalize.toolsSrcExtractTranslationFilesFormatOptionsMod.FormatOptions
import typingsJapgolly.angularLocalize.toolsSrcSourceFileUtilsMod.TranslatePluginOptions
import typingsJapgolly.std.Record
import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsMod {
  
  @JSImport("@angular/localize/tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/localize/tools", "ArbTranslationParser")
  @js.native
  open class ArbTranslationParser ()
    extends typingsJapgolly.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersArbTranslationParserMod.ArbTranslationParser
  
  @JSImport("@angular/localize/tools", "ArbTranslationSerializer")
  @js.native
  open class ArbTranslationSerializer protected ()
    extends typingsJapgolly.angularLocalize.toolsSrcExtractTranslationFilesArbTranslationSerializerMod.ArbTranslationSerializer {
    def this(sourceLocale: String, basePath: AbsoluteFsPath, fs: PathManipulation) = this()
  }
  
  @JSImport("@angular/localize/tools", "Diagnostics")
  @js.native
  open class Diagnostics ()
    extends typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics
  
  @JSImport("@angular/localize/tools", "LegacyMessageIdMigrationSerializer")
  @js.native
  open class LegacyMessageIdMigrationSerializer protected ()
    extends typingsJapgolly.angularLocalize.toolsSrcExtractTranslationFilesLegacyMessageIdMigrationSerializerMod.LegacyMessageIdMigrationSerializer {
    def this(_diagnostics: typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics) = this()
  }
  
  @JSImport("@angular/localize/tools", "MessageExtractor")
  @js.native
  open class MessageExtractor protected ()
    extends typingsJapgolly.angularLocalize.toolsSrcExtractExtractionMod.MessageExtractor {
    def this(fs: ReadonlyFileSystem, logger: Logger, hasBasePathUseSourceMapsLocalizeName: ExtractionOptions) = this()
  }
  
  @JSImport("@angular/localize/tools", "SimpleJsonTranslationParser")
  @js.native
  open class SimpleJsonTranslationParser ()
    extends typingsJapgolly.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersSimpleJsonTranslationParserMod.SimpleJsonTranslationParser
  
  @JSImport("@angular/localize/tools", "SimpleJsonTranslationSerializer")
  @js.native
  open class SimpleJsonTranslationSerializer protected ()
    extends typingsJapgolly.angularLocalize.toolsSrcExtractTranslationFilesJsonTranslationSerializerMod.SimpleJsonTranslationSerializer {
    def this(sourceLocale: String) = this()
  }
  
  @JSImport("@angular/localize/tools", "Xliff1TranslationParser")
  @js.native
  open class Xliff1TranslationParser ()
    extends typingsJapgolly.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersXliff1TranslationParserMod.Xliff1TranslationParser
  
  @JSImport("@angular/localize/tools", "Xliff1TranslationSerializer")
  @js.native
  open class Xliff1TranslationSerializer protected ()
    extends typingsJapgolly.angularLocalize.toolsSrcExtractTranslationFilesXliff1TranslationSerializerMod.Xliff1TranslationSerializer {
    def this(sourceLocale: String, basePath: AbsoluteFsPath, useLegacyIds: Boolean) = this()
    def this(
      sourceLocale: String,
      basePath: AbsoluteFsPath,
      useLegacyIds: Boolean,
      formatOptions: FormatOptions
    ) = this()
    def this(
      sourceLocale: String,
      basePath: AbsoluteFsPath,
      useLegacyIds: Boolean,
      formatOptions: Unit,
      fs: PathManipulation
    ) = this()
    def this(
      sourceLocale: String,
      basePath: AbsoluteFsPath,
      useLegacyIds: Boolean,
      formatOptions: FormatOptions,
      fs: PathManipulation
    ) = this()
  }
  
  @JSImport("@angular/localize/tools", "Xliff2TranslationParser")
  @js.native
  open class Xliff2TranslationParser ()
    extends typingsJapgolly.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersXliff2TranslationParserMod.Xliff2TranslationParser
  
  @JSImport("@angular/localize/tools", "Xliff2TranslationSerializer")
  @js.native
  open class Xliff2TranslationSerializer protected ()
    extends typingsJapgolly.angularLocalize.toolsSrcExtractTranslationFilesXliff2TranslationSerializerMod.Xliff2TranslationSerializer {
    def this(sourceLocale: String, basePath: AbsoluteFsPath, useLegacyIds: Boolean) = this()
    def this(
      sourceLocale: String,
      basePath: AbsoluteFsPath,
      useLegacyIds: Boolean,
      formatOptions: FormatOptions
    ) = this()
    def this(
      sourceLocale: String,
      basePath: AbsoluteFsPath,
      useLegacyIds: Boolean,
      formatOptions: Unit,
      fs: PathManipulation
    ) = this()
    def this(
      sourceLocale: String,
      basePath: AbsoluteFsPath,
      useLegacyIds: Boolean,
      formatOptions: FormatOptions,
      fs: PathManipulation
    ) = this()
  }
  
  @JSImport("@angular/localize/tools", "XmbTranslationSerializer")
  @js.native
  open class XmbTranslationSerializer protected ()
    extends typingsJapgolly.angularLocalize.toolsSrcExtractTranslationFilesXmbTranslationSerializerMod.XmbTranslationSerializer {
    def this(basePath: AbsoluteFsPath, useLegacyIds: Boolean) = this()
    def this(basePath: AbsoluteFsPath, useLegacyIds: Boolean, fs: PathManipulation) = this()
  }
  
  @JSImport("@angular/localize/tools", "XtbTranslationParser")
  @js.native
  open class XtbTranslationParser ()
    extends typingsJapgolly.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersXtbTranslationParserMod.XtbTranslationParser
  
  inline def buildLocalizeReplacement(
    messageParts: TemplateStringsArray,
    substitutions: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLocalizeReplacement")(messageParts.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def checkDuplicateMessages(
    fs: PathManipulation,
    messages: js.Array[ɵParsedMessage],
    duplicateMessageHandling: DiagnosticHandlingStrategy,
    basePath: AbsoluteFsPath
  ): typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDuplicateMessages")(fs.asInstanceOf[js.Any], messages.asInstanceOf[js.Any], duplicateMessageHandling.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics]
  
  inline def isGlobalIdentifier(
    identifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.Identifier> */ Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGlobalIdentifier")(identifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def makeEs2015TranslatePlugin(
    diagnostics: typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation]
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs2015TranslatePlugin(
    diagnostics: typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    hasMissingTranslationLocalizeName: Unit,
    fs: PathManipulation
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], hasMissingTranslationLocalizeName.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs2015TranslatePlugin(
    diagnostics: typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    hasMissingTranslationLocalizeName: TranslatePluginOptions
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], hasMissingTranslationLocalizeName.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs2015TranslatePlugin(
    diagnostics: typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    hasMissingTranslationLocalizeName: TranslatePluginOptions,
    fs: PathManipulation
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], hasMissingTranslationLocalizeName.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  
  inline def makeEs5TranslatePlugin(
    diagnostics: typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation]
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs5TranslatePlugin(
    diagnostics: typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    hasMissingTranslationLocalizeName: Unit,
    fs: PathManipulation
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], hasMissingTranslationLocalizeName.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs5TranslatePlugin(
    diagnostics: typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    hasMissingTranslationLocalizeName: TranslatePluginOptions
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], hasMissingTranslationLocalizeName.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs5TranslatePlugin(
    diagnostics: typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    hasMissingTranslationLocalizeName: TranslatePluginOptions,
    fs: PathManipulation
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], hasMissingTranslationLocalizeName.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  
  inline def makeLocalePlugin(locale: String): PluginObj = ^.asInstanceOf[js.Dynamic].applyDynamic("makeLocalePlugin")(locale.asInstanceOf[js.Any]).asInstanceOf[PluginObj]
  inline def makeLocalePlugin(locale: String, hasLocalizeName: TranslatePluginOptions): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeLocalePlugin")(locale.asInstanceOf[js.Any], hasLocalizeName.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  
  inline def translate(
    diagnostics: typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    messageParts: TemplateStringsArray,
    substitutions: js.Array[Any],
    missingTranslation: DiagnosticHandlingStrategy
  ): js.Tuple2[TemplateStringsArray, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], messageParts.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any], missingTranslation.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[Any]]]
  
  inline def unwrapExpressionsFromTemplateLiteral(
    quasi: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.TemplateLiteral> */ Any
  ): js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapExpressionsFromTemplateLiteral")(quasi.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ]]
  inline def unwrapExpressionsFromTemplateLiteral(
    quasi: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.TemplateLiteral> */ Any,
    fs: PathManipulation
  ): js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrapExpressionsFromTemplateLiteral")(quasi.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ]]
  
  inline def unwrapMessagePartsFromLocalizeCall(
    call: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.CallExpression> */ Any
  ): js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapMessagePartsFromLocalizeCall")(call.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]]]
  inline def unwrapMessagePartsFromLocalizeCall(
    call: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.CallExpression> */ Any,
    fs: PathManipulation
  ): js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrapMessagePartsFromLocalizeCall")(call.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]]]
  
  inline def unwrapMessagePartsFromTemplateLiteral(
    elements: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.TemplateElement> */ Any
    ]
  ): js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapMessagePartsFromTemplateLiteral")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]]]
  inline def unwrapMessagePartsFromTemplateLiteral(
    elements: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.TemplateElement> */ Any
    ],
    fs: PathManipulation
  ): js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrapMessagePartsFromTemplateLiteral")(elements.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[js.UndefOr[ɵSourceLocation]]]]
  
  inline def unwrapSubstitutionsFromLocalizeCall(
    call: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.CallExpression> */ Any
  ): js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapSubstitutionsFromLocalizeCall")(call.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ]]
  inline def unwrapSubstitutionsFromLocalizeCall(
    call: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.CallExpression> */ Any,
    fs: PathManipulation
  ): js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrapSubstitutionsFromLocalizeCall")(call.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.Expression */ Any
    ], 
    js.Array[js.UndefOr[ɵSourceLocation]]
  ]]
}
