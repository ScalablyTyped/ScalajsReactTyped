package typingsJapgolly.antd.mod

import typingsJapgolly.antd.mentionsMod.MentionsConfig
import typingsJapgolly.antd.mentionsMod.MentionsEntity
import typingsJapgolly.antd.mentionsMod.default
import typingsJapgolly.rcMentions.optionMod.OptionProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Mentions")
@js.native
class Mentions () extends default

/* static members */
@JSImport("antd", "Mentions")
@js.native
object Mentions extends js.Object {
  var Option: FunctionComponent[OptionProps] = js.native
  def getMentions(): js.Array[MentionsEntity] = js.native
  def getMentions(value: String): js.Array[MentionsEntity] = js.native
  def getMentions(value: String, config: MentionsConfig): js.Array[MentionsEntity] = js.native
}

