package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.anon.DefaultEncapsulation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "CompilerConfig")
@js.native
open class CompilerConfig () extends StObject {
  def this(hasDefaultEncapsulationUseJitJitDevModeMissingTranslationPreserveWhitespacesStrictInjectionParameters: DefaultEncapsulation) = this()
  
  var defaultEncapsulation: ViewEncapsulation | Null = js.native
  
  var jitDevMode: Boolean = js.native
  
  var missingTranslation: MissingTranslationStrategy | Null = js.native
  
  var preserveWhitespaces: Boolean = js.native
  
  var strictInjectionParameters: Boolean = js.native
  
  var useJit: Boolean = js.native
}
