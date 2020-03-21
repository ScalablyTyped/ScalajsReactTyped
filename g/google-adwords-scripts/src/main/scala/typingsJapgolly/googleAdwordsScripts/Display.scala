package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Display extends js.Object {
  def audiences(): AdWordsSelector[Audience]
  def keywords(): AdWordsSelector[DisplayKeyword]
  def placements(): AdWordsSelector[Placement]
  def topics(): AdWordsSelector[Topic]
}

object Display {
  @scala.inline
  def apply(
    audiences: CallbackTo[AdWordsSelector[Audience]],
    keywords: CallbackTo[AdWordsSelector[DisplayKeyword]],
    placements: CallbackTo[AdWordsSelector[Placement]],
    topics: CallbackTo[AdWordsSelector[Topic]]
  ): Display = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audiences")(audiences.toJsFn)
    __obj.updateDynamic("keywords")(keywords.toJsFn)
    __obj.updateDynamic("placements")(placements.toJsFn)
    __obj.updateDynamic("topics")(topics.toJsFn)
    __obj.asInstanceOf[Display]
  }
}

