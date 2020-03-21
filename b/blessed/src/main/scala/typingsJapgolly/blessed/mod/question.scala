package typingsJapgolly.blessed.mod

import typingsJapgolly.blessed.mod.Widgets.QuestionElement
import typingsJapgolly.blessed.mod.Widgets.QuestionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "question")
@js.native
object question extends js.Object {
  def apply(): QuestionElement = js.native
  def apply(options: QuestionOptions): QuestionElement = js.native
}

