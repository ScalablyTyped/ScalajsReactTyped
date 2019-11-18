package typingsJapgolly.antd.antdMod

import typingsJapgolly.antd.libMentionsMod.MentionsConfig
import typingsJapgolly.antd.libMentionsMod.MentionsEntity
import typingsJapgolly.antd.libMentionsMod.default
import typingsJapgolly.rcDashMentions.libOptionMod.OptionProps
import typingsJapgolly.react.reactMod.FunctionComponent
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

