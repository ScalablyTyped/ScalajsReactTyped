package typingsJapgolly.jade

import typingsJapgolly.jade.mod.JadeGenerationFunction
import typingsJapgolly.jade.mod.TemplateLocals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBody extends js.Object {
  @JSName("body")
  var body_Original: JadeGenerationFunction = js.native
  var dependencies: js.Array[String] = js.native
  def body(): String = js.native
  def body(locals: TemplateLocals): String = js.native
}

