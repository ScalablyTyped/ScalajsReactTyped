package typingsJapgolly.resourcejs.mod

import typingsJapgolly.express.mod.Application_
import typingsJapgolly.mongoose.mod.Document
import typingsJapgolly.mongoose.mod.Model_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resourcejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(app: Application_, route: String, modelName: String, model: Model_[Document, js.Object]): ResourceEndpoint = js.native
}

