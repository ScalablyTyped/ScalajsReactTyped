package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcCoreMod.MissingTranslationStrategy
import typingsJapgolly.atAngularCompiler.srcCoreMod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/config", JSImport.Namespace)
@js.native
object srcConfigMod extends js.Object {
  @js.native
  class CompilerConfig () extends js.Object {
    def this(hasDefaultEncapsulationUseJitJitDevModeMissingTranslationPreserveWhitespacesStrictInjectionParameters: Anon_DefaultEncapsulation) = this()
    var defaultEncapsulation: ViewEncapsulation | Null = js.native
    var jitDevMode: Boolean = js.native
    var missingTranslation: MissingTranslationStrategy | Null = js.native
    var preserveWhitespaces: Boolean = js.native
    var strictInjectionParameters: Boolean = js.native
    var useJit: Boolean = js.native
  }
  
  def preserveWhitespacesDefault(): Boolean = js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: Boolean): Boolean = js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: Boolean, defaultSetting: Boolean): Boolean = js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: Null, defaultSetting: Boolean): Boolean = js.native
}

