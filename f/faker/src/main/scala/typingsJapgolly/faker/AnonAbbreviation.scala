package typingsJapgolly.faker

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbbreviation extends js.Object {
  def abbreviation(): String
  def adjective(): String
  def ingverb(): String
  def noun(): String
  def phrase(): String
  def verb(): String
}

object AnonAbbreviation {
  @scala.inline
  def apply(
    abbreviation: CallbackTo[String],
    adjective: CallbackTo[String],
    ingverb: CallbackTo[String],
    noun: CallbackTo[String],
    phrase: CallbackTo[String],
    verb: CallbackTo[String]
  ): AnonAbbreviation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abbreviation")(abbreviation.toJsFn)
    __obj.updateDynamic("adjective")(adjective.toJsFn)
    __obj.updateDynamic("ingverb")(ingverb.toJsFn)
    __obj.updateDynamic("noun")(noun.toJsFn)
    __obj.updateDynamic("phrase")(phrase.toJsFn)
    __obj.updateDynamic("verb")(verb.toJsFn)
    __obj.asInstanceOf[AnonAbbreviation]
  }
}

