package typingsJapgolly.angularCompiler.providerAnalyzerMod

import typingsJapgolly.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsJapgolly.angularCompiler.compileReflectorMod.CompileReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/provider_analyzer", "ProviderViewContext")
@js.native
class ProviderViewContext protected () extends js.Object {
  def this(reflector: CompileReflector, component: CompileDirectiveMetadata) = this()
  var component: CompileDirectiveMetadata = js.native
  var errors: js.Array[ProviderError] = js.native
  var reflector: CompileReflector = js.native
}

