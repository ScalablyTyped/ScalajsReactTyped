package typingsJapgolly.rcMentions

import typingsJapgolly.rcMentions.mentionsMod.MentionsProps
import typingsJapgolly.rcMentions.mentionsMod.MentionsState
import typingsJapgolly.rcMentions.optionMod.OptionProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected ()
    extends typingsJapgolly.rcMentions.mentionsMod.default {
    def this(props: MentionsProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Option: FunctionComponent[OptionProps] = js.native
    var defaultProps: AnonFilterOption = js.native
    def getDerivedStateFromProps(props: MentionsProps, prevState: MentionsState): PartialMentionsState = js.native
  }
  
}

