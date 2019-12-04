package typingsJapgolly.rcDashMentions

import typingsJapgolly.rcDashMentions.libMentionsMod.MentionsProps
import typingsJapgolly.rcDashMentions.libMentionsMod.MentionsState
import typingsJapgolly.rcDashMentions.libOptionMod.OptionProps
import typingsJapgolly.react.reactMod.FunctionComponent
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsJapgolly.rcDashMentions.libMentionsMod.default {
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

