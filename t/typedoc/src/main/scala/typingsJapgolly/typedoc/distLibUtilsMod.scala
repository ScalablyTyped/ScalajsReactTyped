package typingsJapgolly.typedoc

import typingsJapgolly.std.ArrayConstructor
import typingsJapgolly.std.BooleanConstructor
import typingsJapgolly.std.ClassDecorator
import typingsJapgolly.std.NumberConstructor
import typingsJapgolly.std.PropertyKey
import typingsJapgolly.std.Record
import typingsJapgolly.std.StringConstructor
import typingsJapgolly.typedoc.anon.Application
import typingsJapgolly.typedoc.anon.Dictk
import typingsJapgolly.typedoc.anon.Html
import typingsJapgolly.typedoc.anon.Priority
import typingsJapgolly.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
import typingsJapgolly.typedoc.distLibUtilsComponentMod.Component
import typingsJapgolly.typedoc.distLibUtilsComponentMod.ComponentHost
import typingsJapgolly.typedoc.distLibUtilsComponentMod.ComponentOptions
import typingsJapgolly.typedoc.distLibUtilsEntryPointMod.DocumentationEntryPoint
import typingsJapgolly.typedoc.distLibUtilsGeneralMod.NeverIfInternal
import typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod.JsxChildren
import typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod.JsxComponent
import typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import typingsJapgolly.typedoc.distLibUtilsSortMod.SortStrategy
import typingsJapgolly.typedoc.distLibUtilsValidationMod.Optional_
import typingsJapgolly.typedoc.distLibUtilsValidationMod.Schema
import typingsJapgolly.typedoc.typedocStrings.all_
import typingsJapgolly.typedoc.typedocStrings.basePath
import typingsJapgolly.typedoc.typedocStrings.block
import typingsJapgolly.typedoc.typedocStrings.blockTags
import typingsJapgolly.typedoc.typedocStrings.categorizeByGroup
import typingsJapgolly.typedoc.typedocStrings.categoryOrder
import typingsJapgolly.typedoc.typedocStrings.cleanOutputDir
import typingsJapgolly.typedoc.typedocStrings.cname
import typingsJapgolly.typedoc.typedocStrings.commentStyle
import typingsJapgolly.typedoc.typedocStrings.compilerOptions
import typingsJapgolly.typedoc.typedocStrings.customCss
import typingsJapgolly.typedoc.typedocStrings.darkHighlightTheme
import typingsJapgolly.typedoc.typedocStrings.defaultCategory
import typingsJapgolly.typedoc.typedocStrings.disableSources
import typingsJapgolly.typedoc.typedocStrings.emit
import typingsJapgolly.typedoc.typedocStrings.entryPointStrategy
import typingsJapgolly.typedoc.typedocStrings.entryPoints
import typingsJapgolly.typedoc.typedocStrings.exclude
import typingsJapgolly.typedoc.typedocStrings.excludeExternals
import typingsJapgolly.typedoc.typedocStrings.excludeInternal
import typingsJapgolly.typedoc.typedocStrings.excludeNotDocumented
import typingsJapgolly.typedoc.typedocStrings.excludePrivate
import typingsJapgolly.typedoc.typedocStrings.excludeProtected
import typingsJapgolly.typedoc.typedocStrings.excludeTags
import typingsJapgolly.typedoc.typedocStrings.expand
import typingsJapgolly.typedoc.typedocStrings.externalPattern
import typingsJapgolly.typedoc.typedocStrings.externalSymbolLinkMappings
import typingsJapgolly.typedoc.typedocStrings.gaID
import typingsJapgolly.typedoc.typedocStrings.gitRemote
import typingsJapgolly.typedoc.typedocStrings.gitRevision
import typingsJapgolly.typedoc.typedocStrings.githubPages
import typingsJapgolly.typedoc.typedocStrings.help
import typingsJapgolly.typedoc.typedocStrings.hideGenerator
import typingsJapgolly.typedoc.typedocStrings.htmlLang
import typingsJapgolly.typedoc.typedocStrings.includeVersion
import typingsJapgolly.typedoc.typedocStrings.includes
import typingsJapgolly.typedoc.typedocStrings.inlineTags
import typingsJapgolly.typedoc.typedocStrings.intentionallyNotExported
import typingsJapgolly.typedoc.typedocStrings.jsdoc
import typingsJapgolly.typedoc.typedocStrings.json
import typingsJapgolly.typedoc.typedocStrings.lightHighlightTheme
import typingsJapgolly.typedoc.typedocStrings.line
import typingsJapgolly.typedoc.typedocStrings.logLevel
import typingsJapgolly.typedoc.typedocStrings.logger
import typingsJapgolly.typedoc.typedocStrings.markedOptions
import typingsJapgolly.typedoc.typedocStrings.media
import typingsJapgolly.typedoc.typedocStrings.modifierTags
import typingsJapgolly.typedoc.typedocStrings.name
import typingsJapgolly.typedoc.typedocStrings.options
import typingsJapgolly.typedoc.typedocStrings.out
import typingsJapgolly.typedoc.typedocStrings.packages
import typingsJapgolly.typedoc.typedocStrings.plugin
import typingsJapgolly.typedoc.typedocStrings.preserveWatchOutput
import typingsJapgolly.typedoc.typedocStrings.pretty
import typingsJapgolly.typedoc.typedocStrings.readme
import typingsJapgolly.typedoc.typedocStrings.requiredToBeDocumented
import typingsJapgolly.typedoc.typedocStrings.resolve
import typingsJapgolly.typedoc.typedocStrings.searchCategoryBoosts
import typingsJapgolly.typedoc.typedocStrings.searchGroupBoosts
import typingsJapgolly.typedoc.typedocStrings.searchInComments
import typingsJapgolly.typedoc.typedocStrings.showConfig
import typingsJapgolly.typedoc.typedocStrings.skipErrorChecking
import typingsJapgolly.typedoc.typedocStrings.sort
import typingsJapgolly.typedoc.typedocStrings.theme
import typingsJapgolly.typedoc.typedocStrings.treatWarningsAsErrors
import typingsJapgolly.typedoc.typedocStrings.tsconfig
import typingsJapgolly.typedoc.typedocStrings.validation
import typingsJapgolly.typedoc.typedocStrings.version
import typingsJapgolly.typedoc.typedocStrings.visibilityFilters
import typingsJapgolly.typedoc.typedocStrings.watch
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.Symbol
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsMod {
  
  @JSImport("typedoc/dist/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("typedoc/dist/lib/utils", "AbstractComponent")
  @js.native
  open class AbstractComponent[O /* <: ComponentHost */] protected ()
    extends typingsJapgolly.typedoc.distLibUtilsComponentMod.AbstractComponent[O] {
    /**
      * Create new Component instance.
      */
    def this(owner: O) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils", "ArgumentsReader")
  @js.native
  open class ArgumentsReader protected ()
    extends typingsJapgolly.typedoc.distLibUtilsOptionsMod.ArgumentsReader {
    def this(priority: Double) = this()
    def this(priority: Double, args: js.Array[String]) = this()
  }
  
  inline def BindOption(name: NeverIfInternal[String]): js.Function2[
    /* target */ Application | typingsJapgolly.typedoc.anon.Options, 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ Application | typingsJapgolly.typedoc.anon.Options, 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_basePath(name: basePath): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_blockTags(name: blockTags): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_categorizeByGroup(name: categorizeByGroup): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_categoryOrder(name: categoryOrder): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_cleanOutputDir(name: cleanOutputDir): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_cname(name: cname): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_commentStyle(name: commentStyle): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}? unknown : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}? unknown : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}? unknown : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}? unknown : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_compilerOptions(name: compilerOptions): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_customCss(name: customCss): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_darkHighlightTheme(name: darkHighlightTheme): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_defaultCategory(name: defaultCategory): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_disableSources(name: disableSources): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_emit(name: emit): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}? unknown : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}? unknown : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}? unknown : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}? unknown : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_entryPointStrategy(name: entryPointStrategy): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}? unknown : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}? unknown : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}? unknown : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}? unknown : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_entryPoints(name: entryPoints): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_exclude(name: exclude): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludeExternals(name: excludeExternals): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludeInternal(name: excludeInternal): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludeNotDocumented(name: excludeNotDocumented): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludePrivate(name: excludePrivate): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludeProtected(name: excludeProtected): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludeTags(name: excludeTags): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_externalPattern(name: externalPattern): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_externalSymbolLinkMappings(name: externalSymbolLinkMappings): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_gaID(name: gaID): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_gitRemote(name: gitRemote): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_gitRevision(name: gitRevision): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_githubPages(name: githubPages): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_help(name: help): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_hideGenerator(name: hideGenerator): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_htmlLang(name: htmlLang): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_includeVersion(name: includeVersion): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_includes(name: includes): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_inlineTags(name: inlineTags): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_intentionallyNotExported(name: intentionallyNotExported): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_json(name: json): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_lightHighlightTheme(name: lightHighlightTheme): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_logLevel(name: logLevel): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any? unknown : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any? unknown : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any? unknown : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any? unknown : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_logger(name: logger): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_markedOptions(name: markedOptions): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_media(name: media): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_modifierTags(name: modifierTags): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_name(name: name): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_options(name: options): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_out(name: out): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_plugin(name: plugin): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_preserveWatchOutput(name: preserveWatchOutput): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_pretty(name: pretty): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_readme(name: readme): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_requiredToBeDocumented(name: requiredToBeDocumented): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>? unknown : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>? unknown : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>? unknown : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>? unknown : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_searchCategoryBoosts(name: searchCategoryBoosts): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_searchGroupBoosts(name: searchGroupBoosts): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_searchInComments(name: searchInComments): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_showConfig(name: showConfig): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_skipErrorChecking(name: skipErrorChecking): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_sort(name: sort): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>? unknown : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>? unknown : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>? unknown : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>? unknown : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_theme(name: theme): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_treatWarningsAsErrors(name: treatWarningsAsErrors): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_tsconfig(name: tsconfig): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_validation(name: validation): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_version(name: version): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_visibilityFilters(name: visibilityFilters): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_watch(name: watch): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typingsJapgolly.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  @JSImport("typedoc/dist/lib/utils", "CallbackLogger")
  @js.native
  open class CallbackLogger protected ()
    extends typingsJapgolly.typedoc.distLibUtilsLoggersMod.CallbackLogger {
    /**
      * Create a new CallbackLogger instance.
      *
      * @param callback  The callback that should be used to log messages.
      */
    def this(callback: js.Function) = this()
  }
  
  /* note: abstract class */ @JSImport("typedoc/dist/lib/utils", "ChildableComponent")
  @js.native
  open class ChildableComponent[O /* <: ComponentHost */, C /* <: Component */] protected ()
    extends typingsJapgolly.typedoc.distLibUtilsComponentMod.ChildableComponent[O, C] {
    /**
      * Create new Component instance.
      */
    def this(owner: O) = this()
  }
  
  object CommentStyle {
    
    @JSImport("typedoc/dist/lib/utils", "CommentStyle.All")
    @js.native
    val All: all_ = js.native
    
    @JSImport("typedoc/dist/lib/utils", "CommentStyle.Block")
    @js.native
    val Block: block = js.native
    
    @JSImport("typedoc/dist/lib/utils", "CommentStyle.JSDoc")
    @js.native
    val JSDoc: jsdoc = js.native
    
    @JSImport("typedoc/dist/lib/utils", "CommentStyle.Line")
    @js.native
    val Line: line = js.native
  }
  
  inline def Component(options: ComponentOptions): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Component")(options.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  
  @JSImport("typedoc/dist/lib/utils", "ConsoleLogger")
  @js.native
  /**
    * Create a new ConsoleLogger instance.
    */
  open class ConsoleLogger ()
    extends typingsJapgolly.typedoc.distLibUtilsLoggersMod.ConsoleLogger
  
  @JSImport("typedoc/dist/lib/utils", "DefaultMap")
  @js.native
  open class DefaultMap[K, V] protected ()
    extends typingsJapgolly.typedoc.distLibUtilsMapMod.DefaultMap[K, V] {
    def this(creator: js.Function0[V]) = this()
  }
  
  object EntryPointStrategy {
    
    /**
      * The default behavior in v0.21 and earlier. Behaves like the resolve behavior, but will recursively
      * expand directories into an entry point for each file within the directory.
      */
    @JSImport("typedoc/dist/lib/utils", "EntryPointStrategy.Expand")
    @js.native
    val Expand: expand = js.native
    
    /**
      * Alternative resolution mode useful for monorepos. With this mode, TypeDoc will look for a package.json
      * and tsconfig.json under each provided entry point. The `main` field of each package will be documented.
      */
    @JSImport("typedoc/dist/lib/utils", "EntryPointStrategy.Packages")
    @js.native
    val Packages: packages = js.native
    
    /**
      * The default behavior in v0.22+, expects all provided entry points as being part of a single program.
      * Any directories included in the entry point list will result in `dir/index.([cm][tj]s|[tj]sx?)` being used.
      */
    @JSImport("typedoc/dist/lib/utils", "EntryPointStrategy.Resolve")
    @js.native
    val Resolve: resolve = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils", "Event")
  @js.native
  open class Event protected ()
    extends typingsJapgolly.typedoc.distLibUtilsEventsMod.Event {
    /**
      * Create a new Event instance.
      */
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils", "EventDispatcher")
  @js.native
  open class EventDispatcher ()
    extends typingsJapgolly.typedoc.distLibUtilsEventsMod.EventDispatcher
  
  @JSImport("typedoc/dist/lib/utils", "EventHooks")
  @js.native
  open class EventHooks[T /* <: Record[/* keyof T */ String, js.Array[Any]] */, R] ()
    extends typingsJapgolly.typedoc.distLibUtilsHooksMod.EventHooks[T, R]
  
  @JSImport("typedoc/dist/lib/utils", "Fragment")
  @js.native
  val Fragment: js.Symbol = js.native
  
  object JSX {
    
    @JSImport("typedoc/dist/lib/utils", "JSX")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/utils", "JSX.Fragment")
    @js.native
    val Fragment: js.Symbol = js.native
    
    inline def Raw(_props: Html): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Raw")(_props.asInstanceOf[js.Any]).asInstanceOf[Null]
    
    inline def createElement(tag: String, props: js.Object, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
    inline def createElement(tag: String, props: Null, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
    inline def createElement(tag: js.Symbol, props: js.Object, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
    inline def createElement(tag: js.Symbol, props: Null, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
    inline def createElement(tag: JsxComponent[Any], props: js.Object, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
    inline def createElement(tag: JsxComponent[Any], props: Null, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
    
    inline def renderElement(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderElement")().asInstanceOf[String]
    inline def renderElement(element: JsxElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderElement")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("typedoc/dist/lib/utils", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.typedoc.distLibUtilsLoggersMod.LogLevel & Double] = js.native
    
    /* 3 */ val Error: typingsJapgolly.typedoc.distLibUtilsLoggersMod.LogLevel.Error & Double = js.native
    
    /* 1 */ val Info: typingsJapgolly.typedoc.distLibUtilsLoggersMod.LogLevel.Info & Double = js.native
    
    /* 0 */ val Verbose: typingsJapgolly.typedoc.distLibUtilsLoggersMod.LogLevel.Verbose & Double = js.native
    
    /* 2 */ val Warn: typingsJapgolly.typedoc.distLibUtilsLoggersMod.LogLevel.Warn & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils", "Logger")
  @js.native
  open class Logger ()
    extends typingsJapgolly.typedoc.distLibUtilsLoggersMod.Logger
  
  @JSImport("typedoc/dist/lib/utils", "MinimalSourceFile")
  @js.native
  open class MinimalSourceFile protected ()
    extends typingsJapgolly.typedoc.distLibUtilsMinimalSourceFileMod.MinimalSourceFile {
    def this(text: String, fileName: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils", "Options")
  @js.native
  open class Options protected ()
    extends typingsJapgolly.typedoc.distLibUtilsOptionsMod.Options {
    def this(logger: typingsJapgolly.typedoc.distLibUtilsLoggersMod.Logger) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils", "ParameterHint")
  @js.native
  object ParameterHint extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterHint & Double] = js.native
    
    /* 1 */ val Directory: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterHint.Directory & Double = js.native
    
    /* 0 */ val File: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterHint.File & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils", "ParameterType")
  @js.native
  object ParameterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType & Double] = js.native
    
    /* 6 */ val Array: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Array & Double = js.native
    
    /* 3 */ val Boolean: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Boolean & Double = js.native
    
    /* 11 */ val Flags: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Flags & Double = js.native
    
    /* 9 */ val GlobArray: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.GlobArray & Double = js.native
    
    /* 4 */ val Map: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Map & Double = js.native
    
    /* 5 */ val Mixed: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Mixed & Double = js.native
    
    /* 8 */ val ModuleArray: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.ModuleArray & Double = js.native
    
    /* 2 */ val Number: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Number & Double = js.native
    
    /* 10 */ val Object: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Object & Double = js.native
    
    /* 1 */ val Path: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Path & Double = js.native
    
    /* 7 */ val PathArray: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.PathArray & Double = js.native
    
    /* 0 */ val String: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.String & Double = js.native
  }
  
  inline def Raw(_props: Html): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Raw")(_props.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  @JSImport("typedoc/dist/lib/utils", "TSConfigReader")
  @js.native
  open class TSConfigReader ()
    extends typingsJapgolly.typedoc.distLibUtilsOptionsMod.TSConfigReader
  /* static members */
  object TSConfigReader {
    
    @JSImport("typedoc/dist/lib/utils", "TSConfigReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Not considered part of the public API. You can use it, but it might break.
      * @internal
      */
    inline def findConfigFile(file: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findConfigFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  }
  
  @JSImport("typedoc/dist/lib/utils", "TypeDocReader")
  @js.native
  open class TypeDocReader ()
    extends typingsJapgolly.typedoc.distLibUtilsOptionsMod.TypeDocReader
  
  object Validation {
    
    @JSImport("typedoc/dist/lib/utils", "Validation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/utils", "Validation.additionalProperties")
    @js.native
    val additionalProperties: js.Symbol = js.native
    
    inline def isTagString(x: Any): /* is / * template literal string: @${string} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTagString")(x.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: @${string} * / string */ Boolean]
    
    inline def optional(x: js.Array[String]): Optional_[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(x.asInstanceOf[js.Any]).asInstanceOf[Optional_[js.Array[String]]]
    inline def optional(x: BooleanConstructor): Optional_[BooleanConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(x.asInstanceOf[js.Any]).asInstanceOf[Optional_[BooleanConstructor]]
    inline def optional(x: NumberConstructor): Optional_[NumberConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(x.asInstanceOf[js.Any]).asInstanceOf[Optional_[NumberConstructor]]
    inline def optional(x: StringConstructor): Optional_[StringConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(x.asInstanceOf[js.Any]).asInstanceOf[Optional_[StringConstructor]]
    inline def optional[T /* <: (js.Tuple2[ArrayConstructor, Schema]) | Dictk | (js.Function1[/* x */ Any, /* is unknown */ Boolean]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in symbol ]: std.StringConstructor} */ js.Any) */](x: T): Optional_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(x.asInstanceOf[js.Any]).asInstanceOf[Optional_[T]]
    
    inline def validate(schema: js.Array[String], obj: Any): /* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.Array<string>> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.Array<string>> */ Boolean]
    inline def validate(schema: BooleanConstructor, obj: Any): /* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.BooleanConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.BooleanConstructor> */ Boolean]
    inline def validate(schema: NumberConstructor, obj: Any): /* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.NumberConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.NumberConstructor> */ Boolean]
    inline def validate(schema: StringConstructor, obj: Any): /* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.StringConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.StringConstructor> */ Boolean]
    inline def validate[T /* <: (js.Tuple2[ArrayConstructor, Schema]) | Dictk | (js.Function1[/* x */ Any, /* is unknown */ Boolean]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in symbol ]: std.StringConstructor} */ js.Any) */](schema: T, obj: Any): /* is typedoc.typedoc/dist/lib/utils/validation.Infer<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* is typedoc.typedoc/dist/lib/utils/validation.Infer<T> */ Boolean]
  }
  
  inline def assertNever(x: scala.Nothing): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNever")(x.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def copy(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def copySync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def discoverPlugins(app: typingsJapgolly.typedoc.distLibApplicationMod.Application): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("discoverPlugins")(app.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def filterMap[T, U](iter: js.Iterable[T], fn: js.Function1[/* item */ T, js.UndefOr[U]]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(iter.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  inline def getCommonDirectory(files: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommonDirectory")(files.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getEntryPoints(
    logger: typingsJapgolly.typedoc.distLibUtilsLoggersMod.Logger,
    options: typingsJapgolly.typedoc.distLibUtilsOptionsMod.Options
  ): js.UndefOr[js.Array[DocumentationEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntryPoints")(logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[DocumentationEntryPoint]]]
  
  inline def getExpandedEntryPointsForPaths(
    logger: typingsJapgolly.typedoc.distLibUtilsLoggersMod.Logger,
    inputFiles: js.Array[String],
    options: typingsJapgolly.typedoc.distLibUtilsOptionsMod.Options
  ): js.UndefOr[js.Array[DocumentationEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExpandedEntryPointsForPaths")(logger.asInstanceOf[js.Any], inputFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[DocumentationEntryPoint]]]
  inline def getExpandedEntryPointsForPaths(
    logger: typingsJapgolly.typedoc.distLibUtilsLoggersMod.Logger,
    inputFiles: js.Array[String],
    options: typingsJapgolly.typedoc.distLibUtilsOptionsMod.Options,
    programs: js.Array[Program]
  ): js.UndefOr[js.Array[DocumentationEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExpandedEntryPointsForPaths")(logger.asInstanceOf[js.Any], inputFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], programs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[DocumentationEntryPoint]]]
  
  inline def getQualifiedName(checker: TypeChecker, symbol: Symbol): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getQualifiedName")(checker.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getWatchEntryPoints(
    logger: typingsJapgolly.typedoc.distLibUtilsLoggersMod.Logger,
    options: typingsJapgolly.typedoc.distLibUtilsOptionsMod.Options,
    program: Program
  ): js.UndefOr[js.Array[DocumentationEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWatchEntryPoints")(logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any], program.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[DocumentationEntryPoint]]]
  
  inline def insertPrioritySorted[T /* <: Priority */](arr: js.Array[T], item: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertPrioritySorted")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def loadPlugins(app: typingsJapgolly.typedoc.distLibApplicationMod.Application, plugins: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugins")(app.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def normalizePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def partition[T](iter: js.Iterable[T], predicate: js.Function1[/* item */ T, Boolean]): js.Tuple2[js.Array[T], js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(iter.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[T], js.Array[T]]]
  
  inline def readFile(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def removeIf[T](arr: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIf")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeIfPresent[T](arr: js.Array[T], item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIfPresent")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeIfPresent[T](arr: Unit, item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIfPresent")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderElement(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderElement")().asInstanceOf[String]
  inline def renderElement(element: JsxElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderElement")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sortReflections(reflections: js.Array[DeclarationReflection], strategies: js.Array[SortStrategy]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortReflections")(reflections.asInstanceOf[js.Any], strategies.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unique[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")().asInstanceOf[js.Array[T]]
  inline def unique[T](arr: js.Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def writeFile(fileName: String, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(fileName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def writeFileSync(fileName: String, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(fileName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
