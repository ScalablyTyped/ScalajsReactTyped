package typingsJapgolly.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionHtmlModel")
@js.native
class QuestionHtmlModel protected () extends QuestionNonValue {
  def this(name: String) = this()
  /**
    * Set html to display it
    */
  var html: String = js.native
  val locHtml: LocalizableString = js.native
  val processedHtml: String = js.native
}

