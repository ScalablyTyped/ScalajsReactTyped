package typingsJapgolly.classTransformer

import typingsJapgolly.classTransformer.exposeExcludeOptionsMod.ExposeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-transformer/metadata/ExposeMetadata", JSImport.Namespace)
@js.native
object exposeMetadataMod extends js.Object {
  @js.native
  class ExposeMetadata protected () extends js.Object {
    def this(target: js.Function, propertyName: String, options: ExposeOptions) = this()
    var options: ExposeOptions = js.native
    var propertyName: String = js.native
    var target: js.Function = js.native
  }
  
}

