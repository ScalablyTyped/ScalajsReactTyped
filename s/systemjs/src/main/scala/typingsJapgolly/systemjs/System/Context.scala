package typingsJapgolly.systemjs.System

import typingsJapgolly.systemjs.AnonUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  @JSName("import")
  var import_Original: ImportFn = js.native
  var meta: AnonUrl = js.native
  def `import`[T /* <: Module */](moduleId: String): js.Promise[T] = js.native
  def `import`[T /* <: Module */](moduleId: String, parentUrl: String): js.Promise[T] = js.native
}

