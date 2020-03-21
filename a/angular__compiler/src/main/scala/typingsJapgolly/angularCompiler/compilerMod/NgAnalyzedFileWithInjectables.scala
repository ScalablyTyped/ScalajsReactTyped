package typingsJapgolly.angularCompiler.compilerMod

import typingsJapgolly.angularCompiler.compileMetadataMod.CompileInjectableMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileShallowModuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgAnalyzedFileWithInjectables extends js.Object {
  var fileName: String
  var injectables: js.Array[CompileInjectableMetadata]
  var shallowModules: js.Array[CompileShallowModuleMetadata]
}

object NgAnalyzedFileWithInjectables {
  @scala.inline
  def apply(
    fileName: String,
    injectables: js.Array[CompileInjectableMetadata],
    shallowModules: js.Array[CompileShallowModuleMetadata]
  ): NgAnalyzedFileWithInjectables = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], injectables = injectables.asInstanceOf[js.Any], shallowModules = shallowModules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NgAnalyzedFileWithInjectables]
  }
}

