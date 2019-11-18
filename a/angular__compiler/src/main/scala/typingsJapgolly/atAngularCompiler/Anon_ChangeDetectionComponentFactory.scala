package typingsJapgolly.atAngularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileEntryComponentMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileProviderMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileQueryMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTemplateMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTypeMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.ProxyClass
import typingsJapgolly.atAngularCompiler.srcCoreMod.ChangeDetectionStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangeDetectionComponentFactory extends js.Object {
  var changeDetection: ChangeDetectionStrategy | Null
  var componentFactory: StaticSymbol | js.Object | Null
  var componentViewType: StaticSymbol | ProxyClass | Null
  var entryComponents: js.Array[CompileEntryComponentMetadata]
  var exportAs: String | Null
  var guards: StringDictionary[js.Any]
  var hostAttributes: StringDictionary[String]
  var hostListeners: StringDictionary[String]
  var hostProperties: StringDictionary[String]
  var inputs: StringDictionary[String]
  var isComponent: Boolean
  var isHost: Boolean
  var outputs: StringDictionary[String]
  var providers: js.Array[CompileProviderMetadata]
  var queries: js.Array[CompileQueryMetadata]
  var rendererType: StaticSymbol | js.Object | Null
  var selector: String | Null
  var template: CompileTemplateMetadata | Null
  var `type`: CompileTypeMetadata
  var viewProviders: js.Array[CompileProviderMetadata]
  var viewQueries: js.Array[CompileQueryMetadata]
}

object Anon_ChangeDetectionComponentFactory {
  @scala.inline
  def apply(
    entryComponents: js.Array[CompileEntryComponentMetadata],
    guards: StringDictionary[js.Any],
    hostAttributes: StringDictionary[String],
    hostListeners: StringDictionary[String],
    hostProperties: StringDictionary[String],
    inputs: StringDictionary[String],
    isComponent: Boolean,
    isHost: Boolean,
    outputs: StringDictionary[String],
    providers: js.Array[CompileProviderMetadata],
    queries: js.Array[CompileQueryMetadata],
    `type`: CompileTypeMetadata,
    viewProviders: js.Array[CompileProviderMetadata],
    viewQueries: js.Array[CompileQueryMetadata],
    changeDetection: ChangeDetectionStrategy = null,
    componentFactory: StaticSymbol | js.Object = null,
    componentViewType: StaticSymbol | ProxyClass = null,
    exportAs: String = null,
    rendererType: StaticSymbol | js.Object = null,
    selector: String = null,
    template: CompileTemplateMetadata = null
  ): Anon_ChangeDetectionComponentFactory = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents.asInstanceOf[js.Any], guards = guards.asInstanceOf[js.Any], hostAttributes = hostAttributes.asInstanceOf[js.Any], hostListeners = hostListeners.asInstanceOf[js.Any], hostProperties = hostProperties.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isHost = isHost.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], viewProviders = viewProviders.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (changeDetection != null) __obj.updateDynamic("changeDetection")(changeDetection.asInstanceOf[js.Any])
    if (componentFactory != null) __obj.updateDynamic("componentFactory")(componentFactory.asInstanceOf[js.Any])
    if (componentViewType != null) __obj.updateDynamic("componentViewType")(componentViewType.asInstanceOf[js.Any])
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs.asInstanceOf[js.Any])
    if (rendererType != null) __obj.updateDynamic("rendererType")(rendererType.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChangeDetectionComponentFactory]
  }
}

