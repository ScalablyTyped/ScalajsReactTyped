package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcAotCompilerMod.NgAnalyzedFileWithInjectables
import typingsJapgolly.atAngularCompiler.srcAotCompilerMod.NgAnalyzedModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnalyzedInjectables extends js.Object {
  var analyzedInjectables: js.Array[NgAnalyzedFileWithInjectables]
  var analyzedModules: NgAnalyzedModules
}

object Anon_AnalyzedInjectables {
  @scala.inline
  def apply(analyzedInjectables: js.Array[NgAnalyzedFileWithInjectables], analyzedModules: NgAnalyzedModules): Anon_AnalyzedInjectables = {
    val __obj = js.Dynamic.literal(analyzedInjectables = analyzedInjectables.asInstanceOf[js.Any], analyzedModules = analyzedModules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AnalyzedInjectables]
  }
}

