package typingsJapgolly.classTransformer

import typingsJapgolly.classTransformer.exposeExcludeOptionsMod.ExcludeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-transformer/metadata/ExcludeMetadata", JSImport.Namespace)
@js.native
object excludeMetadataMod extends js.Object {
  @js.native
  class ExcludeMetadata protected () extends js.Object {
    def this(target: js.Function, propertyName: String, options: ExcludeOptions) = this()
    var options: ExcludeOptions = js.native
    var propertyName: String = js.native
    var target: js.Function = js.native
  }
  
}

