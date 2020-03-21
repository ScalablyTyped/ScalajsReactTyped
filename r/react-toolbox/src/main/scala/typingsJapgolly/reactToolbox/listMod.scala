package typingsJapgolly.reactToolbox

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.listCheckboxMod.ListCheckboxProps
import typingsJapgolly.reactToolbox.listDividerMod.ListDividerProps
import typingsJapgolly.reactToolbox.listItemActionMod.ListItemActionProps
import typingsJapgolly.reactToolbox.listItemActionsMod.ListItemActionsProps
import typingsJapgolly.reactToolbox.listItemContentMod.ListItemContentProps
import typingsJapgolly.reactToolbox.listItemLayoutMod.ListItemLayoutProps
import typingsJapgolly.reactToolbox.listItemMod.ListItemProps
import typingsJapgolly.reactToolbox.listItemTextMod.ListItemTextProps
import typingsJapgolly.reactToolbox.listListMod.ListProps
import typingsJapgolly.reactToolbox.listSubHeaderMod.ListSubHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/components/list", JSImport.Namespace)
@js.native
object listMod extends js.Object {
  @js.native
  class List ()
    extends Component[ListProps, js.Object, js.Any]
  
  @js.native
  class ListCheckbox ()
    extends Component[ListCheckboxProps, js.Object, js.Any]
  
  @js.native
  class ListDivider ()
    extends Component[ListDividerProps, js.Object, js.Any]
  
  @js.native
  class ListItem ()
    extends Component[ListItemProps with ListItemLayoutProps, js.Object, js.Any]
  
  @js.native
  class ListItemAction ()
    extends Component[ListItemActionProps, js.Object, js.Any]
  
  @js.native
  class ListItemActions ()
    extends Component[ListItemActionsProps, js.Object, js.Any]
  
  @js.native
  class ListItemContent ()
    extends Component[ListItemContentProps, js.Object, js.Any]
  
  @js.native
  class ListItemLayout ()
    extends Component[ListItemLayoutProps, js.Object, js.Any]
  
  @js.native
  class ListItemText ()
    extends Component[ListItemTextProps, js.Object, js.Any]
  
  @js.native
  class ListSubHeader ()
    extends Component[ListSubHeaderProps, js.Object, js.Any]
  
}

