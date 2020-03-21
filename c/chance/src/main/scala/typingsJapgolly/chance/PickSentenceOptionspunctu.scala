package typingsJapgolly.chance

import typingsJapgolly.chance.chanceStrings.Colon
import typingsJapgolly.chance.chanceStrings.Dot
import typingsJapgolly.chance.chanceStrings.Exclamationmark
import typingsJapgolly.chance.chanceStrings.Questionmark
import typingsJapgolly.chance.chanceStrings.Semicolon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<chance.Chance.SentenceOptions, 'punctuation'> */
trait PickSentenceOptionspunctu extends js.Object {
  var punctuation: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean
}

object PickSentenceOptionspunctu {
  @scala.inline
  def apply(punctuation: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean): PickSentenceOptionspunctu = {
    val __obj = js.Dynamic.literal(punctuation = punctuation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickSentenceOptionspunctu]
  }
}

