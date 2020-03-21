package typingsJapgolly.rcMentions.dropdownMenuMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.rcMentions.mentionsContextMod.MentionsContextProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * We only use Menu to display the candidate.
  * The focus is controlled by textarea to make accessibility easy.
  */
@js.native
trait DropdownMenu
  extends Component[DropdownMenuProps, js.Object, js.Any] {
  def renderDropdown(hasNotFoundContentActiveIndexSetActiveIndexSelectOptionOnFocusOnBlur: MentionsContextProps): Element = js.native
}

