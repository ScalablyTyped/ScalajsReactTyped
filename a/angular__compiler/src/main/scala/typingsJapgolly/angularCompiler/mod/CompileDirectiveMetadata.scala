package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.AnonChangeDetection
import typingsJapgolly.angularCompiler.AnonComponentFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "CompileDirectiveMetadata")
@js.native
class CompileDirectiveMetadata protected ()
  extends typingsJapgolly.angularCompiler.publicApiMod.CompileDirectiveMetadata {
  def this(hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostListenersHostPropertiesHostAttributesProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory: AnonComponentFactory) = this()
}

/* static members */
@JSImport("@angular/compiler", "CompileDirectiveMetadata")
@js.native
object CompileDirectiveMetadata extends js.Object {
  def create(
    hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory: AnonChangeDetection
  ): typingsJapgolly.angularCompiler.compileMetadataMod.CompileDirectiveMetadata = js.native
}

