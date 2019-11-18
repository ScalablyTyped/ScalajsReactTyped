package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileEntryComponentMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileNgModuleSummary
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileProviderMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTypeMetadata
import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.TransitiveCompileNgModuleMetadata
import typingsJapgolly.atAngularCompiler.srcCoreMod.SchemaMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BootstrapComponents extends js.Object {
  var bootstrapComponents: js.Array[CompileIdentifierMetadata]
  var declaredDirectives: js.Array[CompileIdentifierMetadata]
  var declaredPipes: js.Array[CompileIdentifierMetadata]
  var entryComponents: js.Array[CompileEntryComponentMetadata]
  var exportedDirectives: js.Array[CompileIdentifierMetadata]
  var exportedModules: js.Array[CompileNgModuleSummary]
  var exportedPipes: js.Array[CompileIdentifierMetadata]
  var id: String | Null
  var importedModules: js.Array[CompileNgModuleSummary]
  var providers: js.Array[CompileProviderMetadata]
  var schemas: js.Array[SchemaMetadata]
  var transitiveModule: TransitiveCompileNgModuleMetadata
  var `type`: CompileTypeMetadata
}

object Anon_BootstrapComponents {
  @scala.inline
  def apply(
    bootstrapComponents: js.Array[CompileIdentifierMetadata],
    declaredDirectives: js.Array[CompileIdentifierMetadata],
    declaredPipes: js.Array[CompileIdentifierMetadata],
    entryComponents: js.Array[CompileEntryComponentMetadata],
    exportedDirectives: js.Array[CompileIdentifierMetadata],
    exportedModules: js.Array[CompileNgModuleSummary],
    exportedPipes: js.Array[CompileIdentifierMetadata],
    importedModules: js.Array[CompileNgModuleSummary],
    providers: js.Array[CompileProviderMetadata],
    schemas: js.Array[SchemaMetadata],
    transitiveModule: TransitiveCompileNgModuleMetadata,
    `type`: CompileTypeMetadata,
    id: String = null
  ): Anon_BootstrapComponents = {
    val __obj = js.Dynamic.literal(bootstrapComponents = bootstrapComponents.asInstanceOf[js.Any], declaredDirectives = declaredDirectives.asInstanceOf[js.Any], declaredPipes = declaredPipes.asInstanceOf[js.Any], entryComponents = entryComponents.asInstanceOf[js.Any], exportedDirectives = exportedDirectives.asInstanceOf[js.Any], exportedModules = exportedModules.asInstanceOf[js.Any], exportedPipes = exportedPipes.asInstanceOf[js.Any], importedModules = importedModules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], transitiveModule = transitiveModule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BootstrapComponents]
  }
}

