package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
import typingsJapgolly.atAngularCompiler.srcCoreMod.Directive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Annotation extends js.Object {
  var annotation: Directive
  var metadata: CompileDirectiveMetadata
}

object Anon_Annotation {
  @scala.inline
  def apply(annotation: Directive, metadata: CompileDirectiveMetadata): Anon_Annotation = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Annotation]
  }
}

