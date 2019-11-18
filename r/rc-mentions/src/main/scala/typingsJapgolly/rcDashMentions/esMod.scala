package typingsJapgolly.rcDashMentions

import typingsJapgolly.rcDashMentions.esMentionsMod.MentionsProps
import typingsJapgolly.rcDashMentions.esMentionsMod.MentionsState
import typingsJapgolly.rcDashMentions.esOptionMod.OptionProps
import typingsJapgolly.react.reactMod.FunctionComponent
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions/es", JSImport.Namespace)
@js.native
object esMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsJapgolly.rcDashMentions.esMentionsMod.default {
    def this(props: MentionsProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Option: FunctionComponent[OptionProps] = js.native
    var defaultProps: Anon_FilterOption = js.native
    def getDerivedStateFromProps(props: MentionsProps, prevState: MentionsState): Partial[MentionsState] = js.native
  }
  
}

