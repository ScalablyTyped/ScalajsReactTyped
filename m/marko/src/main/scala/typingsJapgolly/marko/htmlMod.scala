package typingsJapgolly.marko

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/runtime/html", JSImport.Namespace)
@js.native
object htmlMod extends js.Object {
  def createWriter(writer: js.Any): AsyncStream = js.native
  def enableAsyncStackTrace(): Unit = js.native
  type AsyncStream = typingsJapgolly.marko.asyncStreamMod.AsyncStream
  type RenderResult = typingsJapgolly.marko.renderResultMod.RenderResult
  type Template = typingsJapgolly.marko.templateMod.Template
}

