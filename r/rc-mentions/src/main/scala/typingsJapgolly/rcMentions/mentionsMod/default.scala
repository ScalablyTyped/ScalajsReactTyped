package typingsJapgolly.rcMentions.mentionsMod

import typingsJapgolly.rcMentions.AnonFilterOption
import typingsJapgolly.rcMentions.PartialMentionsState
import typingsJapgolly.rcMentions.optionMod.OptionProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions/lib/Mentions", JSImport.Default)
@js.native
class default protected () extends Mentions {
  def this(props: MentionsProps) = this()
}

/* static members */
@JSImport("rc-mentions/lib/Mentions", JSImport.Default)
@js.native
object default extends js.Object {
  var Option: FunctionComponent[OptionProps] = js.native
  var defaultProps: AnonFilterOption = js.native
  def getDerivedStateFromProps(props: MentionsProps, prevState: MentionsState): PartialMentionsState = js.native
}

